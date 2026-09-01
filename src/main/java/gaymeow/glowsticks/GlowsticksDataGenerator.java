package gaymeow.glowsticks;

import gaymeow.glowsticks.datagen.ModItemTagsProvider;
import gaymeow.glowsticks.datagen.ModModelProvider;
import gaymeow.glowsticks.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GlowsticksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
	}
}
