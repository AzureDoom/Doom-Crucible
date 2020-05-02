package mod.azure.doomweapon.items.weapons;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class UnopenedItem extends Item {

	public UnopenedItem(String name) {
		super();
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
		tooltip.add("\u00A7o" + "Expired but holds tremendous potential.");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}