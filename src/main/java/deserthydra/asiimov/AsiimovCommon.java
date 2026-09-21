package deserthydra.asiimov;

import deserthydra.asiimov.block.AsiimovBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsiimovCommon {

    public static final String  MOD_ID = "asiimov";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private AsiimovCommon() {

    }

    public static void init() {
        AsiimovBlocks.registerModBlocks();
    }
}
