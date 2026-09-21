package deserthydra.asiimov.datagen.common;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class AsiimovBlockLootTableProvider extends FabricBlockLootSubProvider {
    public AsiimovBlockLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.dropSelf(AsiimovBlocks.WHITE_TILE);
        this.dropSelf(AsiimovBlocks.LIGHT_GRAY_TILE);
        this.dropSelf(AsiimovBlocks.GRAY_TILE);
        this.dropSelf(AsiimovBlocks.BLACK_TILE);
        this.dropSelf(AsiimovBlocks.BROWN_TILE);
        this.dropSelf(AsiimovBlocks.RED_TILE);
        this.dropSelf(AsiimovBlocks.ORANGE_TILE);
        this.dropSelf(AsiimovBlocks.YELLOW_TILE);
        this.dropSelf(AsiimovBlocks.LIME_TILE);
        this.dropSelf(AsiimovBlocks.GREEN_TILE);
        this.dropSelf(AsiimovBlocks.CYAN_TILE);
        this.dropSelf(AsiimovBlocks.LIGHT_BLUE_TILE);
        this.dropSelf(AsiimovBlocks.BLUE_TILE);
        this.dropSelf(AsiimovBlocks.PURPLE_TILE);
        this.dropSelf(AsiimovBlocks.MAGENTA_TILE);
        this.dropSelf(AsiimovBlocks.PINK_TILE);
    }
}
