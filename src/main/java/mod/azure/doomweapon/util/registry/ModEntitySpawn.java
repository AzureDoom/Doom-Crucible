package mod.azure.doomweapon.util.registry;

import mod.azure.doomweapon.entity.CyberDemonEntity;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.Heightmap;

public class ModEntitySpawn {

	public static void registerEntityWorldSpawns() {
		registerEntityWorldSpawn(ModEntityTypes.IMP.get(), 12, 2, 7, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.PINKY.get(), 12, 2, 4, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.LOST_SOUL.get(), 1, 1, 3, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.CACODEMON.get(), 1, 1, 2, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.ARCHVILE.get(), 9, 1, 2, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.BARON.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.MANCUBUS.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.CYBERDEMON.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.SPIDERDEMON.get(), 2, 1, 1, Biomes.NETHER);
		registerEntityWorldSpawn(ModEntityTypes.ZOMBIEMAN.get(), 12, 2, 7, Biomes.NETHER);
	}

	public static void EntitySpawnPlacementRegistry() {
		EntitySpawnPlacementRegistry.register(ModEntityTypes.ARCHVILE.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.ZOMBIEMAN.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.SPIDERDEMON.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.MANCUBUS.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.BARON.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.CYBERDEMON.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				CyberDemonEntity::spawning);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.IMP.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
		EntitySpawnPlacementRegistry.register(ModEntityTypes.PINKY.get(),
				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawnInLight);
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