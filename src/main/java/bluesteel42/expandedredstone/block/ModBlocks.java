package bluesteel42.expandedredstone.block;

import bluesteel42.expandedredstone.ExpandedRedstone;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.createButtonSettings;

public class ModBlocks {
    public static final Block COBBLESTONE_BUTTON = registerStoneButton("cobblestone_button");
    public static final Block DEEPSLATE_BUTTON = registerStoneButton("deepslate_button", ModBlockSetType.DEEPSLATE);
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerStoneButton("cobbled_deepslate_button", ModBlockSetType.DEEPSLATE);
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerStoneButton("polished_deepslate_button", ModBlockSetType.POLISHED_DEEPSLATE);
    public static final Block BLACKSTONE_BUTTON = registerStoneButton("blackstone_button");
    public static final Block ANDESITE_BUTTON = registerStoneButton("andesite_button");
    public static final Block POLISHED_ANDESITE_BUTTON = registerStoneButton("polished_andesite_button");
    public static final Block DIORITE_BUTTON = registerStoneButton("diorite_button");
    public static final Block POLISHED_DIORITE_BUTTON = registerStoneButton("polished_diorite_button");
    public static final Block GRANITE_BUTTON = registerStoneButton("granite_button");
    public static final Block POLISHED_GRANITE_BUTTON = registerStoneButton("polished_granite_button");
    public static final Block TUFF_BUTTON = registerStoneButton("tuff_button", ModBlockSetType.TUFF);
    public static final Block POLISHED_TUFF_BUTTON = registerStoneButton("polished_tuff_button", ModBlockSetType.POLISHED_TUFF);
    public static final Block END_STONE_BUTTON = registerStoneButton("end_stone_button");
    public static final Block WHITE_CONCRETE_BUTTON = registerStoneButton("white_concrete_button");
    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerStoneButton("light_gray_concrete_button");
    public static final Block GRAY_CONCRETE_BUTTON = registerStoneButton("gray_concrete_button");
    public static final Block BLACK_CONCRETE_BUTTON = registerStoneButton("black_concrete_button");
    public static final Block BROWN_CONCRETE_BUTTON = registerStoneButton("brown_concrete_button");
    public static final Block RED_CONCRETE_BUTTON = registerStoneButton("red_concrete_button");
    public static final Block ORANGE_CONCRETE_BUTTON = registerStoneButton("orange_concrete_button");
    public static final Block YELLOW_CONCRETE_BUTTON = registerStoneButton("yellow_concrete_button");
    public static final Block LIME_CONCRETE_BUTTON = registerStoneButton("lime_concrete_button");
    public static final Block GREEN_CONCRETE_BUTTON = registerStoneButton("green_concrete_button");
    public static final Block CYAN_CONCRETE_BUTTON = registerStoneButton("cyan_concrete_button");
    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerStoneButton("light_blue_concrete_button");
    public static final Block BLUE_CONCRETE_BUTTON = registerStoneButton("blue_concrete_button");
    public static final Block PURPLE_CONCRETE_BUTTON = registerStoneButton("purple_concrete_button");
    public static final Block MAGENTA_CONCRETE_BUTTON = registerStoneButton("magenta_concrete_button");
    public static final Block PINK_CONCRETE_BUTTON = registerStoneButton("pink_concrete_button");

