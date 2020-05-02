package mod.azure.doomweapon.items.armor;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MidnightArmor extends ItemArmor {

	public MidnightArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(new ResourceLocation(DoomMod.MODID, name));
		this.setTranslationKey(name);
		this.setCreativeTab(DoomMod.DoomItemGroup);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00A7o" + "\u00A7e" + "You are covered in the ashes of the great Icon of Herobrine.");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 3);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 2);
		stack.addEnchantment(Enchantments.PROTECTION, 3);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 3);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 2);
		stack.addEnchantment(Enchantments.PROTECTION, 3);
		if (tab == DoomMod.DoomItemGroup) {
			items.add(stack);
		}
	}
	
	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return false;
	}
}