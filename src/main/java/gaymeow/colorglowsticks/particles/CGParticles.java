package gaymeow.colorglowsticks.particles;

import gaymeow.colorglowsticks.ColorGlowsticks;
import gaymeow.colorglowsticks.particles.custom.GlowstickParticle;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;


public class CGParticles {

    public static final SimpleParticleType NOTE = registerParticle("note");
    public static final SimpleParticleType SPARKLE = registerParticle("sparkle");

    private static SimpleParticleType registerParticle(String name){
        SimpleParticleType particle = FabricParticleTypes.simple();
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(ColorGlowsticks.MOD_ID,name),particle);
    };

    public static void registerModParticles(){
        ParticleProviderRegistry.getInstance().register(CGParticles.NOTE, GlowstickParticle.Provider::new);
        ParticleProviderRegistry.getInstance().register(CGParticles.SPARKLE, GlowstickParticle.Provider::new);
    }
}
