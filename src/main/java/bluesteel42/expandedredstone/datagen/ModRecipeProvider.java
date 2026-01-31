package bluesteel42.expandedredstone.datagen;

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
            private void offerLeverRecipe(ItemConvertible lever, ItemConvertible material) {
                offerStandardRecipe(createShaped(RecipeCategory.REDSTONE, lever, 1).input('#', material).input('X', Items.STICK).pattern("X").pattern("#"), material);
            }
            private void offerButtonRecipe(ItemConvertible button, ItemConvertible material) {
                offerStandardRecipe(createShapeless(RecipeCategory.REDSTONE, button, 1).input(material), material);
            }
            private void offerNewPressurePlateRecipe(ItemConvertible pressurePlate, ItemConvertible material) {
                offerStandardRecipe(createShaped(RecipeCategory.REDSTONE, pressurePlate, 1).input('#', material).pattern("##"), material);
            }

            @Override
            public void generate() {
                offerButtonRecipe(ModBlocks.COBBLESTONE_BUTTON, Blocks.COBBLESTONE);
                offerButtonRecipe(ModBlocks.DEEPSLATE_BUTTON, Blocks.DEEPSLATE);
                offerButtonRecipe(ModBlocks.COBBLED_DEEPSLATE_BUTTON, Blocks.COBBLED_DEEPSLATE);
                offerButtonRecipe(ModBlocks.POLISHED_DEEPSLATE_BUTTON, Blocks.POLISHED_DEEPSLATE);
                offerButtonRecipe(ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE);
                offerButtonRecipe(ModBlocks.ANDESITE_BUTTON, Blocks.ANDESITE);
                offerButtonRecipe(ModBlocks.POLISHED_ANDESITE_BUTTON, Blocks.POLISHED_ANDESITE);
                offerButtonRecipe(ModBlocks.DIORITE_BUTTON, Blocks.DIORITE);
                offerButtonRecipe(ModBlocks.POLISHED_DIORITE_BUTTON, Blocks.POLISHED_DIORITE);
                offerButtonRecipe(ModBlocks.GRANITE_BUTTON, Blocks.GRANITE);
                offerButtonRecipe(ModBlocks.POLISHED_GRANITE_BUTTON, Blocks.POLISHED_GRANITE);
                offerButtonRecipe(ModBlocks.TUFF_BUTTON, Blocks.TUFF);
                offerButtonRecipe(ModBlocks.POLISHED_TUFF_BUTTON, Blocks.POLISHED_TUFF);
                offerButtonRecipe(ModBlocks.END_STONE_BUTTON, Blocks.END_STONE);
                offerButtonRecipe(ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE);
                offerButtonRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE);
                offerButtonRecipe(ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE);
                offerButtonRecipe(ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE);
                offerButtonRecipe(ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE);
                offerButtonRecipe(ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE);
                offerButtonRecipe(ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE);
                offerButtonRecipe(ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE);
                offerButtonRecipe(ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE);
                offerButtonRecipe(ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE);
                offerButtonRecipe(ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE);
                offerButtonRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE);
                offerButtonRecipe(ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE);
                offerButtonRecipe(ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE);
                offerButtonRecipe(ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE);
                offerButtonRecipe(ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE);

                offerLeverRecipe(ModBlocks.COBBLESTONE_LEVER, Blocks.COBBLESTONE);
                offerLeverRecipe(ModBlocks.DEEPSLATE_LEVER, Blocks.DEEPSLATE);
                offerLeverRecipe(ModBlocks.COBBLED_DEEPSLATE_LEVER, Blocks.COBBLED_DEEPSLATE);
                offerLeverRecipe(ModBlocks.POLISHED_DEEPSLATE_LEVER, Blocks.POLISHED_DEEPSLATE);
                offerLeverRecipe(ModBlocks.BLACKSTONE_LEVER, Blocks.BLACKSTONE);
                offerLeverRecipe(ModBlocks.POLISHED_BLACKSTONE_LEVER, Blocks.POLISHED_BLACKSTONE);
                offerLeverRecipe(ModBlocks.ANDESITE_LEVER, Blocks.ANDESITE);
                offerLeverRecipe(ModBlocks.POLISHED_ANDESITE_LEVER, Blocks.POLISHED_ANDESITE);
                offerLeverRecipe(ModBlocks.DIORITE_LEVER, Blocks.DIORITE);
                offerLeverRecipe(ModBlocks.POLISHED_DIORITE_LEVER, Blocks.POLISHED_DIORITE);
                offerLeverRecipe(ModBlocks.GRANITE_LEVER, Blocks.GRANITE);
                offerLeverRecipe(ModBlocks.POLISHED_GRANITE_LEVER, Blocks.POLISHED_GRANITE);
                offerLeverRecipe(ModBlocks.TUFF_LEVER, Blocks.TUFF);
                offerLeverRecipe(ModBlocks.POLISHED_TUFF_LEVER, Blocks.POLISHED_TUFF);
                offerLeverRecipe(ModBlocks.END_STONE_LEVER, Blocks.END_STONE);
                offerLeverRecipe(ModBlocks.WHITE_CONCRETE_LEVER, Blocks.WHITE_CONCRETE);
                offerLeverRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER, Blocks.LIGHT_GRAY_CONCRETE);
                offerLeverRecipe(ModBlocks.GRAY_CONCRETE_LEVER, Blocks.GRAY_CONCRETE);
                offerLeverRecipe(ModBlocks.BLACK_CONCRETE_LEVER, Blocks.BLACK_CONCRETE);
                offerLeverRecipe(ModBlocks.BROWN_CONCRETE_LEVER, Blocks.BROWN_CONCRETE);
                offerLeverRecipe(ModBlocks.RED_CONCRETE_LEVER, Blocks.RED_CONCRETE);
                offerLeverRecipe(ModBlocks.ORANGE_CONCRETE_LEVER, Blocks.ORANGE_CONCRETE);
                offerLeverRecipe(ModBlocks.YELLOW_CONCRETE_LEVER, Blocks.YELLOW_CONCRETE);
                offerLeverRecipe(ModBlocks.LIME_CONCRETE_LEVER, Blocks.LIME_CONCRETE);
                offerLeverRecipe(ModBlocks.GREEN_CONCRETE_LEVER, Blocks.GREEN_CONCRETE);
                offerLeverRecipe(ModBlocks.CYAN_CONCRETE_LEVER, Blocks.CYAN_CONCRETE);
                offerLeverRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER, Blocks.LIGHT_BLUE_CONCRETE);
                offerLeverRecipe(ModBlocks.BLUE_CONCRETE_LEVER, Blocks.BLUE_CONCRETE);
                offerLeverRecipe(ModBlocks.PURPLE_CONCRETE_LEVER, Blocks.PURPLE_CONCRETE);
                offerLeverRecipe(ModBlocks.MAGENTA_CONCRETE_LEVER, Blocks.MAGENTA_CONCRETE);
                offerLeverRecipe(ModBlocks.PINK_CONCRETE_LEVER, Blocks.PINK_CONCRETE);

                offerNewPressurePlateRecipe(ModBlocks.COBBLESTONE_PRESSURE_PLATE, Blocks.COBBLESTONE);
                offerNewPressurePlateRecipe(ModBlocks.DEEPSLATE_PRESSURE_PLATE, Blocks.DEEPSLATE);
                offerNewPressurePlateRecipe(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Blocks.COBBLED_DEEPSLATE);
                offerNewPressurePlateRecipe(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);
                offerNewPressurePlateRecipe(ModBlocks.BLACKSTONE_PRESSURE_PLATE, Blocks.BLACKSTONE);
                offerNewPressurePlateRecipe(ModBlocks.ANDESITE_PRESSURE_PLATE, Blocks.ANDESITE);
                offerNewPressurePlateRecipe(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE, Blocks.POLISHED_ANDESITE);
                offerNewPressurePlateRecipe(ModBlocks.DIORITE_PRESSURE_PLATE, Blocks.DIORITE);
                offerNewPressurePlateRecipe(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE, Blocks.POLISHED_DIORITE);
                offerNewPressurePlateRecipe(ModBlocks.GRANITE_PRESSURE_PLATE, Blocks.GRANITE);
                offerNewPressurePlateRecipe(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE);
                offerNewPressurePlateRecipe(ModBlocks.TUFF_PRESSURE_PLATE, Blocks.TUFF);
                offerNewPressurePlateRecipe(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE, Blocks.POLISHED_TUFF);
                offerNewPressurePlateRecipe(ModBlocks.END_STONE_PRESSURE_PLATE, Blocks.END_STONE);
                offerNewPressurePlateRecipe(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, Blocks.WHITE_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_GRAY_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, Blocks.GRAY_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, Blocks.BLACK_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, Blocks.BROWN_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.RED_CONCRETE_PRESSURE_PLATE, Blocks.RED_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, Blocks.ORANGE_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, Blocks.YELLOW_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, Blocks.LIME_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, Blocks.GREEN_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, Blocks.CYAN_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_BLUE_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, Blocks.BLUE_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, Blocks.PURPLE_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, Blocks.MAGENTA_CONCRETE);
                offerNewPressurePlateRecipe(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, Blocks.PINK_CONCRETE);
            }
        };
    }

    @Override
    public String getName() {
        return ExpandedRedstone.MOD_ID + " recipes";
    }
}
