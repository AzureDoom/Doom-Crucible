package mod.azure.doomweapon.util;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.entity.ShotgunShellEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, DoomMod.MODID);
	
	public static final String SHOTGUN_SHELLS = "shotgun_shell";
	public static final RegistryObject<EntityType<ShotgunShellEntity>> SHOTGUN_SHELL = ENTITY_TYPES.register("shotgun_shell",
			() -> EntityType.Builder.<ShotgunShellEntity>create(ShotgunShellEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).build(new ResourceLocation(DoomMod.MODID, SHOTGUN_SHELLS).toString()));

}