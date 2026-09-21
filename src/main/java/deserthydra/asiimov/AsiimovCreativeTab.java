package deserthydra.asiimov;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class AsiimovCreativeTab {

    public static void init() {
        registerItemGroupOrder();
    }

    private static void registerItemGroupOrder() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
            entries.insertAfter(Items.PINK_GLAZED_TERRACOTTA, AsiimovBlocks.WHITE_TILE);
            entries.insertAfter(AsiimovBlocks.WHITE_TILE     , AsiimovBlocks.  LIGHT_GRAY_TILE);
            entries.insertAfter(AsiimovBlocks.LIGHT_GRAY_TILE, AsiimovBlocks.       GRAY_TILE);
            entries.insertAfter(AsiimovBlocks.GRAY_TILE      , AsiimovBlocks. BLACK_TILE);
            entries.insertAfter(AsiimovBlocks.BLACK_TILE     , AsiimovBlocks.  BROWN_TILE);
            entries.insertAfter(AsiimovBlocks.BROWN_TILE     , AsiimovBlocks.  RED_TILE);
            entries.insertAfter(AsiimovBlocks.RED_TILE       , AsiimovBlocks.ORANGE_TILE);
            entries.insertAfter(AsiimovBlocks.ORANGE_TILE    , AsiimovBlocks.   YELLOW_TILE);
            entries.insertAfter(AsiimovBlocks.YELLOW_TILE    , AsiimovBlocks.   LIME_TILE);
            entries.insertAfter(AsiimovBlocks.LIME_TILE      , AsiimovBlocks. GREEN_TILE);
            entries.insertAfter(AsiimovBlocks.GREEN_TILE     , AsiimovBlocks.  CYAN_TILE);
            entries.insertAfter(AsiimovBlocks.CYAN_TILE      , AsiimovBlocks. LIGHT_BLUE_TILE);
            entries.insertAfter(AsiimovBlocks.LIGHT_BLUE_TILE, AsiimovBlocks.       BLUE_TILE);
            entries.insertAfter(AsiimovBlocks.BLUE_TILE      , AsiimovBlocks. PURPLE_TILE);
            entries.insertAfter(AsiimovBlocks.PURPLE_TILE    , AsiimovBlocks.   MAGENTA_TILE);
            entries.insertAfter(AsiimovBlocks.MAGENTA_TILE   , AsiimovBlocks.    PINK_TILE);
        });

    }
}
