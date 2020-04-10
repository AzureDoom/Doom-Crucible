package mod.azure.doomweapon.item;

import java.util.List;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import mod.azure.doomweapon.util.KeyHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class UnopenedItem extends Item {

	public UnopenedItem(String name) {
		super(new Item.Properties().group(DoomTab.DoomItemGroup));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (KeyHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("\u00A7o" + "Expired but holds tremendous potential."));
		} else {
			tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}