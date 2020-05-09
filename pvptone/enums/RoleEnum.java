package pvptone.enums;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public enum RoleEnum
{
    public RoleEnum Admin;
    public String prefix;
    public int[] Field_1153;
    public RoleEnum Mod;
    public RoleEnum[] ENUM$VALUES;
    public String[] Field_1154;
    
    public void Method_5189() {
        (RoleEnum.Field_1153 = new int[6])[0] = ((0x94 ^ 0x86) & ~(0x9A ^ 0x88));
        RoleEnum.Field_1153[1] = " ".length();
        RoleEnum.Field_1153[2] = "  ".length();
        RoleEnum.Field_1153[3] = "   ".length();
        RoleEnum.Field_1153[4] = (0xEB ^ 0x99 ^ (0x1D ^ 0x6B));
        RoleEnum.Field_1153[5] = (0x40 ^ 0x21 ^ (0xDA ^ 0xB3));
    }
    
    public RoleEnum[] values() {
        final RoleEnum[] enum$VALUES = RoleEnum.ENUM$VALUES;
        final int length;
        final RoleEnum[] array;
        System.arraycopy(enum$VALUES, RoleEnum.Field_1153[0], array = new RoleEnum[length = enum$VALUES.length], RoleEnum.Field_1153[0], length);
        return array;
    }
    
    public String Method_5190(final String Variable_52528, String Variable_52529) {
        Variable_52535 = (byte)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_52529 = new StringBuilder();
        final char[] Variable_52536 = Variable_52528.toCharArray();
        int Variable_52537 = RoleEnum.Field_1153[0];
        final Exception Variable_52538 = (Object)((String)this).toCharArray();
        final char Variable_52539 = (char)Variable_52538.length;
        String Variable_52540 = (String)RoleEnum.Field_1153[0];
        while (Method_5191((int)Variable_52540, Variable_52539)) {
            final char Variable_52541 = Variable_52538[Variable_52540];
            Variable_52529.append((char)(Variable_52541 ^ Variable_52536[Variable_52537 % Variable_52536.length]));
            "".length();
            ++Variable_52537;
            ++Variable_52540;
            "".length();
            if (-(0xB4 ^ 0xB1) >= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_52529);
    }
    
    public RoleEnum(final String Variable_52544, final int Variable_52545, final String Variable_52543) {
        this.prefix = Variable_52543;
    }
    
    public boolean Method_5191(final int Variable_52548, final int n) {
        return this < Variable_52548;
    }
    
    public String Method_5192(final String Variable_52550, final String Variable_52558) {
        try {
            final SecretKeySpec Variable_52556 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_52550.getBytes(StandardCharsets.UTF_8)), RoleEnum.Field_1153[5]), "DES");
            final Cipher Variable_52557 = Cipher.getInstance("DES");
            Variable_52557.init(RoleEnum.Field_1153[2], Variable_52556);
            return new String(Variable_52557.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_52558) {
            Variable_52558.printStackTrace();
            return null;
        }
    }
    
    public RoleEnum valueOf(final String s) {
        return Enum.valueOf(RoleEnum.class, (String)this);
    }
    
    static {
        Method_5189();
        Method_5193();
        RoleEnum.Admin = new RoleEnum(RoleEnum.Field_1154[RoleEnum.Field_1153[0]], RoleEnum.Field_1153[0], RoleEnum.Field_1154[RoleEnum.Field_1153[1]]);
        RoleEnum.Mod = new RoleEnum(RoleEnum.Field_1154[RoleEnum.Field_1153[2]], RoleEnum.Field_1153[1], RoleEnum.Field_1154[RoleEnum.Field_1153[3]]);
        final RoleEnum[] enum$VALUES = new RoleEnum[RoleEnum.Field_1153[2]];
        enum$VALUES[RoleEnum.Field_1153[0]] = RoleEnum.Admin;
        enum$VALUES[RoleEnum.Field_1153[1]] = RoleEnum.Mod;
        RoleEnum.ENUM$VALUES = enum$VALUES;
    }
    
    public void Method_5193() {
        (RoleEnum.Field_1154 = new String[RoleEnum.Field_1153[4]])[RoleEnum.Field_1153[0]] = Method_5190("BzcFHQA=", "FShtn");
        RoleEnum.Field_1154[RoleEnum.Field_1153[1]] = Method_5190("aiVvIAcoKyAiZmpw", "LFILF");
        RoleEnum.Field_1154[RoleEnum.Field_1153[2]] = Method_5190("KR8N", "dpihs");
        RoleEnum.Field_1154[RoleEnum.Field_1153[3]] = Method_5192("0r6Is2o+KkIf/U/26jBVtA==", "nRImT");
    }
}
