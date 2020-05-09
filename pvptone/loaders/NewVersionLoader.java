package pvptone.loaders;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.net.*;
import java.util.*;
import pvptone.*;

public class NewVersionLoader extends Object<NewVersionLoader>
{
    public boolean newVersion;
    public String[] Field_1033;
    public boolean cos;
    public int[] Field_1034;
    
    public boolean Method_4685(final int n) {
        return this == 0;
    }
    
    public void Method_4686() {
        (NewVersionLoader.Field_1034 = new int[6])[0] = ((0xEB ^ 0xBD) & ~(0xDC ^ 0x8A));
        NewVersionLoader.Field_1034[1] = " ".length();
        NewVersionLoader.Field_1034[2] = "  ".length();
        NewVersionLoader.Field_1034[3] = "   ".length();
        NewVersionLoader.Field_1034[4] = (0x71 ^ 0x6 ^ (0x56 ^ 0x25));
        NewVersionLoader.Field_1034[5] = (0xE4 ^ 0xA9 ^ (0x21 ^ 0x64));
    }
    
    public String Method_4687(final String Variable_47282, String Variable_47287) {
        Variable_47295 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_47287 = new StringBuilder();
        final char[] Variable_47296 = Variable_47282.toCharArray();
        int Variable_47297 = NewVersionLoader.Field_1034[0];
        final byte Variable_47298 = (Object)((String)this).toCharArray();
        final byte Variable_47299 = (byte)Variable_47298.length;
        short Variable_47300 = (short)NewVersionLoader.Field_1034[0];
        while (Method_4689(Variable_47300, Variable_47299)) {
            final char Variable_47301 = Variable_47298[Variable_47300];
            Variable_47287.append((char)(Variable_47301 ^ Variable_47296[Variable_47297 % Variable_47296.length]));
            "".length();
            ++Variable_47297;
            ++Variable_47300;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(Variable_47287);
    }
    
    public void Method_4688() {
        (NewVersionLoader.Field_1033 = new String[NewVersionLoader.Field_1034[4]])[NewVersionLoader.Field_1034[0]] = Method_4690("tD9AaVSVm3qrvqEz3qMSSZoxuVynLdw/FN1vRXxlwZ944RWKsT7rMRZ4Zz6/USmf", "OWxtY");
        NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[1]] = Method_4690("De1BNGWbQTDr4WeOS+ajMw==", "tZwcZ");
        NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[2]] = Method_4687("FyEiUSc9KSseciohIlEiNiQmEiggKw==", "YHGqR");
        NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[3]] = Method_4687("LSM0BwguPywPBA==", "oquLL");
    }
    
    static {
        Method_4686();
        Method_4688();
        NewVersionLoader.newVersion = (NewVersionLoader.Field_1034[0] != 0);
        NewVersionLoader.cos = (NewVersionLoader.Field_1034[0] != 0);
    }
    
    public boolean Method_4689(final int Variable_47298, final int n) {
        return this < Variable_47298;
    }
    
    public String Method_4690(final String Variable_47300, final String Variable_47308) {
        try {
            final SecretKeySpec Variable_47306 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_47300.getBytes(StandardCharsets.UTF_8)), NewVersionLoader.Field_1034[5]), "DES");
            final Cipher Variable_47307 = Cipher.getInstance("DES");
            Variable_47307.init(NewVersionLoader.Field_1034[2], Variable_47306);
            return new String(Variable_47307.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_47308) {
            Variable_47308.printStackTrace();
            return null;
        }
    }
    
    public String load() {
        try {
            final Scanner Variable_47311 = new Scanner(new URL(NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[0]]).openStream());
            "".length();
            if (null != null) {
                return null;
            }
            while (!Method_4685(Variable_47311.hasNext() ? 1 : 0)) {
                final String Variable_47312 = Variable_47311.next();
                if (Method_4685(Variable_47312.equalsIgnoreCase(Config.version) ? 1 : 0)) {
                    NewVersionLoader.newVersion = (NewVersionLoader.Field_1034[1] != 0);
                    Variable_47311.close();
                    return Variable_47312;
                }
            }
            Variable_47311.close();
            return NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[1]];
        }
        catch (Exception Variable_47313) {
            System.out.println(NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[2]]);
            return NewVersionLoader.Field_1033[NewVersionLoader.Field_1034[3]];
        }
    }
}
