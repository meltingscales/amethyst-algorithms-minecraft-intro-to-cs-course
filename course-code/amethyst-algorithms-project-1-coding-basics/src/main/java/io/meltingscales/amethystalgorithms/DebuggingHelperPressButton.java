package io.meltingscales.amethystalgorithms;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.jarjar.nio.util.Lazy;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(modid = AmethystAlgorithms.MODID, bus = EventBusSubscriber.Bus.GAME)
public class DebuggingHelperPressButton {

  public static final Lazy<KeyMapping> KEY_MAPPING =
      Lazy.of(
          () ->
              new KeyMapping(
                  "key.amethystalgorithms.debuggingHelper",
                  InputConstants.Type.KEYSYM,
                  GLFW.GLFW_KEY_B,
                  "key.categories.misc"));

  // Event is on the mod event bus only on the physical client
  @SubscribeEvent
  public void registerBindings(RegisterKeyMappingsEvent event) {
    event.register(KEY_MAPPING.get());
  }

  //TODO what do I annotate this with to detect them pressing "B"?
  public static void pressDebugButton(Event event) {

    // This is an example of a variable assignment.
    String myName = Minecraft.getInstance().player.getName().getString();

    // Here, we print the player's current name.
    System.out.println("My name is: " + myName);

    // These are another few variable assignments.
    double myX = Minecraft.getInstance().player.getX();
    double myY = Minecraft.getInstance().player.getY();
    double myZ = Minecraft.getInstance().player.getZ();

    // We can print multiple things on one line!
    System.out.println("My x,y,z are: " + myX + "," + myY + "," + myZ);

    // Spawn a diamond block 10 blocks above the player's head.
    // We have to use what's called a "typecast" here.
    int aboveHeadX = (int) myX;
    int aboveHeadY = (int) (myY + 10);
    int aboveHeadZ = (int) myZ;

    //Set the block.
//    event. //TODO

  }
}
