package gaymeow.glowsticks.datagen;

import gaymeow.glowsticks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {

                //wrong recipe for now I need a break or something
                shaped(RecipeCategory.MISC, ModItems.WHITE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ItemTags.DYES)
                        .define('G',Items.GLOWSTONE_DUST)
                        .define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                        .group("glowstick")
                        .save(output);


            }
        };
    }

    @Override
    public String getName() {
        return "Glowstick Recipes";
    }
}
