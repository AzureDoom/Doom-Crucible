package mod.azure.doomweapon.util;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DoomArmorMaterial {

	public static final IArmorMaterial DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:doom_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial PRAETOR_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:praetor_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CLASSIC_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:classic_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial MIDNIGHT_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:midnight_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial ASTRO_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:astro_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CRIMSON_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:crimson_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial DEMONIC_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:demonic_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial SENTINEL_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:sentinel_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial EMBER_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:ember_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial ZOMBIE_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:zombie_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial DOOMICORN_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:doomicorn_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial PURPLEPONY_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:purplepony_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial NIGHTMARE_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:nightmare_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial PHOBOS_DOOM_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:phobos_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CLASSIC_RED_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:classic_red_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CLASSIC_BLACK_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:classic_black_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};

	public static final IArmorMaterial CLASSIC_BRONZE_ARMOR = new IArmorMaterial() {

		private final int[] armors = new int[] { 5, 8, 10, 5 };

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
			return Ingredient.fromItems(DoomItems.ARGENT_ENERGY);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public String getName() {
			return "doomweapon:classic_bronze_armor";
		}

		@Override
		public float getToughness() {
			return 8;
		}

	};
}