    public static final Block COBBLESTONE_LEVER = registerStoneLever("cobblestone_lever");
    public static final Block DEEPSLATE_LEVER = registerStoneLever("deepslate_lever", BlockSoundGroup.DEEPSLATE);
    public static final Block COBBLED_DEEPSLATE_LEVER = registerStoneLever("cobbled_deepslate_lever", BlockSoundGroup.DEEPSLATE);
    public static final Block POLISHED_DEEPSLATE_LEVER = registerStoneLever("polished_deepslate_lever", BlockSoundGroup.POLISHED_DEEPSLATE);
    public static final Block BLACKSTONE_LEVER = registerStoneLever("blackstone_lever");
    public static final Block POLISHED_BLACKSTONE_LEVER = registerStoneLever("polished_blackstone_lever");
    public static final Block ANDESITE_LEVER = registerStoneLever("andesite_lever");
    public static final Block POLISHED_ANDESITE_LEVER = registerStoneLever("polished_andesite_lever");
    public static final Block DIORITE_LEVER = registerStoneLever("diorite_lever");
    public static final Block POLISHED_DIORITE_LEVER = registerStoneLever("polished_diorite_lever");
    public static final Block GRANITE_LEVER = registerStoneLever("granite_lever");
    public static final Block POLISHED_GRANITE_LEVER = registerStoneLever("polished_granite_lever");
    public static final Block TUFF_LEVER = registerStoneLever("tuff_lever", BlockSoundGroup.TUFF);
    public static final Block POLISHED_TUFF_LEVER = registerStoneLever("polished_tuff_lever", BlockSoundGroup.POLISHED_TUFF);
    public static final Block END_STONE_LEVER = registerStoneLever("end_stone_lever");
    public static final Block WHITE_CONCRETE_LEVER = registerStoneLever("white_concrete_lever");
    public static final Block LIGHT_GRAY_CONCRETE_LEVER = registerStoneLever("light_gray_concrete_lever");
    public static final Block GRAY_CONCRETE_LEVER = registerStoneLever("gray_concrete_lever");
    public static final Block BLACK_CONCRETE_LEVER = registerStoneLever("black_concrete_lever");
    public static final Block BROWN_CONCRETE_LEVER = registerStoneLever("brown_concrete_lever");
    public static final Block RED_CONCRETE_LEVER = registerStoneLever("red_concrete_lever");
    public static final Block ORANGE_CONCRETE_LEVER = registerStoneLever("orange_concrete_lever");
    public static final Block YELLOW_CONCRETE_LEVER = registerStoneLever("yellow_concrete_lever");
    public static final Block LIME_CONCRETE_LEVER = registerStoneLever("lime_concrete_lever");
    public static final Block GREEN_CONCRETE_LEVER = registerStoneLever("green_concrete_lever");
    public static final Block CYAN_CONCRETE_LEVER = registerStoneLever("cyan_concrete_lever");
    public static final Block LIGHT_BLUE_CONCRETE_LEVER = registerStoneLever("light_blue_concrete_lever");
    public static final Block BLUE_CONCRETE_LEVER = registerStoneLever("blue_concrete_lever");
    public static final Block PURPLE_CONCRETE_LEVER = registerStoneLever("purple_concrete_lever");
    public static final Block MAGENTA_CONCRETE_LEVER = registerStoneLever("magenta_concrete_lever");
    public static final Block PINK_CONCRETE_LEVER = registerStoneLever("pink_concrete_lever");

