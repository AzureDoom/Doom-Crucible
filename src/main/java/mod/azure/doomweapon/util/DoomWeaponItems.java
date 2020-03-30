package mod.azure.doomweapon.util;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.item.SwordCrucibleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class DoomWeaponItems {
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(new SwordCrucibleItem("doomcrucible_open"),
					new Item(new Item.Properties().group(ItemGroup.TOOLS)).setRegistryName(DoomWeaponMod.MODID,
							"doomcrucible_closed"));
		}
	}
}