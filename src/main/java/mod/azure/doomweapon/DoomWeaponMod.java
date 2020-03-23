package mod.azure.doomweapon;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(DoomWeaponMod.MODID)
public class DoomWeaponMod {

	public static DoomWeaponMod instance;
	public static final String MODID = "doomweapon";

	public DoomWeaponMod() {
		instance = this;
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC, "doomweapon-config.toml");
		Config.loadConfig(Config.SERVER_SPEC, FMLPaths.CONFIGDIR.get().resolve("doomweapon-config.toml").toString());
	}
}