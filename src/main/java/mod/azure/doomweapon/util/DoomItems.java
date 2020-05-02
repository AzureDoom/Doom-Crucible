package mod.azure.doomweapon.util;

import javax.annotation.Nonnull;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.items.ArgentEnergyItem;
import mod.azure.doomweapon.items.armor.AstroArmor;
import mod.azure.doomweapon.items.armor.ClassicArmor;
import mod.azure.doomweapon.items.armor.CrimsonArmor;
import mod.azure.doomweapon.items.armor.DemonicArmor;
import mod.azure.doomweapon.items.armor.DoomArmor;
import mod.azure.doomweapon.items.armor.DoomicornArmor;
import mod.azure.doomweapon.items.armor.EmberArmor;
import mod.azure.doomweapon.items.armor.MidnightArmor;
import mod.azure.doomweapon.items.armor.NightmareArmor;
import mod.azure.doomweapon.items.armor.PhobosArmor;
import mod.azure.doomweapon.items.armor.PraetorArmor;
import mod.azure.doomweapon.items.armor.PurplePonyArmor;
import mod.azure.doomweapon.items.armor.SentinalArmor;
import mod.azure.doomweapon.items.armor.ZombieArmor;
import mod.azure.doomweapon.items.tools.ArgentAxe;
import mod.azure.doomweapon.items.tools.ArgentHoe;
import mod.azure.doomweapon.items.tools.ArgentPickaxe;
import mod.azure.doomweapon.items.tools.ArgentShovel;
import mod.azure.doomweapon.items.tools.ArgentSword;
import mod.azure.doomweapon.items.weapons.AxeMarauderItem;
import mod.azure.doomweapon.items.weapons.SwordCrucibleItem;
import mod.azure.doomweapon.items.weapons.UnopenedItem;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(DoomMod.MODID)
@Mod.EventBusSubscriber
public class DoomItems {
	
	public static Item argentenergy;
	public static Item tabicon;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(argentenergy = new ArgentEnergyItem("argent_energy"));
		event.getRegistry().registerAll(tabicon = new SwordCrucibleItem("doomcrucible_open"),
				new UnopenedItem("doomcrucible_closed"), new AxeMarauderItem("axe_marauder_open"),
				new UnopenedItem("axe_marauder_closed"));
		event.getRegistry().registerAll(new ArgentAxe("argent_axe"), new ArgentHoe("argent_hoe"),
				new ArgentPickaxe("argent_pickaxe"), new ArgentShovel("argent_shovel"),
				new ArgentSword("argent_sword"));
		event.getRegistry().registerAll(
				new DoomArmor(DoomMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "doom_helmet"),
				new DoomArmor(DoomMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST, "doom_chestplate"),
				new DoomArmor(DoomMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "doom_leggings"),
				new DoomArmor(DoomMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "doom_boots"),
				new PraetorArmor(DoomMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "praetor_doom_helmet"),
				new PraetorArmor(DoomMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"praetor_doom_chestplate"),
				new PraetorArmor(DoomMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "praetor_doom_leggings"),
				new PraetorArmor(DoomMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "praetor_doom_boots"),
				new AstroArmor(DoomMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "astro_doom_helmet"),
				new AstroArmor(DoomMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST, "astro_doom_chestplate"),
				new AstroArmor(DoomMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "astro_doom_leggings"),
				new AstroArmor(DoomMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "astro_doom_boots"),
				new CrimsonArmor(DoomMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "crimson_doom_helmet"),
				new CrimsonArmor(DoomMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"crimson_doom_chestplate"),
				new CrimsonArmor(DoomMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "crimson_doom_leggings"),
				new CrimsonArmor(DoomMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "crimson_doom_boots"),
				new MidnightArmor(DoomMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						"midnight_doom_helmet"),
				new MidnightArmor(DoomMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"midnight_doom_chestplate"),
				new MidnightArmor(DoomMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						"midnight_doom_leggings"),
				new MidnightArmor(DoomMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "midnight_doom_boots"),
				new DemonicArmor(DoomMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "demonic_doom_helmet"),
				new DemonicArmor(DoomMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"demonic_doom_chestplate"),
				new DemonicArmor(DoomMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "demonic_doom_leggings"),
				new DemonicArmor(DoomMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "demonic_doom_boots"),
				new SentinalArmor(DoomMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						"sentinel_doom_helmet"),
				new SentinalArmor(DoomMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"sentinel_doom_chestplate"),
				new SentinalArmor(DoomMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						"sentinel_doom_leggings"),
				new SentinalArmor(DoomMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "sentinel_doom_boots"),
				new ClassicArmor(DoomMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "classic_doom_helmet"),
				new ClassicArmor(DoomMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"classic_doom_chestplate"),
				new ClassicArmor(DoomMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "classic_doom_leggings"),
				new ClassicArmor(DoomMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "classic_doom_boots"),
				new EmberArmor(DoomMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "ember_doom_helmet"),
				new EmberArmor(DoomMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST, "ember_doom_chestplate"),
				new EmberArmor(DoomMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "ember_doom_leggings"),
				new EmberArmor(DoomMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "ember_doom_boots"),
				new ZombieArmor(DoomMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "zombie_doom_helmet"),
				new ZombieArmor(DoomMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST, "zombie_doom_chestplate"),
				new ZombieArmor(DoomMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "zombie_doom_leggings"),
				new ZombieArmor(DoomMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "zombie_doom_boots"),
				new DoomicornArmor(DoomMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						"doomicorn_doom_helmet"),
				new DoomicornArmor(DoomMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"doomicorn_doom_chestplate"),
				new DoomicornArmor(DoomMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						"doomicorn_doom_leggings"),
				new DoomicornArmor(DoomMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET,
						"doomicorn_doom_boots"),
				new PhobosArmor(DoomMaterial.PHOBOS_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "phobos_doom_helmet"),
				new PhobosArmor(DoomMaterial.PHOBOS_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST, "phobos_doom_chestplate"),
				new PhobosArmor(DoomMaterial.PHOBOS_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "phobos_doom_leggings"),
				new PhobosArmor(DoomMaterial.PHOBOS_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "phobos_doom_boots"),
				new NightmareArmor(DoomMaterial.NIGHTMARE_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						"nightmare_doom_helmet"),
				new NightmareArmor(DoomMaterial.NIGHTMARE_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"nightmare_doom_chestplate"),
				new NightmareArmor(DoomMaterial.NIGHTMARE_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						"nightmare_doom_leggings"),
				new NightmareArmor(DoomMaterial.NIGHTMARE_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET,
						"nightmare_doom_boots"),
				new PurplePonyArmor(DoomMaterial.PURPLEPONY_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						"purplepony_doom_helmet"),
				new PurplePonyArmor(DoomMaterial.PURPLEPONY_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						"purplepony_doom_chestplate"),
				new PurplePonyArmor(DoomMaterial.PURPLEPONY_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						"purplepony_doom_leggings"),
				new PurplePonyArmor(DoomMaterial.PURPLEPONY_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET,
						"purplepony_doom_boots"));
	}
}