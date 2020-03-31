package mod.azure.doomweapon.item.weapons;

import javax.annotation.Nullable;

import mod.azure.doomweapon.Config;
import mod.azure.doomweapon.DoomTab;
import mod.azure.doomweapon.DoomWeaponMod;
import mod.azure.doomweapon.item.DoomTier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.CriticalHitEvent;

public class SwordCrucibleItem extends SwordItem {

	public static final IItemPropertyGetter BLOCKING_GETTER = (stack, world,
			entity) -> entity != null && entity.isHandActive() && entity.getActiveItemStack() == stack ? 1.0F : 0.0F;

	public SwordCrucibleItem(String name) {
		super(DoomTier.DOOM, Config.SERVER.SWORD_CRUCIBLE_ATTACK.get(), -2.4F, new Item.Properties()
				.group(DoomTab.DoomItemGroup).maxDamage(Config.SERVER.SWORD_CRUCIBLE_MAXDAMAGE.get()));
		this.setRegistryName(DoomWeaponMod.MODID, name);
		addPropertyOverride(new ResourceLocation("blocking"), BLOCKING_GETTER);
	}

	@Override
	public boolean isShield(ItemStack stack, @Nullable LivingEntity entity) {
		return true;
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.NONE;
	}

	public void onCriticalHit(CriticalHitEvent event) {
		Entity target = event.getTarget();
		final float MOD_CRITICAL_VS_HELL = 6.0F;
		if (target instanceof WitherEntity || target instanceof ZombiePigmanEntity || target instanceof ZombieEntity
				|| target instanceof ZombieVillagerEntity || target instanceof WitherSkeletonEntity
				|| target instanceof MagmaCubeEntity || target instanceof BlazeEntity || target instanceof HuskEntity) {
			event.setDamageModifier(MOD_CRITICAL_VS_HELL);
		}
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return true;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		// double posX = playerIn.getPosX();
		// double posY = playerIn.getPosY();
		// double posZ = playerIn.getPosZ();
		// worldIn.playSound(null, posX, posY, posZ, ModSoundEvents.CRUCIBLE_OPEN,
		// SoundCategory.BLOCKS, 1F, 1F);
		UseAction offhandItemAction = playerIn.getHeldItemOffhand().getUseAction();

		if (offhandItemAction != UseAction.BOW && offhandItemAction != UseAction.SPEAR) {
			playerIn.setActiveHand(handIn);
		}

		return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
	}
}