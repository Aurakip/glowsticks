package gaymeow.colorglowsticks.datagen;

import gaymeow.colorglowsticks.item.CGItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class CGModelProvider extends FabricModelProvider {

    public CGModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(CGItems.WHITE_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.LIGHT_GRAY_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.GRAY_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.BLACK_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.BROWN_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.RED_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.ORANGE_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.YELLOW_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.LIME_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.GREEN_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.CYAN_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.LIGHT_BLUE_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.BLUE_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.PURPLE_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.MAGENTA_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.PINK_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.WHITE_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.LIGHT_GRAY_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.GRAY_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.BLACK_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.BROWN_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.RED_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.ORANGE_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.YELLOW_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.LIME_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.GREEN_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.CYAN_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.LIGHT_BLUE_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.BLUE_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.PURPLE_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.MAGENTA_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(CGItems.PINK_SPARKLING_GLOWSTICK, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
