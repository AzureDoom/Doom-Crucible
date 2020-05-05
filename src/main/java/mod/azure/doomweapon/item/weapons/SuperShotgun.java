package mod.azure.doomweapon.item.weapons;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.util.ModSoundEvents;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class SuperShotgun extends CrossbowItem {

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

	public static float getCharge(int useTime, ItemStack stack) {
		float f = (float) useTime / (float) getChargeTime(stack);
		if (f > 1.0F) {
			f = 1.0F;
		}

		return f;
	}

	public SoundEvent getSoundEvent(int enchantmentLevel) {
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