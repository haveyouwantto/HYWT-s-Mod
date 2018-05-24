package tk.hywt.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityRocket extends EntityThrowable
{
    public EntityRocket(World world)
    {
        super(world);
    }
 
    public EntityRocket(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }
 
    private void explode()
    {
        int bx = (int)posX;
        int by = (int)posY;
        int bz = (int)posZ;
        worldObj.createExplosion(this, posX, posY, posZ, 4F, true);
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
}