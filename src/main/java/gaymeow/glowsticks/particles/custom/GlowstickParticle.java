package gaymeow.glowsticks.particles.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;

//stuff copied and edited from NoteParticle
//Don't ask me what half of it does, I got no clue
@Environment(EnvType.CLIENT)
public class GlowstickParticle extends SingleQuadParticle {
    private GlowstickParticle(final ClientLevel level, final double x, final double y, final double z, final double red, final double green, final double blue, final TextureAtlasSprite sprite) {
        super(level, x, y, z, (double)0.0F, (double)0.0F, (double)0.0F, sprite);
        this.friction = 0.66F;
        this.speedUpWhenYMotionIsBlocked = true;
        this.xd *= (double)0.01F;
        this.yd *= (double)0.01F;
        this.zd *= (double)0.01F;
        this.yd += 0.2;
        this.rCol = (float)red;
        this.gCol = (float)green;
        this.bCol = (float)blue;
        this.quadSize *= 1.5F;
        this.lifetime = 6;
    }

    public SingleQuadParticle.Layer getLayer() {
        return Layer.OPAQUE;
    }

    public float getQuadSize(final float a) {
        return this.quadSize * Mth.clamp(((float)this.age + a) / (float)this.lifetime * 32.0F, 0.0F, 1.0F);
    }

    @Environment(EnvType.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(final SpriteSet sprite) {
            this.sprite = sprite;
        }

        public Particle createParticle(final SimpleParticleType options, final ClientLevel level, final double x, final double y, final double z, final double xAux, final double yAux, final double zAux, final RandomSource random) {
            return new GlowstickParticle(level, x, y, z, xAux, yAux, zAux, this.sprite.get(random));
        }
    }
}