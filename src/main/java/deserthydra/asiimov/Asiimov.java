package deserthydra.asiimov;

import deserthydra.asiimov.block.AsiimovBlocks;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Asiimov implements ModInitializer {


	@Override
	public void onInitialize() {
		AsiimovCommon.init();
		AsiimovCreativeTab.init();
	}

}
