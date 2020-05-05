package mod.azure.doomweapon.util;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(DoomMod.MODID)
public class ModSoundEvents {

	public static SoundEvent LOADING_END = new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_end"));
	public static SoundEvent LOADING_MIDDLE1 = new SoundEvent(
			new ResourceLocation("doomweapon", "doom.loading_middle1"));
	public static SoundEvent LOADING_MIDDLE2 = new SoundEvent(
			new ResourceLocation("doomweapon", "doom.loading_middle2"));
	public static SoundEvent LOADING_MIDDLE3 = new SoundEvent(
			new ResourceLocation("doomweapon", "doom.loading_middle3"));
	public static SoundEvent LOADING_MIDDLE4 = new SoundEvent(
			new ResourceLocation("doomweapon", "doom.loading_middle4"));
	public static SoundEvent LOADING_START = new SoundEvent(new ResourceLocation("doomweapon", "doom.loading_start"));
	public static SoundEvent SHOOT1 = new SoundEvent(new ResourceLocation("doomweapon", "doom.shoot1"));
	public static SoundEvent SHOOT2 = new SoundEvent(new ResourceLocation("doomweapon", "doom.shoot2"));
	public static SoundEvent SHOOT3 = new SoundEvent(new ResourceLocation("doomweapon", "doom.shoot3"));
	public static SoundEvent QUICK1_1 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick1_1"));
	public static SoundEvent QUICK1_2 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick1_2"));
	public static SoundEvent QUICK1_3 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick1_3"));
	public static SoundEvent QUICK2_1 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick2_1"));
	public static SoundEvent QUICK2_2 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick2_2"));
	public static SoundEvent QUICK2_3 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick2_3"));
	public static SoundEvent QUICK3_1 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick3_1"));
	public static SoundEvent QUICK3_2 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick3_2"));
	public static SoundEvent QUICK3_3 = new SoundEvent(new ResourceLocation("doomweapon", "doom.quick3_3"));

	@SubscribeEvent
	public static void onRegisterSoundEvent(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(LOADING_END.setRegistryName("doom.loading_end"),
				LOADING_MIDDLE1.setRegistryName("doom.loading_middle1"),
				LOADING_MIDDLE2.setRegistryName("doom.loading_middle2"),
				LOADING_MIDDLE3.setRegistryName("doom.loading_middle3"),
				LOADING_MIDDLE4.setRegistryName("doom.loading_middle4"),
				LOADING_START.setRegistryName("doom.loading_start"), SHOOT1.setRegistryName("doom.shoot1"),
				SHOOT2.setRegistryName("doom.shoot2"), SHOOT3.setRegistryName("doom.shoot3"),
				QUICK1_1.setRegistryName("doom.quick1_1"), QUICK1_2.setRegistryName("doom.quick1_2"),
				QUICK1_3.setRegistryName("doom.quick1_3"), QUICK2_1.setRegistryName("doom.quick2_1"),
				QUICK2_2.setRegistryName("doom.quick2_2"), QUICK2_3.setRegistryName("doom.quick2_3"),
				QUICK3_1.setRegistryName("doom.quick3_1"), QUICK3_2.setRegistryName("doom.quick3_2"),
				QUICK3_3.setRegistryName("doom.quick3_3"));
	}
}