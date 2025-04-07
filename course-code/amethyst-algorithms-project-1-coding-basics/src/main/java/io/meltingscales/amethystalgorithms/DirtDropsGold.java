package io.meltingscales.amethystalgorithms;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid = AmethystAlgorithms.MODID, bus = EventBusSubscriber.Bus.GAME)
public class DirtDropsGold {
  @SubscribeEvent(receiveCanceled = true)
  public static void onBlockBreak(BlockEvent.BreakEvent event) {
    // Get the block state and position
    BlockState blockState = event.getState();
    BlockPos blockPos = event.getPos();
    // Check if the block being broken is the one you're interested in
    if (blockState.getBlock() == Blocks.STONE) {
      // Do something when a stone block is broken
      System.out.println("Stone block broken at: " + blockPos);
    }

    if (blockState.getBlock() == Blocks.DIRT) {

      System.out.println("Dirt block broken at: " + blockPos);
      System.out.println("Going to drop a gold ingot");

      // drop a gold ingot as a test
      event
          .getLevel()
          .addFreshEntity(
              new net.minecraft.world.entity.item.ItemEntity(
                  (Level) event.getLevel(),
                  blockPos.getX() + 0.5,
                  blockPos.getY() + 0.5,
                  blockPos.getZ() + 0.5,
                  new net.minecraft.world.item.ItemStack(
                      net.minecraft.world.item.Items.GOLD_INGOT)));
    }
  }
}
