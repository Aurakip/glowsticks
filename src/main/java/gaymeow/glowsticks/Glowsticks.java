package gaymeow.glowsticks;

import gaymeow.glowsticks.creativemodetab.ModCreativeModeTabs;
import gaymeow.glowsticks.item.ModItems;
import gaymeow.glowsticks.particles.ModParticles;
import gaymeow.glowsticks.playeranimations.ModAnimations;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Glowsticks implements ModInitializer {
	public static final String MOD_ID = "glowsticks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("♪ Preparing for the show ♫");
		ModItems.registerModItems();
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModParticles.registerModParticles();
		ModAnimations.registerModAnimations();

		//for extra resource packs
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer ->
				ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(MOD_ID,"3d_glowstick_models"),modContainer, PackActivationType.NORMAL));
	}

}
