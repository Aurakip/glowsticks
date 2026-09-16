package gaymeow.glowsticks.playeranimations;

import com.zigythebird.playeranim.animation.PlayerAnimationController;
import com.zigythebird.playeranim.api.PlayerAnimationFactory;
import com.zigythebird.playeranimcore.enums.PlayState;
import gaymeow.glowsticks.Glowsticks;
import net.minecraft.resources.Identifier;

public class ModAnimations {
    public static void registerModAnimations(){
        PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID,"cheer"), 1000,
                player -> new PlayerAnimationController(player,
                        (controller, state, animSetter) -> PlayState.STOP
                )
        );
    }
}