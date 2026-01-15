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

                offerLeverRecipe(ModBlocks.COBBLESTONE_LEVER, Blocks.COBBLESTONE);
                offerLeverRecipe(ModBlocks.DEEPSLATE_LEVER, Blocks.DEEPSLATE);
                offerLeverRecipe(ModBlocks.COBBLED_DEEPSLATE_LEVER, Blocks.COBBLED_DEEPSLATE);
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

                offerNewPressurePlateRecipe(ModBlocks.COBBLESTONE_PRESSURE_PLATE, Blocks.COBBLESTONE);
                offerNewPressurePlateRecipe(ModBlocks.DEEPSLATE_PRESSURE_PLATE, Blocks.DEEPSLATE);
                offerNewPressurePlateRecipe(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Blocks.COBBLED_DEEPSLATE);
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
            }
        };
    }

    @Override
    public String getName() {
        return ExpandedRedstone.MOD_ID + " recipes";
    }
}
