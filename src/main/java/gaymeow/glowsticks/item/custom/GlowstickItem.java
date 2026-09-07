package gaymeow.glowsticks.item.custom;


import gaymeow.glowsticks.particles.ModParticles;
import gaymeow.glowsticks.tags.ModTags;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.level.Level;


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

    //array w/ the values of each color
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
            }
        }
        return colors;
    }

    public static TagKey[] particleTagArray = {
            ModTags.Items.NOTE_GLOWSTICKS};

    //array w/ the glowstick particles
    public static SimpleParticleType[] particleArray = {
            ModParticles.NOTE};

    //picks particle for glowsticks
    public SimpleParticleType particlePicker(ItemStack itemStack){
        SimpleParticleType particle = ParticleTypes.ANGRY_VILLAGER;
        for (int i=0;i<particleTagArray.length;i++){
            if (itemStack.is(particleTagArray[i])){
                particle = particleArray[i];
                break;
            }
        }
        return particle;
    }

    @Override
    //adds glowing to entities hit and emits particles
    public void hurtEnemy(ItemStack itemStack, LivingEntity mob, LivingEntity attacker) {
        super.hurtEnemy(itemStack, mob, attacker);
        mob.addEffect(new MobEffectInstance(MobEffects.GLOWING, 60));
        double[] colors = colorPicker(itemStack);
        SimpleParticleType particle = particlePicker(itemStack);
        for (int i=0; i<5; i++){
        ((ServerLevel) mob.level()).sendParticles(particle, mob.getX() + (Math.random()-0.5)*(mob.getBoundingBox().getXsize()+2), mob.getEyeY() + Math.random()*0.2-0.1,mob.getZ() + (Math.random()-0.5)*(mob.getBoundingBox().getZsize()+2),0,colors[0],colors[1],colors[2],1);
        }
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
        return ItemUseAnimation.TRIDENT;
    }

    @Override
    //emits particles on right click
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        int particleNumber;
        if (hand.asEquipmentSlot().compareTo(EquipmentSlot.MAINHAND)==0) {
            particleNumber = 3;
        }else{
            particleNumber = 2;
        }
        double[] colors = colorPicker(player.getItemInHand(hand));
        SimpleParticleType particle = particlePicker(player.getItemInHand(hand));
        if (!level.isClientSide()) {
            for (int i = 0; i < particleNumber; i++) {
                ((ServerLevel) level).sendParticles(particle, player.getX() + (Math.random() - 0.5) * 3, player.getEyeY() + Math.random() * 0.2 - 0.1, player.getZ() + (Math.random() - 0.5) * 3, 0, colors[0], colors[1], colors[2], 1);
            }
        }
        if (particleNumber == 3 && player.getOffhandItem().is(ModTags.Items.GLOWSTICKS)){
            colors = colorPicker(player.getOffhandItem());
            particle = particlePicker(player.getOffhandItem());
            if (!level.isClientSide()) {
                for (int i = 0; i < 2; i++) {
                    ((ServerLevel) level).sendParticles(particle, player.getX() + (Math.random() - 0.5) * 3, player.getEyeY() + Math.random() * 0.2 - 0.1, player.getZ() + (Math.random() - 0.5) * 3, 0, colors[0], colors[1], colors[2], 1);
                }
            }
        }
        player.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResult.SUCCESS;
    }
}
