package gaymeow.colorglowsticks.playeranimations;

import com.zigythebird.playeranim.animation.PlayerAnimationController;
import com.zigythebird.playeranim.api.PlayerAnimationFactory;
import com.zigythebird.playeranimcore.enums.PlayState;
import gaymeow.colorglowsticks.ColorGlowsticks;
import net.minecraft.resources.Identifier;

public class CGAnimations {
    public static void registerModAnimations(){
        PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,"cheer"), 1500,
                player -> new PlayerAnimationController(player,
                        (controller, state, animSetter) -> PlayState.STOP
                )
        );
    }
}