package mod.azure.doomweapon.client.render;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.models.LostSoulModel;
import mod.azure.doomweapon.entity.LostSoulEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LostSoulRender extends MobRenderer<LostSoulEntity, LostSoulModel<LostSoulEntity>> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(DoomMod.MODID,
			"textures/entity/lost_soul.png");

	public LostSoulRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new LostSoulModel<LostSoulEntity>(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(LostSoulEntity entity) {
		return TEXTURE;
	}

}