package pvptone.options;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public enum OptionsEnum
{
    public int[] Field_232;
    public OptionsEnum BKeys;
    public OptionsEnum[] ENUM$VALUES;
    public OptionsEnum GCompass;
    public float val;
    public OptionsEnum Blue;
    public OptionsEnum RKeys;
    public OptionsEnum Green;
    public OptionsEnum BCompass;
    public OptionsEnum RCompass;
    public String name;
    public OptionsEnum Red;
    public OptionsEnum GKeys;
    public OptionsEnum CompassWidth;
    public OptionsEnum LineWidth;
    public String[] Field_233;
    public OptionsEnum Alpha;
    
    public void Method_1031() {
        (OptionsEnum.Field_232 = new int[26])[0] = ((49 + 110 - 74 + 61 ^ 77 + 149 - 84 + 52) & (0x71 ^ 0x1F ^ (0x75 ^ 0x4B) ^ -" ".length()));
        OptionsEnum.Field_232[1] = " ".length();
        OptionsEnum.Field_232[2] = "  ".length();
        OptionsEnum.Field_232[3] = "   ".length();
        OptionsEnum.Field_232[4] = (0xDB ^ 0x80 ^ (0x6 ^ 0x59));
        OptionsEnum.Field_232[5] = (0x48 ^ 0x4D);
        OptionsEnum.Field_232[6] = (47 + 108 - 11 + 5 ^ 21 + 144 - 43 + 25);
        OptionsEnum.Field_232[7] = (0xEB ^ 0xB5 ^ (0x6D ^ 0x34));
        OptionsEnum.Field_232[8] = (0x19 ^ 0x11);
        OptionsEnum.Field_232[9] = (120 + 4 - 51 + 54 ^ (0x60 ^ 0x16));
        OptionsEnum.Field_232[10] = (118 + 81 - 39 + 11 ^ 13 + 158 - 155 + 145);
        OptionsEnum.Field_232[11] = (0xA5 ^ 0x95 ^ (0x75 ^ 0x4E));
        OptionsEnum.Field_232[12] = 90 + 29 + 11 + 70;
        OptionsEnum.Field_232[13] = (0x54 ^ 0x13 ^ (0x37 ^ 0x7C));
        OptionsEnum.Field_232[14] = (0x35 ^ 0x2B ^ (0x61 ^ 0x72));
        OptionsEnum.Field_232[15] = (0x1D ^ 0x13);
        OptionsEnum.Field_232[16] = (58 + 115 - 127 + 101 ^ 73 + 107 - 63 + 39);
        OptionsEnum.Field_232[17] = (0x2C ^ 0x9 ^ (0x85 ^ 0xB0));
        OptionsEnum.Field_232[18] = (111 + 69 - 95 + 76 ^ 167 + 77 - 160 + 92);
        OptionsEnum.Field_232[19] = (0x37 ^ 0x25);
        OptionsEnum.Field_232[20] = (0xA6 ^ 0xB5);
        OptionsEnum.Field_232[21] = (0x31 ^ 0x25);
        OptionsEnum.Field_232[22] = (0xE ^ 0x3D ^ (0x29 ^ 0xF));
        OptionsEnum.Field_232[23] = (0xD9 ^ 0x9A ^ (0x58 ^ 0xD));
        OptionsEnum.Field_232[24] = (0x81 ^ 0x96);
        OptionsEnum.Field_232[25] = (((0x3 ^ 0x42) & ~(0xD2 ^ 0x93)) ^ (0x54 ^ 0x4C));
    }
    
    public OptionsEnum getByName(String Variable_9789) {
        final boolean Variable_9791;
        final String Variable_9790 = (String)((OptionsEnum[])(Object)(Variable_9791 = (boolean)(Object)values())).length;
        char Variable_9792 = (char)OptionsEnum.Field_232[0];
        "".length();
        if ((0x1A ^ 0x1E) <= 0) {
            return null;
        }
        while (!Method_1037(Variable_9792, (int)Variable_9790)) {
            Variable_9789 = Variable_9791[Variable_9792];
            if (Method_1038(Variable_9789.name.equalsIgnoreCase((String)this) ? 1 : 0)) {
                return Variable_9789;
            }
            ++Variable_9792;
        }
        return null;
    }
    
    public String Method_1032(final String Variable_9802, String Variable_9798) {
        Variable_9804 = (int)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_9798 = new StringBuilder();
        final char[] Variable_9805 = Variable_9802.toCharArray();
        int Variable_9806 = OptionsEnum.Field_232[0];
        final byte Variable_9807 = (Object)((String)this).toCharArray();
        final boolean Variable_9808 = Variable_9807.length != 0;
        short Variable_9809 = (short)OptionsEnum.Field_232[0];
        while (Method_1033(Variable_9809, Variable_9808 ? 1 : 0)) {
            final char Variable_9810 = Variable_9807[Variable_9809];
            Variable_9798.append((char)(Variable_9810 ^ Variable_9805[Variable_9806 % Variable_9805.length]));
            "".length();
            ++Variable_9806;
            ++Variable_9809;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(Variable_9798);
    }
    
    public OptionsEnum[] values() {
        final OptionsEnum[] enum$VALUES = OptionsEnum.ENUM$VALUES;
        final int length;
        final OptionsEnum[] array;
        System.arraycopy(enum$VALUES, OptionsEnum.Field_232[0], array = new OptionsEnum[length = enum$VALUES.length], OptionsEnum.Field_232[0], length);
        return array;
    }
    
    public boolean Method_1033(final int Variable_9811, final int n) {
        return this < Variable_9811;
    }
    
    public OptionsEnum(final String Variable_9813, final int Variable_9815, final String Variable_9818, final int Variable_9814) {
        this.name = Variable_9818;
        this.val = (float)Variable_9814;
    }
    
    public void Method_1034() {
        (OptionsEnum.Field_233 = new String[OptionsEnum.Field_232[25]])[OptionsEnum.Field_232[0]] = Method_1036("HzN4egW2HwY=", "FYpMw");
        OptionsEnum.Field_233[OptionsEnum.Field_232[1]] = Method_1032("Gw==", "ItivE");
        OptionsEnum.Field_233[OptionsEnum.Field_232[2]] = Method_1032("CBg2Kxg=", "OjSNv");
        OptionsEnum.Field_233[OptionsEnum.Field_232[3]] = Method_1035("Tw3GqwslGKU=", "wWnLX");
        OptionsEnum.Field_233[OptionsEnum.Field_232[4]] = Method_1032("BTY2Mg==", "GZCWM");
        OptionsEnum.Field_233[OptionsEnum.Field_232[5]] = Method_1032("LA==", "nUbNe");
        OptionsEnum.Field_233[OptionsEnum.Field_232[6]] = Method_1032("Fj0hASI=", "WQQiC");
        OptionsEnum.Field_233[OptionsEnum.Field_232[7]] = Method_1032("Li4RODg=", "oBaPY");
        OptionsEnum.Field_233[OptionsEnum.Field_232[8]] = Method_1036("FURtBMAQMzkOoRiYjnDoig==", "ggaAG");
        OptionsEnum.Field_233[OptionsEnum.Field_232[9]] = Method_1036("x7zj2FhnVWlKDllRpXEdxg==", "XhWwL");
        OptionsEnum.Field_233[OptionsEnum.Field_232[10]] = Method_1036("CjeEpXgKRY7AEjLaYiTHPQ==", "KGUgV");
        OptionsEnum.Field_233[OptionsEnum.Field_232[11]] = Method_1032("NR4KMzIFAjAqNwIZ", "vqgCS");
        OptionsEnum.Field_233[OptionsEnum.Field_232[13]] = Method_1032("FSULBSgmFRc=", "GfdhX");
        OptionsEnum.Field_233[OptionsEnum.Field_232[14]] = Method_1035("BJ7NCMNI8KUsttbvekxprA==", "Rgrjb");
        OptionsEnum.Field_233[OptionsEnum.Field_232[15]] = Method_1032("PTkmKiQbCTo=", "zzIGT");
        OptionsEnum.Field_233[OptionsEnum.Field_232[16]] = Method_1032("Jh4RIzkiAxk2NhIf", "altFW");
        OptionsEnum.Field_233[OptionsEnum.Field_232[17]] = Method_1036("ZWwyK1ZHyRLv0tOAvium+A==", "NloSU");
        OptionsEnum.Field_233[OptionsEnum.Field_232[18]] = Method_1035("OMS50h9APxlM+6F72ZxVKw==", "EGgvA");
        OptionsEnum.Field_233[OptionsEnum.Field_232[19]] = Method_1036("95oddL4oM6U=", "Tfjav");
        OptionsEnum.Field_233[OptionsEnum.Field_232[20]] = Method_1036("uf+EcnqQrQg=", "NTIuw");
        OptionsEnum.Field_233[OptionsEnum.Field_232[21]] = Method_1036("kp+eBWE9iBQ=", "jDPOd");
        OptionsEnum.Field_233[OptionsEnum.Field_232[22]] = Method_1036("KXYfs9bSHYPqWNsmcTghNw==", "VSzqm");
        OptionsEnum.Field_233[OptionsEnum.Field_232[23]] = Method_1032("MC8UEAU=", "rdqiv");
        OptionsEnum.Field_233[OptionsEnum.Field_232[24]] = Method_1036("Rz3ViwOujhphJfc19zVA1g==", "WRVmE");
    }
    
    public String Method_1035(final String Variable_9821, final String Variable_9826) {
        try {
            final SecretKeySpec Variable_9824 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_9821.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_9825 = Cipher.getInstance("Blowfish");
            Variable_9825.init(OptionsEnum.Field_232[2], Variable_9824);
            return new String(Variable_9825.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_9826) {
            Variable_9826.printStackTrace();
            return null;
        }
    }
    
    public OptionsEnum valueOf(final String s) {
        return Enum.valueOf(OptionsEnum.class, (String)this);
    }
    
    static {
        Method_1031();
        Method_1034();
        OptionsEnum.Red = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[0]], OptionsEnum.Field_232[0], OptionsEnum.Field_233[OptionsEnum.Field_232[1]], OptionsEnum.Field_232[1]);
        OptionsEnum.Green = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[2]], OptionsEnum.Field_232[1], OptionsEnum.Field_233[OptionsEnum.Field_232[3]], OptionsEnum.Field_232[1]);
        OptionsEnum.Blue = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[4]], OptionsEnum.Field_232[2], OptionsEnum.Field_233[OptionsEnum.Field_232[5]], OptionsEnum.Field_232[1]);
        OptionsEnum.Alpha = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[6]], OptionsEnum.Field_232[3], OptionsEnum.Field_233[OptionsEnum.Field_232[7]], OptionsEnum.Field_232[1]);
        OptionsEnum.LineWidth = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[8]], OptionsEnum.Field_232[4], OptionsEnum.Field_233[OptionsEnum.Field_232[9]], OptionsEnum.Field_232[4]);
        OptionsEnum.CompassWidth = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[10]], OptionsEnum.Field_232[5], OptionsEnum.Field_233[OptionsEnum.Field_232[11]], OptionsEnum.Field_232[12]);
        OptionsEnum.RCompass = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[13]], OptionsEnum.Field_232[6], OptionsEnum.Field_233[OptionsEnum.Field_232[14]], OptionsEnum.Field_232[0]);
        OptionsEnum.GCompass = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[15]], OptionsEnum.Field_232[7], OptionsEnum.Field_233[OptionsEnum.Field_232[16]], OptionsEnum.Field_232[0]);
        OptionsEnum.BCompass = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[17]], OptionsEnum.Field_232[8], OptionsEnum.Field_233[OptionsEnum.Field_232[18]], OptionsEnum.Field_232[0]);
        OptionsEnum.RKeys = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[19]], OptionsEnum.Field_232[9], OptionsEnum.Field_233[OptionsEnum.Field_232[20]], OptionsEnum.Field_232[0]);
        OptionsEnum.GKeys = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[21]], OptionsEnum.Field_232[10], OptionsEnum.Field_233[OptionsEnum.Field_232[22]], OptionsEnum.Field_232[0]);
        OptionsEnum.BKeys = new OptionsEnum(OptionsEnum.Field_233[OptionsEnum.Field_232[23]], OptionsEnum.Field_232[11], OptionsEnum.Field_233[OptionsEnum.Field_232[24]], OptionsEnum.Field_232[0]);
        final OptionsEnum[] enum$VALUES = new OptionsEnum[OptionsEnum.Field_232[13]];
        enum$VALUES[OptionsEnum.Field_232[0]] = OptionsEnum.Red;
        enum$VALUES[OptionsEnum.Field_232[1]] = OptionsEnum.Green;
        enum$VALUES[OptionsEnum.Field_232[2]] = OptionsEnum.Blue;
        enum$VALUES[OptionsEnum.Field_232[3]] = OptionsEnum.Alpha;
        enum$VALUES[OptionsEnum.Field_232[4]] = OptionsEnum.LineWidth;
        enum$VALUES[OptionsEnum.Field_232[5]] = OptionsEnum.CompassWidth;
        enum$VALUES[OptionsEnum.Field_232[6]] = OptionsEnum.RCompass;
        enum$VALUES[OptionsEnum.Field_232[7]] = OptionsEnum.GCompass;
        enum$VALUES[OptionsEnum.Field_232[8]] = OptionsEnum.BCompass;
        enum$VALUES[OptionsEnum.Field_232[9]] = OptionsEnum.RKeys;
        enum$VALUES[OptionsEnum.Field_232[10]] = OptionsEnum.GKeys;
        enum$VALUES[OptionsEnum.Field_232[11]] = OptionsEnum.BKeys;
        OptionsEnum.ENUM$VALUES = enum$VALUES;
    }
    
    public String Method_1036(final String Variable_9831, String Variable_9833) {
        try {
            Variable_9833 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_9831.getBytes(StandardCharsets.UTF_8)), OptionsEnum.Field_232[8]), "DES");
            final Cipher Variable_9834 = Cipher.getInstance("DES");
            Variable_9834.init(OptionsEnum.Field_232[2], Variable_9833);
            return new String(Variable_9834.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_9835) {
            Variable_9835.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_1037(final int Variable_9840, final int n) {
        return this >= Variable_9840;
    }
    
    public boolean Method_1038(final int n) {
        return this != 0;
    }
}
