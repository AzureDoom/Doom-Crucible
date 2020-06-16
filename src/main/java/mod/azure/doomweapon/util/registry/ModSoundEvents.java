package mod.azure.doomweapon.util.registry;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {

	@SuppressWarnings("deprecation")
	public static final DeferredRegister<SoundEvent> MOD_SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS,
			DoomMod.MODID);

	public static final RegistryObject<SoundEvent> SHOOT1 = MOD_SOUNDS.register("doom.shoot1",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.shoot1")));
	public static final RegistryObject<SoundEvent> SHOOT2 = MOD_SOUNDS.register("doom.shoot2",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.shoot2")));
	public static final RegistryObject<SoundEvent> SHOOT3 = MOD_SOUNDS.register("doom.shoot3",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.shoot3")));

	public static final RegistryObject<SoundEvent> LOADING_START = MOD_SOUNDS.register("doom.loading_start",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_start")));
	public static final RegistryObject<SoundEvent> LOADING_MIDDLE1 = MOD_SOUNDS.register("doom.loading_middle1",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_middle1")));
	public static final RegistryObject<SoundEvent> LOADING_MIDDLE2 = MOD_SOUNDS.register("doom.loading_middle2",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_middle2")));
	public static final RegistryObject<SoundEvent> LOADING_MIDDLE3 = MOD_SOUNDS.register("doom.loading_middle3",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_middle3")));
	public static final RegistryObject<SoundEvent> LOADING_MIDDLE4 = MOD_SOUNDS.register("doom.loading_middle4",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_middle4")));
	public static final RegistryObject<SoundEvent> LOADING_END = MOD_SOUNDS.register("doom.loading_end",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_end")));

	public static final RegistryObject<SoundEvent> QUICK1_1 = MOD_SOUNDS.register("doom.quick1_1",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick1_1")));
	public static final RegistryObject<SoundEvent> QUICK1_2 = MOD_SOUNDS.register("doom.quick1_2",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick1_2")));
	public static final RegistryObject<SoundEvent> QUICK1_3 = MOD_SOUNDS.register("doom.quick1_3",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick1_3")));

	public static final RegistryObject<SoundEvent> QUICK2_1 = MOD_SOUNDS.register("doom.quick2_1",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick2_1")));
	public static final RegistryObject<SoundEvent> QUICK2_2 = MOD_SOUNDS.register("doom.quick2_2",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick2_2")));
	public static final RegistryObject<SoundEvent> QUICK2_3 = MOD_SOUNDS.register("doom.quick2_3",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick2_3")));

	public static final RegistryObject<SoundEvent> QUICK3_1 = MOD_SOUNDS.register("doom.quick3_1",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick3_1")));
	public static final RegistryObject<SoundEvent> QUICK3_2 = MOD_SOUNDS.register("doom.quick3_2",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick3_2")));
	public static final RegistryObject<SoundEvent> QUICK3_3 = MOD_SOUNDS.register("doom.quick3_3",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.quick3_3")));

	public static final RegistryObject<SoundEvent> E1M1 = MOD_SOUNDS.register("doom.e1m1",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.e1m1")));

	public static final RegistryObject<SoundEvent> IMP_AMBIENT = MOD_SOUNDS.register("doom.imp_ambient",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.imp_ambient")));
	public static final RegistryObject<SoundEvent> IMP_DEATH = MOD_SOUNDS.register("doom.imp_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.imp_death")));
	public static final RegistryObject<SoundEvent> IMP_HURT = MOD_SOUNDS.register("doom.imp_hurt",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.imp_hurt")));
	public static final RegistryObject<SoundEvent> IMP_STEP = MOD_SOUNDS.register("doom.imp_step",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.imp_step")));

	public static final RegistryObject<SoundEvent> ARCHVILE_DEATH = MOD_SOUNDS.register("doom.arch_vile_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.arch_vile_death")));
	public static final RegistryObject<SoundEvent> ARCHVILE_HURT = MOD_SOUNDS.register("doom.arch_vile_hit",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.arch_vile_hit")));
	public static final RegistryObject<SoundEvent> ARCHVILE_AMBIENT = MOD_SOUNDS.register("doom.arch_vile_idle",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.arch_vile_idle")));
	public static final RegistryObject<SoundEvent> ARCHVILE_PORTAL = MOD_SOUNDS.register("doom.arch_vile_portal",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.arch_vile_portal")));
	public static final RegistryObject<SoundEvent> ARCHVILE_SCREAM = MOD_SOUNDS.register("doom.arch_vile_scream",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.arch_vilevscream")));
	public static final RegistryObject<SoundEvent> ARCHVILE_STARE = MOD_SOUNDS.register("doom.arch_vile_stare",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.arch_vile_stare")));

	public static final RegistryObject<SoundEvent> BARON_AMBIENT = MOD_SOUNDS.register("doom.baron_angry",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.baron_angry")));
	public static final RegistryObject<SoundEvent> BARON_DEATH = MOD_SOUNDS.register("doom.baron_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.baron_death")));
	public static final RegistryObject<SoundEvent> BARON_HURT = MOD_SOUNDS.register("doom.baron_hurt",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.baron_hurt")));
	public static final RegistryObject<SoundEvent> BARON_STEP = MOD_SOUNDS.register("doom.baron_say",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.baron_say")));

	public static final RegistryObject<SoundEvent> PINKY_AMBIENT = MOD_SOUNDS.register("doom.pinky_idle",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.pinky_idle")));
	public static final RegistryObject<SoundEvent> PINKY_DEATH = MOD_SOUNDS.register("doom.pinky_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.pinky_death")));
	public static final RegistryObject<SoundEvent> PINKY_HURT = MOD_SOUNDS.register("doom.pinky_hurt",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.pinky_hurt")));
	public static final RegistryObject<SoundEvent> PINKY_STEP = MOD_SOUNDS.register("doom.pinky_step",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.pinky_step")));

	public static final RegistryObject<SoundEvent> LOST_SOUL_DEATH = MOD_SOUNDS.register("doom.lost_soul_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.lost_soul_death")));
	public static final RegistryObject<SoundEvent> LOST_SOUL_AMBIENT = MOD_SOUNDS.register("doom.lost_soul_say",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.lost_soul_say")));

	public static final RegistryObject<SoundEvent> CACODEMON_AMBIENT = MOD_SOUNDS.register("doom.cacodemon_moan",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_moan")));
	public static final RegistryObject<SoundEvent> CACODEMON_DEATH = MOD_SOUNDS.register("doom.cacodemon_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_death")));
	public static final RegistryObject<SoundEvent> CACODEMON_HURT = MOD_SOUNDS.register("doom.cacodemon_hit",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_hit")));
	public static final RegistryObject<SoundEvent> CACODEMON_AFFECTIONATE_SCREAM = MOD_SOUNDS.register(
			"doom.cacodemon_affectionate_scream",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_affectionate_scream")));
	public static final RegistryObject<SoundEvent> CACODEMON_CHARGE = MOD_SOUNDS.register("doom.cacodemon-charge",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_charge")));
	public static final RegistryObject<SoundEvent> CACODEMON_FIREBALL = MOD_SOUNDS.register("doom.cacodemon-fireball",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_fireball")));
	public static final RegistryObject<SoundEvent> CACODEMON_SCREAM = MOD_SOUNDS.register("doom.cacodemon-scream",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_scream")));

	public static final RegistryObject<SoundEvent> SPIDERDEMON_AMBIENT = MOD_SOUNDS.register("doom.spiderdemon_step",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.spiderdemon_step")));
	public static final RegistryObject<SoundEvent> SPIDERDEMON_DEATH = MOD_SOUNDS.register("doom.spiderdemon_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cacodemon_death")));
	public static final RegistryObject<SoundEvent> SPIDERDEMON_HURT = MOD_SOUNDS.register("doom.spiderdemon_say",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.spiderdemon_say")));

	public static final RegistryObject<SoundEvent> ZOMBIEMAN_AMBIENT = MOD_SOUNDS.register("doom.zombieman_idle",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.zombieman_idle")));
	public static final RegistryObject<SoundEvent> ZOMBIEMAN_DEATH = MOD_SOUNDS.register("doom.zombieman_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.zombieman_death")));
	public static final RegistryObject<SoundEvent> ZOMBIEMAN_HURT = MOD_SOUNDS.register("doom.zombieman_hurt",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.zombieman_hurt")));

	public static final RegistryObject<SoundEvent> CYBERDEMON_AMBIENT = MOD_SOUNDS.register("doom.cyberdemon_throw",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cyberdemon_throw")));
	public static final RegistryObject<SoundEvent> CYBERDEMON_DEATH = MOD_SOUNDS.register("doom.cyberdemon_death",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cyberdemon_death")));
	public static final RegistryObject<SoundEvent> CYBERDEMON_HURT = MOD_SOUNDS.register("doom.cyberdemon_hit",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cyberdemon_hit")));
	public static final RegistryObject<SoundEvent> CYBERDEMON_STEP = MOD_SOUNDS.register("doom.cyberdemon_walk",
			() -> new SoundEvent(new ResourceLocation("doomweapon", "doom.cyberdemon_walk")));

}