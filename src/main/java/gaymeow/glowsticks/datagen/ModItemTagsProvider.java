package gaymeow.glowsticks.datagen;

import gaymeow.glowsticks.item.ModItems;
import gaymeow.glowsticks.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.WHITE_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.WHITE_GLOWSTICK));

        tag(ModTags.Items.LIGHT_GRAY_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.LIGHT_GRAY_GLOWSTICK));

        tag(ModTags.Items.GRAY_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.GRAY_GLOWSTICK));

        tag(ModTags.Items.BLACK_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.BLACK_GLOWSTICK));

        tag(ModTags.Items.BROWN_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.BROWN_GLOWSTICK));

        tag(ModTags.Items.RED_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.RED_GLOWSTICK));

        tag(ModTags.Items.ORANGE_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.ORANGE_GLOWSTICK));

        tag(ModTags.Items.YELLOW_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.YELLOW_GLOWSTICK));

        tag(ModTags.Items.LIME_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.LIME_GLOWSTICK));

        tag(ModTags.Items.GREEN_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.GREEN_GLOWSTICK));

        tag(ModTags.Items.CYAN_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.CYAN_GLOWSTICK));

        tag(ModTags.Items.LIGHT_BLUE_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.LIGHT_BLUE_GLOWSTICK));

        tag(ModTags.Items.BLUE_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.BLUE_GLOWSTICK));

        tag(ModTags.Items.PURPLE_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.PURPLE_GLOWSTICK));

        tag(ModTags.Items.MAGENTA_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.MAGENTA_GLOWSTICK));

        tag(ModTags.Items.PINK_GLOWSTICKS)
                .add(ModItems.getRK(ModItems.PINK_GLOWSTICK));
    }
}
