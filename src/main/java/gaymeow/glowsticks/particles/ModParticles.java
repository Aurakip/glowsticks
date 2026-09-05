package gaymeow.glowsticks.particles;

import gaymeow.glowsticks.Glowsticks;
import gaymeow.glowsticks.particles.custom.GlowstickParticle;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;


public class ModParticles {

    public static final SimpleParticleType NOTE = registerParticle("note");

    private static SimpleParticleType registerParticle(String name){
        SimpleParticleType particle = FabricParticleTypes.simple();
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(Glowsticks.MOD_ID,name),particle);
    };

    public static void registerModParticles(){
        ParticleProviderRegistry.getInstance().register(ModParticles.NOTE, GlowstickParticle.Provider::new);
    }
}
