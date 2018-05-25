package tk.hywt.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import tk.hywt.lib.hMath;

public class EntityDoomsdayRocket extends EntityThrowable
{
    public EntityDoomsdayRocket(World world)
    {
        super(world);
    }
 
    public EntityDoomsdayRocket(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }
 
    private void explode()
    {
        int bx = (int)posX;
        int by = (int)posY;
        int bz = (int)posZ;
        worldObj.createExplosion(this, posX, posY, posZ, 15F, true);
        for (int i = 0; i < 5; i++) {
        worldObj.newExplosion(this, posX+hMath.GetRandomNumber(40)-20, posY, posZ+hMath.GetRandomNumber(40)-20, 4, true,true);
        }
        setDead();
    }
    @Override
    public void onUpdate()
    {
        super.onUpdate();
 
        for (int i = 0; i < 10; i++)
        {
            double x = (double)(rand.nextInt(10) - 5) / 8.0D;
            double y = (double)(rand.nextInt(10) - 5) / 8.0D;
            double z = (double)(rand.nextInt(10) - 5) / 8.0D;
            worldObj.spawnParticle("cloud", posX, posY, posZ, 0.1,0.1,0.1);
        }
    }
 
    @Override
    protected float getGravityVelocity()
    {
        return 0.005F;
    }
 
    @Override
    public void onImpact(MovingObjectPosition movingObjectPosition)
    {
        explode();
    }
    protected float func_70182_d()
    {
    return 2F; // set to speed you want
    }
}