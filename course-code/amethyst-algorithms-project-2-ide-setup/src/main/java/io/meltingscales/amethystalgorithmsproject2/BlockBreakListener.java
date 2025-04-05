package io.meltingscales.amethystalgorithmsproject2;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(modid = AmethystAlgorithmsProject2.MODID, bus = EventBusSubscriber.Bus.GAME)
public class BlockBreakListener {
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
    // also generate 10 smoke particles for any block break

    for (int i = 0; i < 10; i++) {
      event
          .getLevel()
          .addParticle(
              net.minecraft.core.particles.ParticleTypes.SMOKE,
              blockPos.getX(),
              blockPos.getY(),
              blockPos.getZ(),
              0,
              0,
              0);
    }
  }
}
