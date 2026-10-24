package gaymeow.colorglowsticks;

import gaymeow.colorglowsticks.creativemodetab.CGCreativeModeTabs;
import gaymeow.colorglowsticks.item.CGItems;
import gaymeow.colorglowsticks.particles.CGParticles;
import gaymeow.colorglowsticks.playeranimations.CGAnimations;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorGlowsticks implements ModInitializer {
	public static final String MOD_ID = "colorglowsticks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("♪ Preparing for the show ♫");
		CGItems.registerModItems();
		CGCreativeModeTabs.registerModCreativeModeTabs();
		CGParticles.registerModParticles();
		CGAnimations.registerModAnimations();

		//for extra resource packs
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer ->
				ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(MOD_ID,"wip_3d_glowsticks"),modContainer, PackActivationType.NORMAL));
	}

}
