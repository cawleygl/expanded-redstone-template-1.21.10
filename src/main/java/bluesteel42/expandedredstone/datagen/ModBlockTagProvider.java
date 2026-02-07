package bluesteel42.expandedredstone.datagen;

import bluesteel42.combinedworldgen.wood.azalea.AzaleaWoodInitializer;
import bluesteel42.combinedworldgen.wood.baobab.BaobabWoodInitializer;
import bluesteel42.combinedworldgen.wood.cholla.ChollaWoodInitializer;
import bluesteel42.combinedworldgen.wood.chorus.ChorusWoodInitializer;
import bluesteel42.combinedworldgen.wood.citrus.CitrusWoodInitializer;
import bluesteel42.combinedworldgen.wood.dogwood.DogwoodWoodInitializer;
import bluesteel42.combinedworldgen.wood.kapok.KapokWoodInitializer;
import bluesteel42.combinedworldgen.wood.maple.MapleWoodInitializer;
import bluesteel42.combinedworldgen.wood.petrified.PetrifiedWoodInitializer;
import bluesteel42.combinedworldgen.wood.pine.PineWoodInitializer;
import bluesteel42.combinedworldgen.wood.willow.WillowWoodInitializer;
import bluesteel42.expandedredstone.block.ModBlocks;
import bluesteel42.expandedredstone.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.COBBLESTONE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.DEEPSLATE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.ANDESITE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.POLISHED_ANDESITE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.DIORITE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.POLISHED_DIORITE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.GRANITE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.POLISHED_GRANITE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.TUFF_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.POLISHED_TUFF_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.BLACKSTONE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.END_STONE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.PINK_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.PURPLE_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.BLUE_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.CYAN_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.GREEN_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.LIME_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.YELLOW_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.ORANGE_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.RED_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.BROWN_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.BLACK_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.GRAY_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        valueLookupBuilder(BlockTags.STONE_BUTTONS).add(ModBlocks.WHITE_CONCRETE_BUTTON);

        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(Blocks.LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.COBBLESTONE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.DEEPSLATE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.COBBLED_DEEPSLATE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.POLISHED_DEEPSLATE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.ANDESITE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.POLISHED_ANDESITE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.DIORITE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.POLISHED_DIORITE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.GRANITE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.POLISHED_GRANITE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.TUFF_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.POLISHED_TUFF_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.BLACKSTONE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.POLISHED_BLACKSTONE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.END_STONE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.PINK_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.MAGENTA_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.PURPLE_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.BLUE_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.CYAN_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.GREEN_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.LIME_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.YELLOW_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.ORANGE_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.RED_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.BROWN_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.BLACK_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.GRAY_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.WHITE_CONCRETE_LEVER);
        valueLookupBuilder(ModTags.Blocks.STONE_LEVERS).add(ModBlocks.PETRIFIED_LEVER);
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).addTag(ModTags.Blocks.STONE_LEVERS);

        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.OAK_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.SPRUCE_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.BIRCH_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.JUNGLE_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.ACACIA_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.DARK_OAK_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.PALE_OAK_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.MANGROVE_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.CHERRY_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.BAMBOO_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.CRIMSON_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.WARPED_LEVER);

        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.AZALEA_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.BAOBAB_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.CHOLLA_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.CHORUS_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.CITRUS_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.DOGWOOD_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.KAPOK_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.MAPLE_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.PINE_LEVER);
        valueLookupBuilder(ModTags.Blocks.WOODEN_LEVERS).add(ModBlocks.WILLOW_LEVER);
        valueLookupBuilder(BlockTags.AXE_MINEABLE).addTag(ModTags.Blocks.WOODEN_LEVERS);

        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.ANDESITE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.DIORITE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.GRANITE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.TUFF_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.END_STONE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.STONE_PRESSURE_PLATES).add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);

    }
}
