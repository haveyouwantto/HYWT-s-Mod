package tk.hywt.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tk.hywt.entity.EntityRocket;
import tk.hywt.entity.EntityTorch;
import tk.hywt.lib.RefStrings;

public class TorchGun extends Item
{
 
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Item.getItemFromBlock(Blocks.torch)))
        {
            //player.swingItem();
            world.playSoundAtEntity(player, RefStrings.modid + ":rocket", 0.5F, 1.0F);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityTorch(world, player));
            }
        }
        return itemStack;
    }
}
