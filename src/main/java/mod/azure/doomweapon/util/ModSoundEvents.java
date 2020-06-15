package mod.azure.doomweapon.util;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {

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

	@SubscribeEvent
	public static void onRegisterSoundEvent(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll();
	}
}