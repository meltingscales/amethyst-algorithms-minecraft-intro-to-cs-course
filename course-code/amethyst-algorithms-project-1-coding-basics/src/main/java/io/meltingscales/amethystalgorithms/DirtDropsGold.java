package io.meltingscales.amethystalgorithms;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
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
    if (blockState.getBlock() == Blocks.DIRT) {
      
      System.out.println("Dirt block broken at: " + blockPos);
      System.out.println("Going to drop a gold ingot");

      int blockX = blockPos.getX();
      int blockY = blockPos.getY();
      int blockZ = blockPos.getZ();

      ItemStack oneGoldIngot =
          new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.GOLD_INGOT);

      ItemStack fourClay =
          new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.CLAY_BALL, 4);

      // drop a gold ingot as a test
      event
          .getLevel()
          .addFreshEntity(
              new net.minecraft.world.entity.item.ItemEntity(
                  (Level) event.getLevel(),
                  blockX + 0.5,
                  blockY + 0.5,
                  blockZ + 0.5,
                  oneGoldIngot));

      // drop four clay 2 blocks above the dirt
      event
          .getLevel()
          .addFreshEntity(
              new ItemEntity(
                  (Level) event.getLevel(), blockX + 0.5, blockY + 2.5, blockZ + 0.5, fourClay));
    }
  }
}
