package pvptone.loaders;

import net.minecraft.client.multiplayer.*;
import java.nio.charset.*;
import com.google.common.collect.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.net.*;
import pvptone.helper.*;
import java.util.*;

public class FeaturedServerLoader extends Object<FeaturedServerLoader>
{
    public int[] Field_523;
    public String[] Field_524;
    public List<ServerData> servers;
    
    public boolean Method_2412(final int n) {
        return this == 0;
    }
    
    public String Method_2413(final String Variable_24001, String Variable_24005) {
        Variable_24010 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_24005 = new StringBuilder();
        final char[] Variable_24011 = Variable_24001.toCharArray();
        int Variable_24012 = FeaturedServerLoader.Field_523[0];
        final int Variable_24013 = (Object)((String)this).toCharArray();
        final Exception Variable_24014 = (Exception)Variable_24013.length;
        float Variable_24015 = FeaturedServerLoader.Field_523[0];
        while (Method_2414((int)Variable_24015, (int)Variable_24014)) {
            final char Variable_24016 = Variable_24013[Variable_24015];
            Variable_24005.append((char)(Variable_24016 ^ Variable_24011[Variable_24012 % Variable_24011.length]));
            "".length();
            ++Variable_24012;
            ++Variable_24015;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(Variable_24005);
    }
    
    public boolean Method_2414(final int Variable_24015, final int n) {
        return this < Variable_24015;
    }
    
    public void Method_2415() {
        (FeaturedServerLoader.Field_523 = new int[5])[0] = ((0x60 ^ 0x64) & ~(0xBB ^ 0xBF));
        FeaturedServerLoader.Field_523[1] = " ".length();
        FeaturedServerLoader.Field_523[2] = "  ".length();
        FeaturedServerLoader.Field_523[3] = "   ".length();
        FeaturedServerLoader.Field_523[4] = (0x68 ^ 0x60);
    }
    
    public void Method_2416() {
        (FeaturedServerLoader.Field_524 = new String[FeaturedServerLoader.Field_523[3]])[FeaturedServerLoader.Field_523[0]] = Method_2413("HwwFBmtYVwIfJRJNSEJmWQ8UFGBZDBgCMBkZCRN/FBccWSISCgcTIwRWBQ4l", "wxqvQ");
        FeaturedServerLoader.Field_524[FeaturedServerLoader.Field_523[1]] = Method_2418("Cm1PjHyVGfY=", "BNnSw");
        FeaturedServerLoader.Field_524[FeaturedServerLoader.Field_523[2]] = Method_2417("qz7Uyap+Q78=", "vAhrZ");
    }
    
    static {
        Method_2415();
        Method_2416();
        FeaturedServerLoader.servers = (List<ServerData>)Lists.newArrayList();
    }
    
    public String Method_2417(final String Variable_24025, final String Variable_24028) {
        try {
            final SecretKeySpec Variable_24026 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_24025.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_24027 = Cipher.getInstance("Blowfish");
            Variable_24027.init(FeaturedServerLoader.Field_523[2], Variable_24026);
            return new String(Variable_24027.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_24028) {
            Variable_24028.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<ServerData> load() {
        FeaturedServerLoader.servers.clear();
        try {
            Variable_24028 = new Scanner(new URL(FeaturedServerLoader.Field_524[FeaturedServerLoader.Field_523[0]]).openStream());
            "".length();
            if ((0xA6 ^ 0xA2) <= -" ".length()) {
                return null;
            }
            while (!Method_2412(((Scanner)this).hasNext() ? 1 : 0)) {
                final String[] Variable_24029 = ((Scanner)this).next().split(FeaturedServerLoader.Field_524[FeaturedServerLoader.Field_523[1]]);
                FeaturedServerLoader.servers.add((ServerData)new FeaturedServer(FeaturedServerLoader.Field_524[FeaturedServerLoader.Field_523[2]], Variable_24029[FeaturedServerLoader.Field_523[0]]));
                "".length();
            }
            ((Scanner)this).close();
            return (ArrayList<ServerData>)(ArrayList)FeaturedServerLoader.servers;
        }
        catch (Exception Variable_24030) {
            return (ArrayList<ServerData>)(ArrayList)FeaturedServerLoader.servers;
        }
    }
    
    public String Method_2418(final String Variable_24035, final String Variable_24039) {
        try {
            final SecretKeySpec Variable_24037 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_24035.getBytes(StandardCharsets.UTF_8)), FeaturedServerLoader.Field_523[4]), "DES");
            final Cipher Variable_24038 = Cipher.getInstance("DES");
            Variable_24038.init(FeaturedServerLoader.Field_523[2], Variable_24037);
            return new String(Variable_24038.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_24039) {
            Variable_24039.printStackTrace();
            return null;
        }
    }
}
