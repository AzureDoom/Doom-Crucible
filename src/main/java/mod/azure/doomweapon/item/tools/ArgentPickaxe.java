package mod.azure.doomweapon.item.tools;

import java.util.List;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.item.DoomTier;
import mod.azure.doomweapon.util.DoomTab;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ArgentPickaxe extends PickaxeItem {

	public ArgentPickaxe(String name) {
		super(DoomTier.DOOM, 4, -2.4F, new Item.Properties().group(DoomTab.DoomItemGroup));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("\u00A7c" + "\u00A7o" + "Powered by Argent Energy"));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

}