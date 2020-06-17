package mod.azure.doomweapon.util.registry;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.entity.ArchvileEntity;
import mod.azure.doomweapon.entity.BaronEntity;
import mod.azure.doomweapon.entity.CacodemonEntity;
import mod.azure.doomweapon.entity.ImpEntity;
import mod.azure.doomweapon.entity.LostSoulEntity;
import mod.azure.doomweapon.entity.MancubusEntity;
import mod.azure.doomweapon.entity.PinkyEntity;
import mod.azure.doomweapon.entity.SpiderdemonEntity;
import mod.azure.doomweapon.entity.ZombiemanEntity;
import mod.azure.doomweapon.entity.projectiles.ArgentBoltEntity;
import mod.azure.doomweapon.entity.projectiles.EnergyCellEntity;
import mod.azure.doomweapon.entity.projectiles.ShotgunShellEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

	@SuppressWarnings("deprecation")
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
			DoomMod.MODID);

	public static final RegistryObject<EntityType<ShotgunShellEntity>> SHOTGUN_SHELL = ENTITY_TYPES
			.register("shotgun_shell",
					() -> EntityType.Builder
							.<ShotgunShellEntity>create(ShotgunShellEntity::new, EntityClassification.MISC)
							.size(0.5F, 0.5F).build(new ResourceLocation(DoomMod.MODID, "shotgun_shell").toString()));

	public static final RegistryObject<EntityType<ArgentBoltEntity>> ARGENT_BOLT = ENTITY_TYPES.register("argent_bolt",
			() -> EntityType.Builder.<ArgentBoltEntity>create(ArgentBoltEntity::new, EntityClassification.MISC)
					.size(0.5F, 0.5F).build(new ResourceLocation(DoomMod.MODID, "argent_bolt").toString()));

	public static final RegistryObject<EntityType<EnergyCellEntity>> ENERGY_CELL = ENTITY_TYPES.register("energy_cell",
			() -> EntityType.Builder.<EnergyCellEntity>create(EnergyCellEntity::new, EntityClassification.MISC)
					.size(0.5F, 0.5F).build(new ResourceLocation(DoomMod.MODID, "energy_cell").toString()));

	public static final RegistryObject<EntityType<ImpEntity>> IMP = ENTITY_TYPES.register("imp",
			() -> EntityType.Builder.<ImpEntity>create(ImpEntity::new, EntityClassification.MONSTER).size(0.6f, 1.95F)
					.build(new ResourceLocation(DoomMod.MODID, "imp").toString()));

	public static final RegistryObject<EntityType<PinkyEntity>> PINKY = ENTITY_TYPES.register("pinky",
			() -> EntityType.Builder.<PinkyEntity>create(PinkyEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "pinky").toString()));

	public static final RegistryObject<EntityType<LostSoulEntity>> LOST_SOUL = ENTITY_TYPES.register("lost_soul",
			() -> EntityType.Builder.<LostSoulEntity>create(LostSoulEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "lost_soul").toString()));

	public static final RegistryObject<EntityType<CacodemonEntity>> CACODEMON = ENTITY_TYPES.register("cacodemon",
			() -> EntityType.Builder.<CacodemonEntity>create(CacodemonEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "cacodemon").toString()));

	public static final RegistryObject<EntityType<ArchvileEntity>> ARCHVILE = ENTITY_TYPES.register("archvile",
			() -> EntityType.Builder.<ArchvileEntity>create(ArchvileEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "archvile").toString()));

	public static final RegistryObject<EntityType<BaronEntity>> BARON = ENTITY_TYPES.register("baron",
			() -> EntityType.Builder.<BaronEntity>create(BaronEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "baron").toString()));

	public static final RegistryObject<EntityType<MancubusEntity>> MANCUBUS = ENTITY_TYPES.register("mancubus",
			() -> EntityType.Builder.<MancubusEntity>create(MancubusEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "mancubus").toString()));

	public static final RegistryObject<EntityType<SpiderdemonEntity>> SPIDERDEMON = ENTITY_TYPES.register("spiderdemon",
			() -> EntityType.Builder.<SpiderdemonEntity>create(SpiderdemonEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "spiderdemon").toString()));

	public static final RegistryObject<EntityType<ZombiemanEntity>> ZOMBIEMAN = ENTITY_TYPES.register("zombieman",
			() -> EntityType.Builder.<ZombiemanEntity>create(ZombiemanEntity::new, EntityClassification.MONSTER)
					.size(0.6f, 1.95F).build(new ResourceLocation(DoomMod.MODID, "zombieman").toString()));

	public static void registerEntityWorldSpawns() {
		registerEntityWorldSpawn(IMP.get(), 14, 2, 7, Biomes.NETHER);
		registerEntityWorldSpawn(PINKY.get(), 14, 2, 4, Biomes.NETHER);
		registerEntityWorldSpawn(LOST_SOUL.get(), 2, 2, 7, Biomes.NETHER);
		registerEntityWorldSpawn(CACODEMON.get(), 2, 1, 2, Biomes.NETHER);
		registerEntityWorldSpawn(ARCHVILE.get(), 2, 1, 2, Biomes.NETHER);
		registerEntityWorldSpawn(BARON.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(MANCUBUS.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(SPIDERDEMON.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(ZOMBIEMAN.get(), 14, 2, 7, Biomes.NETHER);
	}

	public static void registerEntityWorldSpawn(EntityType<?> entity, int weight, int minGroup, int maxGroup,
			Biome... biomes) {
		for (Biome biome : biomes) {
			if (biome != null) {
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, weight, minGroup, maxGroup));
			}
		}
	}

}