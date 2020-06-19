package mod.azure.doomweapon.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.models.RevenantModel;
import mod.azure.doomweapon.entity.RevenantEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RevenantRender extends MobRenderer<RevenantEntity, RevenantModel<RevenantEntity>> {
	private static final ResourceLocation INVULNERABLE_WITHER_TEXTURES = new ResourceLocation(DoomMod.MODID,
			"textures/entity/cyberdemon_invulnerable.png");
	private static final ResourceLocation WITHER_TEXTURES = new ResourceLocation(DoomMod.MODID,
			"textures/entity/cyberdemon.png");

	public RevenantRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new RevenantModel<>(0.0F), 1.0F);
	}

	protected int getBlockLight(RevenantEntity entityIn, float partialTicks) {
		return 15;
	}

	public ResourceLocation getEntityTexture(RevenantEntity entity) {
		int i = entity.getInvulTime();
		return i > 0 && (i > 80 || i / 5 % 2 != 1) ? INVULNERABLE_WITHER_TEXTURES : WITHER_TEXTURES;
	}

	protected void preRenderCallback(RevenantEntity entitylivingbaseIn, MatrixStack matrixStackIn,
			float partialTickTime) {
		float f = 2.0F;
		int i = entitylivingbaseIn.getInvulTime();
		if (i > 0) {
			f -= ((float) i - partialTickTime) / 220.0F * 0.5F;
		}

		matrixStackIn.scale(f, f, f);
	}
}