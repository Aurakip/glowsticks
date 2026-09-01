package gaymeow.glowsticks.item.custom;


import gaymeow.glowsticks.tags.ModTags;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class GlowstickItem extends Item {
    public GlowstickItem(Properties properties) {
        super(properties);
    }

    public static TagKey[] colorTagArray = {
            ModTags.Items.WHITE_GLOWSTICKS,
            ModTags.Items.LIGHT_GRAY_GLOWSTICKS,
            ModTags.Items.GRAY_GLOWSTICKS,
            ModTags.Items.BLACK_GLOWSTICKS,
            ModTags.Items.BROWN_GLOWSTICKS,
            ModTags.Items.RED_GLOWSTICKS,
            ModTags.Items.ORANGE_GLOWSTICKS,
            ModTags.Items.YELLOW_GLOWSTICKS,
            ModTags.Items.LIME_GLOWSTICKS,
            ModTags.Items.GREEN_GLOWSTICKS,
            ModTags.Items.CYAN_GLOWSTICKS,
            ModTags.Items.LIGHT_BLUE_GLOWSTICKS,
            ModTags.Items.BLUE_GLOWSTICKS,
            ModTags.Items.PURPLE_GLOWSTICKS,
            ModTags.Items.MAGENTA_GLOWSTICKS,
            ModTags.Items.PINK_GLOWSTICKS};

    //array with the values of each color
    public static float[][] colorValueArray = {
            {1f, 1f, 1f},
            {0.6f, 0.6f, 0.6f},
            {0.298f, 0.298f, 0.298f},
            {0.098f, 0.098f, 0.098f},
            {0.4f, 0.298f, 0.2f},
            {0.6f, 0.2f, 0.2f},
            {0.847f, 0.498f, 0.2f},
            {0.898f, 0.898f, 0.2f},
            {0.498f, 0.8f, 0.098f},
            {0.4f, 0.498f, 0.2f},
            {0.298f, 0.498f, 0.6f},
            {0.4f, 0.6f, 0.847f},
            {0.2f, 0.298f, 0.698f},
            {0.498f, 0.247f, 0.698f},
            {0.698f, 0.298f, 0.847f},
            {0.949f, 0.498f, 0.647f}};

    //picks color for particles
    public float[] colorPicker(ItemStack itemStack){
        float[] colors = {0,0,0};
        for (int i=0; i<colorTagArray.length; i++){
            if (itemStack.is(colorTagArray[i])){
                colors = colorValueArray[i];
                break;
            };
        };
        return colors;
    };

    @Override
    //adds glowing to entities hit and emits particles
    public void hurtEnemy(ItemStack itemStack, LivingEntity mob, LivingEntity attacker) {
        super.hurtEnemy(itemStack, mob, attacker);
        mob.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60));
        float[] colors = colorPicker(itemStack);
        ColorParticleOption particle = ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, colors[0],colors[1],colors[2]);
        ((ServerLevel) mob.level()).sendParticles(particle, mob.getX(),mob.getEyeY(),mob.getZ(),5,0.5,0.15,0.5,0.3);
    }
}
