package gaymeow.glowsticks.tags;

import gaymeow.glowsticks.Glowsticks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items{
        public static final TagKey<Item> WHITE_GLOWSTICKS = createTag("white_glowsticks");
        public static final TagKey<Item> LIGHT_GRAY_GLOWSTICKS = createTag("light_gray_glowsticks");
        public static final TagKey<Item> GRAY_GLOWSTICKS = createTag("gray_glowsticks");
        public static final TagKey<Item> BLACK_GLOWSTICKS = createTag("black_glowsticks");
        public static final TagKey<Item> BROWN_GLOWSTICKS = createTag("brown_glowsticks");
        public static final TagKey<Item> RED_GLOWSTICKS = createTag("red_glowsticks");
        public static final TagKey<Item> ORANGE_GLOWSTICKS = createTag("orange_glowsticks");
        public static final TagKey<Item> YELLOW_GLOWSTICKS = createTag("yellow_glowsticks");
        public static final TagKey<Item> LIME_GLOWSTICKS = createTag("lime_glowsticks");
        public static final TagKey<Item> GREEN_GLOWSTICKS = createTag("green_glowsticks");
        public static final TagKey<Item> CYAN_GLOWSTICKS = createTag("cyan_glowsticks");
        public static final TagKey<Item> LIGHT_BLUE_GLOWSTICKS = createTag("light_blue_glowsticks");
        public static final TagKey<Item> BLUE_GLOWSTICKS = createTag("blue_glowsticks");
        public static final TagKey<Item> PURPLE_GLOWSTICKS = createTag("purple_glowsticks");
        public static final TagKey<Item> MAGENTA_GLOWSTICKS = createTag("magenta_glowsticks");
        public static final TagKey<Item> PINK_GLOWSTICKS = createTag("pink_glowsticks");

        private static TagKey<Item> createTag(String name){
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID, name));
        }
    }
}
