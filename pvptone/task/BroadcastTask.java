package pvptone.task;

import pvptone.loaders.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class BroadcastTask extends Object<BroadcastTask>
{
    public int[] Field_1540;
    public List<String> ignore;
    public String[] Field_1541;
    
    static {
        Method_7041();
        Method_7045();
    }
    
    public void Method_7041() {
        (BroadcastTask.Field_1540 = new int[4])[0] = ((0x35 ^ 0x6C ^ (0x4B ^ 0x56)) & (0x8B ^ 0xA0 ^ (0xFB ^ 0x94) ^ -" ".length()));
        BroadcastTask.Field_1540[1] = " ".length();
        BroadcastTask.Field_1540[2] = "  ".length();
        BroadcastTask.Field_1540[3] = "   ".length();
    }
    
    public void run() {
        BroadcastLoader.load();
        final char Variable_73393 = (char)BroadcastLoader.bc.entrySet().iterator();
        "".length();
        if (" ".length() <= -" ".length()) {
            return;
        }
        while (!Method_7042(((Iterator)Variable_73393).hasNext() ? 1 : 0)) {
            final Map.Entry<Long, String> Variable_73394 = ((Iterator<Map.Entry<Long, String>>)Variable_73393).next();
            final Long Variable_73395 = Variable_73394.getKey();
            final String Variable_73396 = Variable_73394.getValue();
            if (Method_7042(this.ignore.contains(Variable_73396) ? 1 : 0) && Method_7046(Method_7044(Variable_73395, System.currentTimeMillis()))) {
                this.ignore.add(Variable_73396);
                "".length();
                final ChatComponentText Variable_73397 = new ChatComponentText(String.valueOf(new StringBuilder(BroadcastTask.Field_1541[BroadcastTask.Field_1540[0]]).append(Variable_73396.replace(BroadcastTask.Field_1541[BroadcastTask.Field_1540[1]], BroadcastTask.Field_1541[BroadcastTask.Field_1540[2]]))));
                Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage((IChatComponent)Variable_73397);
            }
        }
    }
    
    public boolean Method_7042(final int n) {
        return this == 0;
    }
    
    public void start() {
        new Timer().scheduleAtFixedRate((TimerTask)this, 1000L, 1000L);
    }
    
    public BroadcastTask() {
        this.ignore = new LinkedList<String>();
    }
    
    public String Method_7043(final String Variable_73409, String Variable_73410) {
        try {
            Variable_73410 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_73409.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_73411 = Cipher.getInstance("Blowfish");
            Variable_73411.init(BroadcastTask.Field_1540[2], Variable_73410);
            return new String(Variable_73411.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_73412) {
            Variable_73412.printStackTrace();
            return null;
        }
    }
    
    public int Method_7044(final long p0, final long p1) {
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
    
    public void Method_7045() {
        (BroadcastTask.Field_1541 = new String[BroadcastTask.Field_1540[3]])[BroadcastTask.Field_1540[0]] = Method_7043("OJjQmXDHEAbYUNyZuiTsujrGZSDmUFWjP9muG2euGdI=", "LQsbV");
        BroadcastTask.Field_1541[BroadcastTask.Field_1540[1]] = Method_7043("tbIk2KJQfR8=", "HGxPP");
        BroadcastTask.Field_1541[BroadcastTask.Field_1540[2]] = Method_7043("qcAVSLdxY5U=", "iNenX");
    }
    
    public boolean Method_7046(final int n) {
        return this <= 0;
    }
}
