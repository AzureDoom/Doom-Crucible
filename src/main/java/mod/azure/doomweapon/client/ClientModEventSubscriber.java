package mod.azure.doomweapon.client;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.render.ShotgunShellRender;
import mod.azure.doomweapon.util.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = DoomMod.MODID, bus=EventBusSubscriber.Bus.MOD, value=Dist.CLIENT)
public class ClientModEventSubscriber {

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SHOTGUN_SHELL.get(), ShotgunShellRender::new);
	}

}