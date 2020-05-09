package pvptone.gui.button.slider;

import pvptone.options.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import net.minecraft.client.renderer.*;
import pvptone.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class PvpToneSlider extends Object<PvpToneSlider>
{
    public float min;
    public float sliderPosition;
    public String[] Field_961;
    public float y;
    public double lastDragX;
    public float max;
    public Value op;
    public boolean dragging;
    public String name;
    public double dragX;
    public boolean isMouseDown;
    public int buttonId;
    public int[] Field_962;
    public float x;
    
    public boolean Method_4398(final int Variable_44863, final int n) {
        return this < Variable_44863;
    }
    
    public void Method_4399() {
        (PvpToneSlider.Field_962 = new int[11])[0] = (0x64 ^ 0x0);
        PvpToneSlider.Field_962[1] = (0xFA ^ 0xBD ^ (0xED ^ 0xAF));
        PvpToneSlider.Field_962[2] = ((0xE4 ^ 0x84) & ~(0xD9 ^ 0xB9));
        PvpToneSlider.Field_962[3] = -(0xFFFFF9DC & 0xDCDFFF);
        PvpToneSlider.Field_962[4] = -(-(0xFFFFB38F & 0x5D77) & (0xFFFFFFD6 & 0x99FFFF));
        PvpToneSlider.Field_962[5] = " ".length();
        PvpToneSlider.Field_962[6] = "  ".length();
        PvpToneSlider.Field_962[7] = -(-1 & 0x61D7AD);
        PvpToneSlider.Field_962[8] = (0x37 ^ 0x33);
        PvpToneSlider.Field_962[9] = (0x16 ^ 0x1E);
        PvpToneSlider.Field_962[10] = "   ".length();
    }
    
    public int Method_4400(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public void drawButton(final Minecraft Variable_44868, final int Variable_44866, final int Variable_44864) {
        super.drawButton(Variable_44868, Variable_44866, Variable_44864);
        Gui.drawRect(this.x, this.y, this.x + 100.0f, this.y + 5.0f, PvpToneSlider.Field_962[3]);
        Gui.drawRect(this.x, this.y, this.x + this.sliderPosition * 100.0f, this.y + 5.0f, PvpToneSlider.Field_962[4]);
        Variable_44868.fontRendererObj.drawCenteredString(Variable_44868.fontRendererObj, String.valueOf(new StringBuilder(String.valueOf(this.name)).append(PvpToneSlider.Field_961[PvpToneSlider.Field_962[5]]).append((int)(this.sliderPosition * 100.0f)).append(PvpToneSlider.Field_961[PvpToneSlider.Field_962[6]])), this.x + 50.0f, this.y - 10.0f, PvpToneSlider.Field_962[7]);
    }
    
    public String Method_4401(final String Variable_44882, String Variable_44873) {
        Variable_44877 = (float)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_44873 = new StringBuilder();
        final char[] Variable_44883 = Variable_44882.toCharArray();
        int Variable_44884 = PvpToneSlider.Field_962[2];
        final long Variable_44885 = (Object)((String)this).toCharArray();
        final Exception Variable_44886 = (Exception)Variable_44885.length;
        int Variable_44887 = PvpToneSlider.Field_962[2];
        while (Method_4398(Variable_44887, (int)Variable_44886)) {
            final char Variable_44888 = Variable_44885[Variable_44887];
            Variable_44873.append((char)(Variable_44888 ^ Variable_44883[Variable_44884 % Variable_44883.length]));
            "".length();
            ++Variable_44884;
            ++Variable_44887;
            "".length();
            if ((0x24 ^ 0x40 ^ (0xC1 ^ 0xA1)) < 0) {
                return null;
            }
        }
        return String.valueOf(Variable_44873);
    }
    
    public boolean mousePressed(final Minecraft Variable_44887, final int Variable_44890, final int Variable_44888) {
        if (Method_4409(super.mousePressed(Variable_44887, Variable_44890, Variable_44888) ? 1 : 0)) {
            this.sliderPosition = (Variable_44890 - (this.xPosition + PvpToneSlider.Field_962[8])) / (float)(this.width - PvpToneSlider.Field_962[9]);
            if (Method_4402(Method_4400(this.sliderPosition, 0.0f))) {
                this.sliderPosition = 0.0f;
            }
            if (Method_4407(Method_4404(this.sliderPosition, 1.0f))) {
                this.sliderPosition = 1.0f;
            }
            this.op.setValueState(this.min + (this.max - this.min) * this.sliderPosition);
            this.isMouseDown = (PvpToneSlider.Field_962[5] != 0);
            return PvpToneSlider.Field_962[5] != 0;
        }
        return PvpToneSlider.Field_962[2] != 0;
    }
    
    public boolean Method_4402(final int n) {
        return this < 0;
    }
    
    public void mouseDragged(final Minecraft Variable_44896, final int Variable_44897, final int Variable_44898) {
        if (Method_4409(this.visible ? 1 : 0)) {
            if (Method_4409(this.isMouseDown ? 1 : 0)) {
                this.sliderPosition = (Variable_44897 - (this.xPosition + PvpToneSlider.Field_962[8])) / (float)(this.width - PvpToneSlider.Field_962[9]);
                if (Method_4402(Method_4408(this.sliderPosition, 0.0f))) {
                    this.sliderPosition = 0.0f;
                }
                if (Method_4407(Method_4403(this.sliderPosition, 1.0f))) {
                    this.sliderPosition = 1.0f;
                }
            }
            this.op.setValueState(this.min + (this.max - this.min) * this.sliderPosition);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    public int Method_4403(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public void mouseReleased(final int Variable_44903, final int Variable_44902) {
        Config.save();
        this.isMouseDown = (PvpToneSlider.Field_962[2] != 0);
    }
    
    public int Method_4404(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public PvpToneSlider(final int Variable_44915, final int Variable_44909, final int Variable_44913, final Value Variable_44914, final int Variable_44906, final int Variable_44920, final String Variable_44916) {
        super(Variable_44915, Variable_44909, Variable_44913, PvpToneSlider.Field_962[0], PvpToneSlider.Field_962[1], PvpToneSlider.Field_961[PvpToneSlider.Field_962[2]]);
        this.sliderPosition = 1.0f;
        this.buttonId = Variable_44915;
        this.x = (float)Variable_44909;
        this.y = (float)Variable_44913;
        this.op = Variable_44914;
        final float Variable_44921 = (float)Variable_44914.getValueState();
        this.sliderPosition = (Variable_44921 - Variable_44906) / (Variable_44920 - Variable_44906);
        this.name = Variable_44916;
        this.min = (float)Variable_44906;
        this.max = (float)Variable_44920;
        this.a = (PvpToneSlider.Field_962[2] != 0);
    }
    
    public void Method_4405() {
        (PvpToneSlider.Field_961 = new String[PvpToneSlider.Field_962[10]])[PvpToneSlider.Field_962[2]] = Method_4401("", "ygMWj");
        PvpToneSlider.Field_961[PvpToneSlider.Field_962[5]] = Method_4406("6VgPQpRxs0g=", "TSYrv");
        PvpToneSlider.Field_961[PvpToneSlider.Field_962[6]] = Method_4406("dj6i6lUh8TU=", "PIvug");
    }
    
    public String Method_4406(final String Variable_44925, final String Variable_44930) {
        try {
            final SecretKeySpec Variable_44928 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_44925.getBytes(StandardCharsets.UTF_8)), PvpToneSlider.Field_962[9]), "DES");
            final Cipher Variable_44929 = Cipher.getInstance("DES");
            Variable_44929.init(PvpToneSlider.Field_962[6], Variable_44928);
            return new String(Variable_44929.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_44930) {
            Variable_44930.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_4407(final int n) {
        return this > 0;
    }
    
    public int Method_4408(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    static {
        Method_4399();
        Method_4405();
    }
    
    public boolean Method_4409(final int n) {
        return this != 0;
    }
}
