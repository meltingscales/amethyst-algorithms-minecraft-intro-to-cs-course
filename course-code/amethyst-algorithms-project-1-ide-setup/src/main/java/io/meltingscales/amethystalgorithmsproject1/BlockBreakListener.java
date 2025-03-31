package io.meltingscales.amethystalgorithmsproject1;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

public class BlockBreakListener {
  @SubscribeEvent
  public void onBlockBreak(BlockEvent.BreakEvent event) {
    // Get the block state and position
    BlockState state = event.getState();
    BlockPos pos = event.getPos();
    // Check if the block being broken is the one you're interested in
    if (state.getBlock() == Blocks.STONE) {
      // Do something when a stone block is broken
      System.out.println("Stone block broken at: " + pos);
    }

    if (state.getBlock() == Blocks.DIRT) {

      System.out.println("Dirt block broken at: " + pos);
      System.out.println("Going to drop a gold ingot");

      // drop a gold ingot as a test
      event
          .getLevel()
          .addFreshEntity(
              new net.minecraft.world.entity.item.ItemEntity(
                  (Level) event.getLevel(),
                  pos.getX() + 0.5,
                  pos.getY() + 0.5,
                  pos.getZ() + 0.5,
                  new net.minecraft.world.item.ItemStack(
                      net.minecraft.world.item.Items.GOLD_INGOT)));
    }
  }
}
