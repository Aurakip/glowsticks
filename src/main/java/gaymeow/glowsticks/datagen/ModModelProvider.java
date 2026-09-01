package gaymeow.glowsticks.datagen;

import gaymeow.glowsticks.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.item.properties.select.DisplayContext;
import net.minecraft.client.renderer.item.properties.select.MainHand;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //itemModelGenerators.declareCustomModelItem(ModItems.WHITE_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.LIGHT_GRAY_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.GRAY_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.BLACK_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.BROWN_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.RED_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.ORANGE_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.YELLOW_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.LIME_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.GREEN_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.CYAN_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.LIGHT_BLUE_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.BLUE_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.PURPLE_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.MAGENTA_GLOWSTICK);
        //itemModelGenerators.declareCustomModelItem(ModItems.PINK_GLOWSTICK);

    }
}
