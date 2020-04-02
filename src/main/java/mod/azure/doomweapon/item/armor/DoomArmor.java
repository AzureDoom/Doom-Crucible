package mod.azure.doomweapon.item.armor;

import java.util.List;

import mod.azure.doomweapon.DoomTab;
import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.KeyHelper;
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

public class DoomArmor extends ArmorItem {

	public DoomArmor(IArmorMaterial materialIn, EquipmentSlotType slot, String name) {
		super(materialIn, slot, new Item.Properties().group(DoomTab.DoomItemGroup));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (KeyHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("\u00A7o" + "\u00A7e" + "The armor fitting a Demon slayer."));
		} else {
			tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	
	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 4);
		stack.addEnchantment(Enchantments.FIRE_PROTECTION, 4);
		stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 4);
		stack.addEnchantment(Enchantments.THORNS, 3);
		if (group == DoomTab.DoomItemGroup) {
			items.add(stack);
		}
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		stack.hasTag();
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 4);
		stack.addEnchantment(Enchantments.FIRE_PROTECTION, 4);
		stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 4);
		stack.addEnchantment(Enchantments.THORNS, 3);
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