    public static final Block COBBLESTONE_PRESSURE_PLATE = registerStonePressurePlate("cobblestone_pressure_plate", Blocks.COBBLESTONE);
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerStonePressurePlate("deepslate_pressure_plate", Blocks.DEEPSLATE, ModBlockSetType.DEEPSLATE);
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerStonePressurePlate("cobbled_deepslate_pressure_plate", Blocks.COBBLED_DEEPSLATE, ModBlockSetType.DEEPSLATE);
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerStonePressurePlate("polished_deepslate_pressure_plate", Blocks.POLISHED_DEEPSLATE, ModBlockSetType.POLISHED_DEEPSLATE);
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerStonePressurePlate("blackstone_pressure_plate", Blocks.BLACKSTONE);
    public static final Block ANDESITE_PRESSURE_PLATE = registerStonePressurePlate("andesite_pressure_plate", Blocks.ANDESITE);
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerStonePressurePlate("polished_andesite_pressure_plate", Blocks.POLISHED_ANDESITE);
    public static final Block DIORITE_PRESSURE_PLATE = registerStonePressurePlate("diorite_pressure_plate", Blocks.DIORITE);
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerStonePressurePlate("polished_diorite_pressure_plate", Blocks.POLISHED_DIORITE);
    public static final Block GRANITE_PRESSURE_PLATE = registerStonePressurePlate("granite_pressure_plate", Blocks.GRANITE);
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerStonePressurePlate("polished_granite_pressure_plate", Blocks.POLISHED_GRANITE);
    public static final Block TUFF_PRESSURE_PLATE = registerStonePressurePlate("tuff_pressure_plate", Blocks.TUFF, ModBlockSetType.TUFF);
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerStonePressurePlate("polished_tuff_pressure_plate", Blocks.POLISHED_TUFF, ModBlockSetType.POLISHED_TUFF);
    public static final Block END_STONE_PRESSURE_PLATE = registerStonePressurePlate("end_stone_pressure_plate", Blocks.END_STONE);
    public static final Block WHITE_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("white_concrete_pressure_plate", Blocks.WHITE_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("light_gray_concrete_pressure_plate", Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("gray_concrete_pressure_plate", Blocks.GRAY_CONCRETE);
    public static final Block BLACK_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("black_concrete_pressure_plate", Blocks.BLACK_CONCRETE);
    public static final Block BROWN_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("brown_concrete_pressure_plate", Blocks.BROWN_CONCRETE);
    public static final Block RED_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("red_concrete_pressure_plate", Blocks.RED_CONCRETE);
    public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("orange_concrete_pressure_plate", Blocks.ORANGE_CONCRETE);
    public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("yellow_concrete_pressure_plate", Blocks.YELLOW_CONCRETE);
    public static final Block LIME_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("lime_concrete_pressure_plate", Blocks.LIME_CONCRETE);
    public static final Block GREEN_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("green_concrete_pressure_plate", Blocks.GREEN_CONCRETE);
    public static final Block CYAN_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("cyan_concrete_pressure_plate", Blocks.CYAN_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("light_blue_concrete_pressure_plate", Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("blue_concrete_pressure_plate", Blocks.BLUE_CONCRETE);
    public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("purple_concrete_pressure_plate", Blocks.PURPLE_CONCRETE);
    public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("magenta_concrete_pressure_plate", Blocks.MAGENTA_CONCRETE);
    public static final Block PINK_CONCRETE_PRESSURE_PLATE = registerStonePressurePlate("pink_concrete_pressure_plate", Blocks.PINK_CONCRETE);

    private static Block registerStoneButton(String path) {
        return registerStoneButton(path, BlockSetType.STONE);
    }
    private static Block registerStoneButton(String path, BlockSetType set) {
        return register(path, settings -> new ButtonBlock(set, 20, settings), createButtonSettings());
    }
    private static Block registerStoneLever(String path) {
        return registerStoneLever(path, BlockSoundGroup.STONE);
    }
    private static Block registerStoneLever(String path, BlockSoundGroup sounds) {
        return register(path, LeverBlock::new, AbstractBlock.Settings.create().noCollision().strength(0.5F).sounds(sounds).pistonBehavior(PistonBehavior.DESTROY));
    }
    private static Block registerStonePressurePlate(String path, Block material) {
        return registerStonePressurePlate(path, material, BlockSetType.STONE);
    }
    private static Block registerStonePressurePlate(String path, Block material, BlockSetType set) {
        return register(path, settings -> new PressurePlateBlock(set, settings),
                AbstractBlock.Settings.create()
                        .mapColor(material.getDefaultMapColor())
                        .solid()
                        .instrument(NoteBlockInstrument.BASEDRUM)
                        .noCollision()
                        .strength(0.5F)
                        .pistonBehavior(PistonBehavior.DESTROY)
        );
    }
    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(path, factory, settings, true, false);
    }

    public static Block register(
            String path,
            Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings,
            boolean registerItem,
            boolean nonOpaqueBlock
    ) {
        final Identifier identifier = Identifier.of(ExpandedRedstone.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, factory, settings);

        if (registerItem) {
            Items.register(block);
        }

        if (nonOpaqueBlock) {
            net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
        }

        if (block instanceof SignBlock || block instanceof WallSignBlock) {
            BlockEntityType.SIGN.addSupportedBlock(block);
        } else if (block instanceof HangingSignBlock || block instanceof WallHangingSignBlock) {
            BlockEntityType.HANGING_SIGN.addSupportedBlock(block);
        } else if (block instanceof ShelfBlock) {
            BlockEntityType.SHELF.addSupportedBlock(block);
        }

        return block;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Blocks.STONE_BUTTON, Blocks.LEVER);

                    itemGroup.addAfter(Blocks.COBBLESTONE_WALL, ModBlocks.COBBLESTONE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.COBBLESTONE_PRESSURE_PLATE, ModBlocks.COBBLESTONE_BUTTON);
                    itemGroup.addAfter(ModBlocks.COBBLESTONE_BUTTON, ModBlocks.COBBLESTONE_LEVER);

                    itemGroup.addAfter(Blocks.DEEPSLATE, ModBlocks.DEEPSLATE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.DEEPSLATE_PRESSURE_PLATE, ModBlocks.DEEPSLATE_BUTTON);
                    itemGroup.addAfter(ModBlocks.DEEPSLATE_BUTTON, ModBlocks.DEEPSLATE_LEVER);

                    itemGroup.addAfter(Blocks.COBBLED_DEEPSLATE_WALL, ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, ModBlocks.COBBLED_DEEPSLATE_BUTTON);
                    itemGroup.addAfter(ModBlocks.COBBLED_DEEPSLATE_BUTTON, ModBlocks.COBBLED_DEEPSLATE_LEVER);

                    itemGroup.addAfter(Blocks.POLISHED_DEEPSLATE_WALL, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, ModBlocks.POLISHED_DEEPSLATE_BUTTON);
                    itemGroup.addAfter(ModBlocks.POLISHED_DEEPSLATE_BUTTON, ModBlocks.POLISHED_DEEPSLATE_LEVER);

                    itemGroup.addAfter(Blocks.BLACKSTONE_WALL, ModBlocks.BLACKSTONE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.BLACKSTONE_PRESSURE_PLATE, ModBlocks.BLACKSTONE_BUTTON);
                    itemGroup.addAfter(ModBlocks.BLACKSTONE_BUTTON, ModBlocks.BLACKSTONE_LEVER);

                    itemGroup.addAfter(Blocks.POLISHED_BLACKSTONE_BUTTON, ModBlocks.POLISHED_BLACKSTONE_LEVER);

                    itemGroup.addAfter(Blocks.ANDESITE_WALL, ModBlocks.ANDESITE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.ANDESITE_PRESSURE_PLATE, ModBlocks.ANDESITE_BUTTON);
                    itemGroup.addAfter(ModBlocks.ANDESITE_BUTTON, ModBlocks.ANDESITE_LEVER);

                    itemGroup.addAfter(Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, ModBlocks.POLISHED_ANDESITE_BUTTON);
                    itemGroup.addAfter(ModBlocks.POLISHED_ANDESITE_BUTTON, ModBlocks.POLISHED_ANDESITE_LEVER);

                    itemGroup.addAfter(Blocks.DIORITE_WALL, ModBlocks.DIORITE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.DIORITE_PRESSURE_PLATE, ModBlocks.DIORITE_BUTTON);
                    itemGroup.addAfter(ModBlocks.DIORITE_BUTTON, ModBlocks.DIORITE_LEVER);

                    itemGroup.addAfter(Blocks.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, ModBlocks.POLISHED_DIORITE_BUTTON);
                    itemGroup.addAfter(ModBlocks.POLISHED_DIORITE_BUTTON, ModBlocks.POLISHED_DIORITE_LEVER);

                    itemGroup.addAfter(Blocks.GRANITE_WALL, ModBlocks.GRANITE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.GRANITE_PRESSURE_PLATE, ModBlocks.GRANITE_BUTTON);
                    itemGroup.addAfter(ModBlocks.GRANITE_BUTTON, ModBlocks.GRANITE_LEVER);

                    itemGroup.addAfter(Blocks.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, ModBlocks.POLISHED_GRANITE_BUTTON);
                    itemGroup.addAfter(ModBlocks.POLISHED_GRANITE_BUTTON, ModBlocks.POLISHED_GRANITE_LEVER);

                    itemGroup.addAfter(Blocks.TUFF_WALL, ModBlocks.TUFF_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.TUFF_PRESSURE_PLATE, ModBlocks.TUFF_BUTTON);
                    itemGroup.addAfter(ModBlocks.TUFF_BUTTON, ModBlocks.TUFF_LEVER);

                    itemGroup.addAfter(Blocks.POLISHED_TUFF_SLAB, ModBlocks.POLISHED_TUFF_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE, ModBlocks.POLISHED_TUFF_BUTTON);
                    itemGroup.addAfter(ModBlocks.POLISHED_TUFF_BUTTON, ModBlocks.POLISHED_TUFF_LEVER);

                    itemGroup.addAfter(Blocks.END_STONE, ModBlocks.END_STONE_PRESSURE_PLATE);
                    itemGroup.addAfter(ModBlocks.END_STONE_PRESSURE_PLATE, ModBlocks.END_STONE_BUTTON);
                    itemGroup.addAfter(ModBlocks.END_STONE_BUTTON, ModBlocks.END_STONE_LEVER);
                });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.MAGENTA_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PURPLE_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BLUE_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.CYAN_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.GREEN_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIME_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.YELLOW_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.ORANGE_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.RED_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BROWN_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BLACK_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.GRAY_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.WHITE_CONCRETE_LEVER);

                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.MAGENTA_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PURPLE_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BLUE_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.CYAN_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.GREEN_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIME_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.YELLOW_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.ORANGE_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.RED_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BROWN_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BLACK_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.GRAY_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.WHITE_CONCRETE_BUTTON);

                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
                    itemGroup.addAfter(Blocks.PINK_CONCRETE, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
                });
    }
}
