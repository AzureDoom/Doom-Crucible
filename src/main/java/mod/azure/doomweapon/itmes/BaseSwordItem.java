package mod.azure.doomweapon.itmes;

import javax.annotation.Nullable;

import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.util.DoomTab;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.player.CriticalHitEvent;

public class BaseSwordItem extends ItemSword {

	private static final String OPEN = "has_magazine";

	public BaseSwordItem(String name) {
		super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, 3, 4));
		this.setMaxStackSize(1);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(DoomWeaponMod.MODID, name));
		this.setCreativeTab(DoomTab.DOOMWEAPON);
		addPropertyOverride(new ResourceLocation(DoomWeaponMod.MODID, "empty"), new IItemPropertyGetter() {
			@Override
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				return BaseSwordItem.getPropertyEmpty(stack, entityIn);
			}
		});
	}

	public void onCriticalHit(CriticalHitEvent event) {
		Entity target = event.getTarget();
		final float MOD_CRITICAL_VS_HELL = 6.0F;
		if (target instanceof EntityWither || target instanceof EntityZombie || target instanceof EntityZombieVillager
				|| target instanceof EntityWitherSkeleton || target instanceof EntityMagmaCube
				|| target instanceof EntityBlaze || target instanceof EntityHusk) {
			event.setDamageModifier(MOD_CRITICAL_VS_HELL);
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BOW;
	}

	public static float getPropertyEmpty(ItemStack stack, @Nullable EntityLivingBase entityIn) {
		if (entityIn == null)
			return 0.f;
		if (!stack.isEmpty() && stack.getItem() instanceof BaseSwordItem)
			return BaseSwordItem.hasPower(stack) ? 0.f : 1.f; // 0 - not empty
		return 0.f;
	}

	public static boolean hasPower(ItemStack stack) {
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			return nbt.hasKey(OPEN) && nbt.getBoolean(OPEN);
		}
		return false;
	}
}