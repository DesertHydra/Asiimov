package deserthydra.asiimov.block;

import deserthydra.asiimov.AsiimovCommon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class AsiimovBlocks {

    public static final Block WHITE_TILE        = registerBlock("white_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block LIGHT_GRAY_TILE  = registerBlock("light_gray_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block GRAY_TILE         = registerBlock("gray_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block BLACK_TILE        = registerBlock("black_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block BROWN_TILE         = registerBlock("brown_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block RED_TILE          = registerBlock("red_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block ORANGE_TILE        = registerBlock("orange_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block YELLOW_TILE         = registerBlock("yellow_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block LIME_TILE          = registerBlock("lime_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block GREEN_TILE         = registerBlock("green_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block CYAN_TILE         = registerBlock("cyan_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block LIGHT_BLUE_TILE  = registerBlock("light_blue_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block BLUE_TILE           = registerBlock("blue_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block PURPLE_TILE        = registerBlock("purple_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block MAGENTA_TILE       = registerBlock("magenta_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));
    public static final Block PINK_TILE          = registerBlock("pink_tile", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ));


    private static Block registerBlock(String name,
                                       Function<BlockBehaviour.Properties, Block> factory,
                                       Supplier<BlockBehaviour.Properties> propertiesSupplier) {
        Identifier id = Identifier.fromNamespaceAndPath(AsiimovCommon.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(propertiesSupplier.get().setId(key));
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, id, block);
        registerBlockItems(name, registeredBlock);
        return registeredBlock;
    }

    private static void registerBlockItems(String name, Block block) {
        Identifier id = Identifier.fromNamespaceAndPath(AsiimovCommon.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item.Properties properties = new Item.Properties().setId(key).useBlockDescriptionPrefix();
        Item item = block instanceof DoorBlock
                ? new DoubleHighBlockItem(block, properties)
                : new BlockItem(block, properties);
        Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void registerModBlocks() {
        AsiimovCommon.LOGGER.info("Registering Blocks " + AsiimovCommon.MOD_ID);
    }
}
