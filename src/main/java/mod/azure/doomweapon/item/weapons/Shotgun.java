package mod.azure.doomweapon.item.weapons;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class Shotgun extends BowItem {

	public Shotgun() {
		super(new Item.Properties().group(DoomMod.DoomItemGroup));
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

}