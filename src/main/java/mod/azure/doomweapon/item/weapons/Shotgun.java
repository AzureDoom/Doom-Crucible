package mod.azure.doomweapon.item.weapons;

import mod.azure.doomweapon.DoomMod;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;

public class Shotgun extends BowItem {

	public Shotgun(String name) {
		super(new Item.Properties().group(DoomMod.DoomItemGroup));
		this.setRegistryName(DoomMod.MODID, name);
	}
}