package bluesteel42.expandedredstone.datagen;

import bluesteel42.combinedworldgen.wood.azalea.block.AzaleaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.baobab.block.BaobabWoodModBlocks;
import bluesteel42.combinedworldgen.wood.cholla.block.ChollaWoodModBlocks;
import bluesteel42.combinedworldgen.wood.chorus.block.ChorusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.citrus.block.CitrusWoodModBlocks;
import bluesteel42.combinedworldgen.wood.dogwood.block.DogwoodWoodModBlocks;
import bluesteel42.combinedworldgen.wood.kapok.block.KapokWoodModBlocks;
import bluesteel42.combinedworldgen.wood.maple.block.MapleWoodModBlocks;
import bluesteel42.combinedworldgen.wood.petrified.block.PetrifiedWoodModBlocks;
import bluesteel42.combinedworldgen.wood.pine.block.PineWoodModBlocks;
import bluesteel42.combinedworldgen.wood.willow.block.WillowWoodModBlocks;
import bluesteel42.expandedredstone.ExpandedRedstone;
import bluesteel42.expandedredstone.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            private void offerStandardRecipe(CraftingRecipeJsonBuilder recipe, ItemConvertible input) {
                recipe.criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }
            private void offerStoneLeverRecipe(ItemConvertible lever, ItemConvertible material) {
                offerLeverRecipe(lever, material, "stone_lever");
            }
            private void offerWoodenLeverRecipe(ItemConvertible lever, ItemConvertible material) {
                offerLeverRecipe(lever, material, "wooden_lever");
            }
            private void offerLeverRecipe(ItemConvertible lever, ItemConvertible material, String group) {
                offerStandardRecipe(createShaped(RecipeCategory.REDSTONE, lever, 1).group(group).input('#', material).input('X', Items.STICK).pattern("X").pattern("#"), material);
            }
            private void offerStoneButtonRecipe(ItemConvertible button, ItemConvertible material) {
                offerStandardRecipe(createShapeless(RecipeCategory.REDSTONE, button, 1).group("stone_button").input(material), material);
            }
            private void offerStonePressurePlateRecipe(ItemConvertible pressurePlate, ItemConvertible material) {
                offerStandardRecipe(createShaped(RecipeCategory.REDSTONE, pressurePlate, 1).group("stone_pressure_plate").input('#', material).pattern("##"), material);
            }

            @Override
            public void generate() {
                offerStoneButtonRecipe(ModBlocks.COBBLESTONE_BUTTON, Blocks.COBBLESTONE);
                offerStoneButtonRecipe(ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE);
                offerStoneButtonRecipe(ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE);
                offerStoneButtonRecipe(ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE);
                offerStoneButtonRecipe(ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE);
                offerStoneButtonRecipe(ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE);
                offerStoneButtonRecipe(ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE);
                offerStoneButtonRecipe(ModBlocks.DIORITE_BUTTON, Blocks.DIORITE);
                offerStoneButtonRecipe(ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE);
                offerStoneButtonRecipe(ModBlocks.GRANITE_BUTTON, Blocks.GRANITE);
                offerStoneButtonRecipe(ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE);
                offerStoneButtonRecipe(ModBlocks.TUFF_BUTTON, Blocks.TUFF);
                offerStoneButtonRecipe(ModBlocks.POLISHED_TUFF_BUTTON, Blocks.POLISHED_TUFF);
                offerStoneButtonRecipe(ModBlocks.END_STONE_BUTTON, Blocks.END_STONE);
                offerStoneButtonRecipe(ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE);
                offerStoneButtonRecipe(ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE);

                offerStoneLeverRecipe(ModBlocks.COBBLESTONE_LEVER, Blocks.COBBLESTONE);
                offerStoneLeverRecipe(ModBlocks.DEEPSLATE_LEVER, Blocks.DEEPSLATE);
                offerStoneLeverRecipe(ModBlocks.COBBLED_DEEPSLATE_LEVER, Blocks.COBBLED_DEEPSLATE);
                offerStoneLeverRecipe(ModBlocks.POLISHED_DEEPSLATE_LEVER, Blocks.POLISHED_DEEPSLATE);
                offerStoneLeverRecipe(ModBlocks.BLACKSTONE_LEVER, Blocks.BLACKSTONE);
                offerStoneLeverRecipe(ModBlocks.POLISHED_BLACKSTONE_LEVER, Blocks.POLISHED_BLACKSTONE);
                offerStoneLeverRecipe(ModBlocks.ANDESITE_LEVER, Blocks.ANDESITE);
                offerStoneLeverRecipe(ModBlocks.POLISHED_ANDESITE_LEVER, Blocks.POLISHED_ANDESITE);
                offerStoneLeverRecipe(ModBlocks.DIORITE_LEVER, Blocks.DIORITE);
                offerStoneLeverRecipe(ModBlocks.POLISHED_DIORITE_LEVER, Blocks.POLISHED_DIORITE);
                offerStoneLeverRecipe(ModBlocks.GRANITE_LEVER, Blocks.GRANITE);
                offerStoneLeverRecipe(ModBlocks.POLISHED_GRANITE_LEVER, Blocks.POLISHED_GRANITE);
                offerStoneLeverRecipe(ModBlocks.TUFF_LEVER, Blocks.TUFF);
                offerStoneLeverRecipe(ModBlocks.POLISHED_TUFF_LEVER, Blocks.POLISHED_TUFF);
                offerStoneLeverRecipe(ModBlocks.END_STONE_LEVER, Blocks.END_STONE);
                offerStoneLeverRecipe(ModBlocks.WHITE_CONCRETE_LEVER, Blocks.WHITE_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER, Blocks.LIGHT_GRAY_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.GRAY_CONCRETE_LEVER, Blocks.GRAY_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.BLACK_CONCRETE_LEVER, Blocks.BLACK_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.BROWN_CONCRETE_LEVER, Blocks.BROWN_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.RED_CONCRETE_LEVER, Blocks.RED_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.ORANGE_CONCRETE_LEVER, Blocks.ORANGE_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.YELLOW_CONCRETE_LEVER, Blocks.YELLOW_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.LIME_CONCRETE_LEVER, Blocks.LIME_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.GREEN_CONCRETE_LEVER, Blocks.GREEN_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.CYAN_CONCRETE_LEVER, Blocks.CYAN_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER, Blocks.LIGHT_BLUE_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.BLUE_CONCRETE_LEVER, Blocks.BLUE_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.PURPLE_CONCRETE_LEVER, Blocks.PURPLE_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.MAGENTA_CONCRETE_LEVER, Blocks.MAGENTA_CONCRETE);
                offerStoneLeverRecipe(ModBlocks.PINK_CONCRETE_LEVER, Blocks.PINK_CONCRETE);

                offerWoodenLeverRecipe(ModBlocks.OAK_LEVER, Blocks.OAK_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.SPRUCE_LEVER, Blocks.SPRUCE_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.BIRCH_LEVER, Blocks.BIRCH_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.JUNGLE_LEVER, Blocks.JUNGLE_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.ACACIA_LEVER, Blocks.ACACIA_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.DARK_OAK_LEVER, Blocks.DARK_OAK_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.PALE_OAK_LEVER, Blocks.PALE_OAK_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.MANGROVE_LEVER, Blocks.MANGROVE_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.CHERRY_LEVER, Blocks.CHERRY_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.BAMBOO_LEVER, Blocks.BAMBOO_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.CRIMSON_LEVER, Blocks.CRIMSON_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.WARPED_LEVER, Blocks.WARPED_PLANKS);

                offerWoodenLeverRecipe(ModBlocks.AZALEA_LEVER, AzaleaWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.BAOBAB_LEVER, BaobabWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.CHOLLA_LEVER, ChollaWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.CHORUS_LEVER, ChorusWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.CITRUS_LEVER, CitrusWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.DOGWOOD_LEVER, DogwoodWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.KAPOK_LEVER, KapokWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.MAPLE_LEVER, MapleWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.PINE_LEVER, PineWoodModBlocks.MOD_PLANKS);
                offerWoodenLeverRecipe(ModBlocks.WILLOW_LEVER, WillowWoodModBlocks.MOD_PLANKS);
                offerStoneLeverRecipe(ModBlocks.PETRIFIED_LEVER, PetrifiedWoodModBlocks.MOD_PLANKS);

                offerStonePressurePlateRecipe(ModBlocks.COBBLESTONE_PRESSURE_PLATE, Blocks.COBBLESTONE);
                offerStonePressurePlateRecipe(ModBlocks.DEEPSLATE_PRESSURE_PLATE, Blocks.DEEPSLATE);
                offerStonePressurePlateRecipe(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Blocks.COBBLED_DEEPSLATE);
                offerStonePressurePlateRecipe(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);
                offerStonePressurePlateRecipe(ModBlocks.BLACKSTONE_PRESSURE_PLATE, Blocks.BLACKSTONE);
                offerStonePressurePlateRecipe(ModBlocks.ANDESITE_PRESSURE_PLATE, Blocks.ANDESITE);
                offerStonePressurePlateRecipe(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Blocks.POLISHED_ANDESITE);
                offerStonePressurePlateRecipe(ModBlocks.DIORITE_PRESSURE_PLATE, Blocks.DIORITE);
                offerStonePressurePlateRecipe(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Blocks.POLISHED_DIORITE);
                offerStonePressurePlateRecipe(ModBlocks.GRANITE_PRESSURE_PLATE, Blocks.GRANITE);
                offerStonePressurePlateRecipe(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE);
                offerStonePressurePlateRecipe(ModBlocks.TUFF_PRESSURE_PLATE, Blocks.TUFF);
                offerStonePressurePlateRecipe(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE, Blocks.POLISHED_TUFF);
                offerStonePressurePlateRecipe(ModBlocks.END_STONE_PRESSURE_PLATE, Blocks.END_STONE);
                offerStonePressurePlateRecipe(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, Blocks.WHITE_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_GRAY_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, Blocks.GRAY_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, Blocks.BLACK_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, Blocks.BROWN_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.RED_CONCRETE_PRESSURE_PLATE, Blocks.RED_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, Blocks.ORANGE_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, Blocks.YELLOW_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, Blocks.LIME_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, Blocks.GREEN_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, Blocks.CYAN_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_BLUE_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, Blocks.BLUE_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, Blocks.PURPLE_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, Blocks.MAGENTA_CONCRETE);
                offerStonePressurePlateRecipe(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, Blocks.PINK_CONCRETE);
            }
        };
    }

    @Override
    public String getName() {
        return ExpandedRedstone.MOD_ID + " recipes";
    }
}
