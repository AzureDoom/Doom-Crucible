package mod.azure.doomweapon.item.weapons;

import mod.azure.doomweapon.Config;
import mod.azure.doomweapon.DoomTab;
import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.item.DoomTier;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class AxeCrucibleItem extends AxeItem {

	public AxeCrucibleItem(String name) {
		super(DoomTier.DOOM, Config.SERVER.AXE_CRUCIBLE_ATTACK.get(), -2.4F, new Item.Properties()
				.group(DoomTab.DoomItemGroup).maxDamage(Config.SERVER.AXE_CRUCIBLE_MAXDAMAGE.get()));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

}