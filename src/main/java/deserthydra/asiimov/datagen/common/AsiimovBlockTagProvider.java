package deserthydra.asiimov.datagen.common;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class AsiimovBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public AsiimovBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(blockId(AsiimovBlocks.WHITE_TILE))
                .add(blockId(AsiimovBlocks.LIGHT_GRAY_TILE))
                .add(blockId(AsiimovBlocks.GRAY_TILE))
                .add(blockId(AsiimovBlocks.BLACK_TILE))
                .add(blockId(AsiimovBlocks.BROWN_TILE))
                .add(blockId(AsiimovBlocks.RED_TILE))
                .add(blockId(AsiimovBlocks.ORANGE_TILE))
                .add(blockId(AsiimovBlocks.YELLOW_TILE))
                .add(blockId(AsiimovBlocks.LIME_TILE))
                .add(blockId(AsiimovBlocks.GREEN_TILE))
                .add(blockId(AsiimovBlocks.CYAN_TILE))
                .add(blockId(AsiimovBlocks.LIGHT_BLUE_TILE))
                .add(blockId(AsiimovBlocks.BLUE_TILE))
                .add(blockId(AsiimovBlocks.PURPLE_TILE))
                .add(blockId(AsiimovBlocks.MAGENTA_TILE))
                .add(blockId(AsiimovBlocks.PINK_TILE));
    }

    private static ResourceKey<Block> blockId(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).orElseThrow();
    }
}
