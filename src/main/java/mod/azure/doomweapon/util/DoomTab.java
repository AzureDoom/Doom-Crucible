package mod.azure.doomweapon.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DoomTab {

	public static final CreativeTabs DOOMWEAPON = (new CreativeTabs("doomweapon") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DoomItems.tabicon);
		}
	});
	
}