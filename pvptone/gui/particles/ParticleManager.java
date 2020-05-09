package pvptone.gui.particles;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import pvptone.utils.*;
import java.util.*;

public class ParticleManager extends Object<ParticleManager>
{
    public List<Particles> particles;
    public Minecraft mc;
    public int[] Field_955;
    
    public boolean Method_4374(final int n) {
        return this == 0;
    }
    
    public boolean Method_4375(final int Variable_44725, final int n) {
        return this <= Variable_44725;
    }
    
    public ScaledResolution getRes() {
        return new ScaledResolution(this.mc);
    }
    
    public int Method_4376(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public ParticleManager() {
        this.particles = new LinkedList<Particles>();
        this.mc = Minecraft.getMinecraft();
    }
    
    public int centerHeight() {
        return this.getRes().getScaledHeight() / ParticleManager.Field_955[4];
    }
    
    public int centerWidth() {
        return this.getRes().getScaledWidth() / ParticleManager.Field_955[4];
    }
    
    public boolean Method_4377(final int n) {
        return this <= 0;
    }
    
    static {
        Method_4379();
    }
    
    public boolean Method_4378(final int Variable_44736, final int n) {
        return this >= Variable_44736;
    }
    
    public void Method_4379() {
        (ParticleManager.Field_955 = new int[8])[0] = (-(0xFFFFB4CE & 0x5B35) & (0xFFFF93FB & 0x7FEF));
        ParticleManager.Field_955[1] = ((0xC9 ^ 0xAA ^ (0xE2 ^ 0xC6)) & (68 + 6 - 49 + 103 ^ 90 + 112 - 121 + 118 ^ -" ".length()));
        ParticleManager.Field_955[2] = (0xA1 ^ 0x85 ^ (0xB5 ^ 0x97));
        ParticleManager.Field_955[3] = " ".length();
        ParticleManager.Field_955[4] = "  ".length();
        ParticleManager.Field_955[5] = (24 + 142 - 131 + 110 ^ 179 + 25 - 144 + 125);
        ParticleManager.Field_955[6] = (0x56 ^ 0x2B) + (76 + 134 - 164 + 97) - (41 + 46 - 66 + 170) + (0xE9 ^ 0x92);
        ParticleManager.Field_955[7] = (0xBF ^ 0x93 ^ (0x1A ^ 0x33));
    }
    
    public void render(final int Variable_44741, final int Variable_44743) {
        if (Method_4375(this.particles.size(), ParticleManager.Field_955[0])) {
            int Variable_44744 = ParticleManager.Field_955[1];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (!Method_4378(Variable_44744, ParticleManager.Field_955[7])) {
                final int Variable_44745 = new Random().nextInt(ParticleManager.Field_955[2]);
                this.particles.add(new Particles((float)(this.centerWidth() + Utils.random(-this.getRes().getScaledWidth(), this.getRes().getScaledWidth())), (float)(this.centerHeight() + Utils.random(-this.getRes().getScaledHeight(), this.getRes().getScaledHeight())), (float)Utils.random(ParticleManager.Field_955[3], ParticleManager.Field_955[4]), (float)Utils.random(ParticleManager.Field_955[3], ParticleManager.Field_955[4]), (float)Utils.random(ParticleManager.Field_955[5], ParticleManager.Field_955[6])));
                "".length();
                ++Variable_44744;
            }
        }
        final int Variable_44746 = (int)this.particles.iterator();
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!Method_4374(((Iterator)Variable_44746).hasNext() ? 1 : 0)) {
            final Particles Variable_44747 = ((Iterator<Particles>)Variable_44746).next();
            if (Method_4377(Method_4376(Variable_44747.getPosX(), 0.0f))) {
                Variable_44747.setPosX((float)(this.centerWidth() + Utils.random(-this.getRes().getScaledWidth(), this.getRes().getScaledWidth())));
                Variable_44747.setPosY((float)(this.centerHeight() + Utils.random(-this.getRes().getScaledHeight(), this.getRes().getScaledHeight())));
            }
            Variable_44747.render(this);
        }
    }
}
