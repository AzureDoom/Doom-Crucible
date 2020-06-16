package mod.azure.doomweapon.client.render;

import com.mojang.blaze3d.matrix.MatrixStack;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.client.models.ZombiemanModel;
import mod.azure.doomweapon.entity.ZombiemanEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.util.ResourceLocation;

public class ZombiemanRender extends MobRenderer<ZombiemanEntity, ZombiemanModel<ZombiemanEntity>>
		implements IEntityRenderer<ZombiemanEntity, ZombiemanModel<ZombiemanEntity>> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(DoomMod.MODID,
			"textures/entity/zombieman.png");

	public ZombiemanRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ZombiemanModel<>(0.0F, 0.0F, 64, 64), 0.5F);
		this.addLayer(new HeldItemLayer<ZombiemanEntity, ZombiemanModel<ZombiemanEntity>>(this) {
			public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn,
					ZombiemanEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks,
					float ageInTicks, float netHeadYaw, float headPitch) {
				if (entitylivingbaseIn.isAggressive()) {
					super.render(matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount,
							partialTicks, ageInTicks, netHeadYaw, headPitch);
				}

			}
		});
	}

	@Override
	public ResourceLocation getEntityTexture(ZombiemanEntity entity) {
		return TEXTURE;
	}

}