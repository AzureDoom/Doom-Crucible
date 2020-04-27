package mod.azure.doomweapon.items;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class BaseSwordItem extends ItemSword {

	public BaseSwordItem(String name) {
		super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, 3, 4));
		this.setMaxStackSize(1);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DoomWeaponMod.MODID, name));
		this.setCreativeTab(DoomTab.DOOMWEAPON);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return super.getIsRepairable(toRepair, repair);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		stack.addEnchantment(Enchantments.SMITE, 10);
	}
}