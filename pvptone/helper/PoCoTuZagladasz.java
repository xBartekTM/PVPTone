package pvptone.helper;

import java.net.*;
import net.minecraft.client.*;
import pvptone.mods.emoticons.*;

public class PoCoTuZagladasz extends Object<PoCoTuZagladasz>
{
    public boolean socketxd;
    public int[] Field_1777;
    public Socket s;
    
    public boolean Method_8072(final int n) {
        return this != 0;
    }
    
    static {
        Method_8073();
        PoCoTuZagladasz.socketxd = (PoCoTuZagladasz.Field_1777[0] != 0);
    }
    
    public void Method_8073() {
        (PoCoTuZagladasz.Field_1777 = new int[2])[0] = ((0xA7 ^ 0x82 ^ (0xAA ^ 0xC0)) & (92 + 89 - 83 + 29 ^ (0xAA ^ 0x9A) ^ -" ".length()));
        PoCoTuZagladasz.Field_1777[1] = " ".length();
    }
    
    public void run() {
        if (Method_8072(Minecraft.getMinecraft().gameSettings.keyBindDab.isKeyDown() ? 1 : 0)) {
            Dab.dabbing = (PoCoTuZagladasz.Field_1777[1] != 0);
            "".length();
            if (((0xA5 ^ 0xBA ^ (0xCF ^ 0x93)) & (((0x45 ^ 0x5C) & ~(0x25 ^ 0x3C)) ^ (0xC7 ^ 0x84) ^ -" ".length())) >= "   ".length()) {
                return;
            }
        }
        else {
            Dab.dabbing = (PoCoTuZagladasz.Field_1777[0] != 0);
        }
    }
}
