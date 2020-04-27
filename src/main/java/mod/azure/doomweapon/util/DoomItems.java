package mod.azure.doomweapon.util;

import mod.azure.doomweapon.items.ArgentEnergyItem;
import mod.azure.doomweapon.items.BaseItem;
import mod.azure.doomweapon.items.BaseSwordItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DoomItems {

	public static Item tabicon;
	public static Item argentenergy;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(tabicon = new BaseSwordItem("doomcrucible_open"),
				new BaseItem("doomcrucible_closed"), argentenergy = new ArgentEnergyItem("argent_energy")
		// , new BaseSwordItem("crucible_axe_open"), new BaseItem("crucible_axe_closed")
		);
		//event.getRegistry().registerAll(
				// new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST, "doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "doom_boots"),
				// new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "praetor_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"praetor_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"praetor_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.PRAETOR_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "praetor_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "astro_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"astro_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "astro_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.ASTRO_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "astro_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "crimson_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"crimson_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"crimson_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.CRIMSON_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "crimson_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						//"midnight_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"midnight_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"midnight_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.MIDNIGHT_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET,
						//"midnight_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "demonic_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"demonic_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"demonic_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.DEMONIC_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "demonic_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						//"sentinel_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"sentinel_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"sentinel_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.SENTINEL_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET,
						//"sentinel_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "ember_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"ember_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "ember_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.EMBER_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "ember_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "zombie_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"zombie_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS, "zombie_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.ZOMBIE_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "zombie_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD,
						//"doomicorn_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"doomicorn_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"doomicorn_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.DOOMICORN_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET,
						//"doomicorn_doom_boots"),
				// new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.HEAD, "classic_doom_helmet"),
				// new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.CHEST,
						//"classic_doom_chestplate"),
				// new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.LEGS,
						//"classic_doom_leggings"),
				// new DoomArmor(DoomArmorMaterial.CLASSIC_DOOM_ARMOR, 5, EntityEquipmentSlot.FEET, "classic_doom_boots"));
	}
}