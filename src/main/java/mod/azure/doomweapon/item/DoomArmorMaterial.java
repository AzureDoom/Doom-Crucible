package mod.azure.doomweapon.item;

import mod.azure.doomweapon.util.DoomWeaponItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class DoomArmorMaterial {

	public static final IArmorMaterial DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:doom_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CLASSIC_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:classic_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial MIDNIGHT_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:midnight_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial ASTRO_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:astro_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CRIMSON_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:crimson_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial DEMONIC_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:demonic_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial SENTINEL_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:sentinel_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial EMBER_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:ember_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial ZOMBIE_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:zombie_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial DOOMICORN_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 1, 2, 3, 1 };

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return 1000;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.armors[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 15;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(DoomWeaponItems.ARGENT_ENERGY);
		}

		@Override
		public String getName() {
			return "doomweapon:doomicorn_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};
}