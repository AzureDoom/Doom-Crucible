package mod.azure.doomweapon.items.tools;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.util.DoomItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArgentSword extends ItemSword {

	public static final ItemTool.ToolMaterial ARGENT_SWORD = EnumHelper
			.addToolMaterial("argent_sword", 6, 1561, 16.0F, 6F, 30)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public ArgentSword(String name) {
		super(ARGENT_SWORD);
		this.setMaxStackSize(1);
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