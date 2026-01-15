package bluesteel42.expandedredstone.block;

import bluesteel42.expandedredstone.ExpandedRedstone;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlockSetType {
    public static final BlockSetType DEEPSLATE = BlockSetTypeBuilder.copyOf(BlockSetType.STONE).soundGroup(BlockSoundGroup.DEEPSLATE).register(Identifier.of(ExpandedRedstone.MOD_ID, "deepslate"));
    public static final BlockSetType POLISHED_DEEPSLATE = BlockSetTypeBuilder.copyOf(BlockSetType.STONE).soundGroup(BlockSoundGroup.POLISHED_DEEPSLATE).register(Identifier.of(ExpandedRedstone.MOD_ID, "polished_deepslate"));
    public static final BlockSetType TUFF = BlockSetTypeBuilder.copyOf(BlockSetType.STONE).soundGroup(BlockSoundGroup.TUFF).register(Identifier.of(ExpandedRedstone.MOD_ID, "tuff"));
    public static final BlockSetType POLISHED_TUFF = BlockSetTypeBuilder.copyOf(BlockSetType.STONE).soundGroup(BlockSoundGroup.POLISHED_TUFF).register(Identifier.of(ExpandedRedstone.MOD_ID, "polished_tuff"));
}
