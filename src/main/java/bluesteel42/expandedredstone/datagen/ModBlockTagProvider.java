package bluesteel42.expandedredstone.datagen;

import bluesteel42.expandedredstone.block.ModBlocks;
import bluesteel42.expandedredstone.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE).addTag(ModTags.Blocks.STONE_LEVERS);

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

    }
}
