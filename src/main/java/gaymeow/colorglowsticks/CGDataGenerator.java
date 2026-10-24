package gaymeow.colorglowsticks;

import gaymeow.colorglowsticks.datagen.CGItemTagsProvider;
import gaymeow.colorglowsticks.datagen.CGModelProvider;
import gaymeow.colorglowsticks.datagen.CGRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CGDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(CGRecipeProvider::new);
		pack.addProvider(CGModelProvider::new);
		pack.addProvider(CGItemTagsProvider::new);
	}
}
