package mod.azure.doomweapon.item.weapons;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class Ballista extends CrossbowItem {

	public Ballista() {
		super(new Item.Properties().group(DoomMod.DoomItemGroup));
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		stack.addEnchantment(Enchantments.PIERCING, 10);
		if (group == DoomMod.DoomItemGroup) {
			items.add(stack);
		}
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		stack.hasTag();
		stack.addEnchantment(Enchantments.PIERCING, 10);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}
}