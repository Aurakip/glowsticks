package gaymeow.colorglowsticks.datagen;

import gaymeow.colorglowsticks.item.CGItems;
import gaymeow.colorglowsticks.tags.CGTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class CGItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public CGItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(CGTags.Items.WHITE_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.WHITE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.WHITE_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.LIGHT_GRAY_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.LIGHT_GRAY_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIGHT_GRAY_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.GRAY_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.GRAY_GLOWSTICK))
                .add(CGItems.getRK(CGItems.GRAY_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.BLACK_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.BLACK_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BLACK_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.BROWN_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.BROWN_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BROWN_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.RED_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.RED_GLOWSTICK))
                .add(CGItems.getRK(CGItems.RED_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.ORANGE_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.ORANGE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.ORANGE_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.YELLOW_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.YELLOW_GLOWSTICK))
                .add(CGItems.getRK(CGItems.YELLOW_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.LIME_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.LIME_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIME_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.GREEN_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.GREEN_GLOWSTICK))
                .add(CGItems.getRK(CGItems.GREEN_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.CYAN_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.CYAN_GLOWSTICK))
                .add(CGItems.getRK(CGItems.CYAN_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.LIGHT_BLUE_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.LIGHT_BLUE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIGHT_BLUE_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.BLUE_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.BLUE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BLUE_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.PURPLE_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.PURPLE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.PURPLE_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.MAGENTA_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.MAGENTA_GLOWSTICK))
                .add(CGItems.getRK(CGItems.MAGENTA_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.PINK_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.PINK_GLOWSTICK))
                .add(CGItems.getRK(CGItems.PINK_SPARKLING_GLOWSTICK));;

        tag(CGTags.Items.NOTE_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.WHITE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIGHT_GRAY_GLOWSTICK))
                .add(CGItems.getRK(CGItems.GRAY_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BLACK_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BROWN_GLOWSTICK))
                .add(CGItems.getRK(CGItems.RED_GLOWSTICK))
                .add(CGItems.getRK(CGItems.ORANGE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.YELLOW_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIME_GLOWSTICK))
                .add(CGItems.getRK(CGItems.GREEN_GLOWSTICK))
                .add(CGItems.getRK(CGItems.CYAN_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIGHT_BLUE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BLUE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.PURPLE_GLOWSTICK))
                .add(CGItems.getRK(CGItems.MAGENTA_GLOWSTICK))
                .add(CGItems.getRK(CGItems.PINK_GLOWSTICK));

        tag(CGTags.Items.SPARKLING_GLOWSTICKS)
                .add(CGItems.getRK(CGItems.WHITE_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIGHT_GRAY_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.GRAY_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BLACK_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BROWN_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.RED_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.ORANGE_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.YELLOW_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIME_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.GREEN_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.CYAN_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.LIGHT_BLUE_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.BLUE_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.PURPLE_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.MAGENTA_SPARKLING_GLOWSTICK))
                .add(CGItems.getRK(CGItems.PINK_SPARKLING_GLOWSTICK));

        tag(CGTags.Items.GLOWSTICKS)
                .addTag(CGTags.Items.NOTE_GLOWSTICKS)
                .addTag(CGTags.Items.SPARKLING_GLOWSTICKS);
    }
}
