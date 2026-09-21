package deserthydra.asiimov.datagen.common;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class AsiimovRecipeProvider extends RecipeProvider {
    public AsiimovRecipeProvider(HolderLookup.Provider provider, RecipeOutput exporter) {
        super(provider,exporter);    }

    @Override
    public void buildRecipes() {
        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.WHITE_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.WHITE_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.LIGHT_GRAY_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.LIGHT_GRAY_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.GRAY_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.GRAY_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.BLACK_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.BLACK_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.BROWN_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.BROWN_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.RED_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.RED_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.ORANGE_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.ORANGE_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.YELLOW_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.YELLOW_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.LIME_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.LIME_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.GREEN_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.GREEN_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.CYAN_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.CYAN_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.LIGHT_BLUE_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.LIGHT_BLUE_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.BLUE_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.BLUE_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.PURPLE_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.PURPLE_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.MAGENTA_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.MAGENTA_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, AsiimovBlocks.PINK_TILE)
                .pattern("bbb")
                .pattern("bib")
                .pattern("bbb")
                .define('b', Blocks.SMOOTH_QUARTZ)
                .define('i', Items.PINK_DYE)
                .group("quartz")
                .unlockedBy("has_smooth_quartz", this.has(Blocks.SMOOTH_QUARTZ))
                .save(this.output);
        
        

    }

    public static class AsiimovRecipeGenerator extends FabricRecipeProvider {
        public AsiimovRecipeGenerator(FabricPackOutput dataPackOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(dataPackOutput, completableFuture);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput exporter) {
            return new AsiimovRecipeProvider(provider, exporter);
        }

        @Override
        public String getName() {
            return "Asiimov Recipes";
        }
    }
}
