package mod.azure.doomweapon.client.render;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.models.PinkyModel;
import mod.azure.doomweapon.entity.PinkyEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PinkyRender extends MobRenderer<PinkyEntity, PinkyModel<PinkyEntity>> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(DoomMod.MODID, "textures/entity/pinky.png");

	public PinkyRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new PinkyModel<PinkyEntity>(0.5f, false), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(PinkyEntity entity) {
		return TEXTURE;
	}

}