package mod.azure.doomweapon.itmes;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BaseItem extends Item {

	public BaseItem(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DoomWeaponMod.MODID, name));
		this.setCreativeTab(DoomTab.DOOMWEAPON);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}