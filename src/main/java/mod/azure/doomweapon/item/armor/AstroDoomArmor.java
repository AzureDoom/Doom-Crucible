package mod.azure.doomweapon.item.armor;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AstroDoomArmor extends ArmorItem {

	public AstroDoomArmor(IArmorMaterial materialIn, EquipmentSlotType slot, String name) {
		super(materialIn, slot, new Item.Properties().group(DoomMod.DoomItemGroup));
		this.setRegistryName(DoomMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				"\u00A7o" + "\u00A7e" + "This armor is brimming with the power."));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 3);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 3);
		stack.addEnchantment(Enchantments.FIRE_PROTECTION, 3);
		if (group == DoomMod.DoomItemGroup) {
			items.add(stack);
		}
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		stack.hasTag();
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 1);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 1);
		stack.addEnchantment(Enchantments.FIRE_PROTECTION, 1);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	public boolean shouldSyncTag() {
		return true;
	}

	@Override
	public boolean updateItemStackNBT(CompoundNBT nbt) {
		return super.updateItemStackNBT(nbt);
	}

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return false;
	}

}