package mod.azure.doomweapon.util;

import mod.azure.doomweapon.item.ArgentEnergyItem;
import mod.azure.doomweapon.item.DoomArmorMaterial;
import mod.azure.doomweapon.item.UnopenedItem;
import mod.azure.doomweapon.item.armor.DoomArmor;
import mod.azure.doomweapon.item.tools.ArgentAxe;
import mod.azure.doomweapon.item.tools.ArgentHoe;
import mod.azure.doomweapon.item.tools.ArgentPickaxe;
import mod.azure.doomweapon.item.tools.ArgentShovel;
import mod.azure.doomweapon.item.weapons.AxeCrucibleItem;
import mod.azure.doomweapon.item.weapons.SwordCrucibleItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class DoomItems {

	public static Item CRUCIBLE;
	public static Item ARGENT_ENERGY;

	public static IArmorMaterial doom_armor = DoomArmorMaterial.DOOM_ARMOR;
	public static IArmorMaterial praetor_armor = DoomArmorMaterial.PRAETOR_DOOM_ARMOR;
	public static IArmorMaterial astro_armor = DoomArmorMaterial.ASTRO_DOOM_ARMOR;
	public static IArmorMaterial crimson_armor = DoomArmorMaterial.CRIMSON_DOOM_ARMOR;
	public static IArmorMaterial midnight_armor = DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR;
	public static IArmorMaterial demonic_armor = DoomArmorMaterial.DEMONIC_DOOM_ARMOR;
	public static IArmorMaterial sentinel_armor = DoomArmorMaterial.SENTINEL_DOOM_ARMOR;
	public static IArmorMaterial ember_armor = DoomArmorMaterial.EMBER_DOOM_ARMOR;
	public static IArmorMaterial zombie_armor = DoomArmorMaterial.ZOMBIE_DOOM_ARMOR;
	public static IArmorMaterial doomicorn_armor = DoomArmorMaterial.DOOMICORN_DOOM_ARMOR;
	public static IArmorMaterial classic_armor = DoomArmorMaterial.CLASSIC_DOOM_ARMOR;

	public static EquipmentSlotType helmet = EquipmentSlotType.HEAD;
	public static EquipmentSlotType chest = EquipmentSlotType.CHEST;
	public static EquipmentSlotType pants = EquipmentSlotType.LEGS;
	public static EquipmentSlotType boots = EquipmentSlotType.FEET;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(ARGENT_ENERGY = new ArgentEnergyItem("argent_energy"),
					new ArgentAxe("argent_axe"), new ArgentHoe("argent_hoe"), new ArgentPickaxe("argent_pickaxe"),
					new ArgentShovel("argent_shovel"), CRUCIBLE = new SwordCrucibleItem("doomcrucible_open"),
					new UnopenedItem("doomcrucible_closed"), new AxeCrucibleItem("axe_crucible_open"),
					new UnopenedItem("axe_crucible_closed"), new DoomArmor(doom_armor, helmet, "doom_helmet"),
					new DoomArmor(doom_armor, chest, "doom_chestplate"),
					new DoomArmor(doom_armor, pants, "doom_leggings"), new DoomArmor(doom_armor, boots, "doom_boots"),
					new DoomArmor(praetor_armor, helmet, "praetor_doom_helmet"),
					new DoomArmor(praetor_armor, chest, "praetor_doom_chestplate"),
					new DoomArmor(praetor_armor, pants, "praetor_doom_leggings"),
					new DoomArmor(praetor_armor, boots, "praetor_doom_boots"),
					new DoomArmor(astro_armor, helmet, "astro_doom_helmet"),
					new DoomArmor(astro_armor, chest, "astro_doom_chestplate"),
					new DoomArmor(astro_armor, pants, "astro_doom_leggings"),
					new DoomArmor(astro_armor, boots, "astro_doom_boots"),
					new DoomArmor(crimson_armor, helmet, "crimson_doom_helmet"),
					new DoomArmor(crimson_armor, chest, "crimson_doom_chestplate"),
					new DoomArmor(crimson_armor, pants, "crimson_doom_leggings"),
					new DoomArmor(crimson_armor, boots, "crimson_doom_boots"),
					new DoomArmor(midnight_armor, helmet, "midnight_doom_helmet"),
					new DoomArmor(midnight_armor, chest, "midnight_doom_chestplate"),
					new DoomArmor(midnight_armor, pants, "midnight_doom_leggings"),
					new DoomArmor(midnight_armor, boots, "midnight_doom_boots"),
					new DoomArmor(demonic_armor, helmet, "demonic_doom_helmet"),
					new DoomArmor(demonic_armor, chest, "demonic_doom_chestplate"),
					new DoomArmor(demonic_armor, pants, "demonic_doom_leggings"),
					new DoomArmor(demonic_armor, boots, "demonic_doom_boots"),
					new DoomArmor(sentinel_armor, helmet, "sentinel_doom_helmet"),
					new DoomArmor(sentinel_armor, chest, "sentinel_doom_chestplate"),
					new DoomArmor(sentinel_armor, pants, "sentinel_doom_leggings"),
					new DoomArmor(sentinel_armor, boots, "sentinel_doom_boots"),
					new DoomArmor(ember_armor, helmet, "ember_doom_helmet"),
					new DoomArmor(ember_armor, chest, "ember_doom_chestplate"),
					new DoomArmor(ember_armor, pants, "ember_doom_leggings"),
					new DoomArmor(ember_armor, boots, "ember_doom_boots"),
					new DoomArmor(zombie_armor, helmet, "zombie_doom_helmet"),
					new DoomArmor(zombie_armor, chest, "zombie_doom_chestplate"),
					new DoomArmor(zombie_armor, pants, "zombie_doom_leggings"),
					new DoomArmor(zombie_armor, boots, "zombie_doom_boots"),
					new DoomArmor(doomicorn_armor, helmet, "doomicorn_doom_helmet"),
					new DoomArmor(doomicorn_armor, chest, "doomicorn_doom_chestplate"),
					new DoomArmor(doomicorn_armor, pants, "doomicorn_doom_leggings"),
					new DoomArmor(doomicorn_armor, boots, "doomicorn_doom_boots"),
					new DoomArmor(classic_armor, helmet, "classic_doom_helmet"),
					new DoomArmor(classic_armor, chest, "classic_doom_chestplate"),
					new DoomArmor(classic_armor, pants, "classic_doom_leggings"),
					new DoomArmor(classic_armor, boots, "classic_doom_boots"));
		}
	}
}