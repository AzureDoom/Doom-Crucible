package mod.azure.doomweapon;

import mod.azure.doomweapon.config.DoomConfig;
import mod.azure.doomweapon.proxy.IProxy;
import mod.azure.doomweapon.util.MineSlashHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DoomWeaponMod.MODID, name = DoomWeaponMod.NAME)
public class DoomWeaponMod {
	public static final String MODID = "doomweapon";
	public static final String NAME = "Doom Weapon";

	@SidedProxy(clientSide = "mod.azure.doomweapon.proxy.Client", serverSide = "mod.azure.doomweapon.proxy.Server")
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
		if (Loader.isModLoaded("mmorpg") && DoomConfig.USE_COMPATIBILITY_ITEMS) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}
}