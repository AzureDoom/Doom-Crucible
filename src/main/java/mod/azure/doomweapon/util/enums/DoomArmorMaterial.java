package mod.azure.doomweapon.util.enums;

import java.util.function.Supplier;

import mod.azure.doomweapon.util.registry.DoomItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum DoomArmorMaterial implements IArmorMaterial {
	DOOM_ARMOR("doomweapon:doom_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F,
			() -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	PRAETOR_DOOM_ARMOR("doomweapon:praetor_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	CLASSIC_DOOM_ARMOR("doomweapon:classic_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	MIDNIGHT_DOOM_ARMOR("doomweapon:midnight_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	ASTRO_DOOM_ARMOR("doomweapon:astro_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	DEMONIC_DOOM_ARMOR("doomweapon:demonic_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	SENTINEL_DOOM_ARMOR("doomweapon:sentinel_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	EMBER_DOOM_ARMOR("doomweapon:ember_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	ZOMBIE_DOOM_ARMOR("doomweapon:zombie_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	DOOMICORN_DOOM_ARMOR("doomweapon:doomicorn_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	PURPLEPONY_DOOM_ARMOR("doomweapon:purplepony_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	NIGHTMARE_DOOM_ARMOR("doomweapon:nightmare_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	PHOBOS_DOOM_ARMOR("doomweapon:phobos_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	CLASSIC_RED_ARMOR("doomweapon:classic_red_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	CLASSIC_INDIGO_ARMOR("doomweapon:classic_indigo_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	CLASSIC_BRONZE_ARMOR("doomweapon:classic_bronze_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	GOLD_ARMOR("doomweapon:gold_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F,
			() -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	TWENTY_FIVE_ARMOR("doomweapon:twenty_five_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	REDNECK1_ARMOR("doomweapon:redneck1_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	REDNECK2_ARMOR("doomweapon:redneck2_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	REDNECK3_ARMOR("doomweapon:redneck3_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	BRONZE_DOOM_ARMOR("doomweapon:bronze_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	PAINTER_DOOM_ARMOR("doomweapon:painter_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	CULTIST_DOOM_ARMOR("doomweapon:cultist_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	MAYKR_DOOM_ARMOR("doomweapon:maykr_armor", 50, new int[] { 5, 8, 10, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			}),
	CRIMSON_DOOM_ARMOR("doomweapon:crimson_armor", 50, new int[] { 5, 8, 10, 5 }, 30,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F, () -> {
				return Ingredient.fromItems(DoomItems.ARGENT_ENERGY.get());
			});

	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 5, 8, 10, 5 };
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;

	private DoomArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn,
			int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn,
			Supplier<Ingredient> repairMaterialSupplier) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountsIn;
		this.enchantability = enchantabilityIn;
		this.soundEvent = equipSoundIn;
		this.toughness = toughnessIn;
		this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
	}

	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}

	@OnlyIn(Dist.CLIENT)
	public String getName() {
		return this.name;
	}

	public float getToughness() {
		return this.toughness;
	}
}