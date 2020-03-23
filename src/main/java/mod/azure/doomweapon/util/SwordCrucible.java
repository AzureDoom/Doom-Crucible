package mod.azure.doomweapon.util;

import mod.azure.doomweapon.Config;
import mod.azure.doomweapon.DoomWeaponMod;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class SwordCrucible extends SwordItem {

	public SwordCrucible(String name) {
		super(ItemTier.DIAMOND, Config.SERVER.CRUCIBLE_ATTACK.get(), -2.4F,
				new Item.Properties().group(ItemGroup.COMBAT).maxDamage(Config.SERVER.CRUCIBLE_MAXDAMAGE.get()));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}

	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if (!(worldIn instanceof ServerWorld))
			return new ActionResult<>(ActionResultType.PASS, playerIn.getHeldItem(handIn));
		if (Config.SERVER.USE_LIGHTNING_CRUCIBLE.get()) {
			ServerWorld world = (ServerWorld) worldIn;
			RayTraceResult rts = playerIn.pick(100, 1, false);
			BlockPos pos = new BlockPos(rts.getHitVec().getX(), rts.getHitVec().getY(), rts.getHitVec().getZ());
			LightningBoltEntity l = new LightningBoltEntity(world, pos.getX(), pos.getY(), pos.getZ(), false);
			world.addLightningBolt(l);
		} 
		return new ActionResult<>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
	}
}