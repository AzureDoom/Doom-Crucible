package mod.azure.doomweapon.item.weapons;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.util.ModSoundEvents;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ICrossbowUser;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SuperShotgun extends CrossbowItem {

	private boolean isLoadingStart = false;
	private boolean isLoadingMiddle = false;

	public SuperShotgun(String name) {
		super(new Item.Properties().group(DoomMod.DoomItemGroup));
		this.setRegistryName(DoomMod.MODID, name);
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
		if (!isCharged(stack) && hasAmmo(entityLiving, stack)) {
			setCharged(stack, true);
			SoundCategory soundcategory = entityLiving instanceof PlayerEntity ? SoundCategory.PLAYERS
					: SoundCategory.HOSTILE;
			worldIn.playSound((PlayerEntity) null, entityLiving.getPosX(), entityLiving.getPosY(),
					entityLiving.getPosZ(), ModSoundEvents.LOADING_END, soundcategory, 1.0F,
					1.0F / (random.nextFloat() * 0.5F + 1.0F) + 0.2F);
		}
	}

	@SuppressWarnings("unused")
	private static void fireProjectile(World worldIn, LivingEntity shooter, Hand handIn, ItemStack crossbow,
			ItemStack projectile, float soundPitch, boolean isCreativeMode, float velocity, float inaccuracy,
			float projectileAngle) {
		if (!worldIn.isRemote) {
			boolean flag = projectile.getItem() == Items.FIREWORK_ROCKET;
			IProjectile iprojectile;
			if (flag) {
				iprojectile = new FireworkRocketEntity(worldIn, projectile, shooter.getPosX(),
						shooter.getPosYEye() - (double) 0.15F, shooter.getPosZ(), true);
			} else {
				iprojectile = createArrow(worldIn, shooter, crossbow, projectile);
				if (isCreativeMode || projectileAngle != 0.0F) {
					((AbstractArrowEntity) iprojectile).pickupStatus = AbstractArrowEntity.PickupStatus.CREATIVE_ONLY;
				}
			}
			if (shooter instanceof ICrossbowUser) {
				ICrossbowUser icrossbowuser = (ICrossbowUser) shooter;
				icrossbowuser.shoot(icrossbowuser.getAttackTarget(), crossbow, iprojectile, projectileAngle);
			} else {
				Vec3d vec3d1 = shooter.getUpVector(1.0F);
				Quaternion quaternion = new Quaternion(new Vector3f(vec3d1), projectileAngle, true);
				Vec3d vec3d = shooter.getLook(1.0F);
				Vector3f vector3f = new Vector3f(vec3d);
				vector3f.transform(quaternion);
				iprojectile.shoot((double) vector3f.getX(), (double) vector3f.getY(), (double) vector3f.getZ(),
						velocity, inaccuracy);
			}
			crossbow.damageItem(flag ? 3 : 1, shooter, (p_220017_1_) -> {
				p_220017_1_.sendBreakAnimation(handIn);
			});
			worldIn.addEntity((Entity) iprojectile);
			worldIn.playSound((PlayerEntity) null, shooter.getPosX(), shooter.getPosY(), shooter.getPosZ(),
					ModSoundEvents.SHOOT1, SoundCategory.PLAYERS, 1.0F, soundPitch);
		}
	}

	public void func_219972_a(World worldIn, LivingEntity livingEntityIn, ItemStack stack, int count) {
		if (!worldIn.isRemote) {
			int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.QUICK_CHARGE, stack);
			SoundEvent soundevent = this.getSoundEvent(i);
			SoundEvent soundevent1 = i == 0 ? ModSoundEvents.LOADING_MIDDLE1 : null;
			float f = (float) (stack.getUseDuration() - count) / (float) getChargeTime(stack);
			if (f < 0.2F) {
				this.isLoadingStart = false;
				this.isLoadingMiddle = false;
			}
			if (f >= 0.2F && !this.isLoadingStart) {
				this.isLoadingStart = true;
				worldIn.playSound((PlayerEntity) null, livingEntityIn.getPosX(), livingEntityIn.getPosY(),
						livingEntityIn.getPosZ(), soundevent, SoundCategory.PLAYERS, 0.5F, 1.0F);
			}
			if (f >= 0.5F && soundevent1 != null && !this.isLoadingMiddle) {
				this.isLoadingMiddle = true;
				worldIn.playSound((PlayerEntity) null, livingEntityIn.getPosX(), livingEntityIn.getPosY(),
						livingEntityIn.getPosZ(), soundevent1, SoundCategory.PLAYERS, 0.5F, 1.0F);
			}
		}
	}

	private static AbstractArrowEntity createArrow(World worldIn, LivingEntity shooter, ItemStack crossbow,
			ItemStack ammo) {
		ArrowItem arrowitem = (ArrowItem) (ammo.getItem() instanceof ArrowItem ? ammo.getItem() : Items.ARROW);
		AbstractArrowEntity abstractarrowentity = arrowitem.createArrow(worldIn, ammo, shooter);
		if (shooter instanceof PlayerEntity) {
			abstractarrowentity.setIsCritical(true);
		}

		abstractarrowentity.setHitSound(SoundEvents.ITEM_CROSSBOW_HIT);
		abstractarrowentity.setShotFromCrossbow(true);
		int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.PIERCING, crossbow);
		if (i > 0) {
			abstractarrowentity.setPierceLevel((byte) i);
		}

		return abstractarrowentity;
	}

	private SoundEvent getSoundEvent(int enchantmentLevel) {
		switch (enchantmentLevel) {
		case 1:
			return ModSoundEvents.QUICK1_1;
		case 2:
			return ModSoundEvents.QUICK2_1;
		case 3:
			return ModSoundEvents.QUICK3_1;
		default:
			return ModSoundEvents.LOADING_START;
		}
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		stack.addEnchantment(Enchantments.MULTISHOT, 1);
		stack.addEnchantment(Enchantments.PIERCING, 10);
		stack.addEnchantment(Enchantments.QUICK_CHARGE, 1);
		if (group == DoomMod.DoomItemGroup) {
			items.add(stack);
		}
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		stack.hasTag();
		stack.addEnchantment(Enchantments.MULTISHOT, 1);
		stack.addEnchantment(Enchantments.PIERCING, 10);
		stack.addEnchantment(Enchantments.QUICK_CHARGE, 1);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}
}