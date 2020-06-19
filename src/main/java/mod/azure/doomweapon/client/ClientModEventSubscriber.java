package mod.azure.doomweapon.client;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.render.ArchvileRender;
import mod.azure.doomweapon.client.render.BaronRender;
import mod.azure.doomweapon.client.render.CacodemonRender;
import mod.azure.doomweapon.client.render.RevenantRender;
import mod.azure.doomweapon.client.render.ImpRender;
import mod.azure.doomweapon.client.render.LostSoulRender;
import mod.azure.doomweapon.client.render.MancubusRender;
import mod.azure.doomweapon.client.render.PinkyRender;
import mod.azure.doomweapon.client.render.SpiderdemonRender;
import mod.azure.doomweapon.client.render.ZombiemanRender;
import mod.azure.doomweapon.client.render.projectiles.ArgentBoltRender;
import mod.azure.doomweapon.client.render.projectiles.EnergyCellRender;
import mod.azure.doomweapon.client.render.projectiles.ShotgunShellRender;
import mod.azure.doomweapon.util.registry.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = DoomMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SHOTGUN_SHELL.get(), ShotgunShellRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARGENT_BOLT.get(), ArgentBoltRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ENERGY_CELL.get(), EnergyCellRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IMP.get(), ImpRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PINKY.get(), PinkyRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LOST_SOUL.get(), LostSoulRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CACODEMON.get(), CacodemonRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARCHVILE.get(), ArchvileRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BARON.get(), BaronRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MANCUBUS.get(), MancubusRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SPIDERDEMON.get(), SpiderdemonRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ZOMBIEMAN.get(), ZombiemanRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REVENANT.get(), RevenantRender::new);
	}

}