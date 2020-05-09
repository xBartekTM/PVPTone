package pvptone.utils;

import java.util.*;
import java.awt.image.*;
import java.util.concurrent.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;

public class RenderUtils extends Object<RenderUtils>
{
    public int[] Field_1063;
    public Map<String, BufferedImage> texturesImage;
    
    public boolean Method_4825(final int n) {
        return this != 0;
    }
    
    public void drawScaledText(final String Variable_48794, final int Variable_48795, final int Variable_48800, final double p3, final int Variable_48791, final boolean Variable_48793, final boolean p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dload_3         /* Variable_48802 */
        //     4: dload_3         /* Variable_48802 */
        //     5: dload_3         /* Variable_48802 */
        //     6: invokestatic    net/minecraft/client/renderer/GlStateManager.scale:(DDD)V
        //     9: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //    12: getfield        net/minecraft/client/Minecraft.fontRendererObj:Lnet/minecraft/client/gui/FontRenderer;
        //    15: aload_0         /* Variable_48799 */
        //    16: iload_1         /* Variable_48797 */
        //    17: i2d            
        //    18: dload_3         /* Variable_48802 */
        //    19: ddiv           
        //    20: d2f            
        //    21: iload           Variable_48801
        //    23: invokestatic    pvptone/utils/RenderUtils.Method_4825:(I)Z
        //    26: ifeq            64
        //    29: invokestatic    net/minecraft/client/Minecraft.getMinecraft:()Lnet/minecraft/client/Minecraft;
        //    32: getfield        net/minecraft/client/Minecraft.fontRendererObj:Lnet/minecraft/client/gui/FontRenderer;
        //    35: aload_0         /* Variable_48799 */
        //    36: invokevirtual   net/minecraft/client/gui/FontRenderer.getStringWidth:(Ljava/lang/String;)I
        //    39: i2f            
        //    40: fconst_2       
        //    41: fdiv           
        //    42: ldc             ""
        //    44: invokevirtual   java/lang/String.length:()I
        //    47: pop            
        //    48: sipush          146
        //    51: sipush          150
        //    54: ixor           
        //    55: ldc             "  "
        //    57: invokevirtual   java/lang/String.length:()I
        //    60: if_icmpge       65
        //    63: return         
        //    64: fconst_0       
        //    65: fsub           
        //    66: iload_2         /* Variable_48798 */
        //    67: i2d            
        //    68: dload_3         /* Variable_48802 */
        //    69: ddiv           
        //    70: d2f            
        //    71: iload           Variable_48804
        //    73: iload           Variable_48803
        //    75: invokevirtual   net/minecraft/client/gui/FontRenderer.drawString:(Ljava/lang/String;FFIZ)I
        //    78: ldc             ""
        //    80: invokevirtual   java/lang/String.length:()I
        //    83: pop2           
        //    84: dconst_1       
        //    85: dload_3         /* Variable_48802 */
        //    86: ddiv           
        //    87: dconst_1       
        //    88: dload_3         /* Variable_48802 */
        //    89: ddiv           
        //    90: dconst_1       
        //    91: dload_3         /* Variable_48802 */
        //    92: ddiv           
        //    93: invokestatic    net/minecraft/client/renderer/GlStateManager.scale:(DDD)V
        //    96: invokestatic    net/minecraft/client/renderer/GlStateManager.popMatrix:()V
        //    99: return         
        //    StackMapTable: 00 02 FF 00 40 00 07 07 00 37 01 01 03 01 01 01 00 03 07 00 2F 07 00 37 02 FF 00 00 00 07 07 00 37 01 01 03 01 01 01 00 04 07 00 2F 07 00 37 02 02
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean Method_4826(final int n) {
        return this == 0;
    }
    
    static {
        Method_4828();
        RenderUtils.texturesImage = new ConcurrentHashMap<String, BufferedImage>();
    }
    
    public boolean Method_4827(final int Variable_48806, final int n) {
        return this > Variable_48806;
    }
    
    public void drawOutlinedString(final String Variable_48808, final float Variable_48812, final float Variable_48809, int Variable_48811) {
        Variable_48811 = Minecraft.getMinecraft();
        Variable_48811.fontRendererObj.drawString((String)this, (float)(Variable_48808 - 0.3f), Variable_48812, RenderUtils.Field_1063[10]);
        "".length();
        Variable_48811.fontRendererObj.drawString((String)this, (float)(Variable_48808 + 0.3f), Variable_48812, RenderUtils.Field_1063[10]);
        "".length();
        Variable_48811.fontRendererObj.drawString((String)this, (float)Variable_48808, Variable_48812 + 0.3f, RenderUtils.Field_1063[10]);
        "".length();
        Variable_48811.fontRendererObj.drawString((String)this, (float)Variable_48808, Variable_48812 - 0.3f, RenderUtils.Field_1063[10]);
        "".length();
        Variable_48811.fontRendererObj.drawString((String)this, (float)Variable_48808, Variable_48812, (int)Variable_48809);
        "".length();
    }
    
    public void drawImage(final ResourceLocation Variable_48826, final int Variable_48818, final int Variable_48819, final int Variable_48821, int Variable_48822) {
        Variable_48822 = new ScaledResolution(Minecraft.getMinecraft());
        GL11.glDisable(RenderUtils.Field_1063[12]);
        GL11.glDepthMask((boolean)(RenderUtils.Field_1063[10] != 0));
        OpenGlHelper.glBlendFunc(RenderUtils.Field_1063[7], RenderUtils.Field_1063[8], RenderUtils.Field_1063[13], RenderUtils.Field_1063[10]);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().getTextureManager().bindTexture((ResourceLocation)this);
        Gui.drawModalRectWithCustomSizedTexture((int)Variable_48826, Variable_48818, 0.0f, 0.0f, Variable_48819, Variable_48821, (float)Variable_48819, (float)Variable_48821);
        GL11.glDepthMask((boolean)(RenderUtils.Field_1063[13] != 0));
        GL11.glEnable(RenderUtils.Field_1063[12]);
    }
    
    public void drawCircle(final int Variable_48842, final int Variable_48840, final float Variable_48834, int Variable_48850) {
        Variable_48850 = (Variable_48834 >> RenderUtils.Field_1063[0] & RenderUtils.Field_1063[1]) / 255.0f;
        final float Variable_48851 = (Variable_48834 >> RenderUtils.Field_1063[2] & RenderUtils.Field_1063[1]) / 255.0f;
        final float Variable_48852 = (Variable_48834 >> RenderUtils.Field_1063[3] & RenderUtils.Field_1063[1]) / 255.0f;
        final float Variable_48853 = (Variable_48834 & RenderUtils.Field_1063[1]) / 255.0f;
        final boolean Variable_48854 = GL11.glIsEnabled(RenderUtils.Field_1063[4]);
        final boolean Variable_48855 = GL11.glIsEnabled(RenderUtils.Field_1063[5]);
        final boolean Variable_48856 = GL11.glIsEnabled(RenderUtils.Field_1063[6]);
        if (Method_4826(Variable_48854 ? 1 : 0)) {
            GL11.glEnable(RenderUtils.Field_1063[4]);
        }
        if (Method_4826(Variable_48855 ? 1 : 0)) {
            GL11.glEnable(RenderUtils.Field_1063[5]);
        }
        if (Method_4825(Variable_48856 ? 1 : 0)) {
            GL11.glDisable(RenderUtils.Field_1063[6]);
        }
        GL11.glBlendFunc(RenderUtils.Field_1063[7], RenderUtils.Field_1063[8]);
        GL11.glColor4f(Variable_48851, Variable_48852, Variable_48853, Variable_48850);
        GL11.glBegin(RenderUtils.Field_1063[9]);
        int Variable_48857 = RenderUtils.Field_1063[10];
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!Method_4827(Variable_48857, RenderUtils.Field_1063[11])) {
            GL11.glVertex2d((double)this + Math.sin(Variable_48857 * 3.141526 / 180.0) * Variable_48840, Variable_48842 + Math.cos(Variable_48857 * 3.141526 / 180.0) * Variable_48840);
            ++Variable_48857;
        }
        GL11.glEnd();
        if (Method_4825(Variable_48856 ? 1 : 0)) {
            GL11.glEnable(RenderUtils.Field_1063[6]);
        }
        if (Method_4826(Variable_48855 ? 1 : 0)) {
            GL11.glDisable(RenderUtils.Field_1063[5]);
        }
        if (Method_4825(Variable_48854 ? 1 : 0)) {
            return;
        }
        GL11.glDisable(RenderUtils.Field_1063[4]);
    }
    
