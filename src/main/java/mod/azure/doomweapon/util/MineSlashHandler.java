package mod.azure.doomweapon.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Boots;
import com.robertx22.database.gearitemslots.Chest;
import com.robertx22.database.gearitemslots.Helmet;
import com.robertx22.database.gearitemslots.Pants;
import com.robertx22.database.gearitemslots.Sword;

public class MineSlashHandler {

	public static final List<String> TYPE = ImmutableList.of("praetor_doom", "doom", "astro_doom", "crimson_doom",
			"midnight_doom", "demonic_doom", "sentinel_doom", "ember_doom", "zombie_doom", "doomicorn_doom",
			"classic_doom");

	public String MODID = "doomweapon:";

	public MineSlashHandler() {
		MineAndSlashAPI.addCompatibleItem(MODID + "doomcrucible_open",
				new ConfigItem().setType(new Sword()).setAlwaysUnique());
		MineAndSlashAPI.addCompatibleItem(MODID + "axe_crucible_open",
				new ConfigItem().setType(new Axe()).setAlwaysUnique());
		for (String t : TYPE) {
			MineAndSlashAPI.addCompatibleItem("doomweapon:" + t + "_helmet", new ConfigItem().setType(new Helmet()));
			MineAndSlashAPI.addCompatibleItem("doomweapon:" + t + "_chestnew ", new ConfigItem().setType(new Chest()));
			MineAndSlashAPI.addCompatibleItem("doomweapon:" + t + "_leggings", new ConfigItem().setType(new Pants()));
			MineAndSlashAPI.addCompatibleItem("doomweapon:" + t + "_boots", new ConfigItem().setType(new Boots()));
		}
	}
}