package gaymeow.glowsticks.item.custom;


import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class GlowstickItem extends Item {
    public GlowstickItem(Properties properties) {
        super(properties);
    }

    @Override
    //adds glowing to entities hit and emits particles
    public void hurtEnemy(ItemStack itemStack, LivingEntity mob, LivingEntity attacker) {
        super.hurtEnemy(itemStack, mob, attacker);
        mob.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60));
        ((ServerLevel) mob.level()).sendParticles(ParticleTypes.GLOW, mob.getRandomX(1),mob.getEyeY(),mob.getRandomZ(1),5,0,0.5,0,0.3);
    }
}
