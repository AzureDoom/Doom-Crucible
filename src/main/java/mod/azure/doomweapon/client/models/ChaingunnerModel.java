package mod.azure.doomweapon.client.models;

import mod.azure.doomweapon.entity.ChaingunnerEntity;
import net.minecraft.client.renderer.entity.model.AbstractZombieModel;

public class ChaingunnerModel<T extends ChaingunnerEntity> extends AbstractZombieModel<T> {
	public ChaingunnerModel(float modelSize, boolean p_i1168_2_) {
		this(modelSize, 0.0F, 64, p_i1168_2_ ? 32 : 64);
	}

	protected ChaingunnerModel(float p_i48914_1_, float p_i48914_2_, int p_i48914_3_, int p_i48914_4_) {
		super(p_i48914_1_, p_i48914_2_, p_i48914_3_, p_i48914_4_);
	}

	public boolean isAggressive(T entityIn) {
		return entityIn.isAggressive();
	}
}