package mod.azure.doomweapon.items;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ArgentEnergyItem extends Item {

	public ArgentEnergyItem(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DoomWeaponMod.MODID, name));
		this.setCreativeTab(DoomTab.DOOMWEAPON);
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
}