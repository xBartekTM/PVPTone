package pvptone.mods;

import net.minecraft.client.renderer.chunk.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import java.util.*;

public class ChunkAnimator extends Object<ChunkAnimator>
{
    public Map<RenderChunk, Long> timeStamps;
    public Minecraft mc;
    
    public int Method_14131(final long p0, final long p1) {
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
    
    public void preRender(RenderChunk Variable_146767) {
        if (Method_14133(ChunkAnimator.timeStamps.containsKey(this) ? 1 : 0)) {
            Variable_146767 = ChunkAnimator.timeStamps.get(this);
            if (Method_14132(Method_14131(Variable_146767, -1L))) {
                Variable_146767 = System.currentTimeMillis();
                ChunkAnimator.timeStamps.put((RenderChunk)this, Variable_146767);
                "".length();
            }
            final long Variable_146768 = System.currentTimeMillis() - Variable_146767;
            if (Method_14134(Method_14131(Variable_146768, 1500L))) {
                final double Variable_146769 = ((RenderChunk)this).getPosition().getY();
                double Variable_146770 = 0.0;
                Variable_146770 = (256.0 - Variable_146769) / 1500.0 * Variable_146768;
                GlStateManager.translate(0.0, 256.0 - Variable_146769 - Variable_146770, 0.0);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                ChunkAnimator.timeStamps.remove(this);
                "".length();
            }
        }
    }
    
    public boolean Method_14132(final int n) {
        return this == 0;
    }
    
    static {
        ChunkAnimator.mc = Minecraft.getMinecraft();
        ChunkAnimator.timeStamps = new HashMap<RenderChunk, Long>();
    }
    
    public boolean Method_14133(final int n) {
        return this != 0;
    }
    
    public boolean Method_14134(final int n) {
        return this < 0;
    }
    
    public boolean Method_14135(final Object o) {
        return this != null;
    }
    
    public void setPosition(final RenderChunk renderChunk) {
        if (Method_14135(ChunkAnimator.mc.thePlayer)) {
            ChunkAnimator.timeStamps.put((RenderChunk)this, -1L);
            "".length();
        }
    }
}
