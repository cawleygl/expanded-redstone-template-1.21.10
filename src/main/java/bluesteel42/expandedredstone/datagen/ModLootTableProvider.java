package bluesteel42.expandedredstone.datagen;

import bluesteel42.expandedredstone.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COBBLESTONE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_BUTTON);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.BLACKSTONE_BUTTON);
        addDrop(ModBlocks.ANDESITE_BUTTON);
        addDrop(ModBlocks.POLISHED_ANDESITE_BUTTON);
        addDrop(ModBlocks.DIORITE_BUTTON);
        addDrop(ModBlocks.POLISHED_DIORITE_BUTTON);
        addDrop(ModBlocks.GRANITE_BUTTON);
        addDrop(ModBlocks.POLISHED_GRANITE_BUTTON);
        addDrop(ModBlocks.TUFF_BUTTON);
        addDrop(ModBlocks.POLISHED_TUFF_BUTTON);
        addDrop(ModBlocks.END_STONE_BUTTON);

        addDrop(ModBlocks.COBBLESTONE_LEVER);
        addDrop(ModBlocks.DEEPSLATE_LEVER);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_LEVER);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_LEVER);
        addDrop(ModBlocks.BLACKSTONE_LEVER);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_LEVER);
        addDrop(ModBlocks.ANDESITE_LEVER);
        addDrop(ModBlocks.POLISHED_ANDESITE_LEVER);
        addDrop(ModBlocks.DIORITE_LEVER);
        addDrop(ModBlocks.POLISHED_DIORITE_LEVER);
        addDrop(ModBlocks.GRANITE_LEVER);
        addDrop(ModBlocks.POLISHED_GRANITE_LEVER);
        addDrop(ModBlocks.TUFF_LEVER);
        addDrop(ModBlocks.POLISHED_TUFF_LEVER);
        addDrop(ModBlocks.END_STONE_LEVER);

        addDrop(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks.END_STONE_PRESSURE_PLATE);

    }
}
