package mod.azure.doomweapon.item.powerup;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.item.Item;

public class SoulCubeItem extends Item {

	public SoulCubeItem() {
		super(new Item.Properties().group(DoomMod.DoomItemGroup).maxStackSize(1));
	}

}