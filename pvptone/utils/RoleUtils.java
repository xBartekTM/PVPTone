package pvptone.utils;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class RoleUtils extends Object<RoleUtils>
{
    public int[] Field_566;
    public String[] Field_567;
    
    public String Method_2638(final String Variable_26253, String Variable_26256) {
        Variable_26266 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_26256 = new StringBuilder();
        final char[] Variable_26267 = Variable_26253.toCharArray();
        int Variable_26268 = RoleUtils.Field_566[0];
        final Exception Variable_26269 = (Object)((String)this).toCharArray();
        final boolean Variable_26270 = Variable_26269.length != 0;
        boolean Variable_26271 = RoleUtils.Field_566[0] != 0;
        while (Method_2640(Variable_26271 ? 1 : 0, Variable_26270 ? 1 : 0)) {
            final char Variable_26272 = Variable_26269[Variable_26271];
            Variable_26256.append((char)(Variable_26272 ^ Variable_26267[Variable_26268 % Variable_26267.length]));
            "".length();
            ++Variable_26268;
            ++Variable_26271;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(Variable_26256);
    }
    
    static {
        Method_2644();
        Method_2642();
    }
    
    public String Method_2639(final String Variable_26272, final String Variable_26276) {
        try {
            final SecretKeySpec Variable_26274 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_26272.getBytes(StandardCharsets.UTF_8)), RoleUtils.Field_566[8]), "DES");
            final Cipher Variable_26275 = Cipher.getInstance("DES");
            Variable_26275.init(RoleUtils.Field_566[2], Variable_26274);
            return new String(Variable_26275.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_26276) {
            Variable_26276.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_2640(final int Variable_26280, final int n) {
        return this < Variable_26280;
    }
    
    public String Method_2641(final String Variable_26281, final String Variable_26285) {
        try {
            final SecretKeySpec Variable_26283 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_26281.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_26284 = Cipher.getInstance("Blowfish");
            Variable_26284.init(RoleUtils.Field_566[2], Variable_26283);
            return new String(Variable_26284.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_26285) {
            Variable_26285.printStackTrace();
            return null;
        }
    }
    
    public void Method_2642() {
        (RoleUtils.Field_567 = new String[RoleUtils.Field_566[9]])[RoleUtils.Field_566[0]] = Method_2638("GjU6Ew4aDw==", "BvUwk");
        RoleUtils.Field_567[RoleUtils.Field_566[1]] = Method_2641("bQjG7oGbaEuoYCKaAF9MYw==", "HWJvT");
        RoleUtils.Field_567[RoleUtils.Field_566[2]] = Method_2641("scsy/SWazYs=", "yLtHu");
        RoleUtils.Field_567[RoleUtils.Field_566[3]] = Method_2638("bSR2HgIPChk8Y21w", "KGPrC");
        RoleUtils.Field_567[RoleUtils.Field_566[4]] = Method_2638("Ay8tATIlGS0LPA==", "DFHsY");
        RoleUtils.Field_567[RoleUtils.Field_566[5]] = Method_2639("6mjM8SKmbP2diQP2eiud4A==", "BdaNd");
        RoleUtils.Field_567[RoleUtils.Field_566[6]] = Method_2641("IGKD1vw3CFjv0BOWABHc0Q==", "AuYlN");
        RoleUtils.Field_567[RoleUtils.Field_566[7]] = Method_2638("UQ9oKgg4Km5gcg==", "wnNFE");
        RoleUtils.Field_567[RoleUtils.Field_566[8]] = Method_2638("", "NyYLe");
    }
    
    public String getPrefix(final String s) {
        if (Method_2643(((String)this).equalsIgnoreCase(RoleUtils.Field_567[RoleUtils.Field_566[0]]) ? 1 : 0)) {
            return RoleUtils.Field_567[RoleUtils.Field_566[1]];
        }
        if (Method_2643(((String)this).equalsIgnoreCase(RoleUtils.Field_567[RoleUtils.Field_566[2]]) ? 1 : 0)) {
            return RoleUtils.Field_567[RoleUtils.Field_566[3]];
        }
        if (Method_2643(((String)this).equalsIgnoreCase(RoleUtils.Field_567[RoleUtils.Field_566[4]]) ? 1 : 0)) {
            return RoleUtils.Field_567[RoleUtils.Field_566[5]];
        }
        if (Method_2643(((String)this).equalsIgnoreCase(RoleUtils.Field_567[RoleUtils.Field_566[6]]) ? 1 : 0)) {
            return RoleUtils.Field_567[RoleUtils.Field_566[7]];
        }
        return RoleUtils.Field_567[RoleUtils.Field_566[8]];
    }
    
    public boolean Method_2643(final int n) {
        return this != 0;
    }
    
    public void Method_2644() {
        (RoleUtils.Field_566 = new int[10])[0] = ((0x34 ^ 0x3E ^ (0xB ^ 0x57)) & (60 + 17 - 30 + 103 ^ 49 + 5 + 85 + 53 ^ -" ".length()));
        RoleUtils.Field_566[1] = " ".length();
        RoleUtils.Field_566[2] = "  ".length();
        RoleUtils.Field_566[3] = "   ".length();
        RoleUtils.Field_566[4] = (0x55 ^ 0x72 ^ (0x81 ^ 0xA2));
        RoleUtils.Field_566[5] = (0x68 ^ 0x6D);
        RoleUtils.Field_566[6] = (11 + 3 + 35 + 88 ^ 86 + 19 - 46 + 84);
        RoleUtils.Field_566[7] = (0xB3 ^ 0xB4);
        RoleUtils.Field_566[8] = (1 + 92 - 46 + 86 ^ 31 + 56 - 12 + 66);
        RoleUtils.Field_566[9] = (46 + 45 + 1 + 37 ^ 5 + 98 - 44 + 77);
    }
}
