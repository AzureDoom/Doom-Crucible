package mod.azure.doomweapon.client.render;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.models.ZombiemanModel;
import mod.azure.doomweapon.entity.ZombiemanEntity;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.util.ResourceLocation;

public class ZombiemanRender extends BipedRenderer<ZombiemanEntity, ZombiemanModel<ZombiemanEntity>> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(DoomMod.MODID,
			"textures/entity/zombieman.png");

	public ZombiemanRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ZombiemanModel<>(), 0.5F);
		this.addLayer(new HeldItemLayer<>(this));
		this.addLayer(new BipedArmorLayer<>(this, new ZombiemanModel(0.5F, true), new ZombiemanModel(1.0F, true)));
	}

	@Override
	public ResourceLocation getEntityTexture(ZombiemanEntity entity) {
		return TEXTURE;
	}

}