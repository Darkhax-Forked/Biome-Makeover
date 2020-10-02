package party.lemons.biomemakeover.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SproutsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import party.lemons.biomemakeover.init.BMBlocks;
import party.lemons.biomemakeover.util.BlockWithItem;

public class MushroomSproutsBlock extends SproutsBlock implements BlockWithItem
{
	public MushroomSproutsBlock(Settings settings)
	{
		super(settings);
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos)
	{
		return floor.isOf(Blocks.MYCELIUM) || floor.isOf(BMBlocks.DEEP_MYCELIUM) || super.canPlantOnTop(floor, world, pos);
	}
}
