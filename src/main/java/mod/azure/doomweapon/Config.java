package mod.azure.doomweapon;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public ConfigValue<Integer> CRUCIBLE_ATTACK;
		public ConfigValue<Integer> CRUCIBLE_MAXDAMAGE;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.push("general");
			CRUCIBLE_ATTACK = builder.comment(
					"Attack damage of Crucible. Minecraft adds 4 to this number so set it four lower then you want.")
					.translation(DoomWeaponMod.MODID + ".config.crucible_attack").define("CRUCIBLE_ATTACK", 4);
			CRUCIBLE_MAXDAMAGE = builder.comment("Max damage of Crucible.")
					.translation(DoomWeaponMod.MODID + ".config.crucible_maxdamage").define("CRUCIBLE_MAXDAMAGE", 300);
			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		file.load();
		config.setConfig(file);
	}
}