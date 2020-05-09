package pvptone.enums;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public enum LoadType
{
    public LoadType HAT;
    public LoadType ITEMS;
    public int[] Field_3063;
    public String[] Field_3064;
    public LoadType TAIL;
    public LoadType[] ENUM$VALUES;
    public LoadType WINGS;
    
    public void Method_13847() {
        (LoadType.Field_3063 = new int[5])[0] = ((0x2D ^ 0x7C) & ~(0xD7 ^ 0x86));
        LoadType.Field_3063[1] = " ".length();
        LoadType.Field_3063[2] = "  ".length();
        LoadType.Field_3063[3] = "   ".length();
        LoadType.Field_3063[4] = (0xF3 ^ 0xA0 ^ (0xC4 ^ 0x93));
    }
    
    public void Method_13848() {
        (LoadType.Field_3064 = new String[LoadType.Field_3063[4]])[LoadType.Field_3063[0]] = Method_13849("+6coJLv7AZs=", "LtRif");
        LoadType.Field_3064[LoadType.Field_3063[1]] = Method_13851("Dww7LDs=", "XEukh");
        LoadType.Field_3064[LoadType.Field_3063[2]] = Method_13851("BhgX", "NYCXO");
        LoadType.Field_3064[LoadType.Field_3063[3]] = Method_13849("2mcTBOXXBME=", "nEFst");
    }
    
    public String Method_13849(final String Variable_143848, String Variable_143849) {
        try {
            Variable_143849 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_143848.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_143850 = Cipher.getInstance("Blowfish");
            Variable_143850.init(LoadType.Field_3063[2], Variable_143849);
            return new String(Variable_143850.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_143851) {
            Variable_143851.printStackTrace();
            return null;
        }
    }
    
    public LoadType valueOf(final String s) {
        return Enum.valueOf(LoadType.class, (String)this);
    }
    
    public boolean Method_13850(final int Variable_143857, final int n) {
        return this < Variable_143857;
    }
    
    static {
        Method_13847();
        Method_13848();
        LoadType.ITEMS = new LoadType(LoadType.Field_3064[LoadType.Field_3063[0]], LoadType.Field_3063[0]);
        LoadType.WINGS = new LoadType(LoadType.Field_3064[LoadType.Field_3063[1]], LoadType.Field_3063[1]);
        LoadType.HAT = new LoadType(LoadType.Field_3064[LoadType.Field_3063[2]], LoadType.Field_3063[2]);
        LoadType.TAIL = new LoadType(LoadType.Field_3064[LoadType.Field_3063[3]], LoadType.Field_3063[3]);
        final LoadType[] enum$VALUES = new LoadType[LoadType.Field_3063[4]];
        enum$VALUES[LoadType.Field_3063[0]] = LoadType.ITEMS;
        enum$VALUES[LoadType.Field_3063[1]] = LoadType.WINGS;
        enum$VALUES[LoadType.Field_3063[2]] = LoadType.HAT;
        enum$VALUES[LoadType.Field_3063[3]] = LoadType.TAIL;
        LoadType.ENUM$VALUES = enum$VALUES;
    }
    
    public LoadType(final String Variable_143860, final int Variable_143859) {
    }
    
    public String Method_13851(final String Variable_143865, String Variable_143866) {
        Variable_143870 = (float)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_143866 = new StringBuilder();
        final char[] Variable_143871 = Variable_143865.toCharArray();
        int Variable_143872 = LoadType.Field_3063[0];
        final char Variable_143873 = (Object)((String)this).toCharArray();
        final Exception Variable_143874 = (Exception)Variable_143873.length;
        Exception Variable_143875 = (Exception)LoadType.Field_3063[0];
        while (Method_13850((int)Variable_143875, (int)Variable_143874)) {
            final char Variable_143876 = Variable_143873[Variable_143875];
            Variable_143866.append((char)(Variable_143876 ^ Variable_143871[Variable_143872 % Variable_143871.length]));
            "".length();
            ++Variable_143872;
            ++Variable_143875;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_143866);
    }
    
    public LoadType[] values() {
        final LoadType[] enum$VALUES = LoadType.ENUM$VALUES;
        final int length;
        final LoadType[] array;
        System.arraycopy(enum$VALUES, LoadType.Field_3063[0], array = new LoadType[length = enum$VALUES.length], LoadType.Field_3063[0], length);
        return array;
    }
}
