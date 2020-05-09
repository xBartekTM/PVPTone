package pvptone.cosmetics.others;

import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import java.util.*;
import java.nio.charset.*;

public class SurgicalMask extends Object<SurgicalMask>
{
    public ModelRenderer r;
    public String[] Field_2247;
    public float g;
    public int[] Field_2248;
    
    public SurgicalMask() {
        super(SurgicalMask.Field_2248[0]);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(SurgicalMask.Field_2248[1], SurgicalMask.Field_2248[1]);
        this.r.setTextureOffset(SurgicalMask.Field_2248[2], SurgicalMask.Field_2248[2]).addBox(-5.0f, -9.0f, -4.1f, SurgicalMask.Field_2248[3], SurgicalMask.Field_2248[3], SurgicalMask.Field_2248[4]);
        "".length();
    }
    
    public void Method_10255() {
        (SurgicalMask.Field_2247 = new String[SurgicalMask.Field_2248[4]])[SurgicalMask.Field_2248[2]] = Method_10257("AyEzFTYFIThOEwE0Hw4tEmsIDjAaIT8IIARrIwA3WCkqEigWHA9PMxkj", "wDKaC");
    }
    
    public boolean Method_10256(final int Variable_106160, final int n) {
        return this < Variable_106160;
    }
    
    public void render(final Entity Variable_106168, final float Variable_106163, final float Variable_106171, final float Variable_106162, final float Variable_106173, final float Variable_106170, final float Variable_106172, final ModelPlayer Variable_106164, final int Variable_106165) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(SurgicalMask.Field_2247[SurgicalMask.Field_2248[2]]));
        if (Method_10259(Variable_106168.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_106164.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_106164.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_106172);
        GL11.glPopMatrix();
    }
    
    public String Method_10257(final String Variable_106176, String Variable_106190) {
        Variable_106188 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_106190 = new StringBuilder();
        final char[] Variable_106191 = Variable_106176.toCharArray();
        int Variable_106192 = SurgicalMask.Field_2248[2];
        final float Variable_106193 = (Object)((String)this).toCharArray();
        final boolean Variable_106194 = Variable_106193.length != 0;
        byte Variable_106195 = (byte)SurgicalMask.Field_2248[2];
        while (Method_10256(Variable_106195, Variable_106194 ? 1 : 0)) {
            final char Variable_106196 = Variable_106193[Variable_106195];
            Variable_106190.append((char)(Variable_106196 ^ Variable_106191[Variable_106192 % Variable_106191.length]));
            "".length();
            ++Variable_106192;
            ++Variable_106195;
            "".length();
            if ((45 + 13 + 13 + 56 ^ (0xD9 ^ 0xA3)) <= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_106190);
    }
    
    public void Method_10258() {
        (SurgicalMask.Field_2248 = new int[5])[0] = (0xB2 ^ 0x94 ^ (0xA6 ^ 0x8B));
        SurgicalMask.Field_2248[1] = (0xBE ^ 0xB2);
        SurgicalMask.Field_2248[2] = ((0x44 ^ 0x3F ^ (0x61 ^ 0x20)) & (0xC1 ^ 0xAC ^ (0xEA ^ 0xBD) ^ -" ".length()));
        SurgicalMask.Field_2248[3] = (0x6 ^ 0xC);
        SurgicalMask.Field_2248[4] = " ".length();
    }
    
    static {
        Method_10258();
        Method_10255();
    }
    
    public boolean Method_10259(final int n) {
        return this != 0;
    }
}
