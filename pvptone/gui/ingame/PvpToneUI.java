package pvptone.gui.ingame;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import pvptone.*;

public class PvpToneUI extends Object<PvpToneUI>
{
    public int left;
    public int lastScaledW;
    public int bottom;
    public int[] Field_1900;
    public int right;
    public Minecraft mc;
    public FontRenderer fontRenderer;
    public double posX;
    public int sizeW;
    public int sizeH;
    public String[] Field_1901;
    public String name;
    public int windowZIndex;
    public int lastScaledH;
    public double posY;
    public int top;
    public boolean visible;
    
    public void setPosition(final double Variable_90249, final double Variable_90245) {
        this.posX = Variable_90249;
        this.posY = Variable_90245;
    }
    
    public void Method_8611() {
        (PvpToneUI.Field_1901 = new String[PvpToneUI.Field_1900[6]])[PvpToneUI.Field_1900[1]] = Method_8615("H4mJrAr+Dyc=", "mHiLS");
        PvpToneUI.Field_1901[PvpToneUI.Field_1900[0]] = Method_8615("clI67uK9Ojc=", "sVEWd");
        PvpToneUI.Field_1901[PvpToneUI.Field_1900[2]] = Method_8616("Z9n7S5QHzz0=", "oHvPK");
        PvpToneUI.Field_1901[PvpToneUI.Field_1900[3]] = Method_8616("11JLjqtYr/A=", "zUxtF");
        PvpToneUI.Field_1901[PvpToneUI.Field_1900[4]] = Method_8615("MX/Gf80EeXo=", "tpSSH");
        PvpToneUI.Field_1901[PvpToneUI.Field_1900[5]] = Method_8615("3ZLjOOn7p+0=", "nIqdP");
    }
    
    public boolean Method_8612(final Object o) {
        return this != null;
    }
    
    public void Method_8613() {
        (PvpToneUI.Field_1900 = new int[8])[0] = " ".length();
        PvpToneUI.Field_1900[1] = ((0x36 ^ 0x15) & ~(0xA3 ^ 0x80));
        PvpToneUI.Field_1900[2] = "  ".length();
        PvpToneUI.Field_1900[3] = "   ".length();
        PvpToneUI.Field_1900[4] = (0x7F ^ 0xB ^ (0x6D ^ 0x1D));
        PvpToneUI.Field_1900[5] = (0x30 ^ 0x35);
        PvpToneUI.Field_1900[6] = (60 + 50 - 48 + 73 ^ 65 + 6 + 3 + 55);
        PvpToneUI.Field_1900[7] = (0xA5 ^ 0xAD);
    }
    
    public boolean Method_8614(final int Variable_90252, final int n) {
        return this == Variable_90252;
    }
    
    public String Method_8615(final String Variable_90259, final String Variable_90262) {
        try {
            final SecretKeySpec Variable_90260 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_90259.getBytes(StandardCharsets.UTF_8)), PvpToneUI.Field_1900[7]), "DES");
            final Cipher Variable_90261 = Cipher.getInstance("DES");
            Variable_90261.init(PvpToneUI.Field_1900[2], Variable_90260);
            return new String(Variable_90261.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_90262) {
            Variable_90262.printStackTrace();
            return null;
        }
    }
    
    public void calculatePositions(final int Variable_90263, final int Variable_90264) {
        this.left = (int)(this.posX * (Variable_90263 - this.sizeW));
        this.top = (int)(this.posY * (Variable_90264 - this.sizeH));
        this.right = this.left + this.sizeW;
        this.bottom = this.top + this.sizeH;
        Config.prop.setProperty(String.valueOf(new StringBuilder(String.valueOf(this.name)).append(PvpToneUI.Field_1901[PvpToneUI.Field_1900[4]])), String.valueOf(new StringBuilder().append(this.posX)));
        "".length();
        Config.prop.setProperty(String.valueOf(new StringBuilder(String.valueOf(this.name)).append(PvpToneUI.Field_1901[PvpToneUI.Field_1900[5]])), String.valueOf(new StringBuilder().append(this.posY)));
        "".length();
        Config.save();
    }
    
    public void renderGameOverlay(final int Variable_90272, final int Variable_90269, final float Variable_90271) {
    }
    
    static {
        Method_8613();
        Method_8611();
    }
    
    public PvpToneUI(final String Variable_90276, final int Variable_90275, final int Variable_90273) {
        this.visible = (PvpToneUI.Field_1900[0] != 0);
        this.mc = Minecraft.getMinecraft();
        this.fontRenderer = this.mc.fontRendererObj;
        this.name = Variable_90276;
        this.sizeW = Variable_90275;
        this.sizeH = Variable_90273;
        if (Method_8612(Config.prop.getProperty(String.valueOf(new StringBuilder(String.valueOf(Variable_90276)).append(PvpToneUI.Field_1901[PvpToneUI.Field_1900[1]]))))) {
            this.posX = Float.parseFloat(Config.prop.getProperty(String.valueOf(new StringBuilder(String.valueOf(Variable_90276)).append(PvpToneUI.Field_1901[PvpToneUI.Field_1900[0]]))));
        }
        if (Method_8612(Config.prop.getProperty(String.valueOf(new StringBuilder(String.valueOf(Variable_90276)).append(PvpToneUI.Field_1901[PvpToneUI.Field_1900[2]]))))) {
            this.posY = Float.parseFloat(Config.prop.getProperty(String.valueOf(new StringBuilder(String.valueOf(Variable_90276)).append(PvpToneUI.Field_1901[PvpToneUI.Field_1900[3]]))));
        }
    }
    
    public String Method_8616(final String Variable_90283, String Variable_90282) {
        try {
            Variable_90282 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_90283.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_90284 = Cipher.getInstance("Blowfish");
            Variable_90284.init(PvpToneUI.Field_1900[2], Variable_90282);
            return new String(Variable_90284.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_90285) {
            Variable_90285.printStackTrace();
            return null;
        }
    }
    
    public void renderGameOverlay0(final int Variable_90290, final int Variable_90292, final float Variable_90294) {
        if (!Method_8614(this.lastScaledW, Variable_90290) || Method_8617(this.lastScaledH, Variable_90292)) {
            this.calculatePositions(Variable_90290, Variable_90292);
            this.lastScaledW = Variable_90290;
            this.lastScaledH = Variable_90292;
        }
        this.renderGameOverlay(Variable_90290, Variable_90292, Variable_90294);
        this.mc.getTextureManager().bindTexture(PvpToneUI.icons);
    }
    
    public void setSize(final int Variable_90298, final int Variable_90299) {
        if (Method_8614(this.sizeH, Variable_90299) && Method_8614(this.sizeW, Variable_90298)) {
            return;
        }
        this.sizeW = Variable_90298;
        this.sizeH = Variable_90299;
        this.calculatePositions(this.lastScaledW, this.lastScaledH);
    }
    
    public boolean Method_8617(final int Variable_90305, final int n) {
        return this != Variable_90305;
    }
    
    public void onLoad() {
    }
}
