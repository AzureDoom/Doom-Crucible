package mod.azure.doomweapon.entity;

import mod.azure.doomweapon.util.DoomItems;
import mod.azure.doomweapon.util.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class ArgentBoltEntity extends ArrowEntity  {

	public ArgentBoltEntity(EntityType<? extends ArgentBoltEntity> shooter, World worldIn) {
		super(shooter, worldIn);
	}
	
	public ArgentBoltEntity(World worldIn, LivingEntity shooter) {
		super(worldIn, shooter);
	}
	
	public ArgentBoltEntity(World world) {
        super(ModEntityTypes.ARGENT_BOLT.get(), world);
    }

	@SuppressWarnings("unchecked")
	public ArgentBoltEntity(World worldIn, EntityType<?> type) {
		super((EntityType<? extends ArrowEntity>) type, worldIn);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(DoomItems.ARGENT_BOLT.get());
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

}