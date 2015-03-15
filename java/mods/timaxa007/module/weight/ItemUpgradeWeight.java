package mods.timaxa007.module.weight;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemUpgradeWeight extends Item {

	public ItemUpgradeWeight() {
		super();
		setCreativeTab(CreativeTabs.tabMisc);
		setHasSubtypes(true);
		setMaxDamage(0);
		setUnlocalizedName("upgrades_weights");
	}

	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player) {
		NBTTagCompound nbt = is.getTagCompound();
		if (nbt == null) nbt = new NBTTagCompound();

		if (PlayerWeight.get(player) != null) {
			if (nbt != null && nbt.hasKey("WeightUp")) {
				if (nbt.getShort("WeightUp") > (short)0) {
					PlayerWeight.get(player).addWeightMax((float)nbt.getShort("WeightUp"));
					if (!player.capabilities.isCreativeMode) --is.stackSize;
				} else if (nbt.getShort("WeightUp") == (short)0) {
					if (PlayerWeight.get(player).getWeightMax() >= 60.0F && PlayerWeight.get(player).getWeightMax() <= 30000.0F) {
						short weight_down = (short)(PlayerWeight.get(player).getWeightMax() - 60.0F);
						player.inventory.addItemStackToInventory(addNBT(weight_down));
						PlayerWeight.get(player).addWeightMax(-weight_down);
					}
				}
			}
		}

		return is;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack is, EntityPlayer player, List list, boolean flag) {
		NBTTagCompound nbt = is.getTagCompound();
		if (nbt != null && nbt.hasKey("WeightUp"))
			list.add(StatCollector.translateToLocal("text.add_weight") + ": +" + nbt.getShort("WeightUp") + ".");
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(Item id, CreativeTabs table, List list) {
		list.add(addNBT((short)0));
		list.add(addNBT((short)1));
		list.add(addNBT((short)2));
		list.add(addNBT((short)3));
		list.add(addNBT((short)4));
		list.add(addNBT((short)5));
		list.add(addNBT((short)10));
		list.add(addNBT((short)25));
		list.add(addNBT((short)50));
		list.add(addNBT((short)100));
		list.add(addNBT((short)500));
		list.add(addNBT((short)1000));
		list.add(addNBT((short)5000));
		list.add(addNBT((short)10000));
		list.add(addNBT((short)20000));
		list.add(addNBT((short)30000));
		//list.add(new ItemStack(id, 1, 0));
	}

	public static ItemStack addNBT(short i) {
		ItemStack is = new ItemStack(CoreWeight.upgradeWeight);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setShort("WeightUp", i);
		is.setTagCompound(nbt);
		return is;
	}

}
