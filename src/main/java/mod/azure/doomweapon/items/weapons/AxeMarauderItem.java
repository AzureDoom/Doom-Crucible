package mod.azure.doomweapon.items.weapons;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.util.DoomMaterial;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AxeMarauderItem extends ItemAxe {

	public AxeMarauderItem(String name) {
		super(DoomMaterial.DOOM, 15, -2.4F);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DoomMod.MODID, name));
		this.setCreativeTab(DoomMod.DoomItemGroup);
	}
	
	@Override
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00A7o" + "\u00A7c" + "You were never one of us. You were");
		tooltip.add("\u00A7o" + "\u00A7c" + "nothing but a usurper, a false");
		tooltip.add("\u00A7o" + "\u00A7c" + "idol. My eyes have been opened.");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		stack.addEnchantment(Enchantments.SMITE, 10);
		stack.addEnchantment(Enchantments.LOOTING, 10);
		stack.addEnchantment(Enchantments.SHARPNESS, 10);
		stack.addEnchantment(Enchantments.SWEEPING, 10);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.addEnchantment(Enchantments.SMITE, 10);
		stack.addEnchantment(Enchantments.LOOTING, 10);
		stack.addEnchantment(Enchantments.SHARPNESS, 10);
		stack.addEnchantment(Enchantments.SWEEPING, 10);
		if (tab == DoomMod.DoomItemGroup) {
			items.add(stack);
		}
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
}
