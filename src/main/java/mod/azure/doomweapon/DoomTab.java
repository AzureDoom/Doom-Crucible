package mod.azure.doomweapon;

import mod.azure.doomweapon.util.DoomWeaponItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DoomTab {
	
	public static final ItemGroup DoomItemGroup = (new ItemGroup("doomweapon") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DoomWeaponItems.CRUCIBLE);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");
}