package mod.azure.doomweapon.items;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class DoomArmor extends ItemArmor {

	public DoomArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(new ResourceLocation(DoomWeaponMod.MODID, name));
		this.setTranslationKey(name);
		this.setCreativeTab(DoomTab.DOOMWEAPON);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		stack.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
		stack.addEnchantment(Enchantments.FEATHER_FALLING, 4);
		stack.addEnchantment(Enchantments.FIRE_PROTECTION, 4);
		stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 4);
		stack.addEnchantment(Enchantments.THORNS, 3);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}
}