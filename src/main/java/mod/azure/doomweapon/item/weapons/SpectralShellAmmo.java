package mod.azure.doomweapon.item.weapons;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpectralArrowItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpectralShellAmmo extends SpectralArrowItem {

	public SpectralShellAmmo(String name) {
		super(new Item.Properties().group(DoomMod.DoomItemGroup));
		this.setRegistryName(DoomMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("\u00A7o" + "Test."));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

}