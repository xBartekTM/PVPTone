package pvptone.loaders;

import pvptone.data.*;
import java.nio.charset.*;
import java.net.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class CapeLoader extends Object<CapeLoader>
{
    public boolean cos;
    public String[] Field_51;
    public List<CapeUser> cape;
    public int[] Field_52;
    
    public boolean Method_219(final int n) {
        return this != 0;
    }
    
    public String Method_220(final String Variable_1910, String Variable_1921) {
        Variable_1914 = (byte)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_1921 = new StringBuilder();
        final char[] Variable_1922 = Variable_1910.toCharArray();
        int Variable_1923 = CapeLoader.Field_52[0];
        final String Variable_1924 = (Object)((String)this).toCharArray();
        final long Variable_1925 = Variable_1924.length;
        Exception Variable_1926 = (Exception)CapeLoader.Field_52[0];
        while (Method_223((int)Variable_1926, (int)Variable_1925)) {
            final char Variable_1927 = Variable_1924[Variable_1926];
            Variable_1921.append((char)(Variable_1927 ^ Variable_1922[Variable_1923 % Variable_1922.length]));
            "".length();
            ++Variable_1923;
            ++Variable_1926;
            "".length();
            if (((0x21 ^ 0x40) & ~(0xCB ^ 0xAA)) > 0) {
                return null;
            }
        }
        return String.valueOf(Variable_1921);
    }
    
    public void Method_221() {
        (CapeLoader.Field_52 = new int[5])[0] = ((0x19 ^ 0x58) & ~(0x1E ^ 0x5F));
        CapeLoader.Field_52[1] = " ".length();
        CapeLoader.Field_52[2] = "  ".length();
        CapeLoader.Field_52[3] = "   ".length();
        CapeLoader.Field_52[4] = (0x47 ^ 0x4F);
    }
    
    public int load() {
        CapeLoader.cape.clear();
        try {
            Variable_1926 = new Scanner(new URL(CapeLoader.Field_51[CapeLoader.Field_52[0]]).openStream());
            "".length();
            if (null != null) {
                return (29 + 74 - 90 + 129 ^ 93 + 170 - 207 + 139) & (0x74 ^ 0x43 ^ (0x19 ^ 0x63) ^ -" ".length());
            }
            while (!Method_225(((Scanner)this).hasNext() ? 1 : 0)) {
                final String[] Variable_1927 = ((Scanner)this).next().split(CapeLoader.Field_51[CapeLoader.Field_52[1]]);
                CapeLoader.cape.add(new CapeUser(Variable_1927[CapeLoader.Field_52[0]], Integer.parseInt(Variable_1927[CapeLoader.Field_52[1]])));
                "".length();
            }
            ((Scanner)this).close();
            return CapeLoader.cape.size();
        }
        catch (Exception Variable_1928) {
            System.out.println(CapeLoader.Field_51[CapeLoader.Field_52[2]]);
            return CapeLoader.Field_52[0];
        }
    }
    
    public String Method_222(final String Variable_1937, String Variable_1936) {
        try {
            Variable_1936 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_1937.getBytes(StandardCharsets.UTF_8)), CapeLoader.Field_52[4]), "DES");
            final Cipher Variable_1938 = Cipher.getInstance("DES");
            Variable_1938.init(CapeLoader.Field_52[2], Variable_1936);
            return new String(Variable_1938.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_1939) {
            Variable_1939.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_223(final int Variable_1940, final int n) {
        return this < Variable_1940;
    }
    
    public void Method_224() {
        (CapeLoader.Field_51 = new String[CapeLoader.Field_52[3]])[CapeLoader.Field_52[0]] = Method_220("DRYSMkhKTRUrBgBXX3ZFSxUDIENLFg82EwsDHidcBg0LbREEEgNsBh0W", "ebfBr");
        CapeLoader.Field_51[CapeLoader.Field_52[1]] = Method_222("bJ3IYmjmBYI=", "VYeWh");
        CapeLoader.Field_51[CapeLoader.Field_52[2]] = Method_220("NRsZNA==", "vziQi");
    }
    
    static {
        Method_221();
        Method_224();
        CapeLoader.cape = new LinkedList<CapeUser>();
        CapeLoader.cos = (CapeLoader.Field_52[0] != 0);
    }
    
    public boolean Method_225(final int n) {
        return this == 0;
    }
    
    public CapeUser getUserByName(String Variable_1943) {
        final boolean Variable_1944 = (boolean)CapeLoader.cape.iterator();
        "".length();
        if (((0x60 ^ 0x58 ^ (0x11 ^ 0x1B)) & (0x7 ^ 0x2F ^ (0x80 ^ 0x9A) ^ -" ".length())) >= "   ".length()) {
            return null;
        }
        while (!Method_225(((Iterator)Variable_1944).hasNext() ? 1 : 0)) {
            Variable_1943 = ((Iterator<CapeUser>)Variable_1944).next();
            if (Method_219(Variable_1943.name.equalsIgnoreCase((String)this) ? 1 : 0)) {
                return Variable_1943;
            }
        }
        return null;
    }
}
