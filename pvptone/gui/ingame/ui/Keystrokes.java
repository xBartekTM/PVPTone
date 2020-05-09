package pvptone.gui.ingame.ui;

import org.lwjgl.input.*;
import pvptone.*;
import pvptone.utils.*;
import java.awt.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Keystrokes extends Object<Keystrokes>
{
    public int[] Field_685;
    public String[] Field_686;
    
    public Keystrokes() {
        super(Keystrokes.Field_686[Keystrokes.Field_685[0]], Keystrokes.Field_685[1], Keystrokes.Field_685[2]);
    }
    
    static {
        Method_3128();
        Method_3127();
    }
    
    public void Method_3127() {
        (Keystrokes.Field_686 = new String[Keystrokes.Field_685[12]])[Keystrokes.Field_685[0]] = Method_3131("qD2t8pr/fKr7dWab1b1JgQ==", "gKXUF");
    }
    
    public void Method_3128() {
        (Keystrokes.Field_685 = new int[18])[0] = ((0x25 ^ 0x30 ^ (0x3B ^ 0x3C)) & (109 + 184 - 262 + 156 ^ 162 + 135 - 206 + 78 ^ -" ".length()));
        Keystrokes.Field_685[1] = (0x7E ^ 0x3D);
        Keystrokes.Field_685[2] = (0x8D ^ 0xA0);
        Keystrokes.Field_685[3] = (0x65 ^ 0x73);
        Keystrokes.Field_685[4] = (0xAD ^ 0x81);
        Keystrokes.Field_685[5] = (-(0xFFFFEC77 & 0x3FC9) & (0xFFFFFFFE & 0x7A426D7F));
        Keystrokes.Field_685[6] = (0xFFFF9E5D & 0x7A1F7FBE);
        Keystrokes.Field_685[7] = (100 + 19 - 77 + 106 ^ 123 + 124 - 204 + 138);
        Keystrokes.Field_685[8] = (0x53 ^ 0x54);
        Keystrokes.Field_685[9] = (0xFFFFD3A9 & 0x3FDE);
        Keystrokes.Field_685[10] = (0x47 ^ 0x20 ^ (0xC4 ^ 0xB4));
        Keystrokes.Field_685[11] = (0x97 ^ 0x88);
        Keystrokes.Field_685[12] = " ".length();
        Keystrokes.Field_685[13] = (0x37 ^ 0x22);
        Keystrokes.Field_685[14] = (0x2E ^ 0x24);
        Keystrokes.Field_685[15] = (125 + 62 - 116 + 110 ^ 17 + 134 - 138 + 128);
        Keystrokes.Field_685[16] = (0x5B ^ 0x20 ^ (0x25 ^ 0x56));
        Keystrokes.Field_685[17] = "  ".length();
    }
    
    public boolean Method_3129(final int n) {
        return this == 0;
    }
    
    public boolean Method_3130(final int n) {
        return this != 0;
    }
    
    public void renderGameOverlay(final int Variable_31341, final int Variable_31340, final float Variable_31333) {
        if (Method_3129(this.visible ? 1 : 0)) {
            return;
        }
        final KeyBinding Variable_31342 = this.mc.gameSettings.keyBindForward;
        final KeyBinding Variable_31343 = this.mc.gameSettings.keyBindBack;
        final KeyBinding Variable_31344 = this.mc.gameSettings.keyBindLeft;
        final KeyBinding Variable_31345 = this.mc.gameSettings.keyBindRight;
        final int Variable_31346 = this.left;
        final int Variable_31347 = this.top;
        final int n = Variable_31346 + Keystrokes.Field_685[3];
        final int n2 = Variable_31347;
        final int n3 = Variable_31346 + Keystrokes.Field_685[4];
        final int n4 = Variable_31347 + Keystrokes.Field_685[3];
        int n5;
        if (Method_3130(Variable_31342.isKeyDown() ? 1 : 0)) {
            n5 = Keystrokes.Field_685[5];
            "".length();
            if (-" ".length() >= ((0x11 ^ 0x2B ^ (0x4 ^ 0x6D)) & (0x24 ^ 0x19 ^ (0x7F ^ 0x11) ^ -" ".length()))) {
                return;
            }
        }
        else {
            n5 = Keystrokes.Field_685[6];
        }
        Gui.drawRect(n, n2, n3, n4, n5);
        final FontRenderer fontRendererObj = this.mc.fontRendererObj;
        final FontRenderer fontRenderer = this.fontRenderer;
        final String keyName = Keyboard.getKeyName(Variable_31342.getKeyCode());
        final float n6 = (float)(Variable_31346 + Keystrokes.Field_685[7]);
        final float n7 = (float)(Variable_31347 + Keystrokes.Field_685[8]);
        int rgb;
        if (Method_3130(((boolean)Config.isKeyRainbow.getValueState()) ? 1 : 0)) {
            rgb = (int)RainbowUtil.rainbow(Keystrokes.Field_685[9]);
            "".length();
            if (((120 + 80 - 98 + 30 ^ 77 + 80 - 141 + 142) & (0xC3 ^ 0xA7 ^ (0x21 ^ 0x5F) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (Method_3130(((boolean)Config.isKeyRainbow.getValueState()) ? 1 : 0)) {
            rgb = (int)RainbowUtil.rainbow(Keystrokes.Field_685[9]);
            "".length();
            if (-(0x9F ^ 0xAE ^ (0xAC ^ 0x99)) > 0) {
                return;
            }
        }
        else {
            rgb = new Color((float)Config.RedKey.getValueState(), (float)Config.GreenKey.getValueState(), (float)Config.BlueKey.getValueState()).getRGB();
        }
        fontRendererObj.drawCenteredString(fontRenderer, keyName, n6, n7, rgb);
        final int n8 = Variable_31346 + Keystrokes.Field_685[3];
        final int n9 = Variable_31347 + Keystrokes.Field_685[10];
        final int n10 = Variable_31346 + Keystrokes.Field_685[4];
        final int n11 = Variable_31347 + Keystrokes.Field_685[2];
        int n12;
        if (Method_3130(Variable_31343.isKeyDown() ? 1 : 0)) {
            n12 = Keystrokes.Field_685[5];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n12 = Keystrokes.Field_685[6];
        }
        Gui.drawRect(n8, n9, n10, n11, n12);
        final FontRenderer fontRendererObj2 = this.mc.fontRendererObj;
        final FontRenderer fontRenderer2 = this.fontRenderer;
        final String keyName2 = Keyboard.getKeyName(Variable_31343.getKeyCode());
        final float n13 = (float)(Variable_31346 + Keystrokes.Field_685[7]);
        final float n14 = (float)(Variable_31347 + Keystrokes.Field_685[11]);
        int rgb2;
        if (Method_3130(((boolean)Config.isKeyRainbow.getValueState()) ? 1 : 0)) {
            rgb2 = (int)RainbowUtil.rainbow(Keystrokes.Field_685[9]);
            "".length();
            if (((6 + 20 + 91 + 12 ^ 54 + 26 - 34 + 99) & (0x5E ^ 0x46 ^ (0x83 ^ 0x8B) ^ -" ".length())) > ((((0x10 ^ 0x50) & ~(0x1C ^ 0x5C)) ^ (0x40 ^ 0x52)) & (0x39 ^ 0xB ^ (0x24 ^ 0x4) ^ -" ".length()))) {
                return;
            }
        }
        else {
            rgb2 = new Color((float)Config.RedKey.getValueState(), (float)Config.GreenKey.getValueState(), (float)Config.BlueKey.getValueState()).getRGB();
        }
        fontRendererObj2.drawCenteredString(fontRenderer2, keyName2, n13, n14, rgb2);
        final int n15 = Variable_31346 - Keystrokes.Field_685[12];
        final int n16 = Variable_31347 + Keystrokes.Field_685[10];
        final int n17 = Variable_31346 + Keystrokes.Field_685[13];
        final int n18 = Variable_31347 + Keystrokes.Field_685[2];
        int n19;
        if (Method_3130(Variable_31344.isKeyDown() ? 1 : 0)) {
            n19 = Keystrokes.Field_685[5];
            "".length();
            if ((142 + 134 - 171 + 52 ^ 61 + 29 - 13 + 76) < 0) {
                return;
            }
        }
        else {
            n19 = Keystrokes.Field_685[6];
        }
        Gui.drawRect(n15, n16, n17, n18, n19);
        final FontRenderer fontRendererObj3 = this.mc.fontRendererObj;
        final FontRenderer fontRenderer3 = this.fontRenderer;
        final String keyName3 = Keyboard.getKeyName(Variable_31344.getKeyCode());
        final float n20 = (float)(Variable_31346 + Keystrokes.Field_685[14]);
        final float n21 = (float)(Variable_31347 + Keystrokes.Field_685[11]);
        int rgb3;
        if (Method_3130(((boolean)Config.isKeyRainbow.getValueState()) ? 1 : 0)) {
            rgb3 = (int)RainbowUtil.rainbow(Keystrokes.Field_685[9]);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            rgb3 = new Color((float)Config.RedKey.getValueState(), (float)Config.GreenKey.getValueState(), (float)Config.BlueKey.getValueState()).getRGB();
        }
        fontRendererObj3.drawCenteredString(fontRenderer3, keyName3, n20, n21, rgb3);
        final int n22 = Variable_31346 + Keystrokes.Field_685[2];
        final int n23 = Variable_31347 + Keystrokes.Field_685[10];
        final int n24 = Variable_31346 + Keystrokes.Field_685[1];
        final int n25 = Variable_31347 + Keystrokes.Field_685[2];
        int n26;
        if (Method_3130(Variable_31345.isKeyDown() ? 1 : 0)) {
            n26 = Keystrokes.Field_685[5];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            n26 = Keystrokes.Field_685[6];
        }
        Gui.drawRect(n22, n23, n24, n25, n26);
        final FontRenderer fontRendererObj4 = this.mc.fontRendererObj;
        final FontRenderer fontRenderer4 = this.fontRenderer;
        final String keyName4 = Keyboard.getKeyName(Variable_31345.getKeyCode());
        final float n27 = (float)(Variable_31346 + Keystrokes.Field_685[15]);
        final float n28 = (float)(Variable_31347 + Keystrokes.Field_685[11]);
        int rgb4;
        if (Method_3130(((boolean)Config.isKeyRainbow.getValueState()) ? 1 : 0)) {
            rgb4 = (int)RainbowUtil.rainbow(Keystrokes.Field_685[9]);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            rgb4 = new Color((float)Config.RedKey.getValueState(), (float)Config.GreenKey.getValueState(), (float)Config.BlueKey.getValueState()).getRGB();
        }
        fontRendererObj4.drawCenteredString(fontRenderer4, keyName4, n27, n28, rgb4);
    }
    
    public String Method_3131(final String Variable_31349, final String Variable_31352) {
        try {
            final SecretKeySpec Variable_31350 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_31349.getBytes(StandardCharsets.UTF_8)), Keystrokes.Field_685[16]), "DES");
            final Cipher Variable_31351 = Cipher.getInstance("DES");
            Variable_31351.init(Keystrokes.Field_685[17], Variable_31350);
            return new String(Variable_31351.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_31352) {
            Variable_31352.printStackTrace();
            return null;
        }
    }
}
