package pvptone.loaders;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.net.*;
import java.util.*;

public class BroadcastLoader extends Object<BroadcastLoader>
{
    public HashMap<Long, String> bc;
    public String[] Field_3032;
    public int[] Field_3033;
    
    public String Method_13732(final String Variable_142751, final String Variable_142754) {
        try {
            final SecretKeySpec Variable_142752 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_142751.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_142753 = Cipher.getInstance("Blowfish");
            Variable_142753.init(BroadcastLoader.Field_3033[2], Variable_142752);
            return new String(Variable_142753.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_142754) {
            Variable_142754.printStackTrace();
            return null;
        }
    }
    
    public String Method_13733(final String Variable_142770, String Variable_142759) {
        Variable_142765 = (byte)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_142759 = new StringBuilder();
        final char[] Variable_142771 = Variable_142770.toCharArray();
        int Variable_142772 = BroadcastLoader.Field_3033[0];
        final boolean Variable_142773 = (Object)((String)this).toCharArray();
        final boolean Variable_142774 = Variable_142773.length != 0;
        int Variable_142775 = BroadcastLoader.Field_3033[0];
        while (Method_13736(Variable_142775, Variable_142774 ? 1 : 0)) {
            final char Variable_142776 = Variable_142773[Variable_142775];
            Variable_142759.append((char)(Variable_142776 ^ Variable_142771[Variable_142772 % Variable_142771.length]));
            "".length();
            ++Variable_142772;
            ++Variable_142775;
            "".length();
            if (-(0x24 ^ 0x4C ^ (0x4A ^ 0x26)) > 0) {
                return null;
            }
        }
        return String.valueOf(Variable_142759);
    }
    
    public boolean Method_13734(final int Variable_142774, final int n) {
        return this >= Variable_142774;
    }
    
    public void Method_13735() {
        (BroadcastLoader.Field_3032 = new String[BroadcastLoader.Field_3033[5]])[BroadcastLoader.Field_3033[0]] = Method_13732("h/O3Mgd164GaTd7p2w+HxrKmx30HDp0ttPlqL0PmwmIUT3evsTvQgKbIVg28LZgN", "EhxaX");
        BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[1]] = Method_13733("ew==", "ApkzY");
        BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[2]] = Method_13732("vP+rQOAx6VI=", "DokPG");
        BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[3]] = Method_13737("S6lV+reNRwg=", "oXpao");
        BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[4]] = Method_13733("DyMqTyIlKyMAdzIjKk8nLiYuDC04KQ==", "AJOoW");
    }
    
    public boolean Method_13736(final int Variable_142776, final int n) {
        return this < Variable_142776;
    }
    
    public void load() {
        try {
            final Scanner Variable_142786 = new Scanner(new URL(BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[0]]).openStream());
            "".length();
            if (" ".length() == ((0x89 ^ 0x8D ^ (0x36 ^ 0x53)) & (0x9 ^ 0x31 ^ (0x23 ^ 0x7A) ^ -" ".length()) & (((57 + 108 - 32 + 54 ^ 5 + 79 + 16 + 68) & (182 + 172 - 199 + 60 ^ 171 + 147 - 176 + 54 ^ -" ".length())) ^ -" ".length()))) {
                return;
            }
            while (!Method_13739(Variable_142786.hasNext() ? 1 : 0)) {
                final String[] Variable_142787 = Variable_142786.next().split(BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[1]]);
                String Variable_142788 = BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[2]];
                int Variable_142789 = BroadcastLoader.Field_3033[1];
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
                while (!Method_13734(Variable_142789, Variable_142787.length)) {
                    Variable_142788 = String.valueOf(new StringBuilder(String.valueOf(Variable_142788)).append(BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[3]]).append(Variable_142787[Variable_142789]));
                    ++Variable_142789;
                }
                BroadcastLoader.bc.put(Long.parseLong(Variable_142787[BroadcastLoader.Field_3033[0]]), Variable_142788);
                "".length();
            }
            Variable_142786.close();
            "".length();
            if ("  ".length() < " ".length()) {
                return;
            }
        }
        catch (Exception Variable_142790) {
            System.out.println(BroadcastLoader.Field_3032[BroadcastLoader.Field_3033[4]]);
        }
    }
    
    public String Method_13737(final String Variable_142791, final String Variable_142794) {
        try {
            final SecretKeySpec Variable_142792 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_142791.getBytes(StandardCharsets.UTF_8)), BroadcastLoader.Field_3033[6]), "DES");
            final Cipher Variable_142793 = Cipher.getInstance("DES");
            Variable_142793.init(BroadcastLoader.Field_3033[2], Variable_142792);
            return new String(Variable_142793.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_142794) {
            Variable_142794.printStackTrace();
            return null;
        }
    }
    
    public void Method_13738() {
        (BroadcastLoader.Field_3033 = new int[7])[0] = ((0x22 ^ 0x10) & ~(0xAD ^ 0x9F));
        BroadcastLoader.Field_3033[1] = " ".length();
        BroadcastLoader.Field_3033[2] = "  ".length();
        BroadcastLoader.Field_3033[3] = "   ".length();
        BroadcastLoader.Field_3033[4] = (0x2 ^ 0x61 ^ (0xED ^ 0x8A));
        BroadcastLoader.Field_3033[5] = (0x8 ^ 0xD);
        BroadcastLoader.Field_3033[6] = (0xB1 ^ 0xA3 ^ (0x84 ^ 0x9E));
    }
    
    static {
        Method_13738();
        Method_13735();
        BroadcastLoader.bc = new HashMap<Long, String>();
    }
    
    public boolean Method_13739(final int n) {
        return this == 0;
    }
}
