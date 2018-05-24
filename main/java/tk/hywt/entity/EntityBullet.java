package tk.hywt.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable
{
    public EntityBullet(World world)
    {
        super(world);
    }
 
    public EntityBullet(World world, EntityLivingBase entity)
    {
        super(world, entity);
    }
 
    @Override
    protected float getGravityVelocity()
    {
        return 0.005F;
    }
 
    @Override
    public void onImpact(MovingObjectPosition movingObjectPosition)
    {
    	 if (movingObjectPosition.entityHit != null) {
        movingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)4);
    	 }
        setDead();
    }
}