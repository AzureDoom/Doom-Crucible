package mod.azure.doomweapon.item;

import java.util.List;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import mod.azure.doomweapon.util.KeyHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ArgentEnergyItem extends Item {

	public ArgentEnergyItem(String name) {
		super(new Item.Properties().group(DoomTab.DoomItemGroup));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if (KeyHelper.isHoldingShift()) {
			tooltip.add(new StringTextComponent("\u00A7c" + "\u00A7o" + "Created by combining the tortured"));
			tooltip.add(new StringTextComponent("\u00A7c" + "\u00A7o" + "souls of the Nether and the power"));
			tooltip.add(new StringTextComponent("\u00A7c" + "\u00A7o" + "of the Aether."));
		} else {
			tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 100000;
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		if (group == DoomTab.DoomItemGroup) {
			items.add(stack);
		}
	}
}