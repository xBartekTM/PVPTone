package pvptone.gui.options;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import pvptone.utils.*;
import java.io.*;
import pvptone.*;
import pvptone.gui.button.slider.*;
import pvptone.gui.button.check.*;
import pvptone.gui.button.*;
import net.minecraft.client.gui.*;
import java.util.*;

public class PvptoneOptions extends Object<PvptoneOptions>
{
    public int layer;
    public int[] Field_1118;
    public String[] Field_1119;
    
    static {
        Method_5065();
        Method_5066();
    }
    
    public String Method_5063(final String Variable_51224, String Variable_51223) {
        Variable_51217 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_51223 = new StringBuilder();
        final char[] Variable_51225 = Variable_51224.toCharArray();
        int Variable_51226 = PvptoneOptions.Field_1118[0];
        final short Variable_51227 = (Object)((String)this).toCharArray();
        final double Variable_51228 = Variable_51227.length;
        Exception Variable_51229 = (Exception)PvptoneOptions.Field_1118[0];
        while (Method_5070((int)Variable_51229, (int)Variable_51228)) {
            final char Variable_51230 = Variable_51227[Variable_51229];
            Variable_51223.append((char)(Variable_51230 ^ Variable_51225[Variable_51226 % Variable_51225.length]));
            "".length();
            ++Variable_51226;
            ++Variable_51229;
            "".length();
            if (-(63 + 89 - 11 + 48 ^ 95 + 174 - 134 + 50) >= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_51223);
    }
    
    public String Method_5064(final String Variable_51231, final String Variable_51238) {
        try {
            final SecretKeySpec Variable_51236 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_51231.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_51237 = Cipher.getInstance("Blowfish");
            Variable_51237.init(PvptoneOptions.Field_1118[1], Variable_51236);
            return new String(Variable_51237.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_51238) {
            Variable_51238.printStackTrace();
            return null;
        }
    }
    
    public void actionPerformed(final GuiButton Variable_51239) throws IOException {
        if (Method_5067(Variable_51239.id, PvptoneOptions.Field_1118[13])) {
            this.layer = PvptoneOptions.Field_1118[13];
        }
        if (Method_5067(Variable_51239.id, PvptoneOptions.Field_1118[2])) {
            this.layer = PvptoneOptions.Field_1118[2];
        }
        if (Method_5067(Variable_51239.id, PvptoneOptions.Field_1118[1])) {
            this.layer = PvptoneOptions.Field_1118[1];
        }
        if (Method_5067(Variable_51239.id, PvptoneOptions.Field_1118[6])) {
            this.layer = PvptoneOptions.Field_1118[6];
        }
        if (Method_5067(Variable_51239.id, PvptoneOptions.Field_1118[50])) {
            Utils.reloadCosmetics();
            Variable_51239.displayString = PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[36]];
        }
        super.actionPerformed(Variable_51239);
    }
    
    public void initGui() {
        this.buttonList.clear();
        final ScaledResolution Variable_51247 = new ScaledResolution(this.mc);
        final int Variable_51248 = (int)(Variable_51247.getScaledWidth() * 0.5);
        final int Variable_51249 = (int)(Variable_51247.getScaledHeight() * 0.6);
        final int Variable_51250 = (Variable_51247.getScaledWidth() - Variable_51248) / PvptoneOptions.Field_1118[1];
        final int Variable_51251 = (Variable_51247.getScaledHeight() - Variable_51249) / PvptoneOptions.Field_1118[1];
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[4] + PvptoneOptions.Field_1118[5], Config.RedKey, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[0]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[7] + PvptoneOptions.Field_1118[5], Config.BlueKey, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[6]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[8] + PvptoneOptions.Field_1118[5], Config.GreenKey, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[1]]));
        "".length();
        this.buttonList.add(new CheckBox(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[9], Variable_51251 + PvptoneOptions.Field_1118[10], Config.isKeyRainbow, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[2]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[8] + PvptoneOptions.Field_1118[11] + PvptoneOptions.Field_1118[12] + PvptoneOptions.Field_1118[12], Config.RedCompass, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[13]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[14] + PvptoneOptions.Field_1118[12] + PvptoneOptions.Field_1118[12] + PvptoneOptions.Field_1118[12], Config.BlueCompass, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[15]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[16] + PvptoneOptions.Field_1118[12] + PvptoneOptions.Field_1118[5] + PvptoneOptions.Field_1118[12], Config.GreenCompass, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[17]]));
        "".length();
        this.buttonList.add(new CheckBox(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[9], Variable_51251 + PvptoneOptions.Field_1118[18], Config.isCompassRainbow, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[19]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[1], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[4] + PvptoneOptions.Field_1118[5], Config.RedObramowanie, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[20]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[1], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[7] + PvptoneOptions.Field_1118[5], Config.BlueObramowanie, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[21]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[1], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[8] + PvptoneOptions.Field_1118[5], Config.GreenObramowanie, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[5]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[1], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[22] + PvptoneOptions.Field_1118[5], Config.AlphaObramowanie, PvptoneOptions.Field_1118[0], PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[23]]));
        "".length();
        this.buttonList.add(new PvpToneSlider(PvptoneOptions.Field_1118[1], Variable_51250 + PvptoneOptions.Field_1118[3], Variable_51251 + PvptoneOptions.Field_1118[24] + PvptoneOptions.Field_1118[5], Config.WidthObramowanie, PvptoneOptions.Field_1118[6], PvptoneOptions.Field_1118[5], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[25]]));
        "".length();
        this.buttonList.add(new CheckBox(PvptoneOptions.Field_1118[6], Variable_51250 + PvptoneOptions.Field_1118[26], Variable_51251 + PvptoneOptions.Field_1118[27], Config.isWings, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[28]]));
        "".length();
        this.buttonList.add(new CheckBox(PvptoneOptions.Field_1118[6], Variable_51250 + PvptoneOptions.Field_1118[26], Variable_51251 + PvptoneOptions.Field_1118[7], Config.isCosmetic, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[29]]));
        "".length();
        this.buttonList.add(new CheckBox(PvptoneOptions.Field_1118[6], Variable_51250 + PvptoneOptions.Field_1118[26], Variable_51251 + PvptoneOptions.Field_1118[30], Config.isItems, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[31]]));
        "".length();
        this.buttonList.add(new CheckBox(PvptoneOptions.Field_1118[13], Variable_51250 + PvptoneOptions.Field_1118[26], Variable_51251 + PvptoneOptions.Field_1118[27], Config.Perspektywa360, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[32]]));
        "".length();
        this.buttonList.add(new TextButton(PvptoneOptions.Field_1118[6], Variable_51250 + PvptoneOptions.Field_1118[31], Variable_51251 + PvptoneOptions.Field_1118[12], PvptoneOptions.Field_1118[4], PvptoneOptions.Field_1118[11], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[33]], PvptoneOptions.Field_1118[34]));
        "".length();
        this.buttonList.add(new TextButton(PvptoneOptions.Field_1118[1], Variable_51250 + PvptoneOptions.Field_1118[31], Variable_51251 + PvptoneOptions.Field_1118[27], PvptoneOptions.Field_1118[4], PvptoneOptions.Field_1118[11], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[35]], PvptoneOptions.Field_1118[34]));
        "".length();
        this.buttonList.add(new TextButton(PvptoneOptions.Field_1118[2], Variable_51250 + PvptoneOptions.Field_1118[31], Variable_51251 + PvptoneOptions.Field_1118[27] + PvptoneOptions.Field_1118[36], PvptoneOptions.Field_1118[4], PvptoneOptions.Field_1118[11], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[37]], PvptoneOptions.Field_1118[34]));
        "".length();
        this.buttonList.add(new TextButton(PvptoneOptions.Field_1118[13], Variable_51250 + PvptoneOptions.Field_1118[31], Variable_51251 + PvptoneOptions.Field_1118[27] + PvptoneOptions.Field_1118[36] + PvptoneOptions.Field_1118[36], PvptoneOptions.Field_1118[4], PvptoneOptions.Field_1118[11], PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[12]], PvptoneOptions.Field_1118[34]));
        "".length();
    }
    
    public void drawScreen(final int Variable_51267, final int Variable_51266, final float Variable_51256) {
        final ScaledResolution Variable_51268 = new ScaledResolution(this.mc);
        final ScaledResolution Variable_51269 = new ScaledResolution(this.mc);
        final int Variable_51270 = (int)(Variable_51269.getScaledWidth() * 0.5);
        final int Variable_51271 = (int)(Variable_51269.getScaledHeight() * 0.6);
        final int Variable_51272 = (Variable_51269.getScaledWidth() - Variable_51270) / PvptoneOptions.Field_1118[1];
        final int Variable_51273 = (Variable_51269.getScaledHeight() - Variable_51271) / PvptoneOptions.Field_1118[1];
        this.drawDefaultBackground();
        Gui.drawRect(Variable_51272, Variable_51273, Variable_51272 + Variable_51270, Variable_51273 + Variable_51271, PvptoneOptions.Field_1118[38]);
        Gui.drawRect(Variable_51272, Variable_51273, Variable_51272 + Variable_51270, Variable_51273 + PvptoneOptions.Field_1118[11], PvptoneOptions.Field_1118[39]);
        Gui.drawRect(Variable_51272, Variable_51273 + PvptoneOptions.Field_1118[11], Variable_51272 + PvptoneOptions.Field_1118[7], Variable_51273 + Variable_51271, PvptoneOptions.Field_1118[40]);
        this.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[41]]).append(Config.version)), this.width - PvptoneOptions.Field_1118[42], this.height - PvptoneOptions.Field_1118[23], PvptoneOptions.Field_1118[43]);
        final boolean Variable_51274 = (boolean)this.buttonList.iterator();
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!Method_5069(((Iterator)Variable_51274).hasNext() ? 1 : 0)) {
            final GuiButton Variable_51275 = ((Iterator<GuiButton>)Variable_51274).next();
            if (Method_5068((Variable_51275 instanceof PvpToneSlider) ? 1 : 0)) {
                final PvpToneSlider Variable_51276 = (PvpToneSlider)Variable_51275;
                if (Method_5067(Variable_51276.id, PvptoneOptions.Field_1118[2])) {
                    if (Method_5067(this.layer, PvptoneOptions.Field_1118[2])) {
                        this.drawCenteredString(this.fontRendererObj, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[44]], Variable_51272 + PvptoneOptions.Field_1118[45], Variable_51273 + PvptoneOptions.Field_1118[46], PvptoneOptions.Field_1118[47]);
                        this.drawCenteredString(this.fontRendererObj, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[48]], Variable_51272 + PvptoneOptions.Field_1118[45], Variable_51273 + PvptoneOptions.Field_1118[24], PvptoneOptions.Field_1118[47]);
                        Variable_51276.visible = (PvptoneOptions.Field_1118[6] != 0);
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                    }
                    else {
                        Variable_51276.visible = (PvptoneOptions.Field_1118[0] != 0);
                    }
                }
                if (Method_5067(Variable_51276.id, PvptoneOptions.Field_1118[1])) {
                    if (Method_5067(this.layer, PvptoneOptions.Field_1118[1])) {
                        this.drawCenteredString(this.fontRendererObj, PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[49]], Variable_51272 + PvptoneOptions.Field_1118[45], Variable_51273 + PvptoneOptions.Field_1118[46], PvptoneOptions.Field_1118[47]);
                        Variable_51276.visible = (PvptoneOptions.Field_1118[6] != 0);
                        "".length();
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                    else {
                        Variable_51276.visible = (PvptoneOptions.Field_1118[0] != 0);
                    }
                }
            }
            if (Method_5068((Variable_51275 instanceof CheckBox) ? 1 : 0)) {
                final CheckBox Variable_51277 = (CheckBox)Variable_51275;
                if (Method_5067(Variable_51277.id, PvptoneOptions.Field_1118[6])) {
                    if (Method_5067(this.layer, PvptoneOptions.Field_1118[6])) {
                        Variable_51277.visible = (PvptoneOptions.Field_1118[6] != 0);
                        "".length();
                        if (-" ".length() >= "   ".length()) {
                            return;
                        }
                    }
                    else {
                        Variable_51277.visible = (PvptoneOptions.Field_1118[0] != 0);
                    }
                }
                if (Method_5067(Variable_51277.id, PvptoneOptions.Field_1118[13])) {
                    if (Method_5067(this.layer, PvptoneOptions.Field_1118[13])) {
                        Variable_51277.visible = (PvptoneOptions.Field_1118[6] != 0);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        Variable_51277.visible = (PvptoneOptions.Field_1118[0] != 0);
                    }
                }
                if (!Method_5067(Variable_51277.id, PvptoneOptions.Field_1118[2])) {
                    continue;
                }
                if (Method_5067(this.layer, PvptoneOptions.Field_1118[2])) {
                    Variable_51277.visible = (PvptoneOptions.Field_1118[6] != 0);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    Variable_51277.visible = (PvptoneOptions.Field_1118[0] != 0);
                }
            }
        }
        super.drawScreen(Variable_51267, Variable_51266, Variable_51256);
    }
    
    public void Method_5065() {
        (PvptoneOptions.Field_1118 = new int[52])[0] = ((0x4B ^ 0x58 ^ (0x10 ^ 0x25)) & (0xC4 ^ 0xC1 ^ (0xBB ^ 0x98) ^ -" ".length()));
        PvptoneOptions.Field_1118[1] = "  ".length();
        PvptoneOptions.Field_1118[2] = "   ".length();
        PvptoneOptions.Field_1118[3] = (0xF7 ^ 0x8A);
        PvptoneOptions.Field_1118[4] = (0x22 ^ 0x10);
        PvptoneOptions.Field_1118[5] = (0xE3 ^ 0xC4 ^ (0x24 ^ 0x9));
        PvptoneOptions.Field_1118[6] = " ".length();
        PvptoneOptions.Field_1118[7] = (0x9 ^ 0x4F);
        PvptoneOptions.Field_1118[8] = (0x10 ^ 0x4A);
        PvptoneOptions.Field_1118[9] = (0x27 ^ 0x18) + (0x7E ^ 0x0) - (61 + 111 - 91 + 89) + (131 + 12 - 6 + 14);
        PvptoneOptions.Field_1118[10] = (0xE6 ^ 0x93);
        PvptoneOptions.Field_1118[11] = (9 + 169 - 136 + 133 ^ 26 + 14 + 42 + 95);
        PvptoneOptions.Field_1118[12] = (0xAB ^ 0xBF);
        PvptoneOptions.Field_1118[13] = (125 + 169 - 255 + 140 ^ 134 + 119 - 138 + 68);
        PvptoneOptions.Field_1118[14] = (0xEE ^ 0x96);
        PvptoneOptions.Field_1118[15] = (0x82 ^ 0x87);
        PvptoneOptions.Field_1118[16] = (0x7D ^ 0x10) + (0x5A ^ 0x13) - (97 + 103 - 166 + 118) + (0x6 ^ 0x7E);
        PvptoneOptions.Field_1118[17] = (0x53 ^ 0x8 ^ (0xEC ^ 0xB1));
        PvptoneOptions.Field_1118[18] = 163 + 131 - 255 + 178;
        PvptoneOptions.Field_1118[19] = (0x3A ^ 0x3D);
        PvptoneOptions.Field_1118[20] = (0x7D ^ 0x75);
        PvptoneOptions.Field_1118[21] = (0x52 ^ 0x5B);
        PvptoneOptions.Field_1118[22] = (0x55 ^ 0x3B);
        PvptoneOptions.Field_1118[23] = (0x1E ^ 0x15);
        PvptoneOptions.Field_1118[24] = (0x45 ^ 0x3C) + (0x78 ^ 0x11) - (191 + 44 - 187 + 150) + (0xF9 ^ 0x9F);
        PvptoneOptions.Field_1118[25] = (0x45 ^ 0x41 ^ (0x75 ^ 0x7D));
        PvptoneOptions.Field_1118[26] = 94 + 59 - 39 + 66;
        PvptoneOptions.Field_1118[27] = (85 + 128 - 102 + 18 ^ 138 + 32 - 157 + 159);
        PvptoneOptions.Field_1118[28] = (130 + 44 - 164 + 121 ^ 106 + 109 - 119 + 46);
        PvptoneOptions.Field_1118[29] = (0x72 ^ 0x0 ^ (0x21 ^ 0x5D));
        PvptoneOptions.Field_1118[30] = (0x64 ^ 0x48 ^ (0xC6 ^ 0xB5));
        PvptoneOptions.Field_1118[31] = (0xCD ^ 0xC2);
        PvptoneOptions.Field_1118[32] = (0x4D ^ 0x5D);
        PvptoneOptions.Field_1118[33] = (45 + 127 - 154 + 144 ^ 98 + 59 - 24 + 46);
        PvptoneOptions.Field_1118[34] = -" ".length();
        PvptoneOptions.Field_1118[35] = (0xE2 ^ 0xB6 ^ (0x81 ^ 0xC7));
        PvptoneOptions.Field_1118[36] = (0xDB ^ 0xC2);
        PvptoneOptions.Field_1118[37] = (0xFE ^ 0x83 ^ (0x61 ^ 0xF));
        PvptoneOptions.Field_1118[38] = -(0xFFFFCFFF & 0xCDFCB8);
        PvptoneOptions.Field_1118[39] = -(-(0xFFFFABF3 & 0x573D) & (0xFFFFDFFE & 0xDEFFFB));
        PvptoneOptions.Field_1118[40] = -(0xFFFFFFEF & 0xDAD7D3);
        PvptoneOptions.Field_1118[41] = (0x8A ^ 0x9F);
        PvptoneOptions.Field_1118[42] = (0x5F ^ 0x31 ^ (0x52 ^ 0x1F));
        PvptoneOptions.Field_1118[43] = (-(0xFFFFEAE5 & 0x5DDB) & (0xFFFFFDFA & 0x70D17FEF));
        PvptoneOptions.Field_1118[44] = (0x5C ^ 0x22 ^ (0x75 ^ 0x1D));
        PvptoneOptions.Field_1118[45] = (0x1F ^ 0x3E) + (0xED ^ 0xB3) - -"  ".length() + (0x93 ^ 0xBD);
        PvptoneOptions.Field_1118[46] = (0x59 ^ 0x79);
        PvptoneOptions.Field_1118[47] = -(-(0x50 ^ 0x79) & (0xFFFFF8FD & 0xA1F7FE));
        PvptoneOptions.Field_1118[48] = (0x41 ^ 0x21 ^ (0xDD ^ 0xAA));
        PvptoneOptions.Field_1118[49] = (0xD2 ^ 0xBC ^ (0x3 ^ 0x75));
        PvptoneOptions.Field_1118[50] = (0xFF ^ 0xBC ^ (0x22 ^ 0x24));
        PvptoneOptions.Field_1118[51] = (68 + 42 - 48 + 80 ^ 34 + 78 - 57 + 93);
    }
    
    public void Method_5066() {
        (PvptoneOptions.Field_1119 = new String[PvptoneOptions.Field_1118[51]])[PvptoneOptions.Field_1118[0]] = Method_5071("ehwRVILCbM5+Dd/C/yfSSQ==", "Qzjhm");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[6]] = Method_5063("IiwKCi8JNgQB", "lEohF");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[1]] = Method_5063("AyMkKj03Mw==", "YJAFR");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[2]] = Method_5071("1oIVoy2Nlsc=", "rtQeU");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[13]] = Method_5063("Kx0IGAAHCRQ=", "hgmjw");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[15]] = Method_5064("FBJu2G8vgj3FyWNBEcvzzA==", "sQcil");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[17]] = Method_5064("mRRcdzDhV8w=", "QqtUH");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[19]] = Method_5063("JhAoFgs=", "ruKlj");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[20]] = Method_5063("NREyNT0ZBS4=", "vkWGJ");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[21]] = Method_5064("oiXEcAtbJ6zeBSawEnRiLg==", "isxOm");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[5]] = Method_5063("LyoEGRkbOg==", "uCauv");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[23]] = Method_5071("E6g+Ji9HHVg=", "pUQVB");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[25]] = Method_5071("7dAjq3BUCPU=", "BTxyW");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[28]] = Method_5064("oKNZT107NHwE4mLjum5wbGrm4r//ZjfP", "Jftkk");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[29]] = Method_5064("OeY2Tnhrh3uQGz3xQbAZtmX3gXE5krEW", "erJoE");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[31]] = Method_5063("MwwkERcWCW8ZGQYOJBk=", "ccOpm");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[32]] = Method_5063("OjAwJjMfM3I7JBQrcj8zHzoiKj0ZMCU2", "mIROV");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[33]] = Method_5063("LzcWLgYQIQ4q", "dXeCc");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[35]] = Method_5071("a3o0s1w7zi0RcCvf1/TScA==", "bKwJg");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[37]] = Method_5071("/m9E1/z1cXg=", "WUeJM");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[12]] = Method_5063("HRwYHAYoEh4WASw=", "Myjov");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[41]] = Method_5063("ETQeLgwvJ04=", "ABnzc");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[44]] = Method_5071("1Xe+eb9N2+neFqBt5lm98Q==", "XCSCP");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[48]] = Method_5063("PB0MIiUE", "wraRD");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[49]] = Method_5071("Rdpd5UOZPShBmzpSWPMiz36UAyXVsKl0", "vFDRk");
        PvptoneOptions.Field_1119[PvptoneOptions.Field_1118[36]] = Method_5071("kcfhO2GwEDikcVbb1/wTPQ==", "eGelv");
    }
    
    public boolean Method_5067(final int Variable_51281, final int n) {
        return this == Variable_51281;
    }
    
    public boolean Method_5068(final int n) {
        return this != 0;
    }
    
    public PvptoneOptions() {
        this.layer = PvptoneOptions.Field_1118[0];
    }
    
    public boolean Method_5069(final int n) {
        return this == 0;
    }
    
    public boolean Method_5070(final int Variable_51287, final int n) {
        return this < Variable_51287;
    }
    
    public String Method_5071(final String Variable_51294, String Variable_51289) {
        try {
            Variable_51289 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_51294.getBytes(StandardCharsets.UTF_8)), PvptoneOptions.Field_1118[20]), "DES");
            final Cipher Variable_51295 = Cipher.getInstance("DES");
            Variable_51295.init(PvptoneOptions.Field_1118[1], Variable_51289);
            return new String(Variable_51295.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_51296) {
            Variable_51296.printStackTrace();
            return null;
        }
    }
}
