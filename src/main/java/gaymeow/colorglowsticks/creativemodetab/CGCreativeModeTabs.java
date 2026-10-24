package gaymeow.colorglowsticks.creativemodetab;

import gaymeow.colorglowsticks.ColorGlowsticks;
import gaymeow.colorglowsticks.item.CGItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CGCreativeModeTabs {
    public static final CreativeModeTab GLOWSTICK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,"glowstick_items"),
            FabricCreativeModeTab.builder()
                    .icon(()->new ItemStack(CGItems.PINK_GLOWSTICK))
                    .title(Component.translatable("creativemodetab.colorglowsticks.glowstick_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(CGItems.WHITE_GLOWSTICK);
                        output.accept(CGItems.LIGHT_GRAY_GLOWSTICK);
                        output.accept(CGItems.GRAY_GLOWSTICK);
                        output.accept(CGItems.BLACK_GLOWSTICK);
                        output.accept(CGItems.BROWN_GLOWSTICK);
                        output.accept(CGItems.RED_GLOWSTICK);
                        output.accept(CGItems.ORANGE_GLOWSTICK);
                        output.accept(CGItems.YELLOW_GLOWSTICK);
                        output.accept(CGItems.LIME_GLOWSTICK);
                        output.accept(CGItems.GREEN_GLOWSTICK);
                        output.accept(CGItems.CYAN_GLOWSTICK);
                        output.accept(CGItems.LIGHT_BLUE_GLOWSTICK);
                        output.accept(CGItems.BLUE_GLOWSTICK);
                        output.accept(CGItems.PURPLE_GLOWSTICK);
                        output.accept(CGItems.MAGENTA_GLOWSTICK);
                        output.accept(CGItems.PINK_GLOWSTICK);
                        output.accept(CGItems.WHITE_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.LIGHT_GRAY_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.GRAY_SPARKLING_GLOWSTICK );
                        output.accept(CGItems.BLACK_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.BROWN_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.RED_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.ORANGE_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.YELLOW_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.LIME_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.GREEN_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.CYAN_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.LIGHT_BLUE_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.BLUE_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.PURPLE_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.MAGENTA_SPARKLING_GLOWSTICK);
                        output.accept(CGItems.PINK_SPARKLING_GLOWSTICK);
                    })

                    .build());

    public static  void registerModCreativeModeTabs(){}
}
