package pvptone.gui.particles;

import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import pvptone.utils.*;
import java.util.*;
import net.minecraft.client.gui.*;

public class Particles extends Object<Particles>
{
    public float posX;
    public Minecraft mc;
    public int[] Field_3228;
    public float posY;
    public float speed;
    public float size;
    public float alpha;
    
    public void setPosY(final float Variable_153419) {
        this.posY = Variable_153419;
    }
    
    public float getSpeed() {
        return this.speed;
    }
    
    public void setPosX(final float Variable_153423) {
        this.posX = Variable_153423;
    }
    
    public float getAlpha() {
        return this.alpha;
    }
    
    public float getPosX() {
        return this.posX;
    }
    
    public void render(final ParticleManager Variable_153432) {
        this.setPosY(this.getPosY() + this.getSpeed());
        this.setPosX(this.getPosX() - this.getSpeed());
        GlStateManager.enableBlend();
        RenderUtils.drawCircle((int)this.getPosX(), (int)this.getPosY(), 0.4f, Particles.Field_3228[0]);
        GlStateManager.disableBlend();
    }
    
    public void setSize(final float Variable_153436) {
        this.size = Variable_153436;
    }
    
    static {
        Method_14783();
    }
    
    public void setAlpha(final float Variable_153438) {
        this.alpha = Variable_153438;
    }
    
    public float getSize() {
        return this.size;
    }
    
    public int random(final int Variable_153446, final int Variable_153445) {
        final Random Variable_153447 = new Random();
        return Variable_153447.nextInt(Variable_153445 - Variable_153446) + Variable_153446;
    }
    
    public void Method_14783() {
        (Particles.Field_3228 = new int[1])[0] = -" ".length();
    }
    
    public void setSpeed(final float Variable_153452) {
        this.speed = Variable_153452;
    }
    
    public float getPosY() {
        return this.posY;
    }
    
    public Particles(final float Variable_153461, final float Variable_153460, final float Variable_153457, final float Variable_153458, final float Variable_153464) {
        this.mc = Minecraft.getMinecraft();
        this.setPosX(Variable_153461);
        this.setPosY(Variable_153460);
        this.setSize(Variable_153457);
        this.setSpeed(Variable_153458);
        this.setAlpha(Variable_153464);
    }
    
    public ScaledResolution getRes() {
        return new ScaledResolution(this.mc);
    }
}
