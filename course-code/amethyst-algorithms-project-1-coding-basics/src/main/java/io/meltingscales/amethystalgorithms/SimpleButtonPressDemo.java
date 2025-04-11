package io.meltingscales.amethystalgorithms;

import com.mojang.blaze3d.platform.InputConstants;
import com.mojang.logging.LogUtils;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.jarjar.nio.util.Lazy;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import net.neoforged.neoforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;

@EventBusSubscriber(modid = AmethystAlgorithms.MODID, bus = EventBusSubscriber.Bus.MOD)
public class SimpleButtonPressDemo {

  private static final Logger LOGGER = LogUtils.getLogger();

  public static final Lazy<KeyMapping> KEY_MAPPING_BUTTONPRESSDEMO =
      Lazy.of(
          () ->
              new KeyMapping(
                  "key.amethystalgorithms.simpleButtonPressDemo",
                  KeyConflictContext.UNIVERSAL,
                  KeyModifier.NONE,
                  InputConstants.Type.KEYSYM,
                  GLFW.GLFW_KEY_B,
                  "key.categories.misc"));

  // Event is on the mod event bus only on the physical client
  @SubscribeEvent
  public static void registerBindings(RegisterKeyMappingsEvent event) {
    event.register(KEY_MAPPING_BUTTONPRESSDEMO.get());
  }

  // Event is on the NeoForge event bus only on the physical client
  public static void onClientTick(ClientTickEvent.Post event) {
    while (KEY_MAPPING_BUTTONPRESSDEMO.get().consumeClick()) {
      inGameEventDemo(event);
    }
  }

  public static void inGameEventDemo(ClientTickEvent.Post event) {

    // This is an example of a variable assignment.
    String myName = Minecraft.getInstance().player.getName().getString();

    // Here, we print the player's current name.
    LOGGER.info("My name is: {}", myName);

    // Send a chat message.
    Minecraft.getInstance()
        .player
        .sendSystemMessage(Component.empty().append("Thank you for pressing the debug button!"));

    // These are another few variable assignments.
    double playerBlockX = Minecraft.getInstance().player.getBlockX();
    double playerBlockY = Minecraft.getInstance().player.getBlockY();
    double playerBlockZ = Minecraft.getInstance().player.getBlockZ();

    // We can print multiple things on one line!
    LOGGER.info("My x,y,z are: {},{},{}", playerBlockX, playerBlockY, playerBlockZ);

    // Spawn a diamond block 10 blocks above the player's head.
    // We have to use what's called a "typecast" here.
    int aboveHeadX = (int) playerBlockX;
    int aboveHeadY = (int) (playerBlockY + 10);
    int aboveHeadZ = (int) playerBlockZ;

    BlockPos aboveHeadPosition = new BlockPos(aboveHeadX, aboveHeadY, aboveHeadZ);

    // Set the block.
    Minecraft.getInstance()
        .player
        .level()
        .setBlock(
            aboveHeadPosition,
            net.minecraft.world.level.block.Blocks.DIAMOND_BLOCK.defaultBlockState(),
            3);

    LOGGER.info("Just set " + aboveHeadPosition.toString() + " to diamond block");
  }
}