    public void Method_4828() {
        (RenderUtils.Field_1063 = new int[14])[0] = (0x14 ^ 0x2 ^ (0x7D ^ 0x73));
        RenderUtils.Field_1063[1] = (0x1B ^ 0x32) + (0x61 ^ 0x6A) - -(0xC3 ^ 0xA2) + (0x33 ^ 0x59);
        RenderUtils.Field_1063[2] = (0x67 ^ 0x77);
        RenderUtils.Field_1063[3] = (0xA8 ^ 0xA0);
        RenderUtils.Field_1063[4] = (0xFFFFDFF2 & 0x2BEF);
        RenderUtils.Field_1063[5] = (0xFFFFEB66 & 0x1FB9);
        RenderUtils.Field_1063[6] = (-(0xA3 ^ 0xBA) & (0xFFFFBDF9 & 0x4FFF));
        RenderUtils.Field_1063[7] = (0xFFFFD32E & 0x2FD3);
        RenderUtils.Field_1063[8] = (-(0xFFFFDE3F & 0x3DD5) & (0xFFFFBFBF & 0x5F57));
        RenderUtils.Field_1063[9] = (0x8 ^ 0x7E ^ 60 + 36 + 10 + 21);
        RenderUtils.Field_1063[10] = ((0x28 ^ 0x3C) & ~(0x52 ^ 0x46));
        RenderUtils.Field_1063[11] = (0xFFFF8D6E & 0x73F9);
        RenderUtils.Field_1063[12] = (0xFFFFDF73 & 0x2BFD);
        RenderUtils.Field_1063[13] = " ".length();
    }
}
