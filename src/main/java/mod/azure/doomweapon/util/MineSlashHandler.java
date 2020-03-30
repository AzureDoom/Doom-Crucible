package mod.azure.doomweapon.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.doomweapon.DoomWeaponMod;

public class MineSlashHandler {

	public MineSlashHandler() {
		MineAndSlashAPI.addCompatibleItem(DoomWeaponMod.MODID + ":doomcrucible_open",
				new ConfigItem().setType(new Sword()).setAlwaysUnique());
	}
}