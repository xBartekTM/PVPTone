package pvptone.gui.ingame.ui;

import java.text.*;
import java.math.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Info extends Object<Info>
{
    public int[] Field_2967;
    public String[] Field_2968;
    
    public boolean Method_13462(final int n) {
        return this == 0;
    }
    
    public Info() {
        super(Info.Field_2968[Info.Field_2967[0]], Info.Field_2967[1], Info.Field_2967[2]);
    }
    
    static {
        Method_13466();
        Method_13463();
    }
    
    public void Method_13463() {
        (Info.Field_2968 = new String[Info.Field_2967[9]])[Info.Field_2967[0]] = Method_13464("HYqFIwJEz+M=", "jjuOk");
        Info.Field_2968[Info.Field_2967[3]] = Method_13467("R3B7UFo=", "dSUsy");
        Info.Field_2968[Info.Field_2967[5]] = Method_13464("hQfy6t2fglhri6k9y9662Q==", "ILlfP");
        Info.Field_2968[Info.Field_2967[7]] = Method_13465("F+LQha2TKSo=", "sMZGp");
    }
    
    public void renderGameOverlay(final int Variable_140354, final int Variable_140353, final float Variable_140357) {
        if (Method_13462(this.visible ? 1 : 0)) {
            return;
        }
        final int Variable_140358 = this.left;
        final int Variable_140359 = this.top;
        final float Variable_140360 = 0.0f;
        float Variable_140361 = 0.0f;
        try {
            Variable_140361 = (float)this.mc.getNetHandler().getPlayerInfo(this.mc.thePlayer.getName()).getResponseTime();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (NullPointerException ex) {}
        final DecimalFormat Variable_140362 = new DecimalFormat(Info.Field_2968[Info.Field_2967[3]]);
        Variable_140362.setRoundingMode(RoundingMode.DOWN);
        drawRect(this.left - Info.Field_2967[3], this.top, this.right, this.bottom, Info.Field_2967[4]);
        this.fontRenderer.drawString(String.valueOf(new StringBuilder(Info.Field_2968[Info.Field_2967[5]]).append(this.mc.getSession().getUsername())), Variable_140358, Variable_140359, Info.Field_2967[6]);
        "".length();
        this.fontRenderer.drawString(String.valueOf(new StringBuilder(Info.Field_2968[Info.Field_2967[7]]).append((int)Variable_140361)), Variable_140358, Variable_140359 + Info.Field_2967[8], Info.Field_2967[6]);
        "".length();
    }
    
    public String Method_13464(final String Variable_140367, String Variable_140366) {
        try {
            Variable_140366 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_140367.getBytes(StandardCharsets.UTF_8)), Info.Field_2967[10]), "DES");
            final Cipher Variable_140368 = Cipher.getInstance("DES");
            Variable_140368.init(Info.Field_2967[5], Variable_140366);
            return new String(Variable_140368.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_140369) {
            Variable_140369.printStackTrace();
            return null;
        }
    }
    
    public String Method_13465(final String Variable_140377, String Variable_140374) {
        try {
            Variable_140374 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_140377.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_140378 = Cipher.getInstance("Blowfish");
            Variable_140378.init(Info.Field_2967[5], Variable_140374);
            return new String(Variable_140378.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_140379) {
            Variable_140379.printStackTrace();
            return null;
        }
    }
    
    public void Method_13466() {
        (Info.Field_2967 = new int[11])[0] = ((0x69 ^ 0x58) & ~(0x2D ^ 0x1C));
        Info.Field_2967[1] = (0x48 ^ 0x17);
        Info.Field_2967[2] = (0xDD ^ 0xAF ^ (0x6F ^ 0x4));
        Info.Field_2967[3] = " ".length();
        Info.Field_2967[4] = (-(0xFFFFCDE6 & 0x333D) & (0xFFFFDF3F & 0x7A1F3FFF));
        Info.Field_2967[5] = "  ".length();
        Info.Field_2967[6] = -(0xFFFFBF6C & 0x1F5FB3);
        Info.Field_2967[7] = "   ".length();
        Info.Field_2967[8] = (0x45 ^ 0x4F);
        Info.Field_2967[9] = (0x3D ^ 0x3A ^ "   ".length());
        Info.Field_2967[10] = (0x4A ^ 0x42);
    }
    
    public String Method_13467(final String Variable_140383, String Variable_140394) {
        Variable_140391 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_140394 = new StringBuilder();
        final char[] Variable_140395 = Variable_140383.toCharArray();
        int Variable_140396 = Info.Field_2967[0];
        final String Variable_140397 = (Object)((String)this).toCharArray();
        final String Variable_140398 = (String)Variable_140397.length;
        double Variable_140399 = Info.Field_2967[0];
        while (Method_13468((int)Variable_140399, (int)Variable_140398)) {
            final char Variable_140400 = Variable_140397[Variable_140399];
            Variable_140394.append((char)(Variable_140400 ^ Variable_140395[Variable_140396 % Variable_140395.length]));
            "".length();
            ++Variable_140396;
            ++Variable_140399;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_140394);
    }
    
    public boolean Method_13468(final int Variable_140397, final int n) {
        return this < Variable_140397;
    }
}
