package mod.azure.doomweapon.item.armor.skin;

import java.util.List;

import mod.azure.doomweapon.DoomMod;
import mod.azure.doomweapon.models.BipedModelSkin;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//created by Marctron

public class SkinArmor extends ArmorItem {

	public SkinArmor(IArmorMaterial materialIn, EquipmentSlotType slot, String name) {
		super(materialIn, slot, new Item.Properties().group(DoomMod.DoomItemGroup));
		this.setRegistryName(DoomMod.MODID, name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new StringTextComponent(
				"\u00A7o" + "\u00A7e" + "Skin like armor model!"));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	@Override
	public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
		ItemStack stack = new ItemStack(this);
		stack.hasTag();
		
	}

	@Override
	public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
		stack.hasTag();
		
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	public boolean shouldSyncTag() {
		return true;
	}

	@Override
	public boolean updateItemStackNBT(CompoundNBT nbt) {
		return super.updateItemStackNBT(nbt);
	}

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return false;
	}
	
	private static BipedModelSkin model = new BipedModelSkin(0f, false);
	
	@Override
	
	public final BipedModel getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel _default) {
	
		if(!itemStack.isEmpty())
		{
			
			
			if(itemStack.getItem() instanceof ArmorItem) 
				{
				
				
					
				
					
			
					
					model.Head.showModel = armorSlot == EquipmentSlotType.HEAD;
					model.Body.showModel = armorSlot == EquipmentSlotType.CHEST;					
					model.RightArm.showModel = armorSlot == EquipmentSlotType.CHEST;
					model.LeftArm.showModel = armorSlot == EquipmentSlotType.CHEST;
					model.RightLeg.showModel = armorSlot == EquipmentSlotType.LEGS;
					model.LeftLeg.showModel = armorSlot == EquipmentSlotType.LEGS;
					
					model.HeadWear.showModel = armorSlot == EquipmentSlotType.HEAD;
					model.BodyWear.showModel = armorSlot == EquipmentSlotType.CHEST;
					model.RightArmWear.showModel = armorSlot == EquipmentSlotType.CHEST;
					model.LeftArmWear.showModel = armorSlot == EquipmentSlotType.CHEST;
					model.RightLegWear.showModel = (armorSlot == EquipmentSlotType.LEGS);
					model.LeftLegWear.showModel = (armorSlot == EquipmentSlotType.LEGS);
					
				

					model.isSneak = _default.isSneak;
					model.isSitting = _default.isSitting;
					model.isChild = _default.isChild;
					model.rightArmPose = _default.rightArmPose;
					model.leftArmPose = _default.leftArmPose;

									
					return model;
				}
			}
			
			return null;
		}


}