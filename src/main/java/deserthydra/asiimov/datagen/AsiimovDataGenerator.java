package deserthydra.asiimov.datagen;

import deserthydra.asiimov.datagen.client.AsiimovEnglishLanguageProvider;
import deserthydra.asiimov.datagen.client.AsiimovModelProvider;
import deserthydra.asiimov.datagen.common.AsiimovBlockTagProvider;
import deserthydra.asiimov.datagen.common.AsiimovRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AsiimovDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        var pack = generator.createPack();

        pack.addProvider(AsiimovBlockTagProvider::new);
        pack.addProvider(AsiimovRecipeProvider.AsiimovRecipeGenerator::new);

        pack.addProvider(AsiimovEnglishLanguageProvider::new);
        pack.addProvider(AsiimovModelProvider::new);


    }
}
