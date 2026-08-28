package gaymeow.glowsticks.item;

import gaymeow.glowsticks.Glowsticks;
import gaymeow.glowsticks.item.custom.GlowstickItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static final Item WHITE_GLOWSTICK = registerItem("white_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item LIGHT_GRAY_GLOWSTICK = registerItem("light_gray_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item GRAY_GLOWSTICK = registerItem("gray_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item BLACK_GLOWSTICK = registerItem("black_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item BROWN_GLOWSTICK = registerItem("brown_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item RED_GLOWSTICK = registerItem("red_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item ORANGE_GLOWSTICK = registerItem("orange_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item YELLOW_GLOWSTICK = registerItem("yellow_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item LIME_GLOWSTICK = registerItem("lime_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item GREEN_GLOWSTICK = registerItem("green_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item CYAN_GLOWSTICK = registerItem("cyan_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item LIGHT_BLUE_GLOWSTICK = registerItem("light_blue_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item BLUE_GLOWSTICK = registerItem("blue_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item PURPLE_GLOWSTICK = registerItem("purple_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item MAGENTA_GLOWSTICK = registerItem("magenta_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item PINK_GLOWSTICK = registerItem("pink_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID,name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID, name)))));
    }

    public static void registerModItems(){}

}
