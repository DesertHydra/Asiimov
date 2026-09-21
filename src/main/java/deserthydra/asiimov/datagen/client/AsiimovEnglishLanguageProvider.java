package deserthydra.asiimov.datagen.client;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class AsiimovEnglishLanguageProvider extends FabricLanguageProvider {
    public AsiimovEnglishLanguageProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider lookup, TranslationBuilder builder) {

        builder.add(AsiimovBlocks.WHITE_TILE     ,"White Tile");
        builder.add(AsiimovBlocks.LIGHT_GRAY_TILE,"Light Gray Tile");
        builder.add(AsiimovBlocks.GRAY_TILE      ,"Gray Tile");
        builder.add(AsiimovBlocks.BLACK_TILE     ,"Black Tile");
        builder.add(AsiimovBlocks.BROWN_TILE     ,"Brown Tile");
        builder.add(AsiimovBlocks.RED_TILE       ,"Red Tile");
        builder.add(AsiimovBlocks.ORANGE_TILE    ,"Orange Tile");
        builder.add(AsiimovBlocks.YELLOW_TILE    ,"Yellow Tile");
        builder.add(AsiimovBlocks.LIME_TILE      ,"Lime Tile");
        builder.add(AsiimovBlocks.GREEN_TILE     ,"Green Tile");
        builder.add(AsiimovBlocks.CYAN_TILE      ,"Cyan Tile");
        builder.add(AsiimovBlocks.LIGHT_BLUE_TILE,"Light Blue Tile");
        builder.add(AsiimovBlocks.BLUE_TILE      ,"Blue Tile");
        builder.add(AsiimovBlocks.PURPLE_TILE    ,"Purple Tile");
        builder.add(AsiimovBlocks.MAGENTA_TILE   ,"Magenta Tile");
        builder.add(AsiimovBlocks.PINK_TILE      ,"Pink Tile");
    }
}
