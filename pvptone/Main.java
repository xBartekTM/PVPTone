package pvptone;

import pvptone.utils.*;
import pvptone.cosmetics.builder.*;
import pvptone.loaders.*;
import net.minecraft.client.*;
import pvptone.gui.*;
import net.minecraft.client.gui.*;
import pvptone.task.*;
import pvptone.gui.ingame.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Main extends Object<Main>
{
    public Discord d;
    public int[] lIIIIlIIIlIIll;
    public String newVersion;
    public String[] lIIIIlIIIlIIII;
    
    public void llIIIlIIlIIlllI() {
        (Main.lIIIIlIIIlIIll = new int[3])[0] = ((126 + 178 - 245 + 141 ^ 160 + 92 - 110 + 26) & (241 + 13 - 138 + 128 ^ 131 + 115 - 108 + 10 ^ -" ".length()));
        Main.lIIIIlIIIlIIll[1] = " ".length();
        Main.lIIIIlIIIlIIll[2] = "  ".length();
    }
    
    public boolean llIIIlIIlIlIIII(final int n) {
        return this != 0;
    }
    
    public void main() {
        Utils.reloadCosmetics();
        Loader.loadUsers();
        CosmeticsManager.init();
        new AntycheatTask().start();
        NewVersionLoader.load();
        "".length();
        if (llIIIlIIlIlIIII(NewVersionLoader.newVersion ? 1 : 0)) {
            Main.newVersion = NewVersionLoader.load();
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new UpdateGui(Main.newVersion));
        }
        new BlacklistTask().start();
        new BroadcastTask().start();
        (Main.d = new Discord()).start();
        new DabTask().start();
        Config.load();
        PvpToneGuiIngame.init();
    }
    
    public String llIIIlIIlIIlIII(final String lllllllllllllIlIIlllIIIIIlIIIlll, final String lllllllllllllIlIIlllIIIIIlIIlIIl2) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIIIIIlIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllIIIIIlIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllIIIIIlIIlIlI.init(Main.lIIIIlIIIlIIll[2], lllllllllllllIlIIlllIIIIIlIIlIll);
            return new String(lllllllllllllIlIIlllIIIIIlIIlIlI.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIIIIIlIIlIIl2) {
            lllllllllllllIlIIlllIIIIIlIIlIIl2.printStackTrace();
            return null;
        }
    }
    
    public void shutdown() {
        Main.d.shutdown();
    }
    
    static {
        llIIIlIIlIIlllI();
        llIIIlIIlIIllII();
        Main.newVersion = Main.lIIIIlIIIlIIII[Main.lIIIIlIIIlIIll[0]];
    }
    
    public void llIIIlIIlIIllII() {
        (Main.lIIIIlIIIlIIII = new String[Main.lIIIIlIIIlIIll[1]])[Main.lIIIIlIIIlIIll[0]] = llIIIlIIlIIlIII("JOv2mHYMT1w=", "OUQYA");
    }
    
    public static class Loader extends Object<Loader>
    {
        public int[] Field_2416;
        public HashMap<String, String> nick;
        public String[] Field_2417;
        
        public void loadUsers() {
            Loader.nick.clear();
            Loader.nick.put(Loader.Field_2417[Loader.Field_2416[0]], Loader.Field_2417[Loader.Field_2416[1]]);
            "".length();
        }
        
        static {
            Method_11012();
            Method_11014();
            Loader.nick = new HashMap<String, String>();
        }
        
        public void Method_11012() {
            (Loader.Field_2416 = new int[3])[0] = ((0xC6 ^ 0x83) & ~(0xC1 ^ 0x84));
            Loader.Field_2416[1] = " ".length();
            Loader.Field_2416[2] = "  ".length();
        }
        
        public String Method_11013(final String Variable_114086, String Variable_114091) {
            Variable_114098 = (boolean)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            Variable_114091 = new StringBuilder();
            final char[] Variable_114099 = Variable_114086.toCharArray();
            int Variable_114100 = Loader.Field_2416[0];
            final Exception Variable_114101 = (Object)((String)this).toCharArray();
            final float Variable_114102 = Variable_114101.length;
            int Variable_114103 = Loader.Field_2416[0];
            while (Method_11015(Variable_114103, (int)Variable_114102)) {
                final char Variable_114104 = Variable_114101[Variable_114103];
                Variable_114091.append((char)(Variable_114104 ^ Variable_114099[Variable_114100 % Variable_114099.length]));
                "".length();
                ++Variable_114100;
                ++Variable_114103;
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(Variable_114091);
        }
        
        public void Method_11014() {
            (Loader.Field_2417 = new String[Loader.Field_2416[2]])[Loader.Field_2416[0]] = Method_11013("IBQsHA4gLg==", "xWCxk");
            Loader.Field_2417[Loader.Field_2416[1]] = Method_11013("bARAPQMOKi8f", "JgfQB");
        }
        
        public boolean Method_11015(final int Variable_114100, final int n) {
            return this < Variable_114100;
        }
    }
}
