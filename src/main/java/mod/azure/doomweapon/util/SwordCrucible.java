package mod.azure.doomweapon.util;

import java.util.Random;

import mod.azure.doomweapon.Config;
import mod.azure.doomweapon.DoomWeaponMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SwordCrucible extends SwordItem {

	public SwordCrucible(String name) {
		super(ItemTier.DIAMOND, Config.SERVER.CRUCIBLE_ATTACK.get(), -2.4F,
				new Item.Properties().group(ItemGroup.COMBAT).maxDamage(Config.SERVER.CRUCIBLE_MAXDAMAGE.get()));
		this.setRegistryName(DoomWeaponMod.MODID, name);
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isRemote && entityLiving instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) entityLiving;
			float f = BowItem.getArrowVelocity(this.getMaxItemUseDuration(stack) - timeLeft);
			player.sendMessage(new StringTextComponent("Charge: " + f));
			int number = (int) (10 * f);
			if (1 <= number) {
				Random rand = new Random();
				for (int i = 0; i < number; i++) {
					double x = player.posX + rand.nextInt(32) - 16;
					double z = player.posZ + rand.nextInt(32) - 16;
					int y = world.getHeight();
					world.addEntity(new LightningBoltEntity(world, x, y, z, false));
				}
			}
		}
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return 72000;
	}

	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		boolean flag = !playerIn.findAmmo(itemstack).isEmpty();

		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn,
				playerIn, handIn, flag);
		if (ret != null)
			return ret;

		if (!playerIn.abilities.isCreativeMode && !flag) {
			return ActionResult.resultFail(itemstack);
		} else {
			playerIn.setActiveHand(handIn);
			return ActionResult.resultConsume(itemstack);
		}
	}
}