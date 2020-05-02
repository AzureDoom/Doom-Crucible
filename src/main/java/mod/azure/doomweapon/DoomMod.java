package mod.azure.doomweapon;

import mod.azure.doomweapon.config.DoomConfig;
import mod.azure.doomweapon.proxy.IProxy;
import mod.azure.doomweapon.util.DoomItems;
import mod.azure.doomweapon.util.MineSlashHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = DoomMod.MODID, name = DoomMod.NAME)
public class DoomMod {
	public static final String MODID = "doomweapon";
	public static final String NAME = "Doom Items Mod";

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

	public static final CreativeTabs DoomItemGroup = (new CreativeTabs("doomweapon") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DoomItems.tabicon);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");

}