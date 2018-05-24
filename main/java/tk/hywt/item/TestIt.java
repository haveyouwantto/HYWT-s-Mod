package tk.hywt.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tk.hywt.entity.EntityBomb;
import tk.hywt.entity.EntityTorch;
import tk.hywt.lib.RefStrings;

public class TestIt extends Item
{
 
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Item.getItemFromBlock(Blocks.tnt)))
        {
            //player.swingItem();
            world.playSoundAtEntity(player, RefStrings.modid + ":gun_shoot", 0.5F, 1.0F);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityBomb(world, player));
            }
        }
        return itemStack;
    }
}