package bluesteel42.expandedredstone.util;

import bluesteel42.expandedredstone.ExpandedRedstone;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WOODEN_LEVERS = createTag("wooden_levers");
        public static final TagKey<Block> STONE_LEVERS = createTag("stone_levers");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExpandedRedstone.MOD_ID, name));
        }
    }
}
