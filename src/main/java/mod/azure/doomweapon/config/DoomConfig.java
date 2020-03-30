package mod.azure.doomweapon.config;

import mod.azure.doomweapon.DoomWeaponMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = DoomWeaponMod.MODID)
@Config.LangKey("doomweapon.config.title")
public class DoomConfig {
	
	@Config.Name("Default Mine and Slash Stats")
    @Config.Comment("Auto Compat with Mine and Slash")
    public static boolean USE_COMPATIBILITY_ITEMS = true;

    @Mod.EventBusSubscriber(modid = DoomWeaponMod.MODID)
    private static class EventHandler {

        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(DoomWeaponMod.MODID)) {
                ConfigManager.sync(DoomWeaponMod.MODID, Config.Type.INSTANCE);
            }
        }
    }

}