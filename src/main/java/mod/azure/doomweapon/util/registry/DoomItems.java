package mod.azure.doomweapon.util.registry;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.item.ArgentEnergyItem;
import mod.azure.doomweapon.item.UnopenedItem;
import mod.azure.doomweapon.item.ammo.ArgentBolt;
import mod.azure.doomweapon.item.ammo.ShellAmmo;
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
import mod.azure.doomweapon.util.enums.DoomArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DoomItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, DoomMod.MODID);

	// AMMO
	public static final RegistryObject<Item> SHOTGUN_SHELLS = ITEMS.register("shotgun_shells",
			() -> new ShellAmmo(new Item.Properties().group(DoomMod.DoomItemGroup), 2.0F));
	public static final RegistryObject<Item> ARGENT_BOLT = ITEMS.register("argent_bolt",
			() -> new ArgentBolt(new Item.Properties().group(DoomMod.DoomItemGroup), 2.7F));
	// MISC
	public static final RegistryObject<Item> ARGENT_ENERGY = ITEMS.register("argent_energy",
			() -> new ArgentEnergyItem());
	// WEAPONS AND TOOLS
	public static final RegistryObject<Item> ICON = ITEMS.register("doomcrucible_open", () -> new SwordCrucibleItem());
	public static final RegistryObject<Item> ARGENT_AXE = ITEMS.register("argent_axe", () -> new ArgentAxe());
	public static final RegistryObject<Item> ARGENT_HOE = ITEMS.register("argent_hoe", () -> new ArgentHoe());
	public static final RegistryObject<Item> ARGENT_PICKAXE = ITEMS.register("argent_pickaxe",
			() -> new ArgentPickaxe());
	public static final RegistryObject<Item> ARGENT_SHOVEL = ITEMS.register("argent_shovel", () -> new ArgentShovel());
	public static final RegistryObject<Item> ARGENT_SWORD = ITEMS.register("argent_sword", () -> new ArgentSword());
	public static final RegistryObject<Item> SWORD_CLOSED = ITEMS.register("doomcrucible_closed",
			() -> new UnopenedItem());
	public static final RegistryObject<Item> AXE_OPEN = ITEMS.register("axe_marauder_open",
			() -> new AxeMarauderItem());
	public static final RegistryObject<Item> AXE_CLOSED = ITEMS.register("axe_marauder_closed",
			() -> new UnopenedItem());
	public static final RegistryObject<Item> SSG = ITEMS.register("supershotgun", () -> new SuperShotgun());
	public static final RegistryObject<Item> SG = ITEMS.register("shotgun", () -> new Shotgun());
	// public static final RegistryObject<Item> BFG = ITEMS.register("bfg9000", ()
	// -> new BFG());
	public static final RegistryObject<Item> BALLISTA = ITEMS.register("ballista", () -> new Ballista());
	// ARMOR
	public static final RegistryObject<Item> DOOM_HELMET = ITEMS.register("doom_helmet",
			() -> new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> DOOM_CHESTPLATE = ITEMS.register("doom_chestplate",
			() -> new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> DOOM_LEGGINGS = ITEMS.register("doom_leggings",
			() -> new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> DOOM_BOOTS = ITEMS.register("doom_boots",
			() -> new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> PRAETOR_DOOM_HELMET = ITEMS.register("praetor_doom_helmet",
			() -> new PraetorDoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> PRAETOR_DOOM_CHESTPLATE = ITEMS.register("praetor_doom_chestplate",
			() -> new PraetorDoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> PRAETOR_DOOM_LEGGINGS = ITEMS.register("praetor_doom_leggings",
			() -> new PraetorDoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> PRAETOR_DOOM_BOOTS = ITEMS.register("praetor_doom_boots",
			() -> new PraetorDoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> ASTRO_DOOM_HELMET = ITEMS.register("astro_doom_helmet",
			() -> new AstroDoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> ASTRO_DOOM_CHESTPLATE = ITEMS.register("astro_doom_chestplate",
			() -> new AstroDoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> ASTRO_DOOM_LEGGINGS = ITEMS.register("astro_doom_leggings",
			() -> new AstroDoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> ASTRO_DOOM_BOOTS = ITEMS.register("astro_doom_boots",
			() -> new AstroDoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> CRIMSON_DOOM_HELMET = ITEMS.register("crimson_doom_helmet",
			() -> new CrimsonDoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> CRIMSON_DOOM_CHESTPLATE = ITEMS.register("crimson_doom_chestplate",
			() -> new CrimsonDoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CRIMSON_DOOM_LEGGINGS = ITEMS.register("crimson_doom_leggings",
			() -> new CrimsonDoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CRIMSON_DOOM_BOOTS = ITEMS.register("crimson_doom_boots",
			() -> new CrimsonDoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> MIDNIGHT_DOOM_HELMET = ITEMS.register("midnight_doom_helmet",
			() -> new MidnightDoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> MIDNIGHT_DOOM_CHESTPLATE = ITEMS.register("midnight_doom_chestplate",
			() -> new MidnightDoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> MIDNIGHT_DOOM_LEGGINGS = ITEMS.register("midnight_doom_leggings",
			() -> new MidnightDoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> MIDNIGHT_DOOM_BOOTS = ITEMS.register("midnight_doom_boots",
			() -> new MidnightDoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> DEMONIC_DOOM_HELMET = ITEMS.register("demonic_doom_helmet",
			() -> new DemonicDoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> DEMONIC_DOOM_CHESTPLATE = ITEMS.register("demonic_doom_chestplate",
			() -> new DemonicDoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> DEMONIC_DOOM_LEGGINGS = ITEMS.register("demonic_doom_leggings",
			() -> new DemonicDoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> DEMONIC_DOOM_BOOTS = ITEMS.register("demonic_doom_boots",
			() -> new DemonicDoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> SENTINEL_DOOM_HELMET = ITEMS.register("sentinel_doom_helmet",
			() -> new SentinelDoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> SENTINEL_DOOM_CHESTPLATE = ITEMS.register("sentinel_doom_chestplate",
			() -> new SentinelDoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> SENTINEL_DOOM_LEGGINGS = ITEMS.register("sentinel_doom_leggings",
			() -> new SentinelDoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> SENTINEL_DOOM_BOOTS = ITEMS.register("sentinel_doom_boots",
			() -> new SentinelDoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> EMBER_DOOM_HELMET = ITEMS.register("ember_doom_helmet",
			() -> new EmberDoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> EMBER_DOOM_CHESTPLATE = ITEMS.register("ember_doom_chestplate",
			() -> new EmberDoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> EMBER_DOOM_LEGGINGS = ITEMS.register("ember_doom_leggings",
			() -> new EmberDoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> EMBER_DOOM_BOOTS = ITEMS.register("ember_doom_boots",
			() -> new EmberDoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> ZOMBIE_DOOM_HELMET = ITEMS.register("zombie_doom_helmet",
			() -> new ZombieDoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> ZOMBIE_DOOM_CHESTPLATE = ITEMS.register("zombie_doom_chestplate",
			() -> new ZombieDoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> ZOMBIE_DOOM_LEGGINGS = ITEMS.register("zombie_doom_leggings",
			() -> new ZombieDoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> ZOMBIE_DOOM_BOOTS = ITEMS.register("zombie_doom_boots",
			() -> new ZombieDoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> PHOBOS_DOOM_HELMET = ITEMS.register("phobos_doom_helmet",
			() -> new PhobosDoomArmor(DoomArmorMaterial.PHOBOS_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> PHOBOS_DOOM_CHESTPLATE = ITEMS.register("phobos_doom_chestplate",
			() -> new PhobosDoomArmor(DoomArmorMaterial.PHOBOS_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> PHOBOS_DOOM_LEGGINGS = ITEMS.register("phobos_doom_leggings",
			() -> new PhobosDoomArmor(DoomArmorMaterial.PHOBOS_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> PHOBOS_DOOM_BOOTS = ITEMS.register("phobos_doom_boots",
			() -> new PhobosDoomArmor(DoomArmorMaterial.PHOBOS_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> NIGHTMARE_DOOM_HELMET = ITEMS.register("nightmare_doom_helmet",
			() -> new NightmareDoomArmor(DoomArmorMaterial.NIGHTMARE_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> NIGHTMARE_DOOM_CHESTPLATE = ITEMS.register("nightmare_doom_chestplate",
			() -> new NightmareDoomArmor(DoomArmorMaterial.NIGHTMARE_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> NIGHTMARE_DOOM_LEGGINGS = ITEMS.register("nightmare_doom_leggings",
			() -> new NightmareDoomArmor(DoomArmorMaterial.NIGHTMARE_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> NIGHTMARE_DOOM_BOOTS = ITEMS.register("nightmare_doom_boots",
			() -> new NightmareDoomArmor(DoomArmorMaterial.NIGHTMARE_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> PURPLEPONY_DOOM_HELMET = ITEMS.register("purplepony_doom_helmet",
			() -> new PurplePonyDoomArmor(DoomArmorMaterial.PURPLEPONY_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> PURPLEPONY_DOOM_CHESTPLATE = ITEMS.register("purplepony_doom_chestplate",
			() -> new PurplePonyDoomArmor(DoomArmorMaterial.PURPLEPONY_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> PURPLEPONY_DOOM_LEGGINGS = ITEMS.register("purplepony_doom_leggings",
			() -> new PurplePonyDoomArmor(DoomArmorMaterial.PURPLEPONY_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> PURPLEPONY_DOOM_BOOTS = ITEMS.register("purplepony_doom_boots",
			() -> new PurplePonyDoomArmor(DoomArmorMaterial.PURPLEPONY_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> DOOMICORN_DOOM_HELMET = ITEMS.register("doomicorn_doom_helmet",
			() -> new DoomicornDoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> DOOMICORN_DOOM_CHESTPLATE = ITEMS.register("doomicorn_doom_chestplate",
			() -> new DoomicornDoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> DOOMICORN_DOOM_LEGGINGS = ITEMS.register("doomicorn_doom_leggings",
			() -> new DoomicornDoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> DOOMICORN_DOOM_BOOTS = ITEMS.register("doomicorn_doom_boots",
			() -> new DoomicornDoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> GOLD_DOOM_HELMET = ITEMS.register("gold_doom_helmet",
			() -> new GoldDoomArmor(DoomArmorMaterial.GOLD_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> GOLD_DOOM_CHESTPLATE = ITEMS.register("gold_doom_chestplate",
			() -> new GoldDoomArmor(DoomArmorMaterial.GOLD_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> GOLD_DOOM_LEGGINGS = ITEMS.register("gold_doom_leggings",
			() -> new GoldDoomArmor(DoomArmorMaterial.GOLD_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> GOLD_DOOM_BOOTS = ITEMS.register("gold_doom_boots",
			() -> new GoldDoomArmor(DoomArmorMaterial.GOLD_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> TWENTY_FIVE_DOOM_HELMET = ITEMS.register("twenty_five_helmet",
			() -> new DoomArmor(DoomArmorMaterial.TWENTY_FIVE_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> TWENTY_FIVE_DOOM_CHESTPLATE = ITEMS.register("twenty_five_chestplate",
			() -> new DoomArmor(DoomArmorMaterial.TWENTY_FIVE_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> TWENTY_FIVE_DOOM_LEGGINGS = ITEMS.register("twenty_five_leggings",
			() -> new DoomArmor(DoomArmorMaterial.TWENTY_FIVE_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> TWENTY_FIVE_DOOM_BOOTS = ITEMS.register("twenty_five_boots",
			() -> new DoomArmor(DoomArmorMaterial.TWENTY_FIVE_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> BRONZE_DOOM_HELMET = ITEMS.register("bronze_doom_helmet",
			() -> new DoomArmor(DoomArmorMaterial.BRONZE_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> BRONZE_DOOM_CHESTPLATE = ITEMS.register("bronze_doom_chestplate",
			() -> new DoomArmor(DoomArmorMaterial.BRONZE_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> BRONZE_DOOM_LEGGINGS = ITEMS.register("bronze_doom_leggings",
			() -> new DoomArmor(DoomArmorMaterial.BRONZE_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> BRONZE_DOOM_BOOTS = ITEMS.register("bronze_doom_boots",
			() -> new DoomArmor(DoomArmorMaterial.BRONZE_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> CULTIST_DOOM_HELMET = ITEMS.register("cultist_doom_helmet",
			() -> new CultistDoomArmor(DoomArmorMaterial.CULTIST_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> CULTIST_DOOM_CHESTPLATE = ITEMS.register("cultist_doom_chestplate",
			() -> new CultistDoomArmor(DoomArmorMaterial.CULTIST_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CULTIST_DOOM_LEGGINGS = ITEMS.register("cultist_doom_leggings",
			() -> new CultistDoomArmor(DoomArmorMaterial.CULTIST_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CULTIST_DOOM_BOOTS = ITEMS.register("cultist_doom_boots",
			() -> new CultistDoomArmor(DoomArmorMaterial.CULTIST_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> MAYKR_DOOM_HELMET = ITEMS.register("maykr_doom_helmet",
			() -> new MaykrDoomArmor(DoomArmorMaterial.MAYKR_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> MAYKR_DOOM_CHESTPLATE = ITEMS.register("maykr_doom_chestplate",
			() -> new MaykrDoomArmor(DoomArmorMaterial.MAYKR_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> MAYKR_DOOM_LEGGINGS = ITEMS.register("maykr_doom_leggings",
			() -> new MaykrDoomArmor(DoomArmorMaterial.MAYKR_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> MAYKR_DOOM_BOOTS = ITEMS.register("maykr_doom_boots",
			() -> new MaykrDoomArmor(DoomArmorMaterial.MAYKR_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> PAINTER_DOOM_HELMET = ITEMS.register("painter_doom_helmet",
			() -> new PainterDoomArmor(DoomArmorMaterial.PAINTER_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> PAINTER_DOOM_CHESTPLATE = ITEMS.register("painter_doom_chestplate",
			() -> new PainterDoomArmor(DoomArmorMaterial.PAINTER_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> PAINTER_DOOM_LEGGINGS = ITEMS.register("painter_doom_leggings",
			() -> new PainterDoomArmor(DoomArmorMaterial.PAINTER_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> PAINTER_DOOM_BOOTS = ITEMS.register("painter_doom_boots",
			() -> new PainterDoomArmor(DoomArmorMaterial.PAINTER_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> CLASSIC_DOOM_HELMET = ITEMS.register("classic_doom_helmet",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> CLASSIC_DOOM_CHESTPLATE = ITEMS.register("classic_doom_chestplate",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CLASSIC_DOOM_LEGGINGS = ITEMS.register("classic_doom_leggings",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CLASSIC_RED_DOOM_CHESTPLATE = ITEMS.register("classic_red_chestplate",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_RED_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CLASSIC_RED_DOOM_LEGGINGS = ITEMS.register("classic_red_leggings",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_RED_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CLASSIC_INDIGO_DOOM_CHESTPLATE = ITEMS.register("classic_black_chestplate",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_INDIGO_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CLASSIC_INDIGO_DOOM_LEGGINGS = ITEMS.register("classic_black_leggings",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_INDIGO_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CLASSIC_BRONZE_DOOM_CHESTPLATE = ITEMS.register(
			"classic_bronze_chestplate",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_BRONZE_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> CLASSIC_BRONZE_DOOM_LEGGINGS = ITEMS.register("classic_bronze_leggings",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_BRONZE_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> CLASSIC_DOOM_BOOTS = ITEMS.register("classic_doom_boots",
			() -> new ClassicDoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, EquipmentSlotType.FEET));
	public static final RegistryObject<Item> MULLET_DOOM_HELMET = ITEMS.register("redneck_doom_helmet",
			() -> new MulletDoomArmor(DoomArmorMaterial.REDNECK1_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> DOOM_CHESTPLATE1 = ITEMS.register("redneck_doom1_chestplate",
			() -> new MulletDoomArmor(DoomArmorMaterial.REDNECK1_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> MULLET_DOOM_CHESTPLATE2 = ITEMS.register("redneck_doom2_chestplate",
			() -> new MulletDoomArmor(DoomArmorMaterial.REDNECK2_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> MULLET_DOOM_CHESTPLATE3 = ITEMS.register("redneck_doom3_chestplate",
			() -> new MulletDoomArmor(DoomArmorMaterial.REDNECK3_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> MULLET_DOOM_LEGGINGS = ITEMS.register("redneck_doom_leggings",
			() -> new MulletDoomArmor(DoomArmorMaterial.REDNECK1_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> MULLET_DOOM_BOOTS = ITEMS.register("redneck_doom_boots",
			() -> new MulletDoomArmor(DoomArmorMaterial.REDNECK1_ARMOR, EquipmentSlotType.FEET));
}