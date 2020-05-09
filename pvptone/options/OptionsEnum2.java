package pvptone.options;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public enum OptionsEnum2
{
    public OptionsEnum2 Discord;
    public boolean val;
    public OptionsEnum2[] ENUM$VALUES;
    public String name;
    public OptionsEnum2 AutoSprint;
    public int[] Field_3157;
    public OptionsEnum2 Wings;
    public String[] Field_3158;
    public OptionsEnum2 Items;
    public OptionsEnum2 Hat;
    public OptionsEnum2 Animation;
    public OptionsEnum2 Camera;
    
    public OptionsEnum2[] values() {
        final OptionsEnum2[] enum$VALUES = OptionsEnum2.ENUM$VALUES;
        final int length;
        final OptionsEnum2[] array;
        System.arraycopy(enum$VALUES, OptionsEnum2.Field_3157[0], array = new OptionsEnum2[length = enum$VALUES.length], OptionsEnum2.Field_3157[0], length);
        return array;
    }
    
    public void Method_14398() {
        (OptionsEnum2.Field_3158 = new String[OptionsEnum2.Field_3157[14]])[OptionsEnum2.Field_3157[0]] = Method_14400("OwcZLxs=", "lnwHh");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[1]] = Method_14405("/ffEV7EGbSo=", "hfSXY");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[2]] = Method_14400("CgcwOh8=", "CsUWl");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[3]] = Method_14405("PIpkteAy2Mc=", "ofUuW");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[4]] = Method_14405("jPj3r7UkuXU=", "LCKqz");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[5]] = Method_14404("bKX5QedUXco=", "SGKNH");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[6]] = Method_14405("AiCGnD2vW5I=", "tPViM");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[7]] = Method_14405("QD+xaxvQQ04=", "THQHI");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[8]] = Method_14400("BgsjIgYzDCUh", "GeJOg");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[9]] = Method_14404("9F8Z81mFwNxNewDMtTqb3A==", "JHJuv");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[10]] = Method_14400("FCEAHxQlJh0eMw==", "UTtpG");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[11]] = Method_14404("c5n42AYWFDKB5GpDVoW+xQ==", "Azmij");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[12]] = Method_14400("ECc4BD8mKg==", "TNKgP");
        OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[13]] = Method_14400("NAY0CBwCCw==", "poGks");
    }
    
    static {
        Method_14403();
        Method_14398();
        OptionsEnum2.Wings = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[0]], OptionsEnum2.Field_3157[0], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[1]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        OptionsEnum2.Items = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[2]], OptionsEnum2.Field_3157[1], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[3]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        OptionsEnum2.Hat = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[4]], OptionsEnum2.Field_3157[2], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[5]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        OptionsEnum2.Camera = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[6]], OptionsEnum2.Field_3157[3], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[7]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        OptionsEnum2.Animation = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[8]], OptionsEnum2.Field_3157[4], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[9]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        OptionsEnum2.AutoSprint = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[10]], OptionsEnum2.Field_3157[5], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[11]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        OptionsEnum2.Discord = new OptionsEnum2(OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[12]], OptionsEnum2.Field_3157[6], OptionsEnum2.Field_3158[OptionsEnum2.Field_3157[13]], (boolean)(OptionsEnum2.Field_3157[1] != 0));
        final OptionsEnum2[] enum$VALUES = new OptionsEnum2[OptionsEnum2.Field_3157[7]];
        enum$VALUES[OptionsEnum2.Field_3157[0]] = OptionsEnum2.Wings;
        enum$VALUES[OptionsEnum2.Field_3157[1]] = OptionsEnum2.Items;
        enum$VALUES[OptionsEnum2.Field_3157[2]] = OptionsEnum2.Hat;
        enum$VALUES[OptionsEnum2.Field_3157[3]] = OptionsEnum2.Camera;
        enum$VALUES[OptionsEnum2.Field_3157[4]] = OptionsEnum2.Animation;
        enum$VALUES[OptionsEnum2.Field_3157[5]] = OptionsEnum2.AutoSprint;
        enum$VALUES[OptionsEnum2.Field_3157[6]] = OptionsEnum2.Discord;
        OptionsEnum2.ENUM$VALUES = enum$VALUES;
    }
    
    public OptionsEnum2 getByName(String Variable_149291) {
        final Exception Variable_149293;
        final double Variable_149292 = ((OptionsEnum2[])(Object)(Variable_149293 = (Exception)(Object)values())).length;
        long Variable_149294 = OptionsEnum2.Field_3157[0];
        "".length();
        if (" ".length() >= "  ".length()) {
            return null;
        }
        while (!Method_14399((int)Variable_149294, (int)Variable_149292)) {
            Variable_149291 = Variable_149293[Variable_149294];
            if (Method_14401(Variable_149291.name.equalsIgnoreCase((String)this) ? 1 : 0)) {
                return Variable_149291;
            }
            ++Variable_149294;
        }
        return null;
    }
    
    public boolean Method_14399(final int Variable_149298, final int n) {
        return this >= Variable_149298;
    }
    
    public OptionsEnum2 valueOf(final String s) {
        return Enum.valueOf(OptionsEnum2.class, (String)this);
    }
    
    public String Method_14400(final String Variable_149306, String Variable_149313) {
        Variable_149304 = (float)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_149313 = new StringBuilder();
        final char[] Variable_149314 = Variable_149306.toCharArray();
        int Variable_149315 = OptionsEnum2.Field_3157[0];
        final short Variable_149316 = (Object)((String)this).toCharArray();
        final char Variable_149317 = (char)Variable_149316.length;
        double Variable_149318 = OptionsEnum2.Field_3157[0];
        while (Method_14402((int)Variable_149318, Variable_149317)) {
            final char Variable_149319 = Variable_149316[Variable_149318];
            Variable_149313.append((char)(Variable_149319 ^ Variable_149314[Variable_149315 % Variable_149314.length]));
            "".length();
            ++Variable_149315;
            ++Variable_149318;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_149313);
    }
    
    public boolean Method_14401(final int n) {
        return this != 0;
    }
    
    public boolean Method_14402(final int Variable_149317, final int n) {
        return this < Variable_149317;
    }
    
    public void Method_14403() {
        (OptionsEnum2.Field_3157 = new int[15])[0] = ((0x53 ^ 0x10) & ~(0x56 ^ 0x15));
        OptionsEnum2.Field_3157[1] = " ".length();
        OptionsEnum2.Field_3157[2] = "  ".length();
        OptionsEnum2.Field_3157[3] = "   ".length();
        OptionsEnum2.Field_3157[4] = (0x8A ^ 0x8E);
        OptionsEnum2.Field_3157[5] = (0x76 ^ 0x41 ^ (0x3C ^ 0xE));
        OptionsEnum2.Field_3157[6] = (0 + 34 - 3 + 126 ^ 100 + 147 - 224 + 132);
        OptionsEnum2.Field_3157[7] = (98 + 89 - 61 + 30 ^ 72 + 76 - 113 + 120);
        OptionsEnum2.Field_3157[8] = (0x6 ^ 0xE);
        OptionsEnum2.Field_3157[9] = (0x5D ^ 0x1F ^ (0xE8 ^ 0xA3));
        OptionsEnum2.Field_3157[10] = (0x13 ^ 0x19);
        OptionsEnum2.Field_3157[11] = (0x55 ^ 0x5E);
        OptionsEnum2.Field_3157[12] = (0x9B ^ 0x97);
        OptionsEnum2.Field_3157[13] = ("   ".length() ^ (0x1C ^ 0x12));
        OptionsEnum2.Field_3157[14] = (0x6E ^ 0x31 ^ (0x39 ^ 0x68));
    }
    
    public String Method_14404(final String Variable_149325, String Variable_149321) {
        try {
            Variable_149321 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_149325.getBytes(StandardCharsets.UTF_8)), OptionsEnum2.Field_3157[8]), "DES");
            final Cipher Variable_149326 = Cipher.getInstance("DES");
            Variable_149326.init(OptionsEnum2.Field_3157[2], Variable_149321);
            return new String(Variable_149326.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_149327) {
            Variable_149327.printStackTrace();
            return null;
        }
    }
    
    public String Method_14405(final String Variable_149329, String Variable_149332) {
        try {
            Variable_149332 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_149329.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_149333 = Cipher.getInstance("Blowfish");
            Variable_149333.init(OptionsEnum2.Field_3157[2], Variable_149332);
            return new String(Variable_149333.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_149334) {
            Variable_149334.printStackTrace();
            return null;
        }
    }
    
    public OptionsEnum2(final String Variable_149341, final int Variable_149342, final String Variable_149340, final boolean Variable_149337) {
        this.name = Variable_149340;
        this.val = Variable_149337;
    }
}
