package pvptone.gui.ingame.ui;

import pvptone.options.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import pvptone.*;
import pvptone.utils.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Compass extends Object<Compass>
{
    public int cwidth;
    public int height;
    public int width;
    public boolean shadow;
    public int colorMarker;
    public String[] Field_2154;
    public int offY;
    public int centerX;
    public int offX;
    public double ANGLE_SCALE = 0.75;
    public int[] Field_2155;
    public double SECONDARY_CARDINAL_SCALE = 1.0;
    public double offsetAll;
    public double PRIMARY_CARDINAL_SCALE = 1.5;
    
    public boolean Method_9799(final int Variable_101501, final int n) {
        return this > Variable_101501;
    }
    
    public int Method_9800(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_2        
        //     2: dcmpg          
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public int Method_9801(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_2        
        //     2: dcmpl          
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void renderGameOverlay(final int Variable_101502, final int Variable_101506, final float Variable_101504) {
        if (Method_9805(this.visible ? 1 : 0)) {
            return;
        }
        if (Method_9803(this.mc.thePlayer)) {
            return;
        }
        this.offX = this.left;
        this.offY = this.top;
        this.setSize(this.width = (int)OptionsEnum.CompassWidth.val, this.height);
        this.cwidth = Compass.Field_2155[4];
        this.shadow = (Compass.Field_2155[3] != 0);
        this.colorMarker = Compass.Field_2155[5];
        final double Variable_101507 = this.normalized(this.mc.thePlayer.rotationYaw);
        this.offsetAll = this.cwidth * (Variable_101507 / 360.0);
        this.centerX = this.offX + this.width / Compass.Field_2155[6];
        Gui.drawRect(this.centerX - this.width / Compass.Field_2155[6], this.offY, this.centerX + this.width / Compass.Field_2155[6], this.offY + this.height, Compass.Field_2155[7]);
        this.renderMarker();
        final int Variable_101508 = Compass.Field_2155[0];
        if (Method_9806(Variable_101508)) {
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[3]], Compass.Field_2155[0], 1.5);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[6]], Compass.Field_2155[8], 1.5);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[9]], Compass.Field_2155[10], 1.5);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[11]], Compass.Field_2155[12], 1.5);
        }
        if (Method_9804(Variable_101508, Compass.Field_2155[3])) {
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[13]], Compass.Field_2155[14], 1.0);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[15]], Compass.Field_2155[16], 1.0);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[17]], Compass.Field_2155[18], 1.0);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[19]], Compass.Field_2155[20], 1.0);
        }
        if (Method_9804(Variable_101508, Compass.Field_2155[6])) {
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[21]], Compass.Field_2155[22], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[23]], Compass.Field_2155[24], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[25]], Compass.Field_2155[26], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[27]], Compass.Field_2155[28], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[29]], Compass.Field_2155[30], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[31]], Compass.Field_2155[32], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[22]], Compass.Field_2155[1], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[33]], Compass.Field_2155[34], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[35]], Compass.Field_2155[36], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[37]], Compass.Field_2155[38], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[39]], Compass.Field_2155[40], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[2]], Compass.Field_2155[41], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[42]], Compass.Field_2155[43], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[44]], Compass.Field_2155[45], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[46]], Compass.Field_2155[47], 0.75);
            this.drawDirection(Compass.Field_2154[Compass.Field_2155[48]], Compass.Field_2155[49], 0.75);
        }
    }
    
    public void Method_9802() {
        (Compass.Field_2155 = new int[57])[0] = ((0x25 ^ 0x6E) & ~(0x1B ^ 0x50));
        Compass.Field_2155[1] = 7 + 48 - 51 + 146;
        Compass.Field_2155[2] = (0xD0 ^ 0x8A ^ (0x73 ^ 0x3D));
        Compass.Field_2155[3] = " ".length();
        Compass.Field_2155[4] = (0x24 ^ 0x34) + (0x2F ^ 0x28) - -(0x4F ^ 0xF) + (0x1E ^ 0x6F);
        Compass.Field_2155[5] = -" ".length();
        Compass.Field_2155[6] = "  ".length();
        Compass.Field_2155[7] = (0xFFFFDF3E & 0x7A1F3EDD);
        Compass.Field_2155[8] = (0x1F ^ 0x45);
        Compass.Field_2155[9] = "   ".length();
        Compass.Field_2155[10] = 168 + 132 - 225 + 105;
        Compass.Field_2155[11] = (0xED ^ 0xBE ^ (0xD3 ^ 0x84));
        Compass.Field_2155[12] = (0xFFFF915F & 0x6FAE);
        Compass.Field_2155[13] = (0x8F ^ 0x8A);
        Compass.Field_2155[14] = (36 + 46 + 46 + 13 ^ 118 + 104 - 107 + 45);
        Compass.Field_2155[15] = (26 + 117 - 88 + 144 ^ 166 + 97 - 212 + 142);
        Compass.Field_2155[16] = (0xAB ^ 0xB5) + (0x3A ^ 0x55) - (0x1D ^ 0x9) + (0x99 ^ 0x97);
        Compass.Field_2155[17] = (0x7D ^ 0x7A);
        Compass.Field_2155[18] = 204 + 127 - 235 + 129;
        Compass.Field_2155[19] = (0x5A ^ 0x52);
        Compass.Field_2155[20] = (0xFFFF8DBB & 0x737F);
        Compass.Field_2155[21] = (52 + 57 + 45 + 24 ^ 97 + 64 - 96 + 122);
        Compass.Field_2155[22] = (0x2A ^ 0x25);
        Compass.Field_2155[23] = (4 + 83 - 24 + 76 ^ 77 + 88 - 164 + 128);
        Compass.Field_2155[24] = (22 + 139 - 106 + 115 ^ 138 + 6 + 31 + 5);
        Compass.Field_2155[25] = (0x44 ^ 0x7C ^ (0x47 ^ 0x74));
        Compass.Field_2155[26] = (29 + 111 - 121 + 146 ^ 108 + 134 - 169 + 80);
        Compass.Field_2155[27] = (0x60 ^ 0x4A ^ (0x11 ^ 0x37));
        Compass.Field_2155[28] = (0x7D ^ 0x36);
        Compass.Field_2155[29] = (0x43 ^ 0x75 ^ (0xA3 ^ 0x98));
        Compass.Field_2155[30] = (0xDC ^ 0xB5);
        Compass.Field_2155[31] = (0x7E ^ 0x70);
        Compass.Field_2155[32] = (0xB0 ^ 0xA0 ^ (0x6A ^ 0x2));
        Compass.Field_2155[33] = (90 + 17 - 90 + 121 ^ 104 + 66 - 107 + 91);
        Compass.Field_2155[34] = 19 + 115 - 32 + 63;
        Compass.Field_2155[35] = (0x21 ^ 0x30);
        Compass.Field_2155[36] = 16 + 160 - 53 + 60 + (0xD8 ^ 0x8F) - (0xE7 ^ 0x84) + (0xBC ^ 0xA4);
        Compass.Field_2155[37] = (0x85 ^ 0x97);
        Compass.Field_2155[38] = 199 + 193 - 372 + 190;
        Compass.Field_2155[39] = (0xD ^ 0x1E);
        Compass.Field_2155[40] = 231 + 25 - 210 + 194;
        Compass.Field_2155[41] = 203 + 55 - 251 + 248;
        Compass.Field_2155[42] = (126 + 26 - 17 + 7 ^ 152 + 69 - 138 + 72);
        Compass.Field_2155[43] = (-(0xFFFFACFB & 0x7FA7) & (0xFFFFBDBF & 0x6FFF));
        Compass.Field_2155[44] = (0x6 ^ 0x10);
        Compass.Field_2155[45] = (-(0xFFFFEBD7 & 0x7CA9) & (0xFFFFFFBF & 0x69EC));
        Compass.Field_2155[46] = (0x2D ^ 0x3A);
        Compass.Field_2155[47] = (0xFFFFEFCB & 0x117E);
        Compass.Field_2155[48] = ("  ".length() ^ (0x4C ^ 0x56));
        Compass.Field_2155[49] = (0xFFFFB1FD & 0x4F5B);
        Compass.Field_2155[50] = (0xFFFFDBC7 & 0x273A);
        Compass.Field_2155[51] = (0xFFFFB3D7 & 0x4F2B);
        Compass.Field_2155[52] = (0xFFFF8BF8 & 0x756F);
        Compass.Field_2155[53] = (-" ".length() & (-1 & 0xFFFFFF));
        Compass.Field_2155[54] = (0xFFFFABEB & 0x5FF6);
        Compass.Field_2155[55] = (0xFFFF93E8 & 0x7F9F);
        Compass.Field_2155[56] = (55 + 127 - 151 + 134 ^ 115 + 148 - 157 + 82);
    }
    
    public boolean Method_9803(final Object o) {
        return this == null;
    }
    
    public double normalized(double Variable_101513) {
        Variable_101513 = (short)(360.0 + Variable_101513 % 360.0);
        if (Method_9809(Method_9801(Variable_101513, 360.0))) {
            Variable_101513 -= 360.0;
        }
        return Variable_101513;
    }
    
    public boolean Method_9804(final int Variable_101516, final int n) {
        return this >= Variable_101516;
    }
    
    public boolean Method_9805(final int n) {
        return this == 0;
    }
    
    static {
        Method_9802();
        Method_9815();
    }
    
    public boolean Method_9806(final int n) {
        return this >= 0;
    }
    
    public boolean Method_9807(final int n) {
        return this != 0;
    }
    
    public void renderMarker() {
        final Tessellator Variable_101523 = Tessellator.getInstance();
        final WorldRenderer Variable_101524 = Variable_101523.getWorldRenderer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(Compass.Field_2155[50], Compass.Field_2155[51], Compass.Field_2155[3], Compass.Field_2155[0]);
        GlStateManager.color((this.colorMarker >> Compass.Field_2155[33] & Compass.Field_2155[41]) / 255.0f, (this.colorMarker >> Compass.Field_2155[19] & Compass.Field_2155[41]) / 255.0f, (this.colorMarker & Compass.Field_2155[41]) / 255.0f, 1.0f);
        Variable_101524.begin(Compass.Field_2155[15], DefaultVertexFormats.POSITION);
        Variable_101524.pos((double)this.centerX, (double)(this.offY + Compass.Field_2155[9]), 0.0).endVertex();
        Variable_101524.pos((double)(this.centerX + Compass.Field_2155[9]), (double)this.offY, 0.0).endVertex();
        Variable_101524.pos((double)(this.centerX - Compass.Field_2155[9]), (double)this.offY, 0.0).endVertex();
        Variable_101523.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }
    
    public boolean Method_9808(final int Variable_101527, final int n) {
        return this < Variable_101527;
    }
    
    public boolean Method_9809(final int n) {
        return this > 0;
    }
    
    public boolean Method_9810(final int n) {
        return this < 0;
    }
    
    public Compass() {
        super(Compass.Field_2154[Compass.Field_2155[0]], Compass.Field_2155[1], Compass.Field_2155[2]);
        this.height = Compass.Field_2155[2];
        this.shadow = (Compass.Field_2155[3] != 0);
    }
    
    public void drawDirection(final String Variable_101533, final int Variable_101542, final double Variable_101538) {
        double Variable_101543 = this.cwidth * Variable_101542 / Compass.Field_2155[52] - this.offsetAll;
        if (Method_9809(Method_9811(Variable_101543, this.cwidth / Compass.Field_2155[6]))) {
            Variable_101543 -= this.cwidth;
        }
        if (Method_9810(Method_9800(Variable_101543, -this.cwidth / Compass.Field_2155[6]))) {
            Variable_101543 += this.cwidth;
        }
        final double Variable_101544 = 1.0 - Math.abs(Variable_101543) / (this.width / 2.0);
        if (Method_9809(Method_9811(Variable_101544, 0.1))) {
            final int Variable_101545 = Compass.Field_2155[53];
            final int Variable_101546 = Variable_101545 | (int)(Variable_101544 * 255.0) << Compass.Field_2155[48];
            final float Variable_101547 = this.centerX + (float)Variable_101543 - (int)(this.fontRenderer.getStringWidth(Variable_101533) * Variable_101538 / 2.0);
            final int Variable_101548 = this.offY + this.height / Compass.Field_2155[6] - (int)(this.fontRenderer.FONT_HEIGHT * Variable_101538 / 2.0);
            GL11.glEnable(Compass.Field_2155[54]);
            GL11.glPushMatrix();
            GL11.glTranslated(-Variable_101547 * (Variable_101538 - 1.0), -Variable_101548 * (Variable_101538 - 1.0), 0.0);
            GL11.glScaled(Variable_101538, Variable_101538, 1.0);
            if (Method_9807(this.shadow ? 1 : 0)) {
                final FontRenderer fontRenderer = this.fontRenderer;
                final float n = Variable_101547;
                final float n2 = (float)Variable_101548;
                int rgb;
                if (Method_9807(((boolean)Config.isCompassRainbow.getValueState()) ? 1 : 0)) {
                    rgb = (int)RainbowUtil.rainbow(Compass.Field_2155[55]);
                    "".length();
                    if ("  ".length() > (0x3F ^ 0x3B)) {
                        return;
                    }
                }
                else {
                    rgb = new Color((float)Config.RedCompass.getValueState(), (float)Config.GreenCompass.getValueState(), (float)Config.BlueCompass.getValueState()).getRGB();
                }
                fontRenderer.drawStringWithShadow(Variable_101533, n, n2, rgb);
                "".length();
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                this.fontRenderer.drawString(Variable_101533, Variable_101547, (float)Variable_101548, Variable_101546, (boolean)(Compass.Field_2155[0] != 0));
                "".length();
            }
            GL11.glPopMatrix();
            GL11.glDisable(Compass.Field_2155[54]);
        }
    }
    
    public int Method_9811(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_2        
        //     2: dcmpl          
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public String Method_9812(final String Variable_101552, String Variable_101562) {
        Variable_101561 = (float)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_101562 = new StringBuilder();
        final char[] Variable_101563 = Variable_101552.toCharArray();
        int Variable_101564 = Compass.Field_2155[0];
        final byte Variable_101565 = (Object)((String)this).toCharArray();
        final String Variable_101566 = (String)Variable_101565.length;
        short Variable_101567 = (short)Compass.Field_2155[0];
        while (Method_9808(Variable_101567, (int)Variable_101566)) {
            final char Variable_101568 = Variable_101565[Variable_101567];
            Variable_101562.append((char)(Variable_101568 ^ Variable_101563[Variable_101564 % Variable_101563.length]));
            "".length();
            ++Variable_101564;
            ++Variable_101567;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(Variable_101562);
    }
    
    public String Method_9813(final String Variable_101568, String Variable_101573) {
        try {
            Variable_101573 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_101568.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_101574 = Cipher.getInstance("Blowfish");
            Variable_101574.init(Compass.Field_2155[6], Variable_101573);
            return new String(Variable_101574.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_101575) {
            Variable_101575.printStackTrace();
            return null;
        }
    }
    
    public String Method_9814(final String Variable_101577, String Variable_101578) {
        try {
            Variable_101578 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_101577.getBytes(StandardCharsets.UTF_8)), Compass.Field_2155[19]), "DES");
            final Cipher Variable_101579 = Cipher.getInstance("DES");
            Variable_101579.init(Compass.Field_2155[6], Variable_101578);
            return new String(Variable_101579.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_101580) {
            Variable_101580.printStackTrace();
            return null;
        }
    }
    
    public void Method_9815() {
        (Compass.Field_2154 = new String[Compass.Field_2155[56]])[Compass.Field_2155[0]] = Method_9814("RP/QLpI2Wfs=", "PxEVh");
        Compass.Field_2154[Compass.Field_2155[3]] = Method_9813("S0Uh8EbFVpw=", "EyHOv");
        Compass.Field_2154[Compass.Field_2155[6]] = Method_9814("qNStXpyRqdw=", "bNoXy");
        Compass.Field_2154[Compass.Field_2155[9]] = Method_9812("Ng==", "xpJfb");
        Compass.Field_2154[Compass.Field_2155[11]] = Method_9812("IQ==", "djvyN");
        Compass.Field_2154[Compass.Field_2155[13]] = Method_9813("6INLlKjSbbs=", "QNAYu");
        Compass.Field_2154[Compass.Field_2155[15]] = Method_9813("cnhGZQ92D6Y=", "LyoSB");
        Compass.Field_2154[Compass.Field_2155[17]] = Method_9814("uzltwIWRtm0=", "VZZxD");
        Compass.Field_2154[Compass.Field_2155[19]] = Method_9814("9Ls6TZv5HWI=", "YXsnX");
        Compass.Field_2154[Compass.Field_2155[21]] = Method_9814("FrfjHjFZCgY=", "ZDsnp");
        Compass.Field_2154[Compass.Field_2155[23]] = Method_9812("RHI=", "wBMVL");
        Compass.Field_2154[Compass.Field_2155[25]] = Method_9813("QAXeOltoSKs=", "DaFpv");
        Compass.Field_2154[Compass.Field_2155[27]] = Method_9813("2B2Tu1EBtR4=", "lWRBW");
        Compass.Field_2154[Compass.Field_2155[29]] = Method_9812("R2Vb", "vUnnA");
        Compass.Field_2154[Compass.Field_2155[31]] = Method_9813("L9R+JJLaI4A=", "QotQp");
        Compass.Field_2154[Compass.Field_2155[22]] = Method_9813("pILsDwqEsL4=", "PdQCS");
        Compass.Field_2154[Compass.Field_2155[33]] = Method_9813("XzREi50ha30=", "fqWkq");
        Compass.Field_2154[Compass.Field_2155[35]] = Method_9813("3JtenST7ofU=", "qyNLg");
        Compass.Field_2154[Compass.Field_2155[37]] = Method_9812("akll", "XxUsK");
        Compass.Field_2154[Compass.Field_2155[39]] = Method_9814("iSkwrkba6OQ=", "YjPfR");
        Compass.Field_2154[Compass.Field_2155[2]] = Method_9812("cHBH", "BErqO");
        Compass.Field_2154[Compass.Field_2155[42]] = Method_9812("UExe", "btksF");
        Compass.Field_2154[Compass.Field_2155[44]] = Method_9813("Mu6cB0K7sDU=", "ptzxX");
        Compass.Field_2154[Compass.Field_2155[46]] = Method_9814("af5PSPV1E4o=", "MZaXw");
        Compass.Field_2154[Compass.Field_2155[48]] = Method_9814("/41+IpbLET8=", "nLRzq");
    }
    
    public int normalize(int Variable_101586) {
        if (Method_9799(Variable_101586, Compass.Field_2155[52])) {
            Variable_101586 %= Compass.Field_2155[52];
            "".length();
            if (" ".length() != " ".length()) {
                return (0x34 ^ 0x21 ^ (0x3A ^ 0xD)) & (130 + 130 - 158 + 68 ^ 55 + 108 - 158 + 131 ^ -" ".length());
            }
        }
        while (!Method_9806(Variable_101586)) {
            Variable_101586 += 360;
        }
        return Variable_101586;
    }
}
