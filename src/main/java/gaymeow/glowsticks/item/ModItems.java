package gaymeow.glowsticks.item;

import gaymeow.glowsticks.Glowsticks;
import gaymeow.glowsticks.item.custom.GlowstickItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.ColorCollection;

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

    public static final Item WHITE_SPARKLING_GLOWSTICK = registerItem("white_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item LIGHT_GRAY_SPARKLING_GLOWSTICK = registerItem("light_gray_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item GRAY_SPARKLING_GLOWSTICK = registerItem("gray_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item BLACK_SPARKLING_GLOWSTICK = registerItem("black_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item BROWN_SPARKLING_GLOWSTICK = registerItem("brown_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item RED_SPARKLING_GLOWSTICK = registerItem("red_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item ORANGE_SPARKLING_GLOWSTICK = registerItem("orange_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item YELLOW_SPARKLING_GLOWSTICK = registerItem("yellow_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item LIME_SPARKLING_GLOWSTICK = registerItem("lime_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item GREEN_SPARKLING_GLOWSTICK = registerItem("green_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item CYAN_SPARKLING_GLOWSTICK = registerItem("cyan_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item LIGHT_BLUE_SPARKLING_GLOWSTICK = registerItem("light_blue_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item BLUE_SPARKLING_GLOWSTICK = registerItem("blue_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item PURPLE_SPARKLING_GLOWSTICK = registerItem("purple_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item MAGENTA_SPARKLING_GLOWSTICK = registerItem("magenta_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));
    public static final Item PINK_SPARKLING_GLOWSTICK = registerItem("pink_sparkling_glowstick", properties -> new GlowstickItem(properties.stacksTo(1)));

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID,name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID, name)))));
    }

    public static void registerModItems(){}

}
