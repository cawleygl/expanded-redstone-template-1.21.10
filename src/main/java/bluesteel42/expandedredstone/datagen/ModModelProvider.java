package bluesteel42.expandedredstone.datagen;

import bluesteel42.expandedredstone.ExpandedRedstone;
import bluesteel42.expandedredstone.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.Optional;

import static net.minecraft.client.data.TextureMap.getId;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static final TextureKey BASE = TextureKey.of("base");
    private static final TextureKey LEVER = TextureKey.of("lever");
    private static final Model LEVER_OFF = modBlock("template_lever", BASE, LEVER);
    private static final Model LEVER_ON = modBlock("template_lever_on", BASE, LEVER);
    private void registerLever(BlockStateModelGenerator blockStateModelGenerator, Block lever, Block material) {
        TextureMap textureMap = new TextureMap().put(BASE, getId(material)).put(LEVER, getId(lever));
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(
                LEVER_OFF.upload(lever, textureMap, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                LEVER_ON.upload(lever, "_on", textureMap, blockStateModelGenerator.modelCollector)
        );
//        blockStateModelGenerator.registerItemModel(lever);
        blockStateModelGenerator.blockStateCollector
                .accept(
                        VariantsBlockModelDefinitionCreator.of(lever)
                                .with(BlockStateModelGenerator.createBooleanModelMap(Properties.POWERED, weightedVariant, weightedVariant2))
                                .apply(
                                        BlockStateVariantMap.operations(Properties.BLOCK_FACE, Properties.HORIZONTAL_FACING)
                                                .register(BlockFace.CEILING, Direction.NORTH, BlockStateModelGenerator.ROTATE_X_180.then(BlockStateModelGenerator.ROTATE_Y_180))
                                                .register(BlockFace.CEILING, Direction.EAST, BlockStateModelGenerator.ROTATE_X_180.then(BlockStateModelGenerator.ROTATE_Y_270))
                                                .register(BlockFace.CEILING, Direction.SOUTH, BlockStateModelGenerator.ROTATE_X_180)
                                                .register(BlockFace.CEILING, Direction.WEST, BlockStateModelGenerator.ROTATE_X_180.then(BlockStateModelGenerator.ROTATE_Y_90))
                                                .register(BlockFace.FLOOR, Direction.NORTH, BlockStateModelGenerator.NO_OP)
                                                .register(BlockFace.FLOOR, Direction.EAST, BlockStateModelGenerator.ROTATE_Y_90)
                                                .register(BlockFace.FLOOR, Direction.SOUTH, BlockStateModelGenerator.ROTATE_Y_180)
                                                .register(BlockFace.FLOOR, Direction.WEST, BlockStateModelGenerator.ROTATE_Y_270)
                                                .register(BlockFace.WALL, Direction.NORTH, BlockStateModelGenerator.ROTATE_X_90)
                                                .register(BlockFace.WALL, Direction.EAST, BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_90))
                                                .register(BlockFace.WALL, Direction.SOUTH, BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_180))
                                                .register(BlockFace.WALL, Direction.WEST, BlockStateModelGenerator.ROTATE_X_90.then(BlockStateModelGenerator.ROTATE_Y_270))
                                )
                );
    }

    private void registerButton(BlockStateModelGenerator blockStateModelGenerator, Block button, Block material) {
        TextureMap textureMap = TextureMap.all(material);
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(
                Models.BUTTON.upload(button, textureMap, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                Models.BUTTON_PRESSED.upload(button, textureMap, blockStateModelGenerator.modelCollector)
        );
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(button, weightedVariant, weightedVariant2));
        Identifier identifier = Models.BUTTON_INVENTORY.upload(button, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerParentedItemModel(button, identifier);
    }

    private void registerPressurePlate(BlockStateModelGenerator blockStateModelGenerator, Block pressurePlate, Block material) {
        TextureMap textureMap = TextureMap.all(material);
        WeightedVariant weightedVariant = BlockStateModelGenerator.createWeightedVariant(
                Models.PRESSURE_PLATE_UP.upload(pressurePlate, textureMap, blockStateModelGenerator.modelCollector)
        );
        WeightedVariant weightedVariant2 = BlockStateModelGenerator.createWeightedVariant(
                Models.PRESSURE_PLATE_DOWN.upload(pressurePlate, textureMap, blockStateModelGenerator.modelCollector)
        );
        blockStateModelGenerator.blockStateCollector
                .accept(BlockStateModelGenerator.createPressurePlateBlockState(pressurePlate, weightedVariant, weightedVariant2));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerButton(blockStateModelGenerator, ModBlocks.COBBLESTONE_BUTTON, Blocks.COBBLESTONE);
        registerButton(blockStateModelGenerator, ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE);
        registerButton(blockStateModelGenerator, ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE);
        registerButton(blockStateModelGenerator, ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE);
        registerButton(blockStateModelGenerator, ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE);
        registerButton(blockStateModelGenerator, ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE);
        registerButton(blockStateModelGenerator, ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE);
        registerButton(blockStateModelGenerator, ModBlocks.DIORITE_BUTTON, Blocks.DIORITE);
        registerButton(blockStateModelGenerator, ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE);
        registerButton(blockStateModelGenerator, ModBlocks.GRANITE_BUTTON, Blocks.GRANITE);
        registerButton(blockStateModelGenerator, ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE);
        registerButton(blockStateModelGenerator, ModBlocks.TUFF_BUTTON, Blocks.TUFF);
        registerButton(blockStateModelGenerator, ModBlocks.POLISHED_TUFF_BUTTON, Blocks.POLISHED_TUFF);
        registerButton(blockStateModelGenerator, ModBlocks.END_STONE_BUTTON, Blocks.END_STONE);
        registerButton(blockStateModelGenerator, ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE);
        registerButton(blockStateModelGenerator, ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE);

        registerLever(blockStateModelGenerator, ModBlocks.COBBLESTONE_LEVER, Blocks.COBBLESTONE);
        registerLever(blockStateModelGenerator, ModBlocks.DEEPSLATE_LEVER, Blocks.DEEPSLATE);
        registerLever(blockStateModelGenerator, ModBlocks.COBBLED_DEEPSLATE_LEVER, Blocks.COBBLED_DEEPSLATE);
        registerLever(blockStateModelGenerator, ModBlocks.POLISHED_DEEPSLATE_LEVER, Blocks.POLISHED_DEEPSLATE);
        registerLever(blockStateModelGenerator, ModBlocks.BLACKSTONE_LEVER, Blocks.BLACKSTONE);
        registerLever(blockStateModelGenerator, ModBlocks.POLISHED_BLACKSTONE_LEVER, Blocks.POLISHED_BLACKSTONE);
        registerLever(blockStateModelGenerator, ModBlocks.ANDESITE_LEVER, Blocks.ANDESITE);
        registerLever(blockStateModelGenerator, ModBlocks.POLISHED_ANDESITE_LEVER, Blocks.POLISHED_ANDESITE);
        registerLever(blockStateModelGenerator, ModBlocks.DIORITE_LEVER, Blocks.DIORITE);
        registerLever(blockStateModelGenerator, ModBlocks.POLISHED_DIORITE_LEVER, Blocks.POLISHED_DIORITE);
        registerLever(blockStateModelGenerator, ModBlocks.GRANITE_LEVER, Blocks.GRANITE);
        registerLever(blockStateModelGenerator, ModBlocks.POLISHED_GRANITE_LEVER, Blocks.POLISHED_GRANITE);
        registerLever(blockStateModelGenerator, ModBlocks.TUFF_LEVER, Blocks.TUFF);
        registerLever(blockStateModelGenerator, ModBlocks.POLISHED_TUFF_LEVER, Blocks.POLISHED_TUFF);
        registerLever(blockStateModelGenerator, ModBlocks.END_STONE_LEVER, Blocks.END_STONE);
        registerLever(blockStateModelGenerator, ModBlocks.WHITE_CONCRETE_LEVER, Blocks.WHITE_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER, Blocks.LIGHT_GRAY_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.GRAY_CONCRETE_LEVER, Blocks.GRAY_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.BLACK_CONCRETE_LEVER, Blocks.BLACK_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.BROWN_CONCRETE_LEVER, Blocks.BROWN_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.RED_CONCRETE_LEVER, Blocks.RED_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.ORANGE_CONCRETE_LEVER, Blocks.ORANGE_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.YELLOW_CONCRETE_LEVER, Blocks.YELLOW_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.LIME_CONCRETE_LEVER, Blocks.LIME_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.GREEN_CONCRETE_LEVER, Blocks.GREEN_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.CYAN_CONCRETE_LEVER, Blocks.CYAN_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER, Blocks.LIGHT_BLUE_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.BLUE_CONCRETE_LEVER, Blocks.BLUE_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.PURPLE_CONCRETE_LEVER, Blocks.PURPLE_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.MAGENTA_CONCRETE_LEVER, Blocks.MAGENTA_CONCRETE);
        registerLever(blockStateModelGenerator, ModBlocks.PINK_CONCRETE_LEVER, Blocks.PINK_CONCRETE);

        registerPressurePlate(blockStateModelGenerator, ModBlocks.COBBLESTONE_PRESSURE_PLATE, Blocks.COBBLESTONE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.DEEPSLATE_PRESSURE_PLATE, Blocks.DEEPSLATE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Blocks.COBBLED_DEEPSLATE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.BLACKSTONE_PRESSURE_PLATE, Blocks.BLACKSTONE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.ANDESITE_PRESSURE_PLATE, Blocks.ANDESITE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Blocks.POLISHED_ANDESITE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.DIORITE_PRESSURE_PLATE, Blocks.DIORITE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Blocks.POLISHED_DIORITE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.GRANITE_PRESSURE_PLATE, Blocks.GRANITE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.TUFF_PRESSURE_PLATE, Blocks.TUFF);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.POLISHED_TUFF_PRESSURE_PLATE, Blocks.POLISHED_TUFF);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.END_STONE_PRESSURE_PLATE, Blocks.END_STONE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, Blocks.WHITE_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_GRAY_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, Blocks.GRAY_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, Blocks.BLACK_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, Blocks.BROWN_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, Blocks.RED_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, Blocks.ORANGE_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, Blocks.YELLOW_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, Blocks.LIME_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, Blocks.GREEN_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, Blocks.CYAN_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_BLUE_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, Blocks.BLUE_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, Blocks.PURPLE_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, Blocks.MAGENTA_CONCRETE);
        registerPressurePlate(blockStateModelGenerator, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, Blocks.PINK_CONCRETE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}

    private static Model modBlock(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(ExpandedRedstone.MOD_ID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
