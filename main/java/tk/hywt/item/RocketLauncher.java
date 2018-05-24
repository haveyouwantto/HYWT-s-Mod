package tk.hywt.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tk.hywt.entity.EntityRocket;
import tk.hywt.lib.RefStrings;

public class RocketLauncher extends Item
{
 
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(Items.fire_charge))
        {
            //player.swingItem();
            world.playSoundAtEntity(player, RefStrings.modid + ":cannon_fire", 0.5F, 1.0F);
            if (!world.isRemote)
            {
                world.spawnEntityInWorld(new EntityRocket(world, player));
            }
        }
        return itemStack;
    }
}
