package gaymeow.glowsticks;

import gaymeow.glowsticks.creativemodetab.ModCreativeModeTabs;
import gaymeow.glowsticks.item.ModItems;
import net.fabricmc.api.ModInitializer;

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
	}

}
