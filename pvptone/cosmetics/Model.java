package pvptone.cosmetics;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;

public abstract class Model extends Object<Model>
{
    public float SCALE = 0.0625f;
    public int[] Field_478;
    
    public void Method_2176() {
        (Model.Field_478 = new int[4])[0] = "   ".length();
        Model.Field_478[1] = ((0x93 ^ 0x87) & ~(0x17 ^ 0x3));
        Model.Field_478[2] = " ".length();
        Model.Field_478[3] = "  ".length();
    }
    
    public void setRotationRadians(final ModelRenderer Variable_21653, final double Variable_21650, final double Variable_21651, final double Variable_21652) {
        Variable_21653.rotateAngleX = (float)Variable_21650;
        Variable_21653.rotateAngleY = (float)Variable_21651;
        Variable_21653.rotateAngleZ = (float)Variable_21652;
    }
    
    public float getAnimationTime(final double p0, final Entity p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/entity/Entity.hashCode:()I
        //     4: i2l            
        //     5: invokestatic    java/lang/System.currentTimeMillis:()J
        //     8: ladd           
        //     9: l2d            
        //    10: dload_0         /* Variable_21661 */
        //    11: drem           
        //    12: dload_0         /* Variable_21661 */
        //    13: ddiv           
        //    14: ldc2_w          2.0
        //    17: dmul           
        //    18: ldc2_w          3.141592653589793
        //    21: dmul           
        //    22: d2f            
        //    23: freturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.FileSaver.doSaveJarDecompiled(FileSaver.java:192)
        //     at us.deathmarine.luyten.FileSaver.access$300(FileSaver.java:45)
        //     at us.deathmarine.luyten.FileSaver$4.run(FileSaver.java:112)
        //     at java.lang.Thread.run(Unknown Source)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean Method_2177(final int n) {
        return this < 0;
    }
    
    public void render(final EntityLivingBase p0, final int p1, final float p2);
    
    public double[] getMotionAngles(final EntityPlayer Variable_21685, final double Variable_21674) {
        final double Variable_21686 = Variable_21685.motionX + (Variable_21685.motionX - Variable_21685.motionX) * Variable_21674 - Variable_21685.prevPosX + (Variable_21685.posX - Variable_21685.prevPosX) * Variable_21674;
        final double Variable_21687 = Variable_21685.motionY + (Variable_21685.motionY - Variable_21685.motionY) * Variable_21674 - Variable_21685.prevPosY + (Variable_21685.posY - Variable_21685.prevPosY) * Variable_21674;
        final double Variable_21688 = Variable_21685.motionZ + (Variable_21685.motionZ - Variable_21685.motionZ) * Variable_21674 - Variable_21685.prevPosZ + (Variable_21685.posZ - Variable_21685.prevPosZ) * Variable_21674;
        final float Variable_21689 = Variable_21685.prevRenderYawOffset + (Variable_21685.renderYawOffset - Variable_21685.prevRenderYawOffset) * (float)Variable_21674;
        final double Variable_21690 = Math.sin(Variable_21689 * 3.1415927f / 180.0f);
        final double Variable_21691 = -Math.cos(Variable_21689 * 3.1415927f / 180.0f);
        final float Variable_21692 = MathHelper.clamp_float((float)Variable_21687 * 10.0f, -6.0f, 32.0f);
        float Variable_21693 = (float)(Variable_21686 * Variable_21690 + Variable_21688 * Variable_21691) * 100.0f;
        final float Variable_21694 = (float)(Variable_21686 * Variable_21691 - Variable_21688 * Variable_21690) * 100.0f;
        if (Method_2177(Method_2178(Variable_21693, 0.0f))) {
            Variable_21693 = 0.0f;
        }
        final double[] array = new double[Model.Field_478[0]];
        array[Model.Field_478[1]] = Math.toRadians(Variable_21693 / 2.5f + Variable_21692 + this.getTailBob(Variable_21685, (float)Variable_21674));
        array[Model.Field_478[2]] = Math.toRadians(-Variable_21694 / 20.0f);
        array[Model.Field_478[3]] = Math.toRadians(Variable_21694 / 2.0f);
        return array;
    }
    
    static {
        Method_2176();
    }
    
    public void setRotationDegrees(final ModelRenderer Variable_21689, final float Variable_21690, final float Variable_21691, final float Variable_21695) {
        this.setRotationRadians(Variable_21689, (float)Math.toRadians(Variable_21690), (float)Math.toRadians(Variable_21691), (float)Math.toRadians(Variable_21695));
    }
    
    public float getTailBob(final EntityPlayer Variable_21698, final float Variable_21699) {
        final float Variable_21700 = Variable_21698.prevCameraYaw + (Variable_21698.cameraYaw - Variable_21698.prevCameraYaw) * Variable_21699;
        return MathHelper.sin((Variable_21698.prevDistanceWalkedModified + (Variable_21698.distanceWalkedModified - Variable_21698.prevDistanceWalkedModified) * Variable_21699) * 6.0f) * 12.0f * Variable_21700;
    }
    
    public int Method_2178(final float n, final float n2) {
        return fcmpg(this, n);
    }
}
