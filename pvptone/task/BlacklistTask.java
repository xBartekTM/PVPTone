package pvptone.task;

import pvptone.loaders.*;
import net.minecraft.client.*;
import pvptone.gui.*;
import net.minecraft.client.gui.*;
import pvptone.data.*;
import java.util.*;

public class BlacklistTask extends Object<BlacklistTask>
{
    public int Method_2947(final long p0, final long p1) {
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
    
    public boolean Method_2948(final Object o) {
        return this != null;
    }
    
    public boolean Method_2949(final int n) {
        return this == 0;
    }
    
    public boolean Method_2950(final int n) {
        return this != 0;
    }
    
    public void run() {
        BlacklistLoader.load();
        "".length();
        final BlacklistUser Variable_29250 = BlacklistLoader.getUserByName(Minecraft.getMinecraft().getSession().getUsername());
        if (Method_2948(Variable_29250) && Method_2950(BlacklistLoader.blacklist.contains(Variable_29250) ? 1 : 0)) {
            if (Method_2949(Method_2947(BlacklistLoader.timeexit, 0L))) {
                BlacklistLoader.timeexit = System.currentTimeMillis() + 5000L;
            }
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new BlacklistGui(Variable_29250.getName(), Variable_29250.getAdmin(), Variable_29250.getReason(), Variable_29250.getTime()));
        }
    }
    
    public void start() {
        new Timer().scheduleAtFixedRate((TimerTask)this, 1000L, 1000L);
    }
}
