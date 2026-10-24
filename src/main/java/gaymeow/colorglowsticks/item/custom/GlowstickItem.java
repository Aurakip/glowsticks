package gaymeow.colorglowsticks.item.custom;


import com.zigythebird.playeranim.animation.PlayerAnimationController;
import com.zigythebird.playeranim.api.PlayerAnimationAccess;
import com.zigythebird.playeranimcore.api.firstPerson.FirstPersonConfiguration;
import com.zigythebird.playeranimcore.api.firstPerson.FirstPersonMode;
import gaymeow.colorglowsticks.ColorGlowsticks;
import gaymeow.colorglowsticks.particles.CGParticles;
import gaymeow.colorglowsticks.tags.CGTags;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class GlowstickItem extends Item {
    public GlowstickItem(Properties properties) {super(properties);}

    public static TagKey[] colorTagArray = {
            CGTags.Items.WHITE_GLOWSTICKS,
            CGTags.Items.LIGHT_GRAY_GLOWSTICKS,
            CGTags.Items.GRAY_GLOWSTICKS,
            CGTags.Items.BLACK_GLOWSTICKS,
            CGTags.Items.BROWN_GLOWSTICKS,
            CGTags.Items.RED_GLOWSTICKS,
            CGTags.Items.ORANGE_GLOWSTICKS,
            CGTags.Items.YELLOW_GLOWSTICKS,
            CGTags.Items.LIME_GLOWSTICKS,
            CGTags.Items.GREEN_GLOWSTICKS,
            CGTags.Items.CYAN_GLOWSTICKS,
            CGTags.Items.LIGHT_BLUE_GLOWSTICKS,
            CGTags.Items.BLUE_GLOWSTICKS,
            CGTags.Items.PURPLE_GLOWSTICKS,
            CGTags.Items.MAGENTA_GLOWSTICKS,
            CGTags.Items.PINK_GLOWSTICKS};

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
            CGTags.Items.NOTE_GLOWSTICKS,
            CGTags.Items.SPARKLING_GLOWSTICKS};

    //array w/ the glowstick particles
    public static SimpleParticleType[] particleArray = {
            CGParticles.NOTE,
            CGParticles.SPARKLE};

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

    //animations for the glowstick
    public PlayerAnimationController cheerController(Player player){
        PlayerAnimationController controller = (PlayerAnimationController) PlayerAnimationAccess.getPlayerAnimationLayer(player, Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,"cheer"));
        controller.setFirstPersonMode(FirstPersonMode.THIRD_PERSON_MODEL);
        controller.setFirstPersonConfiguration(new FirstPersonConfiguration()
                .setShowLeftArm(true)
                .setShowRightArm(true));
        controller.setFirstPersonFollowsCamera(true);
        return controller;
    }

    @Override
    //emits particles on right click
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        double[] colors;
        SimpleParticleType particle;
        boolean rightHand = false;
        boolean leftHand = false;
        boolean isRightHanded = player.getMainArm().equals(HumanoidArm.RIGHT);
        //if(player.isCrouching() && player.getOffhandItem().is(player.getMainHandItem().getItem())){}
        if (player.getMainHandItem().is(CGTags.Items.GLOWSTICKS)) {
            colors = colorPicker(player.getMainHandItem());
            particle = particlePicker(player.getMainHandItem());
            if (!level.isClientSide()) {
                for (int i = 0; i < 3; i++) {
                    ((ServerLevel) level).sendParticles(particle, player.getX() + (Math.random() - 0.5) * 3, player.getEyeY() + Math.random() * 0.2 - 0.1, player.getZ() + (Math.random() - 0.5) * 3, 0, colors[0], colors[1], colors[2], 1);
                }
            }
            if (isRightHanded){rightHand = true;}
            else {leftHand = true;}
        }
        if (player.getOffhandItem().is(CGTags.Items.GLOWSTICKS)){
            colors = colorPicker(player.getOffhandItem());
            particle = particlePicker(player.getOffhandItem());
            if (!level.isClientSide()) {
                for (int i = 0; i < 2; i++) {
                    ((ServerLevel) level).sendParticles(particle, player.getX() + (Math.random() - 0.5) * 3, player.getEyeY() + Math.random() * 0.2 - 0.1, player.getZ() + (Math.random() - 0.5) * 3, 0, colors[0], colors[1], colors[2], 1);
                }
            }
            if (isRightHanded){leftHand = true;}
            else {rightHand = true;}
        }
        if (rightHand && leftHand){cheerController(player).triggerAnimation(Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,"cheer_both"));}
        else{
            if (rightHand){cheerController(player).triggerAnimation(Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,"cheer_right"));}
            if (leftHand){cheerController(player).triggerAnimation(Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,"cheer_left"));}
        }
        player.awardStat(Stats.ITEM_USED.get(this));
        player.startUsingItem(hand);
        return InteractionResult.SUCCESS;
    }
}