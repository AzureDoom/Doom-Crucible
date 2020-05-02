package mod.azure.doomweapon.proxy;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = DoomMod.MODID, value = CLIENT)
public class Client extends IProxy {

	@EventHandler
	public void preInit() {
		OBJLoader.INSTANCE.addDomain(DoomMod.MODID);
	}

	@EventHandler
	public void init() {

	}

	@EventHandler
	public void postInit() {

	}

	@SubscribeEvent
	public static void onRegisterModelsEvent(ModelRegistryEvent e) {
		ForgeRegistries.ITEMS.getValuesCollection().stream()
				.filter(item -> item.getRegistryName().getNamespace().equals(DoomMod.MODID)).forEach(item -> {
					ModelLoader.setCustomModelResourceLocation(item, 0,
							new ModelResourceLocation(item.getRegistryName(), "inventory"));
				});
	}
}