package mod.azure.doomweapon.util;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyHelper {

	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingShift() {
		final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
		return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT)
				|| InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
}