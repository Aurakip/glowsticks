package gaymeow.glowsticks.datagen;

import gaymeow.glowsticks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
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


                shaped(RecipeCategory.MISC, ModItems.WHITE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.WHITE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.LIGHT_GRAY_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIGHT_GRAY_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.GRAY_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.GRAY_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.BLACK_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BLACK_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.BROWN_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BROWN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.RED_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.RED_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.ORANGE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.ORANGE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.YELLOW_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.YELLOW_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.LIME_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIME_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.GREEN_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.GREEN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.CYAN_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.CYAN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.LIGHT_BLUE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIGHT_BLUE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.BLUE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BLUE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.PURPLE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.PURPLE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.MAGENTA_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.MAGENTA_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, ModItems.PINK_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.PINK_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

            }
        };
    }

    @Override
    public String getName() {
        return "Glowstick Recipes";
    }
}
