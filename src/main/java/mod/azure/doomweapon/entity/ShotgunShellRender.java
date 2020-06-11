package mod.azure.doomweapon.entity;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class ShotgunShellRender extends ArrowRenderer<ShotgunShellEntity> {

	private static final ResourceLocation SHOTGUN_SHELL_TEXTURE = new ResourceLocation(DoomMod.MODID,
			"textures/entity/shotgun_shell.png");

	public ShotgunShellRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn);
	}

	@Override
	public ResourceLocation getEntityTexture(ShotgunShellEntity entity) {
		return SHOTGUN_SHELL_TEXTURE;
	}

}