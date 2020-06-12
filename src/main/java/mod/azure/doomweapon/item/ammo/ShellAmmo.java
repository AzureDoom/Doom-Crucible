package mod.azure.doomweapon.item.ammo;

import java.util.List;

import mod.azure.doomweapon.entity.ShotgunShellEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ShellAmmo extends ArrowItem {

	public ShellAmmo(Properties properties) {
		super(properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent("\u00A7o" + "Loads shotgun with malicious intent."));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper
				.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
		return enchant <= 0 ? false : this instanceof ShellAmmo;
	}

	public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, EntityType<? extends ShotgunShellEntity> shooter) {
		ShotgunShellEntity arrowentity = new ShotgunShellEntity(shooter, worldIn);
		return arrowentity;
	}

}