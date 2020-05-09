package pvptone.loaders;

import pvptone.data.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import pvptone.enums.*;
import java.net.*;
import java.util.*;

public class CosmeticsLoader extends Object<CosmeticsLoader>
{
    public int[] Field_525;
    public List<User> u;
    public String[] Field_526;
    
    static {
        Method_2422();
        Method_2425();
        CosmeticsLoader.u = new LinkedList<User>();
    }
    
    public boolean Method_2419(final int n) {
        return this == 0;
    }
    
    public boolean Method_2420(final Object o) {
        return this == null;
    }
    
    public String Method_2421(final String Variable_24053, String Variable_24048) {
        try {
            Variable_24048 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_24053.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_24054 = Cipher.getInstance("Blowfish");
            Variable_24054.init(CosmeticsLoader.Field_525[2], Variable_24048);
            return new String(Variable_24054.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_24055) {
            Variable_24055.printStackTrace();
            return null;
        }
    }
    
    public void Method_2422() {
        (CosmeticsLoader.Field_525 = new int[5])[0] = ((0x81 ^ 0xB1 ^ (0x18 ^ 0x6E)) & (0x2F ^ 0x77 ^ (0x19 ^ 0x7) ^ -" ".length()));
        CosmeticsLoader.Field_525[1] = " ".length();
        CosmeticsLoader.Field_525[2] = "  ".length();
        CosmeticsLoader.Field_525[3] = "   ".length();
        CosmeticsLoader.Field_525[4] = (0xA1 ^ 0xA9);
    }
    
    public User getUserByName(String Variable_24056) {
        final boolean Variable_24057 = (boolean)CosmeticsLoader.u.iterator();
        "".length();
        if ((0x64 ^ 0x60) == 0x0) {
            return null;
        }
        while (!Method_2419(((Iterator)Variable_24057).hasNext() ? 1 : 0)) {
            Variable_24056 = ((Iterator<User>)Variable_24057).next();
            if (Method_2424(Variable_24056.getName().equalsIgnoreCase((String)this) ? 1 : 0)) {
                return Variable_24056;
            }
        }
        return null;
    }
    
    public int load(final String Variable_24062, final LoadType Variable_24063) {
        try {
            final Scanner Variable_24064 = new Scanner(new URL((String)this).openStream());
            "".length();
            if ("  ".length() == 0) {
                return (250 + 59 - 112 + 54 ^ 95 + 134 - 173 + 99) & (172 + 136 - 278 + 190 ^ 155 + 137 - 198 + 94 ^ -" ".length());
            }
            while (!Method_2419(Variable_24064.hasNext() ? 1 : 0)) {
                final String[] Variable_24065 = Variable_24064.next().split(CosmeticsLoader.Field_526[CosmeticsLoader.Field_525[0]]);
                final User Variable_24066 = getUserByName(Variable_24065[CosmeticsLoader.Field_525[0]]);
                if (Method_2420(Variable_24066)) {
                    final User Variable_24067 = new User(Variable_24065[CosmeticsLoader.Field_525[0]], CosmeticsLoader.Field_526[CosmeticsLoader.Field_525[1]], CosmeticsLoader.Field_525[0], CosmeticsLoader.Field_525[0], CosmeticsLoader.Field_525[0]);
                    if (Method_2426(Variable_24062, LoadType.WINGS)) {
                        Variable_24067.setWingsid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                        "".length();
                        if (-" ".length() > 0) {
                            return (0xB4 ^ 0xAF) & ~(0x7D ^ 0x66) & ~((0xDB ^ 0x8D) & ~(0x7D ^ 0x2B));
                        }
                    }
                    else if (Method_2426(Variable_24062, LoadType.ITEMS)) {
                        Variable_24067.setItemid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                        "".length();
                        if (((0x44 ^ 0x58) & ~(0x1 ^ 0x1D)) > (0xAF ^ 0xAB)) {
                            return (0xF2 ^ 0xBB) & ~(0xE5 ^ 0xAC);
                        }
                    }
                    else if (Method_2426(Variable_24062, LoadType.HAT)) {
                        Variable_24067.setHatid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                        "".length();
                        if (-"  ".length() > 0) {
                            return (0x6 ^ 0x9 ^ (0x4A ^ 0xF)) & (0x20 ^ 0x3F ^ (0xE1 ^ 0xB4) ^ -" ".length());
                        }
                    }
                    else if (Method_2426(Variable_24062, LoadType.TAIL)) {
                        Variable_24067.setTailid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                    }
                    CosmeticsLoader.u.add(Variable_24067);
                    "".length();
                    "".length();
                    if ("   ".length() == 0) {
                        return (0x62 ^ 0x50 ^ (0x40 ^ 0x58)) & (107 + 178 - 84 + 36 ^ 90 + 28 - 95 + 176 ^ -" ".length());
                    }
                    continue;
                }
                else {
                    if (Method_2426(Variable_24062, LoadType.WINGS)) {
                        Variable_24066.setWingsid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return (0x6F ^ 0x66) & ~(0x1F ^ 0x16);
                        }
                    }
                    else if (Method_2426(Variable_24062, LoadType.ITEMS)) {
                        Variable_24066.setItemid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                        "".length();
                        if (((0xC8 ^ 0xB9 ^ (0x3B ^ 0x43)) & (0xB7 ^ 0xAA ^ (0x9C ^ 0x88) ^ -" ".length())) > 0) {
                            return (154 + 16 - 95 + 144 ^ 49 + 90 - 13 + 23) & (0x7E ^ 0x33 ^ "   ".length() ^ -" ".length());
                        }
                    }
                    else if (Method_2426(Variable_24062, LoadType.HAT)) {
                        Variable_24066.setHatid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                        "".length();
                        if (null != null) {
                            return (0x30 ^ 0x6F ^ (0x50 ^ 0x39)) & (0x38 ^ 0x74 ^ (0x1B ^ 0x61) ^ -" ".length());
                        }
                    }
                    else if (Method_2426(Variable_24062, LoadType.TAIL)) {
                        Variable_24066.setTailid(Integer.parseInt(Variable_24065[CosmeticsLoader.Field_525[1]]));
                    }
                    CosmeticsLoader.u.add(Variable_24066);
                    "".length();
                }
            }
            Variable_24064.close();
            return CosmeticsLoader.u.size();
        }
        catch (Exception Variable_24068) {
            System.out.println(CosmeticsLoader.Field_526[CosmeticsLoader.Field_525[2]]);
            return CosmeticsLoader.Field_525[0];
        }
    }
    
    public String Method_2423(final String Variable_24073, String Variable_24078) {
        try {
            Variable_24078 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_24073.getBytes(StandardCharsets.UTF_8)), CosmeticsLoader.Field_525[4]), "DES");
            final Cipher Variable_24079 = Cipher.getInstance("DES");
            Variable_24079.init(CosmeticsLoader.Field_525[2], Variable_24078);
            return new String(Variable_24079.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_24080) {
            Variable_24080.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_2424(final int n) {
        return this != 0;
    }
    
    public void Method_2425() {
        (CosmeticsLoader.Field_526 = new String[CosmeticsLoader.Field_525[3]])[CosmeticsLoader.Field_525[0]] = Method_2423("nU/mEGYvst4=", "wHXeq");
        CosmeticsLoader.Field_526[CosmeticsLoader.Field_525[1]] = Method_2421("RCYMthTIwI4=", "nBSOr");
        CosmeticsLoader.Field_526[CosmeticsLoader.Field_525[2]] = Method_2421("xJ+TNuWkp/Vz23122tjDF+rqh0SFImnS", "ReUlB");
    }
    
    public boolean Method_2426(final Object Variable_24084, final Object o) {
        return this == Variable_24084;
    }
}
