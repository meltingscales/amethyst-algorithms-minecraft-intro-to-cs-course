package io.meltingscales;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("amethyst_algorithms_hello_world")
public class AmethystAlgorithmsHelloWorldMod {
    // Logger instance for logging messages
    private static final Logger LOGGER = LoggerFactory.getLogger(AmethystAlgorithmsHelloWorldMod.class);

    public AmethystAlgorithmsHelloWorldMod() {
        // Register setup methods for the mod
        NeoForge.EVENT_BUS.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        // Log the "Hello World" message when the mod reaches common setup
        LOGGER.info("Hello World from Amethyst Algorithms Project 1");
    }
}