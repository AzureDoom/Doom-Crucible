package mod.azure.doomweapon.util.registry;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.entity.ArgentBoltEntity;
import mod.azure.doomweapon.entity.ShotgunShellEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

	@SuppressWarnings("deprecation")
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, DoomMod.MODID);
	
	public static final String SHOTGUN_SHELLS = "shotgun_shell";
	public static final String ARGENT_BOLTS = "argent_bolt";
	public static final RegistryObject<EntityType<ShotgunShellEntity>> SHOTGUN_SHELL = ENTITY_TYPES.register("shotgun_shell",
			() -> EntityType.Builder.<ShotgunShellEntity>create(ShotgunShellEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).build(new ResourceLocation(DoomMod.MODID, SHOTGUN_SHELLS).toString()));
	public static final RegistryObject<EntityType<ArgentBoltEntity>> ARGENT_BOLT = ENTITY_TYPES.register("argent_bolt",
			() -> EntityType.Builder.<ArgentBoltEntity>create(ArgentBoltEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).build(new ResourceLocation(DoomMod.MODID, ARGENT_BOLTS).toString()));

}