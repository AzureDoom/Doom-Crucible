package mod.azure.doomweapon.util;

import mod.azure.doomweapon.itmes.BaseItem;
import mod.azure.doomweapon.itmes.BaseSwordItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DoomItems {

	public static Item tabicon;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(tabicon = new BaseSwordItem("doomcrucible_open"),
				new BaseItem("doomcrucible_closed")
				//, new BaseSwordItem("crucible_axe_open"), new BaseItem("crucible_axe_closed")
				);
	}
}