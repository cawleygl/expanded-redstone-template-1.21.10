package bluesteel42.expandedredstone.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.block.OrientationHelper;
import net.minecraft.world.block.WireOrientation;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class WoodenLeverBlock extends WallMountedBlock {
    public static final MapCodec<WoodenLeverBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(BlockSetType.CODEC.fieldOf("block_set_type").forGetter(block -> block.blockSetType), createSettingsCodec())
                    .apply(instance, WoodenLeverBlock::new)
    );
    public static final BooleanProperty POWERED = Properties.POWERED;
    private final Function<BlockState, VoxelShape> shapeFunction;
    protected final BlockSetType blockSetType;

    @Override
    public MapCodec<WoodenLeverBlock> getCodec() {
        return CODEC;
    }

    public WoodenLeverBlock(BlockSetType blockSetType, AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(POWERED, false).with(FACE, BlockFace.WALL));
        this.shapeFunction = this.createShapeFunction();
        this.blockSetType = blockSetType;
    }

    private Function<BlockState, VoxelShape> createShapeFunction() {
        Map<BlockFace, Map<Direction, VoxelShape>> map = VoxelShapes.createBlockFaceHorizontalFacingShapeMap(Block.createCuboidZShape(6.0, 8.0, 10.0, 16.0));
        return this.createShapeFunction(state -> (VoxelShape)((Map)map.get(state.get(FACE))).get(state.get(FACING)), new Property[]{POWERED});
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (VoxelShape)this.shapeFunction.apply(state);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient()) {
            BlockState blockState = state.cycle(POWERED);
            if ((Boolean)blockState.get(POWERED)) {
                spawnParticles(blockState, world, pos, 1.0F);
            }
        } else {
            this.togglePower(state, world, pos, null);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    protected void onExploded(BlockState state, ServerWorld world, BlockPos pos, Explosion explosion, BiConsumer<ItemStack, BlockPos> stackMerger) {
        if (explosion.canTriggerBlocks()) {
            this.togglePower(state, world, pos, null);
        }

        super.onExploded(state, world, pos, explosion, stackMerger);
    }

    public void togglePower(BlockState state, World world, BlockPos pos, @Nullable PlayerEntity player) {
        state = state.cycle(POWERED);
        world.setBlockState(pos, state, Block.NOTIFY_ALL);
        this.updateNeighbors(state, world, pos);
        playClickSound(player, world, pos, state);
        world.emitGameEvent(player, state.get(POWERED) ? GameEvent.BLOCK_ACTIVATE : GameEvent.BLOCK_DEACTIVATE, pos);
    }

    protected void playClickSound(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos, BlockState state) {
        if (state.get(POWERED)) {
            world.playSound(null, pos, this.blockSetType.buttonClickOn(), SoundCategory.BLOCKS);
        } else {
            world.playSound(null, pos, this.blockSetType.buttonClickOff(), SoundCategory.BLOCKS);
        }
    }

    private static void spawnParticles(BlockState state, WorldAccess world, BlockPos pos, float alpha) {
        Direction direction = ((Direction)state.get(FACING)).getOpposite();
        Direction direction2 = getDirection(state).getOpposite();
        double d = pos.getX() + 0.5 + 0.1 * direction.getOffsetX() + 0.2 * direction2.getOffsetX();
        double e = pos.getY() + 0.5 + 0.1 * direction.getOffsetY() + 0.2 * direction2.getOffsetY();
        double f = pos.getZ() + 0.5 + 0.1 * direction.getOffsetZ() + 0.2 * direction2.getOffsetZ();
        world.addParticleClient(new DustParticleEffect(16711680, alpha), d, e, f, 0.0, 0.0, 0.0);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if ((Boolean)state.get(POWERED) && random.nextFloat() < 0.25F) {
            spawnParticles(state, world, pos, 0.5F);
        }
    }

    @Override
    protected void onStateReplaced(BlockState state, ServerWorld world, BlockPos pos, boolean moved) {
        if (!moved && (Boolean)state.get(POWERED)) {
            this.updateNeighbors(state, world, pos);
        }
    }

    @Override
    protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return state.get(POWERED) ? 8 : 0;
    }

    @Override
    protected int getStrongRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return state.get(POWERED) && getDirection(state) == direction ? 8 : 0;
    }

    @Override
    protected boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    private void updateNeighbors(BlockState state, World world, BlockPos pos) {
        Direction direction = getDirection(state).getOpposite();
        WireOrientation wireOrientation = OrientationHelper.getEmissionOrientation(
                world, direction, direction.getAxis().isHorizontal() ? Direction.UP : state.get(FACING)
        );
        world.updateNeighborsAlways(pos, this, wireOrientation);
        world.updateNeighborsAlways(pos.offset(direction), this, wireOrientation);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACE, FACING, POWERED);
    }
}
