package pvptone.gui.ingame.ui;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.client.*;

public class FPS extends Object<FPS>
{
    public String[] Field_364;
    public int[] Field_365;
    
    public String Method_1654(final String Variable_16362, String Variable_16360) {
        try {
            Variable_16360 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_16362.getBytes(StandardCharsets.UTF_8)), FPS.Field_365[11]), "DES");
            final Cipher Variable_16363 = Cipher.getInstance("DES");
            Variable_16363.init(FPS.Field_365[10], Variable_16360);
            return new String(Variable_16363.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_16364) {
            Variable_16364.printStackTrace();
            return null;
        }
    }
    
    public void renderGameOverlay(final int Variable_16376, final int Variable_16370, final float Variable_16369) {
        if (Method_1658(this.visible ? 1 : 0)) {
            return;
        }
        final int Variable_16377 = this.left;
        final int Variable_16378 = this.top;
        drawRect(this.left - FPS.Field_365[3], this.top, this.right + FPS.Field_365[4], this.bottom, FPS.Field_365[5]);
        this.fontRenderer.drawCenteredString(this.mc.fontRendererObj, String.valueOf(new StringBuilder(FPS.Field_364[FPS.Field_365[6]]).append(Minecraft.getDebugFPS())), (float)(Variable_16377 + FPS.Field_365[7]), (float)(Variable_16378 + FPS.Field_365[8]), FPS.Field_365[9]);
    }
    
    public FPS() {
        super(FPS.Field_364[FPS.Field_365[0]], FPS.Field_365[1], FPS.Field_365[2]);
    }
    
    public void Method_1655() {
        (FPS.Field_365 = new int[12])[0] = ((0x75 ^ 0x2F ^ (0x4A ^ 0x1A)) & (120 + 148 - 123 + 9 ^ 48 + 60 - 106 + 142 ^ -" ".length()));
        FPS.Field_365[1] = (0x3F ^ 0x1C);
        FPS.Field_365[2] = (6 + 111 - 95 + 115 ^ 105 + 66 - 117 + 80);
        FPS.Field_365[3] = (0x3F ^ 0x35);
        FPS.Field_365[4] = (0x51 ^ 0x54);
        FPS.Field_365[5] = (-(0xFFFFFDF7 & 0x22CB) & (0xFFFFBEFF & 0x7A1F7FDE));
        FPS.Field_365[6] = " ".length();
        FPS.Field_365[7] = (0x9E ^ 0x8E);
        FPS.Field_365[8] = (0x7A ^ 0x16 ^ (0x75 ^ 0x1D));
        FPS.Field_365[9] = -(0xFFFFDFA4 & 0x1F3F7B);
        FPS.Field_365[10] = "  ".length();
        FPS.Field_365[11] = (0x82 ^ 0x8A);
    }
    
    static {
        Method_1655();
        Method_1656();
    }
    
    public void Method_1656() {
        (FPS.Field_364 = new String[FPS.Field_365[10]])[FPS.Field_365[0]] = Method_1654("rSY3a7XrwR0=", "zeYhR");
        FPS.Field_364[FPS.Field_365[6]] = Method_1659("KiQjeW8=", "ltpCO");
    }
    
    public boolean Method_1657(final int Variable_16381, final int n) {
        return this < Variable_16381;
    }
    
    public boolean Method_1658(final int n) {
        return this == 0;
    }
    
    public String Method_1659(final String Variable_16383, String Variable_16386) {
        Variable_16388 = (short)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_16386 = new StringBuilder();
        final char[] Variable_16389 = Variable_16383.toCharArray();
        int Variable_16390 = FPS.Field_365[0];
        final byte Variable_16391 = (Object)((String)this).toCharArray();
        final char Variable_16392 = (char)Variable_16391.length;
        long Variable_16393 = FPS.Field_365[0];
        while (Method_1657((int)Variable_16393, Variable_16392)) {
            final char Variable_16394 = Variable_16391[Variable_16393];
            Variable_16386.append((char)(Variable_16394 ^ Variable_16389[Variable_16390 % Variable_16389.length]));
            "".length();
            ++Variable_16390;
            ++Variable_16393;
            "".length();
            if ((153 + 64 - 157 + 136 ^ 88 + 46 - 34 + 92) != (0xA6 ^ 0x95 ^ (0x85 ^ 0xB2))) {
                return null;
            }
        }
        return String.valueOf(Variable_16386);
    }
}
