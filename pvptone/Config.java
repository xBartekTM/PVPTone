package pvptone;

import pvptone.options.*;
import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.io.*;
import net.minecraft.client.*;

public class Config extends Object<Config>
{
    public Properties prop;
    public Value RedObramowanie;
    public Value GreenKey;
    public Value Perspektywa360;
    public Value isItems;
    public Value isCosmetic;
    public File f;
    public boolean FEATURED;
    public Value GreenObramowanie;
    public Value isKeyRainbow;
    public String version;
    public Value RedCompass;
    public String[] Field_807;
    public Value RedKey;
    public Value isCompassRainbow;
    public Value GreenCompass;
    public Value BlueCompass;
    public Value AlphaObramowanie;
    public Value BlueObramowanie;
    public Value BlueKey;
    public int[] Field_808;
    public Value isWings;
    public Value WidthObramowanie;
    
    public String Method_3634(final String Variable_37049, String Variable_37053) {
        Variable_37052 = (boolean)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_37053 = new StringBuilder();
        final char[] Variable_37054 = Variable_37049.toCharArray();
        int Variable_37055 = Config.Field_808[0];
        final String Variable_37056 = (Object)((String)this).toCharArray();
        final byte Variable_37057 = (byte)Variable_37056.length;
        Exception Variable_37058 = (Exception)Config.Field_808[0];
        while (Method_3640((int)Variable_37058, Variable_37057)) {
            final char Variable_37059 = Variable_37056[Variable_37058];
            Variable_37053.append((char)(Variable_37059 ^ Variable_37054[Variable_37055 % Variable_37054.length]));
            "".length();
            ++Variable_37055;
            ++Variable_37058;
            "".length();
            if (-(0x39 ^ 0x3C) >= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_37053);
    }
    
    public void Method_3635() {
        (Config.Field_808 = new int[49])[0] = ((0xC4 ^ 0x8C) & ~(0xCE ^ 0x86));
        Config.Field_808[1] = " ".length();
        Config.Field_808[2] = "  ".length();
        Config.Field_808[3] = "   ".length();
        Config.Field_808[4] = (0xAC ^ 0xA8);
        Config.Field_808[5] = (63 + 87 - 101 + 91 ^ 9 + 42 + 26 + 60);
        Config.Field_808[6] = (3 + 4 + 119 + 54 ^ 80 + 154 - 213 + 157);
        Config.Field_808[7] = (0x77 ^ 0x70);
        Config.Field_808[8] = (0x77 ^ 0x7F);
        Config.Field_808[9] = (0x1B ^ 0x12);
        Config.Field_808[10] = (0xAD ^ 0xA7);
        Config.Field_808[11] = (0x95 ^ 0x9E);
        Config.Field_808[12] = (0xAE ^ 0xA2);
        Config.Field_808[13] = (0x45 ^ 0x48);
        Config.Field_808[14] = (0xA5 ^ 0xAB);
        Config.Field_808[15] = (0xB7 ^ 0xB8);
        Config.Field_808[16] = (0x23 ^ 0x33);
        Config.Field_808[17] = (0x61 ^ 0x70);
        Config.Field_808[18] = (0x41 ^ 0x53);
        Config.Field_808[19] = (0x8D ^ 0x9E);
        Config.Field_808[20] = (0x4A ^ 0x5E);
        Config.Field_808[21] = (0x5B ^ 0x48 ^ (0x4E ^ 0x48));
        Config.Field_808[22] = (0x7B ^ 0x35 ^ (0x7E ^ 0x26));
        Config.Field_808[23] = (125 + 159 - 273 + 155 ^ 148 + 155 - 170 + 44);
        Config.Field_808[24] = (0x14 ^ 0x74 ^ (0xA ^ 0x72));
        Config.Field_808[25] = (0xE4 ^ 0xB0 ^ (0xC7 ^ 0x8A));
        Config.Field_808[26] = (62 + 19 + 20 + 34 ^ 98 + 58 - 55 + 56);
        Config.Field_808[27] = (0xC0 ^ 0xB8 ^ (0x57 ^ 0x34));
        Config.Field_808[28] = (0x53 ^ 0x4F);
        Config.Field_808[29] = (0xD2 ^ 0x8E ^ (0xC3 ^ 0x82));
        Config.Field_808[30] = (10 + 72 - 13 + 95 ^ 158 + 185 - 216 + 59);
        Config.Field_808[31] = (0x53 ^ 0x14 ^ (0x34 ^ 0x6C));
        Config.Field_808[32] = (0x1F ^ 0x58 ^ (0x79 ^ 0x1E));
        Config.Field_808[33] = (76 + 169 - 169 + 104 ^ 76 + 7 + 46 + 20);
        Config.Field_808[34] = (93 + 59 - 0 + 3 ^ 103 + 14 + 54 + 14);
        Config.Field_808[35] = (0x74 ^ 0x57);
        Config.Field_808[36] = (0x8C ^ 0xA8);
        Config.Field_808[37] = (0x8D ^ 0xA8);
        Config.Field_808[38] = (0x54 ^ 0x72);
        Config.Field_808[39] = (0x56 ^ 0x43 ^ (0x8A ^ 0xB8));
        Config.Field_808[40] = (80 + 59 - 105 + 203 ^ 21 + 107 - 74 + 143);
        Config.Field_808[41] = (0x16 ^ 0x3F);
        Config.Field_808[42] = (0x14 ^ 0x3E);
        Config.Field_808[43] = (0x4F ^ 0x64);
        Config.Field_808[44] = (0x40 ^ 0x6C);
        Config.Field_808[45] = (0x1E ^ 0x33);
        Config.Field_808[46] = (0xEC ^ 0xC2);
        Config.Field_808[47] = (0x61 ^ 0x4E);
        Config.Field_808[48] = (0x1B ^ 0x27 ^ (0x8D ^ 0x81));
    }
    
    public void load() {
        try {
            if (Method_3636(Config.f.exists() ? 1 : 0)) {
                Config.f.createNewFile();
                "".length();
                save();
                return;
            }
            final InputStream Variable_37059 = new FileInputStream(Config.f);
            Config.prop.load(Variable_37059);
            Config.RedKey.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[19]])));
            Config.GreenKey.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[20]])));
            Config.BlueKey.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[21]])));
            Config.isKeyRainbow.setValueState(Boolean.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[22]])));
            Config.RedCompass.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[23]])));
            Config.GreenCompass.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[24]])));
            Config.BlueCompass.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[25]])));
            Config.isCompassRainbow.setValueState(Boolean.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[26]])));
            Config.RedObramowanie.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[27]])));
            Config.GreenObramowanie.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[28]])));
            Config.BlueObramowanie.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[29]])));
            Config.AlphaObramowanie.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[30]])));
            Config.WidthObramowanie.setValueState(Float.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[31]])));
            Config.Perspektywa360.setValueState(Boolean.valueOf(Config.prop.getProperty(Config.Field_807[Config.Field_808[32]])));
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        catch (Exception Variable_37060) {
            ((Throwable)this).printStackTrace();
            save();
        }
    }
    
    public boolean Method_3636(final int n) {
        return this == 0;
    }
    
    public String Method_3637(final String Variable_37065, String Variable_37064) {
        try {
            Variable_37064 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_37065.getBytes(StandardCharsets.UTF_8)), Config.Field_808[8]), "DES");
            final Cipher Variable_37066 = Cipher.getInstance("DES");
            Variable_37066.init(Config.Field_808[2], Variable_37064);
            return new String(Variable_37066.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_37067) {
            Variable_37067.printStackTrace();
            return null;
        }
    }
    
    public void save() {
        try {
            Config.prop.setProperty(Config.Field_807[Config.Field_808[33]], String.valueOf(new StringBuilder().append((float)Config.RedKey.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[34]], String.valueOf(new StringBuilder().append((float)Config.GreenKey.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[35]], String.valueOf(new StringBuilder().append((float)Config.BlueKey.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[36]], String.valueOf(new StringBuilder().append((boolean)Config.isKeyRainbow.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[37]], String.valueOf(new StringBuilder().append((float)Config.RedCompass.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[38]], String.valueOf(new StringBuilder().append((float)Config.GreenCompass.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[39]], String.valueOf(new StringBuilder().append((float)Config.BlueCompass.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[40]], String.valueOf(new StringBuilder().append((boolean)Config.isCompassRainbow.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[41]], String.valueOf(new StringBuilder().append((float)Config.RedObramowanie.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[42]], String.valueOf(new StringBuilder().append((float)Config.GreenObramowanie.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[43]], String.valueOf(new StringBuilder().append((float)Config.BlueObramowanie.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[44]], String.valueOf(new StringBuilder().append((float)Config.AlphaObramowanie.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[45]], String.valueOf(new StringBuilder().append((float)Config.WidthObramowanie.getValueState())));
            "".length();
            Config.prop.setProperty(Config.Field_807[Config.Field_808[46]], String.valueOf(new StringBuilder().append((boolean)Config.Perspektywa360.getValueState())));
            "".length();
            Variable_37073 = new FileOutputStream(Config.f);
            Config.prop.store((OutputStream)this, Config.Field_807[Config.Field_808[47]]);
            "".length();
            if ((0x3F ^ 0x3B) <= -" ".length()) {
                return;
            }
        }
        catch (Exception Variable_37074) {
            Variable_37074.printStackTrace();
        }
    }
    
    public String Method_3638(final String Variable_37076, final String Variable_37081) {
        try {
            final SecretKeySpec Variable_37079 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_37076.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_37080 = Cipher.getInstance("Blowfish");
            Variable_37080.init(Config.Field_808[2], Variable_37079);
            return new String(Variable_37080.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_37081) {
            Variable_37081.printStackTrace();
            return null;
        }
    }
    
    public void Method_3639() {
        (Config.Field_807 = new String[Config.Field_808[48]])[Config.Field_808[0]] = Method_3634("PQsFBhIW", "onaMw");
        Config.Field_807[Config.Field_808[1]] = Method_3637("SYpWceMOnGgLxXHh5aZs1g==", "HJKZa");
        Config.Field_807[Config.Field_808[2]] = Method_3637("tvE3+zvPBAg=", "nuFWX");
        Config.Field_807[Config.Field_808[3]] = Method_3634("PRQODxwCAQs/AA==", "oqjLs");
        Config.Field_807[Config.Field_808[4]] = Method_3637("kXigONBiKap2ZlX5Imm84Q==", "spmzI");
        Config.Field_807[Config.Field_808[5]] = Method_3638("UfsmPlSx3EQUgxw005glwA==", "OLlsM");
        Config.Field_807[Config.Field_808[6]] = Method_3638("SXaSB6RozU6FOVzGfSGazg==", "grwUk");
        Config.Field_807[Config.Field_808[7]] = Method_3638("xwwlUDwhpCTPLkU2KN+9XfFU4Vlje0fY", "RyaVw");
        Config.Field_807[Config.Field_808[8]] = Method_3637("V5LG6i/kwWdD2vud/iSnZA==", "JpOVf");
        Config.Field_807[Config.Field_808[9]] = Method_3638("aN1bikaCKPD78/wbeVxReCpyY5X6xqvo", "sBBWr");
        Config.Field_807[Config.Field_808[10]] = Method_3637("TF3GhrhwW5DnpQ65gDJe9BnFWr5YVL97", "phDfs");
        Config.Field_807[Config.Field_808[11]] = Method_3634("Bwk0PDcJCQ==", "nzcUY");
        Config.Field_807[Config.Field_808[12]] = Method_3637("qP7g6fJS0PnsyUZa1Ao96Q==", "VJMKA");
        Config.Field_807[Config.Field_808[13]] = Method_3638("5Buoh8uZ00k=", "fOCKP");
        Config.Field_807[Config.Field_808[14]] = Method_3634("BxIfLi08AD0lNgEW", "naTKT");
        Config.Field_807[Config.Field_808[15]] = Method_3637("O4gTbYB4uaVSaUL6uEmUvS7vxNghqMic", "xJozP");
        Config.Field_807[Config.Field_808[16]] = Method_3634("BQk4PiYwBz40ITRffH0=", "UlJMV");
        Config.Field_807[Config.Field_808[17]] = Method_3634("eXpfAw==", "ITmAC");
        Config.Field_807[Config.Field_808[18]] = Method_3634("WgcvFBIbOTxKKQQjMAsoBw==", "tWYdF");
        Config.Field_807[Config.Field_808[19]] = Method_3634("HD83GjA3", "NZSQU");
        Config.Field_807[Config.Field_808[20]] = Method_3638("5M9wDYVchWtVct2ZfczD0A==", "AuECR");
        Config.Field_807[Config.Field_808[21]] = Method_3634("IAsSLzIHHg==", "bggJy");
        Config.Field_807[Config.Field_808[22]] = Method_3634("IRAyESgDGyksPg==", "juKCI");
        Config.Field_807[Config.Field_808[23]] = Method_3634("KwEeICEUFBsQPQ==", "ydzcN");
        Config.Field_807[Config.Field_808[24]] = Method_3634("IQgmCBslFS4dFBUJ", "fzCmu");
        Config.Field_807[Config.Field_808[25]] = Method_3637("BCtKLFyC0T+jdzOAtKU9fA==", "nQFtd");
        Config.Field_807[Config.Field_808[26]] = Method_3637("jD7cLk7+CfGwqG3l/VQraKHIpP59enQG", "orlhc");
        Config.Field_807[Config.Field_808[27]] = Method_3634("ECQhAA8wICggGiMvLCo=", "BAEOm");
        Config.Field_807[Config.Field_808[28]] = Method_3634("EBktFgcYCToSBDgcKR0AMg==", "WkHsi");
        Config.Field_807[Config.Field_808[29]] = Method_3638("UXDyVteV/Judm4PvEpLNYg==", "fCjqK");
        Config.Field_807[Config.Field_808[30]] = Method_3638("7sIzJzfrLiM7snewE2Lil5j2faX1xk5l", "tfSPr");
        Config.Field_807[Config.Field_808[31]] = Method_3637("yMVdEb3J2qvf4JkglRezhL0jRqVKwZtl", "OFeaM");
        Config.Field_807[Config.Field_808[32]] = Method_3634("CAskJig9DSI8Lj0=", "XnVUX");
        Config.Field_807[Config.Field_808[33]] = Method_3634("JiAeCCIN", "tEzCG");
        Config.Field_807[Config.Field_808[34]] = Method_3638("QYUi49xUHQIabF0CU2LeqA==", "uYCMd");
        Config.Field_807[Config.Field_808[35]] = Method_3634("CCY6FAYvMw==", "JJOqM");
        Config.Field_807[Config.Field_808[36]] = Method_3634("CR8VPyUrFA4CMw==", "BzlmD");
        Config.Field_807[Config.Field_808[37]] = Method_3638("J/f1uCIr1i921zd7vTS64g==", "xPgjN");
        Config.Field_807[Config.Field_808[38]] = Method_3634("HwU8HyUbGDQKKisE", "XwYzK");
        Config.Field_807[Config.Field_808[39]] = Method_3638("m2xqmZgacknXRsI9pOHh4A==", "eeBJN");
        Config.Field_807[Config.Field_808[40]] = Method_3638("8MgLCE24KSjE7fD4BQCvzwepnK0eD7RE", "aFgbs");
        Config.Field_807[Config.Field_808[41]] = Method_3634("EBERNRgwFRgVDSMaHB8=", "Btuzz");
        Config.Field_807[Config.Field_808[42]] = Method_3634("EjoGEQAaKhEVAzo/AhoHMA==", "UHctn");
        Config.Field_807[Config.Field_808[43]] = Method_3634("DhUXIx0uCwMrPTsYDC83", "LybFR");
        Config.Field_807[Config.Field_808[44]] = Method_3634("AD8JBQAOMQsMDC4kGAMIJA==", "ASyma");
        Config.Field_807[Config.Field_808[45]] = Method_3634("PjkyMSwmMiQkKQYnNystDA==", "iPVED");
        Config.Field_807[Config.Field_808[46]] = Method_3634("OR0RHhsMGxcEHQw=", "ixcmk");
        Config.Field_807[Config.Field_808[47]] = Method_3637("U2VuteBsgpE=", "BBhUD");
    }
    
    public boolean Method_3640(final int Variable_37085, final int n) {
        return this < Variable_37085;
    }
    
    static {
        Method_3635();
        Method_3639();
        Config.FEATURED = (Config.Field_808[0] != 0);
        Config.RedKey = new Value(Config.Field_807[Config.Field_808[0]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.GreenKey = new Value(Config.Field_807[Config.Field_808[1]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.BlueKey = new Value(Config.Field_807[Config.Field_808[2]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.RedCompass = new Value(Config.Field_807[Config.Field_808[3]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.GreenCompass = new Value(Config.Field_807[Config.Field_808[4]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.BlueCompass = new Value(Config.Field_807[Config.Field_808[5]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.RedObramowanie = new Value(Config.Field_807[Config.Field_808[6]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.GreenObramowanie = new Value(Config.Field_807[Config.Field_808[7]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.BlueObramowanie = new Value(Config.Field_807[Config.Field_808[8]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.AlphaObramowanie = new Value(Config.Field_807[Config.Field_808[9]], 1.0f, 0.0f, 1.0f, 1.0);
        Config.WidthObramowanie = new Value(Config.Field_807[Config.Field_808[10]], 1.0f, 0.0f, 10.0f, 1.0);
        Config.isWings = new Value(Config.Field_807[Config.Field_808[11]], (boolean)(Config.Field_808[1] != 0));
        Config.isCosmetic = new Value(Config.Field_807[Config.Field_808[12]], (boolean)(Config.Field_808[1] != 0));
        Config.isItems = new Value(Config.Field_807[Config.Field_808[13]], (boolean)(Config.Field_808[1] != 0));
        Config.isKeyRainbow = new Value(Config.Field_807[Config.Field_808[14]], (boolean)(Config.Field_808[0] != 0));
        Config.isCompassRainbow = new Value(Config.Field_807[Config.Field_808[15]], (boolean)(Config.Field_808[0] != 0));
        Config.Perspektywa360 = new Value(Config.Field_807[Config.Field_808[16]], (boolean)(Config.Field_808[1] != 0));
        Config.version = Config.Field_807[Config.Field_808[17]];
        Config.f = new File(Minecraft.getMinecraft().mcDataDir, Config.Field_807[Config.Field_808[18]]);
        Config.prop = new Properties();
    }
}
