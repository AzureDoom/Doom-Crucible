package mod.azure.doomweapon.client.models;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LostSoulModel<T extends Entity> extends SegmentedModel<T> {
	private final ModelRenderer head;

	public LostSoulModel() {
		this(0.0F);
	}

	public LostSoulModel(float p_i46366_1_) {
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, p_i46366_1_);
		this.head.setRotationPoint(0.0F, 6.0F, 0.0F);
	}

	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(this.head);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
		this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
	}
}