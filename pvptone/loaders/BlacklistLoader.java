package pvptone.loaders;

import pvptone.data.*;
import java.net.*;
import net.minecraft.client.*;
import pvptone.gui.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class BlacklistLoader extends Object<BlacklistLoader>
{
    public List<BlacklistUser> blacklist;
    public Long timeexit;
    public boolean cos;
    public String[] Field_3117;
    public int[] Field_3118;
    
    public void addBlacklist(final String Variable_147311, final String Variable_147310, final String Variable_147312, final String Variable_147320, final String Variable_147322) {
        try {
            if (Method_14198(BlacklistLoader.blacklist.contains(getUserByName((String)this)) ? 1 : 0)) {
                final Scanner Variable_147321 = new Scanner(new URL(String.valueOf(new StringBuilder(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[5]]).append((String)this).append(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[6]]).append(Variable_147310).append(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[7]]).append(Variable_147311).append(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[8]]).append(Variable_147312.replace(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[9]], BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[10]])).append(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[11]]).append(Variable_147320))).openStream());
                BlacklistLoader.blacklist.add(new BlacklistUser((String)this, Variable_147311, Variable_147310, Variable_147312, Variable_147320));
                "".length();
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new BlacklistGui((String)this, Variable_147310, Variable_147312, Variable_147320));
                Variable_147321.close();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        }
        catch (Exception Variable_147322) {
            Variable_147322.printStackTrace();
        }
    }
    
    static {
        Method_14194();
        Method_14200();
        BlacklistLoader.blacklist = new LinkedList<BlacklistUser>();
        BlacklistLoader.cos = (BlacklistLoader.Field_3118[0] != 0);
        BlacklistLoader.timeexit = 0L;
    }
    
    public boolean Method_14193(final int n) {
        return this != 0;
    }
    
    public void Method_14194() {
        (BlacklistLoader.Field_3118 = new int[13])[0] = ((0x85 ^ 0xB3) & ~(0x30 ^ 0x6));
        BlacklistLoader.Field_3118[1] = " ".length();
        BlacklistLoader.Field_3118[2] = (0xEA ^ 0x9E ^ (0x52 ^ 0x22));
        BlacklistLoader.Field_3118[3] = "  ".length();
        BlacklistLoader.Field_3118[4] = "   ".length();
        BlacklistLoader.Field_3118[5] = (((0x44 ^ 0x1D) & ~(0x3A ^ 0x63)) ^ (0x8A ^ 0x8F));
        BlacklistLoader.Field_3118[6] = (0xB2 ^ 0xB4);
        BlacklistLoader.Field_3118[7] = (0xB ^ 0xC);
        BlacklistLoader.Field_3118[8] = (13 + 141 - 137 + 156 ^ 163 + 108 - 156 + 50);
        BlacklistLoader.Field_3118[9] = (0x43 ^ 0x7F ^ (0x42 ^ 0x77));
        BlacklistLoader.Field_3118[10] = (0xDB ^ 0xAF ^ (0xCB ^ 0xB5));
        BlacklistLoader.Field_3118[11] = (90 + 13 - 37 + 75 ^ 116 + 124 - 107 + 1);
        BlacklistLoader.Field_3118[12] = (0x75 ^ 0x79);
    }
    
    public BlacklistUser getUserByName(String Variable_147327) {
        final byte Variable_147328 = (byte)BlacklistLoader.blacklist.iterator();
        "".length();
        if (((0x68 ^ 0x66) & ~(0x6D ^ 0x63)) >= (0x5 ^ 0x1)) {
            return null;
        }
        while (!Method_14198(((Iterator)Variable_147328).hasNext() ? 1 : 0)) {
            Variable_147327 = ((Iterator<BlacklistUser>)Variable_147328).next();
            if (Method_14193(Variable_147327.getName().equalsIgnoreCase((String)this) ? 1 : 0)) {
                return Variable_147327;
            }
            if (Method_14193(Variable_147327.getIp().equalsIgnoreCase(System.getenv(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[2]])) ? 1 : 0)) {
                return Variable_147327;
            }
        }
        return null;
    }
    
    public boolean Method_14195(final int Variable_147329, final int n) {
        return this < Variable_147329;
    }
    
    public int Method_14196(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: lload_2        
        //     2: lcmp           
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public String Method_14197(final String Variable_147332, final String Variable_147338) {
        try {
            final SecretKeySpec Variable_147336 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_147332.getBytes(StandardCharsets.UTF_8)), BlacklistLoader.Field_3118[8]), "DES");
            final Cipher Variable_147337 = Cipher.getInstance("DES");
            Variable_147337.init(BlacklistLoader.Field_3118[3], Variable_147336);
            return new String(Variable_147337.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_147338) {
            Variable_147338.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_14198(final int n) {
        return this == 0;
    }
    
    public int load() {
        BlacklistLoader.blacklist.clear();
        try {
            Variable_147343 = new Scanner(new URL(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[0]]).openStream());
            "".length();
            if (((35 + 169 - 31 + 74 ^ 190 + 124 - 307 + 185) & (23 + 154 - 74 + 52 ^ 100 + 37 + 7 + 28 ^ -" ".length())) != 0x0) {
                return (9 + 14 + 90 + 64 ^ 75 + 22 + 21 + 18) & (39 + 111 - 61 + 69 ^ 60 + 137 - 85 + 55 ^ -" ".length());
            }
            while (!Method_14198(((Scanner)this).hasNext() ? 1 : 0)) {
                final String[] Variable_147344 = ((Scanner)this).next().split(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[1]]);
                if (Method_14193(Variable_147344[BlacklistLoader.Field_3118[2]].equalsIgnoreCase(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[3]]) ? 1 : 0)) {
                    BlacklistLoader.blacklist.add(new BlacklistUser(Variable_147344[BlacklistLoader.Field_3118[0]], Variable_147344[BlacklistLoader.Field_3118[1]], Variable_147344[BlacklistLoader.Field_3118[3]], Variable_147344[BlacklistLoader.Field_3118[4]], Variable_147344[BlacklistLoader.Field_3118[2]]));
                    "".length();
                    "".length();
                    if ("  ".length() > (158 + 150 - 305 + 158 ^ 18 + 6 + 80 + 61)) {
                        return (0xB0 ^ 0xC6 ^ (0x35 ^ 0x7F)) & (44 + 170 - 67 + 44 ^ 52 + 21 - 19 + 77 ^ -" ".length());
                    }
                    continue;
                }
                else {
                    if (!Method_14201(Method_14196(Long.parseLong(Variable_147344[BlacklistLoader.Field_3118[2]]), System.currentTimeMillis()))) {
                        continue;
                    }
                    BlacklistLoader.blacklist.add(new BlacklistUser(Variable_147344[BlacklistLoader.Field_3118[0]], Variable_147344[BlacklistLoader.Field_3118[1]], Variable_147344[BlacklistLoader.Field_3118[3]], Variable_147344[BlacklistLoader.Field_3118[4]], Variable_147344[BlacklistLoader.Field_3118[2]]));
                    "".length();
                }
            }
            ((Scanner)this).close();
            return BlacklistLoader.blacklist.size();
        }
        catch (Exception Variable_147345) {
            System.out.println(BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[4]]);
            return BlacklistLoader.Field_3118[0];
        }
    }
    
    public String Method_14199(final String Variable_147353, String Variable_147349) {
        Variable_147351 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_147349 = new StringBuilder();
        final char[] Variable_147354 = Variable_147353.toCharArray();
        int Variable_147355 = BlacklistLoader.Field_3118[0];
        final float Variable_147356 = (Object)((String)this).toCharArray();
        final short Variable_147357 = (short)Variable_147356.length;
        float Variable_147358 = BlacklistLoader.Field_3118[0];
        while (Method_14195((int)Variable_147358, Variable_147357)) {
            final char Variable_147359 = Variable_147356[Variable_147358];
            Variable_147349.append((char)(Variable_147359 ^ Variable_147354[Variable_147355 % Variable_147354.length]));
            "".length();
            ++Variable_147355;
            ++Variable_147358;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_147349);
    }
    
    public void Method_14200() {
        (BlacklistLoader.Field_3117 = new String[BlacklistLoader.Field_3118[12]])[BlacklistLoader.Field_3118[0]] = Method_14202("jW82SI4zAaiIvz29TxeXTBI3uYZaUkBpVLsGNYJ63qsmn9nXeWx4jD/2fEJV4GQ5JOvZ4kzmOqgAV4lVDjOeWw==", "JplnV");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[1]] = Method_14202("8ZQjYppVSao=", "sMNHb");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[3]] = Method_14199("ES4HOg==", "aKuWh");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[4]] = Method_14202("iwLTHgqpo/SDyL7H18EgmQ==", "HgOJG");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[2]] = Method_14197("dEhUJeOa7E9zGwEDksW9wg==", "AOroV");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[5]] = Method_14199("JgESCklhWhUTBytAX05EYAIDGEJgAQ8OEiAUHh9dLRoLVREiFAURHycGElUSKhEEFhItHgoTADpbFhIDcRsHFxZz", "Nufzs");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[6]] = Method_14199("VjciNw4eaw==", "pVFZg");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[7]] = Method_14202("OeXcDvTISAo=", "VMYvh");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[8]] = Method_14202("GjCSMQGcvbv4krq/YthdSQ==", "viFWU");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[9]] = Method_14199("WA==", "xXhTh");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[10]] = Method_14202("9NKZDxhhe5s=", "fWDZo");
        BlacklistLoader.Field_3117[BlacklistLoader.Field_3118[11]] = Method_14197("zrRP7RIDytY=", "zlJUi");
    }
    
    public boolean Method_14201(final int n) {
        return this > 0;
    }
    
    public String Method_14202(final String Variable_147366, String Variable_147369) {
        try {
            Variable_147369 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_147366.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_147370 = Cipher.getInstance("Blowfish");
            Variable_147370.init(BlacklistLoader.Field_3118[3], Variable_147369);
            return new String(Variable_147370.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_147371) {
            Variable_147371.printStackTrace();
            return null;
        }
    }
}
