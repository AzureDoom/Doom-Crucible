package mod.azure.doomweapon.item.armor;

import mod.azure.doomweapon.DoomTab;
import mod.azure.doomweapon.DoomWeaponMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class DoomArmor extends ArmorItem {

	public DoomArmor(IArmorMaterial materialIn, EquipmentSlotType slot, String name) {
		super(materialIn, slot, new Item.Properties().group(DoomTab.DoomItemGroup));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}
}