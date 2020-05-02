package mod.azure.doomweapon.items.tools;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.util.DoomMaterial;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArgentHoe extends ItemHoe {

	public ArgentHoe(String name) {
		super(DoomMaterial.DOOM);
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
		tooltip.add("\u00A7c" + "\u00A7o" + "Powered by Argent Energy");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

}