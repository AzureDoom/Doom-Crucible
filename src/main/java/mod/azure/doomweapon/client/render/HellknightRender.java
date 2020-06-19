package mod.azure.doomweapon.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.models.HellknightModel;
import mod.azure.doomweapon.entity.HellknightEntity;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HellknightRender extends MobRenderer<HellknightEntity, HellknightModel<HellknightEntity>> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(DoomMod.MODID,
			"textures/entity/hellknight.png");

	public HellknightRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new HellknightModel<>(), 0.7F);
	}

	@Override
	public ResourceLocation getEntityTexture(HellknightEntity entity) {
		return TEXTURE;
	}

	protected void applyRotations(HellknightEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks,
			float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
		if (!((double) entityLiving.limbSwingAmount < 0.01D)) {
			float f1 = entityLiving.limbSwing - entityLiving.limbSwingAmount * (1.0F - partialTicks) + 6.0F;
			float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(6.5F * f2));
		}
	}

	protected void preRenderCallback(HellknightEntity entitylivingbaseIn, MatrixStack matrixStackIn,
			float partialTickTime) {
		matrixStackIn.scale(1.0F, 1.0F, 1.0F);
	}

}