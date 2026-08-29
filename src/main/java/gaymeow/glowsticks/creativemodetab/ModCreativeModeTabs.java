package gaymeow.glowsticks.creativemodetab;

import gaymeow.glowsticks.Glowsticks;
import gaymeow.glowsticks.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab GLOWSTICK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID,"glowstick_items"),
            FabricCreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.PINK_GLOWSTICK))
                    .title(Component.translatable("creativemodetab.glowsticks.glowstick_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.WHITE_GLOWSTICK);
                        output.accept(ModItems.LIGHT_GRAY_GLOWSTICK);
                        output.accept(ModItems.GRAY_GLOWSTICK);
                        output.accept(ModItems.BLACK_GLOWSTICK);
                        output.accept(ModItems.BROWN_GLOWSTICK);
                        output.accept(ModItems.RED_GLOWSTICK);
                        output.accept(ModItems.ORANGE_GLOWSTICK);
                        output.accept(ModItems.YELLOW_GLOWSTICK);
                        output.accept(ModItems.LIME_GLOWSTICK);
                        output.accept(ModItems.GREEN_GLOWSTICK);
                        output.accept(ModItems.CYAN_GLOWSTICK);
                        output.accept(ModItems.LIGHT_BLUE_GLOWSTICK);
                        output.accept(ModItems.BLUE_GLOWSTICK);
                        output.accept(ModItems.PURPLE_GLOWSTICK);
                        output.accept(ModItems.MAGENTA_GLOWSTICK);
                        output.accept(ModItems.PINK_GLOWSTICK);
                    })

                    .build());

    public static  void registerModCreativeModeTabs(){}
}
