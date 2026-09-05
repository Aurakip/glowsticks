package gaymeow.glowsticks.item.custom;


import gaymeow.glowsticks.particles.ModParticles;
import gaymeow.glowsticks.tags.ModTags;
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
    public static double[][] colorValueArray = {
            {1, 1, 1},
            {0.6, 0.6, 0.6},
            {0.298, 0.298, 0.298},
            {0.098, 0.098, 0.098},
            {0.4, 0.298, 0.2},
            {0.6, 0.2, 0.2},
            {0.847, 0.498, 0.2},
            {0.898, 0.898, 0.2},
            {0.498, 0.8, 0.098},
            {0.4, 0.498, 0.2},
            {0.298, 0.498, 0.6},
            {0.4, 0.6, 0.847},
            {0.2, 0.298, 0.698},
            {0.498, 0.247, 0.698},
            {0.698, 0.298, 0.847},
            {0.949, 0.498, 0.647}};

    //picks color for particles
    public double[] colorPicker(ItemStack itemStack){
        double[] colors = {0,0,0};
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
        double[] colors = colorPicker(itemStack);
        for (int i=0; i<5; i++){
        ((ServerLevel) mob.level()).sendParticles(ModParticles.NOTE, mob.getX() + (Math.random()-0.5)*(mob.getBoundingBox().getXsize()+1), mob.getEyeY() + Math.random()*0.2-0.1,mob.getZ() + (Math.random()-0.5)*(mob.getBoundingBox().getZsize()+1),0,colors[0],colors[1],colors[2],1);
        }
    }
}
