package io.meltingscales.amethystalgorithms;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.logging.LogUtils;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.jarjar.nio.util.Lazy;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;

@EventBusSubscriber(modid = AmethystAlgorithms.MODID, bus = EventBusSubscriber.Bus.GAME)
public class DebuggingHelperPressButton {

  private static final Logger LOGGER = LogUtils.getLogger();

  public static final Lazy<KeyMapping> KEY_MAPPING_DEBUG =
      Lazy.of(
          () ->
              new KeyMapping(
                  "key.amethystalgorithms.debuggingHelper",
                  InputConstants.Type.KEYSYM,
                  GLFW.GLFW_KEY_B,
                  "key.categories.misc"));

  // Event is on the mod event bus only on the physical client
  @SubscribeEvent
  public static void registerBindings(RegisterKeyMappingsEvent event) {
    event.register(KEY_MAPPING_DEBUG.get());
  }

  @SubscribeEvent
  public void onInput(InputEvent.Key event) {
    if (KEY_MAPPING_DEBUG.get().isDown()) {
      LOGGER.info("Debug button pressed - " + KEY_MAPPING_DEBUG.get().getKey().getName());
      pressDebugButton(event);
    }
  }

  public static void pressDebugButton(InputEvent.Key event) {

    // This is an example of a variable assignment.
    String myName = Minecraft.getInstance().player.getName().getString();

    // Here, we print the player's current name.
    LOGGER.info("My name is: {}", myName);

    // These are another few variable assignments.
    double myX = Minecraft.getInstance().player.getX();
    double myY = Minecraft.getInstance().player.getY();
    double myZ = Minecraft.getInstance().player.getZ();

    // We can print multiple things on one line!
    LOGGER.info("My x,y,z are: {},{},{}", myX, myY, myZ);

    // Spawn a diamond block 10 blocks above the player's head.
    // We have to use what's called a "typecast" here.
    int aboveHeadX = (int) myX;
    int aboveHeadY = (int) (myY + 10);
    int aboveHeadZ = (int) myZ;

    BlockPos aboveHeadPos = new BlockPos(aboveHeadX, aboveHeadY, aboveHeadZ);

    // Set the block.
    Minecraft.getInstance()
        .player
        .level()
        .setBlock(
            aboveHeadPos,
            net.minecraft.world.level.block.Blocks.DIAMOND_BLOCK.defaultBlockState(),
            3);

    LOGGER.info("Just set " + aboveHeadPos.toString() + " to diamond block");
  }
}
