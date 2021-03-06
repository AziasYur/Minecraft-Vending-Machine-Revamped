package com.azias.vendingmachine.items;

import java.util.List;

import com.azias.vendingmachine.VendingMachineMod;
import com.azias.vendingmachine.gui.GuiBookGuide;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemGuideBook extends Item {
	
	@SideOnly(Side.CLIENT)
	protected IIcon[] itemIcon;
	private final String[] itemsNames = {"_base"};
	private final int maxMeta = itemsNames.length;
	
	public ItemGuideBook(String name, boolean isClient) {
        super();
        setHasSubtypes(true);
		setTextureName(VendingMachineMod.modID + ":" + name);
		setUnlocalizedName(VendingMachineMod.modID + "_" + name);
		setCreativeTab(VendingMachineMod.tabVendingMachines);
		if(isClient) {
			itemIcon = new IIcon[maxMeta];
		}
		GameRegistry.registerItem(this, name);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < maxMeta; i ++) {
	        this.itemIcon[i] = reg.registerIcon(VendingMachineMod.modID + ":"+this.getUnlocalizedName().substring(25) + itemsNames[i]);
	    }
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > maxMeta-1)
	        meta = 0;
	    return this.itemIcon[meta];
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < maxMeta; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
	@Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
		if (world.isRemote) {
        	System.out.println("Loading GUI...");
        	player.openGui(VendingMachineMod.instance, GuiBookGuide.id, world, x, y, z);
            return true;
        } else {
        	return true;
        }
	}
	
}
