package mod.azure.doomweapon.util;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class DoomMaterial {

	public static final ArmorMaterial DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor", "doomweapon:doom_armor",
			1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial PRAETOR_DOOM_ARMOR = EnumHelper.addArmorMaterial("praetor_armor",
			"doomweapon:praetor_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial CLASSIC_DOOM_ARMOR = EnumHelper.addArmorMaterial("classic_armor",
			"doomweapon:classic_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial ASTRO_DOOM_ARMOR = EnumHelper.addArmorMaterial("astro_armor",
			"doomweapon:astro_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial CRIMSON_DOOM_ARMOR = EnumHelper.addArmorMaterial("crimson_armor",
			"doomweapon:crimson_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial MIDNIGHT_DOOM_ARMOR = EnumHelper.addArmorMaterial("midnight_armor",
			"doomweapon:midnight_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial DEMONIC_DOOM_ARMOR = EnumHelper.addArmorMaterial("demonic_armor",
			"doomweapon:demonic_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial SENTINEL_DOOM_ARMOR = EnumHelper.addArmorMaterial("sentinel_armor",
			"doomweapon:sentinel_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial EMBER_DOOM_ARMOR = EnumHelper.addArmorMaterial("ember_armor",
			"doomweapon:ember_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial ZOMBIE_DOOM_ARMOR = EnumHelper.addArmorMaterial("zombie_armor",
			"doomweapon:zombie_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial DOOMICORN_DOOM_ARMOR = EnumHelper.addArmorMaterial("doomicorn_armor",
			"doomweapon:doomicorn_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial PHOBOS_DOOM_ARMOR = EnumHelper.addArmorMaterial("phobos_armor",
			"doomweapon:phobos_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial NIGHTMARE_DOOM_ARMOR = EnumHelper.addArmorMaterial("nightmare_armor",
			"doomweapon:nightmare_armor", 1561, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ArmorMaterial PURPLEPONY_DOOM_ARMOR = EnumHelper
			.addArmorMaterial("purplepony_armor", "doomweapon:purplepony_armor", 1561, new int[] { 5, 8, 10, 5 }, 10,
					SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));

	public static final ItemTool.ToolMaterial DOOM = EnumHelper.addToolMaterial("doom", 6, 1561, 16.0F, 3.0F, 30)
			.setRepairItem(new ItemStack(DoomItems.argentenergy));
}