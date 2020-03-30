package mod.azure.doomweapon.util;

import mod.azure.doomweapon.DoomWeaponMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(DoomWeaponMod.MODID)
public class ModSoundEvents {

	public static SoundEvent CRUCIBLE_OPEN = new SoundEvent(new ResourceLocation("doomweapon", "doom.open"));
	static SoundEvent CRUCIBLE_CLOSE = new SoundEvent(new ResourceLocation("doomweapon", "doom.close"));

	@SubscribeEvent
	public static void onRegisterSoundEvent(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(CRUCIBLE_OPEN.setRegistryName("doom.open"),
				CRUCIBLE_CLOSE.setRegistryName("doom.close"));
	}
}