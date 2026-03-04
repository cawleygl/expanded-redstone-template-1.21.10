package bluesteel42.expandedredstone.datagen;

import bluesteel42.expandedredstone.block.ModBlocks;
import bluesteel42.expandedredstone.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.COBBLESTONE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.DEEPSLATE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.ANDESITE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.DIORITE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.GRANITE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.TUFF_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.BLACKSTONE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.END_STONE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.asItem());
        valueLookupBuilder(ModTags.Items.STONE_PRESSURE_PLATES).add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.asItem());

    }
}
