package mod.azure.doomweapon.items;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArgentEnergyItem extends Item {

	public ArgentEnergyItem(String name) {
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
	public int getItemBurnTime(ItemStack itemStack) {
		return 100000;
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("\u00A7c" + "\u00A7o" + "Powered by Argent Energy");
		tooltip.add("\u00A7c" + "\u00A7o" + "Created by combining the tortured");
		tooltip.add("\u00A7c" + "\u00A7o" + "souls of the Nether and the power");
		tooltip.add("\u00A7c" + "\u00A7o" + "of the Aether.");
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}