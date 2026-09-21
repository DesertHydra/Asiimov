package deserthydra.asiimov.datagen.client;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;


public class AsiimovModelProvider extends FabricModelProvider {

    public AsiimovModelProvider(FabricPackOutput output) { super(output); }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        generator.createTrivialCube(AsiimovBlocks.WHITE_TILE     );
        generator.createTrivialCube(AsiimovBlocks.LIGHT_GRAY_TILE);
        generator.createTrivialCube(AsiimovBlocks.GRAY_TILE      );
        generator.createTrivialCube(AsiimovBlocks.BLACK_TILE     );
        generator.createTrivialCube(AsiimovBlocks.BROWN_TILE     );
        generator.createTrivialCube(AsiimovBlocks.RED_TILE       );
        generator.createTrivialCube(AsiimovBlocks.ORANGE_TILE    );
        generator.createTrivialCube(AsiimovBlocks.YELLOW_TILE    );
        generator.createTrivialCube(AsiimovBlocks.LIME_TILE      );
        generator.createTrivialCube(AsiimovBlocks.GREEN_TILE     );
        generator.createTrivialCube(AsiimovBlocks.CYAN_TILE      );
        generator.createTrivialCube(AsiimovBlocks.LIGHT_BLUE_TILE);
        generator.createTrivialCube(AsiimovBlocks.BLUE_TILE      );
        generator.createTrivialCube(AsiimovBlocks.PURPLE_TILE    );
        generator.createTrivialCube(AsiimovBlocks.MAGENTA_TILE   );
        generator.createTrivialCube(AsiimovBlocks.PINK_TILE      );

    }

    public void generateItemModels(ItemModelGenerators generator) {
    }

}

