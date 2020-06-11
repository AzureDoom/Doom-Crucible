package mod.azure.doomweapon.util;

import mod.azure.doomweapon.item.ArgentEnergyItem;
import mod.azure.doomweapon.item.UnopenedItem;
import mod.azure.doomweapon.item.armor.AstroDoomArmor;
import mod.azure.doomweapon.item.armor.ClassicDoomArmor;
import mod.azure.doomweapon.item.armor.CrimsonDoomArmor;
import mod.azure.doomweapon.item.armor.CultistDoomArmor;
import mod.azure.doomweapon.item.armor.DemonicDoomArmor;
import mod.azure.doomweapon.item.armor.DoomArmor;
import mod.azure.doomweapon.item.armor.DoomicornDoomArmor;
import mod.azure.doomweapon.item.armor.EmberDoomArmor;
import mod.azure.doomweapon.item.armor.GoldDoomArmor;
import mod.azure.doomweapon.item.armor.MaykrDoomArmor;
import mod.azure.doomweapon.item.armor.MidnightDoomArmor;
import mod.azure.doomweapon.item.armor.MulletDoomArmor;
import mod.azure.doomweapon.item.armor.NightmareDoomArmor;
import mod.azure.doomweapon.item.armor.PainterDoomArmor;
import mod.azure.doomweapon.item.armor.PhobosDoomArmor;
import mod.azure.doomweapon.item.armor.PraetorDoomArmor;
import mod.azure.doomweapon.item.armor.PurplePonyDoomArmor;
import mod.azure.doomweapon.item.armor.SentinelDoomArmor;
import mod.azure.doomweapon.item.armor.ZombieDoomArmor;
import mod.azure.doomweapon.item.tools.ArgentAxe;
import mod.azure.doomweapon.item.tools.ArgentHoe;
import mod.azure.doomweapon.item.tools.ArgentPickaxe;
import mod.azure.doomweapon.item.tools.ArgentShovel;
import mod.azure.doomweapon.item.weapons.ArgentSword;
import mod.azure.doomweapon.item.weapons.AxeMarauderItem;
import mod.azure.doomweapon.item.weapons.Ballista;
import mod.azure.doomweapon.item.weapons.Shotgun;
import mod.azure.doomweapon.item.weapons.SuperShotgun;
import mod.azure.doomweapon.item.weapons.SwordCrucibleItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class DoomItems {

	public static Item ARGENT_ENERGY;
	public static Item ICON;

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
	public static IArmorMaterial phobos_armor = DoomArmorMaterial.PHOBOS_DOOM_ARMOR;
	public static IArmorMaterial nightmare_armor = DoomArmorMaterial.NIGHTMARE_DOOM_ARMOR;
	public static IArmorMaterial purplepony_armor = DoomArmorMaterial.PURPLEPONY_DOOM_ARMOR;
	public static IArmorMaterial classic_red_armor = DoomArmorMaterial.CLASSIC_RED_ARMOR;
	public static IArmorMaterial classic_indigo_armor = DoomArmorMaterial.CLASSIC_INDIGO_ARMOR;
	public static IArmorMaterial classic_bronze_armor = DoomArmorMaterial.CLASSIC_BRONZE_ARMOR;
	public static IArmorMaterial gold_armor = DoomArmorMaterial.GOLD_ARMOR;
	public static IArmorMaterial twenty_five_armor = DoomArmorMaterial.TWENTY_FIVE_ARMOR;
	public static IArmorMaterial bronze_doom_armor = DoomArmorMaterial.BRONZE_DOOM_ARMOR;
	public static IArmorMaterial painter_doom_armor = DoomArmorMaterial.PAINTER_DOOM_ARMOR;
	public static IArmorMaterial cultist_doom_armor = DoomArmorMaterial.CULTIST_DOOM_ARMOR;
	public static IArmorMaterial maykr_doom_armor = DoomArmorMaterial.MAYKR_DOOM_ARMOR;
	public static IArmorMaterial redneck1_armor = DoomArmorMaterial.REDNECK1_ARMOR;
	public static IArmorMaterial redneck2_armor = DoomArmorMaterial.REDNECK2_ARMOR;
	public static IArmorMaterial redneck3_armor = DoomArmorMaterial.REDNECK3_ARMOR;

	public static EquipmentSlotType helmet = EquipmentSlotType.HEAD;
	public static EquipmentSlotType chest = EquipmentSlotType.CHEST;
	public static EquipmentSlotType pants = EquipmentSlotType.LEGS;
	public static EquipmentSlotType boots = EquipmentSlotType.FEET;

	@Mod.EventBusSubscriber(bus = Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(ARGENT_ENERGY = new ArgentEnergyItem("argent_energy"),
					new ArgentAxe("argent_axe"), new ArgentHoe("argent_hoe"), new ArgentPickaxe("argent_pickaxe"),
					new ArgentShovel("argent_shovel"), new ArgentSword("argent_sword"),
					ICON = new SwordCrucibleItem("doomcrucible_open"), new UnopenedItem("doomcrucible_closed"),
					new AxeMarauderItem("axe_marauder_open"), new UnopenedItem("axe_marauder_closed"),
					new SuperShotgun("supershotgun"), new Shotgun("shotgun"), new Ballista("ballista"),
					new DoomArmor(doom_armor, helmet, "doom_helmet"),
					new DoomArmor(doom_armor, chest, "doom_chestplate"),
					new DoomArmor(doom_armor, pants, "doom_leggings"), new DoomArmor(doom_armor, boots, "doom_boots"),
					new ClassicDoomArmor(classic_armor, helmet, "classic_doom_helmet"),
					new ClassicDoomArmor(classic_armor, chest, "classic_doom_chestplate"),
					new ClassicDoomArmor(classic_armor, pants, "classic_doom_leggings"),
					new ClassicDoomArmor(classic_armor, boots, "classic_doom_boots"),
					new PraetorDoomArmor(praetor_armor, helmet, "praetor_doom_helmet"),
					new PraetorDoomArmor(praetor_armor, chest, "praetor_doom_chestplate"),
					new PraetorDoomArmor(praetor_armor, pants, "praetor_doom_leggings"),
					new PraetorDoomArmor(praetor_armor, boots, "praetor_doom_boots"),
					new AstroDoomArmor(astro_armor, helmet, "astro_doom_helmet"),
					new AstroDoomArmor(astro_armor, chest, "astro_doom_chestplate"),
					new AstroDoomArmor(astro_armor, pants, "astro_doom_leggings"),
					new AstroDoomArmor(astro_armor, boots, "astro_doom_boots"),
					new CrimsonDoomArmor(crimson_armor, helmet, "crimson_doom_helmet"),
					new CrimsonDoomArmor(crimson_armor, chest, "crimson_doom_chestplate"),
					new CrimsonDoomArmor(crimson_armor, pants, "crimson_doom_leggings"),
					new CrimsonDoomArmor(crimson_armor, boots, "crimson_doom_boots"),
					new MidnightDoomArmor(midnight_armor, helmet, "midnight_doom_helmet"),
					new MidnightDoomArmor(midnight_armor, chest, "midnight_doom_chestplate"),
					new MidnightDoomArmor(midnight_armor, pants, "midnight_doom_leggings"),
					new MidnightDoomArmor(midnight_armor, boots, "midnight_doom_boots"),
					new DemonicDoomArmor(demonic_armor, helmet, "demonic_doom_helmet"),
					new DemonicDoomArmor(demonic_armor, chest, "demonic_doom_chestplate"),
					new DemonicDoomArmor(demonic_armor, pants, "demonic_doom_leggings"),
					new DemonicDoomArmor(demonic_armor, boots, "demonic_doom_boots"),
					new SentinelDoomArmor(sentinel_armor, helmet, "sentinel_doom_helmet"),
					new SentinelDoomArmor(sentinel_armor, chest, "sentinel_doom_chestplate"),
					new SentinelDoomArmor(sentinel_armor, pants, "sentinel_doom_leggings"),
					new SentinelDoomArmor(sentinel_armor, boots, "sentinel_doom_boots"),
					new EmberDoomArmor(ember_armor, helmet, "ember_doom_helmet"),
					new EmberDoomArmor(ember_armor, chest, "ember_doom_chestplate"),
					new EmberDoomArmor(ember_armor, pants, "ember_doom_leggings"),
					new EmberDoomArmor(ember_armor, boots, "ember_doom_boots"),
					new ZombieDoomArmor(zombie_armor, helmet, "zombie_doom_helmet"),
					new ZombieDoomArmor(zombie_armor, chest, "zombie_doom_chestplate"),
					new ZombieDoomArmor(zombie_armor, pants, "zombie_doom_leggings"),
					new ZombieDoomArmor(zombie_armor, boots, "zombie_doom_boots"),
					new PhobosDoomArmor(phobos_armor, helmet, "phobos_doom_helmet"),
					new PhobosDoomArmor(phobos_armor, chest, "phobos_doom_chestplate"),
					new PhobosDoomArmor(phobos_armor, pants, "phobos_doom_leggings"),
					new PhobosDoomArmor(phobos_armor, boots, "phobos_doom_boots"),
					new NightmareDoomArmor(nightmare_armor, helmet, "nightmare_doom_helmet"),
					new NightmareDoomArmor(nightmare_armor, chest, "nightmare_doom_chestplate"),
					new NightmareDoomArmor(nightmare_armor, pants, "nightmare_doom_leggings"),
					new NightmareDoomArmor(nightmare_armor, boots, "nightmare_doom_boots"),
					new PurplePonyDoomArmor(purplepony_armor, helmet, "purplepony_doom_helmet"),
					new PurplePonyDoomArmor(purplepony_armor, chest, "purplepony_doom_chestplate"),
					new PurplePonyDoomArmor(purplepony_armor, pants, "purplepony_doom_leggings"),
					new PurplePonyDoomArmor(purplepony_armor, boots, "purplepony_doom_boots"),
					new DoomicornDoomArmor(doomicorn_armor, helmet, "doomicorn_doom_helmet"),
					new DoomicornDoomArmor(doomicorn_armor, chest, "doomicorn_doom_chestplate"),
					new DoomicornDoomArmor(doomicorn_armor, pants, "doomicorn_doom_leggings"),
					new DoomicornDoomArmor(doomicorn_armor, boots, "doomicorn_doom_boots"),
					new ClassicDoomArmor(classic_red_armor, chest, "classic_red_chestplate"),
					new ClassicDoomArmor(classic_red_armor, pants, "classic_red_leggings"),
					new ClassicDoomArmor(classic_indigo_armor, chest, "classic_black_chestplate"),
					new ClassicDoomArmor(classic_indigo_armor, pants, "classic_black_leggings"),
					new ClassicDoomArmor(classic_bronze_armor, chest, "classic_bronze_chestplate"),
					new ClassicDoomArmor(classic_bronze_armor, pants, "classic_bronze_leggings"),
					new GoldDoomArmor(gold_armor, helmet, "gold_doom_helmet"),
					new GoldDoomArmor(gold_armor, chest, "gold_doom_chestplate"),
					new GoldDoomArmor(gold_armor, pants, "gold_doom_leggings"),
					new GoldDoomArmor(gold_armor, boots, "gold_doom_boots"),
					new DoomArmor(twenty_five_armor, helmet, "twenty_five_helmet"),
					new DoomArmor(twenty_five_armor, chest, "twenty_five_chestplate"),
					new DoomArmor(twenty_five_armor, pants, "twenty_five_leggings"),
					new DoomArmor(twenty_five_armor, boots, "twenty_five_boots"),
					new DoomArmor(bronze_doom_armor, helmet, "bronze_doom_helmet"),
					new DoomArmor(bronze_doom_armor, chest, "bronze_doom_chestplate"),
					new DoomArmor(bronze_doom_armor, pants, "bronze_doom_leggings"),
					new DoomArmor(bronze_doom_armor, boots, "bronze_doom_boots"),
					new CultistDoomArmor(cultist_doom_armor, helmet, "cultist_doom_helmet"),
					new CultistDoomArmor(cultist_doom_armor, chest, "cultist_doom_chestplate"),
					new CultistDoomArmor(cultist_doom_armor, pants, "cultist_doom_leggings"),
					new CultistDoomArmor(cultist_doom_armor, boots, "cultist_doom_boots"),
					new MaykrDoomArmor(maykr_doom_armor, helmet, "maykr_doom_helmet"),
					new MaykrDoomArmor(maykr_doom_armor, chest, "maykr_doom_chestplate"),
					new MaykrDoomArmor(maykr_doom_armor, pants, "maykr_doom_leggings"),
					new MaykrDoomArmor(maykr_doom_armor, boots, "maykr_doom_boots"),
					new PainterDoomArmor(painter_doom_armor, helmet, "painter_doom_helmet"),
					new PainterDoomArmor(painter_doom_armor, chest, "painter_doom_chestplate"),
					new PainterDoomArmor(painter_doom_armor, pants, "painter_doom_leggings"),
					new PainterDoomArmor(painter_doom_armor, boots, "painter_doom_boots"),
					new MulletDoomArmor(redneck1_armor, helmet, "redneck_doom_helmet"),
					new MulletDoomArmor(redneck1_armor, chest, "redneck_doom1_chestplate"),
					new MulletDoomArmor(redneck2_armor, chest, "redneck_doom2_chestplate"),
					new MulletDoomArmor(redneck3_armor, chest, "redneck_doom3_chestplate"),
					new MulletDoomArmor(redneck1_armor, pants, "redneck_doom_leggings"),
					new MulletDoomArmor(redneck1_armor, boots, "redneck_doom_boots"));

		}
	}
}