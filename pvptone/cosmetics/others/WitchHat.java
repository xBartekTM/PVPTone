package pvptone.cosmetics.others;

import java.util.*;
import java.nio.charset.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class WitchHat extends Object<WitchHat>
{
    public ModelRenderer root;
    public String[] Field_2646;
    public ModelRenderer wingLeft;
    public ModelRenderer a;
    public ModelRenderer r;
    public ModelRenderer wingRight;
    public int[] Field_2647;
    
    public boolean Method_12030(final int n) {
        return this != 0;
    }
    
    public boolean Method_12031(final int Variable_124389, final int n) {
        return this < Variable_124389;
    }
    
    public void Method_12032() {
        (WitchHat.Field_2646 = new String[WitchHat.Field_2647[11]])[WitchHat.Field_2647[3]] = Method_12034("PioQITg4Kht6HTw/PDojL2ArOj4nKhw8LjlgADQ5ZScJIX9kPwYy", "JOhUM");
    }
    
    public void Method_12033() {
        (WitchHat.Field_2647 = new int[15])[0] = "   ".length();
        WitchHat.Field_2647[1] = (0x0 ^ 0x46 ^ (0x20 ^ 0x4E));
        WitchHat.Field_2647[2] = (0x18 ^ 0x3A);
        WitchHat.Field_2647[3] = ((0x37 ^ 0xD) & ~(0x5B ^ 0x61));
        WitchHat.Field_2647[4] = (0x7C ^ 0x34 ^ (0x2 ^ 0x40));
        WitchHat.Field_2647[5] = "  ".length();
        WitchHat.Field_2647[6] = (0x2B ^ 0x27);
        WitchHat.Field_2647[7] = (0xC2 ^ 0xB2 ^ (0xD6 ^ 0xA1));
        WitchHat.Field_2647[8] = (150 + 155 - 250 + 135 ^ 151 + 10 - 118 + 143);
        WitchHat.Field_2647[9] = (0x55 ^ 0x14 ^ (0x2 ^ 0x54));
        WitchHat.Field_2647[10] = (0x7E ^ 0x61);
        WitchHat.Field_2647[11] = " ".length();
        WitchHat.Field_2647[12] = (0x7 ^ 0x3D ^ (0x67 ^ 0x1D));
        WitchHat.Field_2647[13] = (55 + 47 + 47 + 7 ^ 13 + 48 - 41 + 123);
        WitchHat.Field_2647[14] = (198 + 148 - 210 + 86 ^ 143 + 89 - 167 + 133);
    }
    
    public WitchHat() {
        super(WitchHat.Field_2647[0]);
        this.a = new ModelRenderer((ModelBase)this);
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(WitchHat.Field_2647[1], WitchHat.Field_2647[2]);
        this.r.setTextureOffset(WitchHat.Field_2647[3], WitchHat.Field_2647[3]).addBox(-5.0f, -10.0f, -5.0f, WitchHat.Field_2647[4], WitchHat.Field_2647[5], WitchHat.Field_2647[4]);
        "".length();
        final ModelRenderer Variable_124397 = new ModelRenderer((ModelBase)this).setTextureSize(WitchHat.Field_2647[1], WitchHat.Field_2647[2]);
        Variable_124397.setTextureOffset(WitchHat.Field_2647[3], WitchHat.Field_2647[6]).addBox(-4.0f, -13.0f, -4.0f, WitchHat.Field_2647[7], WitchHat.Field_2647[8], WitchHat.Field_2647[7]);
        "".length();
        Variable_124397.rotateAngleX = -0.05235988f;
        Variable_124397.rotateAngleZ = 0.02617994f;
        this.r.addChild(Variable_124397);
        final ModelRenderer Variable_124398 = new ModelRenderer((ModelBase)this).setTextureSize(WitchHat.Field_2647[1], WitchHat.Field_2647[2]);
        Variable_124398.setTextureOffset(WitchHat.Field_2647[3], WitchHat.Field_2647[9]).addBox(-3.0f, -16.0f, -4.0f, WitchHat.Field_2647[8], WitchHat.Field_2647[8], WitchHat.Field_2647[8]);
        "".length();
        Variable_124398.rotateAngleX = -0.10471976f;
        Variable_124398.rotateAngleZ = 0.05235988f;
        Variable_124397.addChild(Variable_124398);
        final ModelRenderer Variable_124399 = new ModelRenderer((ModelBase)this).setTextureSize(WitchHat.Field_2647[1], WitchHat.Field_2647[2]);
        Variable_124399.setTextureOffset(WitchHat.Field_2647[3], WitchHat.Field_2647[10]).addBox(-3.0f, -17.0f, -6.0f, WitchHat.Field_2647[11], WitchHat.Field_2647[5], WitchHat.Field_2647[11], 0.25f);
        Variable_124399.rotateAngleX = -0.20943952f;
        Variable_124399.rotateAngleZ = 0.10471976f;
        Variable_124398.addChild(Variable_124399);
        final int n = WitchHat.Field_2647[12];
        this.textureHeight = n;
        this.textureWidth = n;
        this.root = new ModelRenderer((ModelBase)this, WitchHat.Field_2647[3], WitchHat.Field_2647[3]);
        (this.wingLeft = new ModelRenderer((ModelBase)this, WitchHat.Field_2647[3], WitchHat.Field_2647[3])).setRotationPoint(0.0f, 2.0f, 3.5f);
        this.wingLeft.addBox(0.0f, -8.0f, 0.0f, WitchHat.Field_2647[13], WitchHat.Field_2647[14], WitchHat.Field_2647[3], 0.0f);
        (this.wingRight = new ModelRenderer((ModelBase)this, WitchHat.Field_2647[3], WitchHat.Field_2647[14])).setRotationPoint(0.0f, 2.0f, 3.5f);
        this.wingRight.addBox(-19.0f, -8.0f, 0.0f, WitchHat.Field_2647[13], WitchHat.Field_2647[14], WitchHat.Field_2647[3], 0.0f);
        this.root.addChild(this.wingLeft);
        this.root.addChild(this.wingRight);
    }
    
    static {
        Method_12033();
        Method_12032();
    }
    
    public String Method_12034(final String Variable_124399, String Variable_124401) {
        Variable_124411 = (char)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_124401 = new StringBuilder();
        final char[] Variable_124412 = Variable_124399.toCharArray();
        int Variable_124413 = WitchHat.Field_2647[3];
        final int Variable_124414 = (Object)((String)this).toCharArray();
        final byte Variable_124415 = (byte)Variable_124414.length;
        short Variable_124416 = (short)WitchHat.Field_2647[3];
        while (Method_12031(Variable_124416, Variable_124415)) {
            final char Variable_124417 = Variable_124414[Variable_124416];
            Variable_124401.append((char)(Variable_124417 ^ Variable_124412[Variable_124413 % Variable_124412.length]));
            "".length();
            ++Variable_124413;
            ++Variable_124416;
            "".length();
            if (((17 + 64 - 70 + 134 ^ 14 + 31 + 5 + 127) & (143 + 62 - 102 + 63 ^ 94 + 120 - 82 + 2 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(Variable_124401);
    }
    
    public void render(final Entity Variable_124417, final float Variable_124419, final float Variable_124416, final float Variable_124425, final float Variable_124418, final float Variable_124421, final float Variable_124423, final ModelPlayer Variable_124420, final int Variable_124415) {
        final Tessellator Variable_124426 = Tessellator.getInstance();
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(WitchHat.Field_2646[WitchHat.Field_2647[3]]));
        if (Method_12030(Variable_124417.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_124420.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_124420.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.a.rotateAngleX = Variable_124420.bipedHead.rotateAngleX - 0.1f;
        this.a.rotateAngleY = Variable_124420.bipedHead.rotateAngleY;
        this.a.rotationPointX = 0.0f;
        this.a.rotationPointY = 0.0f;
        this.r.render(Variable_124423);
        this.a.render(Variable_124423);
        GL11.glPopMatrix();
        GL11.glScaled(0.5, 0.5, 0.5);
    }
}
