package mod.azure.doomweapon.item.weapons;

import java.util.function.Predicate;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.entity.ShotgunShellEntity;
import mod.azure.doomweapon.item.ammo.ShellAmmo;
import mod.azure.doomweapon.util.DoomItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Shotgun extends BowItem {

	public Shotgun() {
		super(new Item.Properties().group(DoomMod.DoomItemGroup));
	}

	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
		if (entityLiving instanceof PlayerEntity) {
			PlayerEntity playerentity = (PlayerEntity) entityLiving;
			boolean flag = playerentity.abilities.isCreativeMode
					|| EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
			ItemStack itemstack = playerentity.findAmmo(stack);

			int i = this.getUseDuration(stack) - timeLeft;
			i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, playerentity, i,
					!itemstack.isEmpty() || flag);
			if (i < 0)
				return;

			if (!itemstack.isEmpty() || flag) {
				if (itemstack.isEmpty()) {
					itemstack = new ItemStack(DoomItems.SHOTGUN_SHELLS.get());
				}

				float f = getArrowVelocity(i);
				if (!((double) f < 0.1D)) {
					boolean flag1 = playerentity.abilities.isCreativeMode || (itemstack.getItem() instanceof ShellAmmo
							&& ((ShellAmmo) itemstack.getItem()).isInfinite(itemstack, stack, playerentity));
					if (!worldIn.isRemote) {
						ShellAmmo arrowitem = (ShellAmmo) (itemstack.getItem() instanceof ShellAmmo
								? itemstack.getItem()
								: DoomItems.SHOTGUN_SHELLS.get());
						AbstractArrowEntity abstractarrowentity = arrowitem.createArrow(worldIn, itemstack,
								playerentity);
						abstractarrowentity = customeArrow(abstractarrowentity);
						abstractarrowentity.shoot(playerentity, playerentity.rotationPitch, playerentity.rotationYaw,
								0.0F, f * 3.0F, 1.0F);
						if (f == 1.0F) {
							abstractarrowentity.setIsCritical(true);
						}

						int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);
						if (j > 0) {
							abstractarrowentity.setDamage(abstractarrowentity.getDamage() + (double) j * 0.5D + 0.5D);
						}

						int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);
						if (k > 0) {
							abstractarrowentity.setKnockbackStrength(k);
						}

						if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
							abstractarrowentity.setFire(100);
						}

						stack.damageItem(1, playerentity, (p_220009_1_) -> {
							p_220009_1_.sendBreakAnimation(playerentity.getActiveHand());
						});
						if (flag1
								|| playerentity.abilities.isCreativeMode && (itemstack.getItem() == Items.SPECTRAL_ARROW
										|| itemstack.getItem() == Items.TIPPED_ARROW)) {
							abstractarrowentity.pickupStatus = AbstractArrowEntity.PickupStatus.DISALLOWED;
						}

						worldIn.addEntity(abstractarrowentity);
					}

					worldIn.playSound((PlayerEntity) null, playerentity.getPosX(), playerentity.getPosY(),
							playerentity.getPosZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F,
							1.0F / (random.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
					if (!flag1 && !playerentity.abilities.isCreativeMode) {
						itemstack.shrink(1);
						if (itemstack.isEmpty()) {
							playerentity.inventory.deleteStack(itemstack);
						}
					}

					playerentity.addStat(Stats.ITEM_USED.get(this));
				}
			}
		}
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		stack.addEnchantment(Enchantments.PUNCH, 2);
		stack.addEnchantment(Enchantments.POWER, 3);
		if (group == DoomMod.DoomItemGroup) {
			items.add(stack);
		}
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		stack.hasTag();
		stack.addEnchantment(Enchantments.PUNCH, 2);
		stack.addEnchantment(Enchantments.POWER, 3);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	public Predicate<ItemStack> getAmmoPredicate() {
		return itemStack -> itemStack.getItem() instanceof ShellAmmo;
	}

	@Override
	public AbstractArrowEntity customeArrow(AbstractArrowEntity arrow) {
		return new ShotgunShellEntity(arrow.world);
	}
}