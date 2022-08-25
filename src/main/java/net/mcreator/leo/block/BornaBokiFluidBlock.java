
package net.mcreator.leo.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.leo.init.LeoModFluids;

public class BornaBokiFluidBlock extends LiquidBlock {
	public BornaBokiFluidBlock() {
		super(() -> (FlowingFluid) LeoModFluids.BORNA_BOKI_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
