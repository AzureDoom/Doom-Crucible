package mod.azure.doomweapon.util;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class DoomArmorMaterial {

	public static final ArmorMaterial DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor", "doomweapon:doom_armor",
			14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial PRAETOR_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:praetor_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial CLASSIC_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:classic_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial ASTRO_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:astro_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial CRIMSON_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:crimson_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial MIDNIGHT_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:midnight_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial DEMONIC_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:demonic_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial SENTINEL_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:sentinel_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial EMBER_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:ember_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial ZOMBIE_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:zombie_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	public static final ArmorMaterial DOOMICORN_DOOM_ARMOR = EnumHelper.addArmorMaterial("doom_armor",
			"doomweapon:doomicorn_armor", 14, new int[] { 5, 8, 10, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			0.0F);

	public static enum ToolMaterial {
		DOOM(6, 1561, 8.0F, 3.0F, 30);
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private ItemStack repairMaterial = ItemStack.EMPTY;

		private ToolMaterial(int harvestLevel, int maxUses, float efficiency, float damageVsEntity,
				int enchantability) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = damageVsEntity;
			this.enchantability = enchantability;
		}

		public Item getRepairItem() {
			return DoomItems.argentenergy;
		}
	}
}