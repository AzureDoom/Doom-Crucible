package mod.azure.doomweapon.entity;

import mod.azure.doomweapon.util.DoomItems;
import mod.azure.doomweapon.util.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class ShotgunShellEntity extends AbstractArrowEntity  {

	public ShotgunShellEntity(EntityType<? extends ShotgunShellEntity> shooter, World worldIn) {
		super(shooter, worldIn);
	}
	
	public ShotgunShellEntity(World world) {
        super(ModEntityTypes.SHOTGUN_SHELL.get(), world);
    }

	public ShotgunShellEntity(World worldIn, EntityType<? extends AbstractArrowEntity> shooter) {
		super(shooter, worldIn);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(DoomItems.SHOTGUN_SHELLS.get());
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

}