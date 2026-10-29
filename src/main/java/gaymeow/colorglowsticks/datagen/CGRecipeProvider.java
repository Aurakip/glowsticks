package gaymeow.colorglowsticks.datagen;

import gaymeow.colorglowsticks.item.CGItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;

import java.util.concurrent.CompletableFuture;

public class CGRecipeProvider extends FabricRecipeProvider {
    public CGRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {

                shaped(RecipeCategory.MISC, CGItems.WHITE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.WHITE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.LIGHT_GRAY_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIGHT_GRAY_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.GRAY_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.GRAY_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.BLACK_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BLACK_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.BROWN_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BROWN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.RED_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.RED_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.ORANGE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.ORANGE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.YELLOW_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.YELLOW_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.LIME_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIME_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.GREEN_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.GREEN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.CYAN_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.CYAN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.LIGHT_BLUE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIGHT_BLUE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.BLUE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BLUE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.PURPLE_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.PURPLE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.MAGENTA_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.MAGENTA_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.PINK_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.PINK_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.IRON_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.WHITE_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.WHITE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.LIGHT_GRAY_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIGHT_GRAY_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.GRAY_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.GRAY_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.BLACK_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BLACK_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.BROWN_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BROWN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.RED_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.RED_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.ORANGE_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.ORANGE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.YELLOW_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.YELLOW_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.LIME_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIME_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.GREEN_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.GREEN_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.CYAN_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.WHITE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.LIGHT_BLUE_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.LIGHT_BLUE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.BLUE_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.BLUE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.PURPLE_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.PURPLE_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.MAGENTA_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.MAGENTA_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);

                shaped(RecipeCategory.MISC, CGItems.PINK_SPARKLING_GLOWSTICK)
                        .pattern("D")
                        .pattern("G")
                        .pattern("I")
                        .define('D', ConventionalItemTags.PINK_DYES).define('G',Items.GLOWSTONE_DUST).define('I',Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST)).group("sparkling_glowstick").save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Glowstick Recipes";
    }
}
