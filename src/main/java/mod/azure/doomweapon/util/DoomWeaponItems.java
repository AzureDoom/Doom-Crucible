package mod.azure.doomweapon.util;

import mod.azure.doomweapon.item.ArgentEnergyItem;
import mod.azure.doomweapon.item.DoomArmorMaterial;
import mod.azure.doomweapon.item.UnopenedItem;
import mod.azure.doomweapon.item.armor.DoomArmor;
import mod.azure.doomweapon.item.tools.ArgentAxe;
import mod.azure.doomweapon.item.tools.ArgentHoe;
import mod.azure.doomweapon.item.tools.ArgentPickaxe;
import mod.azure.doomweapon.item.tools.ArgentShovel;
import mod.azure.doomweapon.item.weapons.SwordCrucibleItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class DoomWeaponItems {

	public static Item CRUCIBLE;
	public static Item ARGENT_ENERGY;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().register(ARGENT_ENERGY = new ArgentEnergyItem("argent_energy"));
			event.getRegistry().registerAll(new ArgentAxe("argent_axe"), new ArgentHoe("argent_hoe"),
					new ArgentPickaxe("argent_pickaxe"), new ArgentShovel("argent_shovel"));
			event.getRegistry().registerAll(CRUCIBLE = new SwordCrucibleItem("doomcrucible_open"),
					new UnopenedItem("doomcrucible_closed")
			// , new AxeCrucibleItem("axe_crucible_open"),
			// new UnopenedItem("axe_crucible_closed")
			);
			event.getRegistry().registerAll(
					new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.HEAD, "doom_helmet"),
					new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.CHEST, "doom_chestplate"),
					new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.LEGS, "doom_leggings"),
					new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.FEET, "doom_boots"),
					new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.HEAD, "praetor_doom_helmet"),
					new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.CHEST,
							"praetor_doom_chestplate"),
					new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.LEGS,
							"praetor_doom_leggings"),
					new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.FEET, "praetor_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "astro_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "astro_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "astro_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "astro_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "crimson_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "crimson_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "crimson_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "crimson_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "midnight_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "midnight_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "midnight_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "midnight_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "demonic_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "demonic_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "demonic_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "demonic_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "sentinel_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "sentinel_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "sentinel_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "sentinel_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "ember_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "ember_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "ember_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "ember_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "zombie_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.CHEST,
					// "zombie_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "zombie_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "zombie_doom_boots"),
					// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.HEAD,
					// "doomicorn_doom_helmet"),
					// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR,
					// EquipmentSlotType.CHEST,
					// "doomicorn_doom_chestplate"),
					// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.LEGS,
					// "doomicorn_doom_leggings"),
					// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.FEET,
					// "doomicorn_doom_boots"),
					new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.HEAD, "classic_doom_helmet"),
					new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.CHEST,
							"classic_doom_chestplate"),
					new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.LEGS,
							"classic_doom_leggings"),
					new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.FEET, "classic_doom_boots"));
		}
	}
}