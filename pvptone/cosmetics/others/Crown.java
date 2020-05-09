package pvptone.cosmetics.others;

import net.minecraft.client.entity.*;
import net.minecraft.client.*;
import java.util.*;
import java.nio.charset.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;

public class Crown extends Object<Crown>
{
    public int[] Field_969;
    public ModelRenderer crown;
    public ModelRenderer crownDiamond;
    public String[] Field_970;
    public float f;
    
    public float getFirstRotationX(final AbstractClientPlayer Variable_45232, float Variable_45228) {
        if (Method_4445(Minecraft.getMinecraft().thePlayer)) {
            Variable_45228 = interpolateRotation(((AbstractClientPlayer)this).prevRenderYawOffset, ((AbstractClientPlayer)this).renderYawOffset, (float)Variable_45232);
            final float Variable_45233 = interpolateRotation(((AbstractClientPlayer)this).prevRotationYawHead, ((AbstractClientPlayer)this).rotationYawHead, (float)Variable_45232);
            float Variable_45234 = Variable_45233 - Variable_45228;
            if (Method_4450(((AbstractClientPlayer)this).isRiding() ? 1 : 0) && Method_4450((((AbstractClientPlayer)this).ridingEntity instanceof EntityLivingBase) ? 1 : 0)) {
                final EntityLivingBase Variable_45235 = (EntityLivingBase)((AbstractClientPlayer)this).ridingEntity;
                Variable_45228 = interpolateRotation(Variable_45235.prevRenderYawOffset, Variable_45235.renderYawOffset, (float)Variable_45232);
                Variable_45234 = Variable_45233 - Variable_45228;
                float Variable_45236 = MathHelper.wrapAngleTo180_float(Variable_45234);
                if (Method_4443(Method_4451(Variable_45236, -85.0f))) {
                    Variable_45236 = -85.0f;
                }
                if (Method_4448(Method_4439(Variable_45236, 85.0f))) {
                    Variable_45236 = 85.0f;
                }
                Variable_45228 = Variable_45233 - Variable_45236;
                if (Method_4449(Method_4439(Variable_45236 * Variable_45236, 2500.0f))) {
                    final int Variable_45237 = (int)(Variable_45228 + Variable_45236 * 0.2f);
                }
            }
            return Variable_45234;
        }
        return 0.0f;
    }
    
    public float interpolateRotation(final float Variable_45247, final float Variable_45242, float Variable_45246) {
        if (!Method_4445(Minecraft.getMinecraft().thePlayer)) {
            return 0.0f;
        }
        Variable_45246 = (float)(Variable_45247 - this);
        "".length();
        if (null != null) {
            return 0.0f;
        }
        while (!Method_4448(Method_4447(Variable_45246, -180.0f))) {
            Variable_45246 += 360.0f;
        }
        "".length();
        if ("   ".length() == 0) {
            return 0.0f;
        }
        while (!Method_4443(Method_4442(Variable_45246, 180.0f))) {
            Variable_45246 -= 360.0f;
        }
        return (float)(this + Variable_45242 * Variable_45246);
    }
    
    public void Method_4438() {
        (Crown.Field_970 = new String[Crown.Field_969[6]])[Crown.Field_969[1]] = Method_4446("IisrETQkKyBKESA+BwovM2EQCjI7KycMIiVhOwQ1eS0hCjY4YCMLJg==", "VNSeA");
    }
    
    public int Method_4439(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public boolean Method_4440(final int Variable_45251, final int n) {
        return this >= Variable_45251;
    }
    
    public void Method_4441() {
        (Crown.Field_969 = new int[11])[0] = (0x16 ^ 0x54 ^ (0x6A ^ 0x20));
        Crown.Field_969[1] = ((0xA6 ^ 0xAC) & ~(0xAE ^ 0xA4));
        Crown.Field_969[2] = (0xE0 ^ 0xA3 ^ (0x19 ^ 0x4C));
        Crown.Field_969[3] = (0xD ^ 0xA);
        Crown.Field_969[4] = (55 + 37 - 58 + 135 ^ 0 + 60 + 87 + 26);
        Crown.Field_969[5] = "  ".length();
        Crown.Field_969[6] = " ".length();
        Crown.Field_969[7] = (70 + 64 - 132 + 139 ^ 5 + 131 - 59 + 59);
        Crown.Field_969[8] = "   ".length();
        Crown.Field_969[9] = (0x2 ^ 0x6A ^ (0x10 ^ 0x74));
        Crown.Field_969[10] = (0xDB ^ 0x87 ^ (0x4E ^ 0x48));
    }
    
    public int Method_4442(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public boolean Method_4443(final int n) {
        return this < 0;
    }
    
    public Crown() {
        super(Crown.Field_969[0]);
        this.crown = new ModelRenderer((ModelBase)this, Crown.Field_969[1], Crown.Field_969[1]).setTextureSize(Crown.Field_969[2], Crown.Field_969[3]);
        this.crown.setTextureOffset(Crown.Field_969[4], Crown.Field_969[1]).addBox(-4.0f, 0.0f, -5.0f, Crown.Field_969[0], Crown.Field_969[5], Crown.Field_969[6], Crown.f);
        this.crown.setTextureOffset(Crown.Field_969[1], Crown.Field_969[1]).addBox(-5.0f, -2.0f, -5.0f, Crown.Field_969[6], Crown.Field_969[4], Crown.Field_969[6], Crown.f);
        this.crown.setTextureOffset(Crown.Field_969[1], Crown.Field_969[7]).addBox(-4.0f, -1.0f, -5.0f, Crown.Field_969[6], Crown.Field_969[6], Crown.Field_969[6], Crown.f);
        this.crown.setTextureOffset(Crown.Field_969[1], Crown.Field_969[7]).addBox(3.0f, -1.0f, -5.0f, Crown.Field_969[6], Crown.Field_969[6], Crown.Field_969[6], Crown.f);
        this.crown.setTextureOffset(Crown.Field_969[4], Crown.Field_969[7]).addBox(-1.5f, -1.0f, -5.0f, Crown.Field_969[8], Crown.Field_969[6], Crown.Field_969[6], Crown.f);
        this.crown.setTextureOffset(Crown.Field_969[1], Crown.Field_969[7]).addBox(-0.5f, -2.0f, -5.0f, Crown.Field_969[6], Crown.Field_969[6], Crown.Field_969[6], Crown.f);
        (this.crownDiamond = new ModelRenderer((ModelBase)this, Crown.Field_969[9], Crown.Field_969[7]).setTextureSize(Crown.Field_969[2], Crown.Field_969[3])).addBox(-0.5f, -0.0f, -6.0f, Crown.Field_969[6], Crown.Field_969[6], Crown.Field_969[6], Crown.f);
        this.crownDiamond.rotateAngleZ = 0.8f;
        this.crownDiamond.rotationPointZ = 0.5f;
        this.crownDiamond.rotationPointX = 0.4f;
    }
    
    public boolean Method_4444(final int Variable_45255, final int n) {
        return this < Variable_45255;
    }
    
    public boolean Method_4445(final Object o) {
        return this != null;
    }
    
    public String Method_4446(final String Variable_45262, String Variable_45272) {
        Variable_45261 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_45272 = new StringBuilder();
        final char[] Variable_45273 = Variable_45262.toCharArray();
        int Variable_45274 = Crown.Field_969[1];
        final boolean Variable_45275 = (Object)((String)this).toCharArray();
        final char Variable_45276 = (char)Variable_45275.length;
        long Variable_45277 = Crown.Field_969[1];
        while (Method_4444((int)Variable_45277, Variable_45276)) {
            final char Variable_45278 = Variable_45275[Variable_45277];
            Variable_45272.append((char)(Variable_45278 ^ Variable_45273[Variable_45274 % Variable_45273.length]));
            "".length();
            ++Variable_45274;
            ++Variable_45277;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_45272);
    }
    
    public int Method_4447(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public boolean Method_4448(final int n) {
        return this >= 0;
    }
    
    static {
        Method_4441();
        Method_4438();
        Crown.f = 0.02f;
    }
    
    public boolean Method_4449(final int n) {
        return this > 0;
    }
    
    public void render(final Entity Variable_45275, final float Variable_45297, final float Variable_45283, final float Variable_45278, final float Variable_45280, final float Variable_45281, final float Variable_45279, final ModelPlayer Variable_45287, final int Variable_45282) {
        final float Variable_45298 = getFirstRotationX((AbstractClientPlayer)Variable_45275, Crown.f);
        final float Variable_45299 = getSecondRotationX((AbstractClientPlayer)Variable_45275, Crown.f);
        int Variable_45300 = Crown.Field_969[1];
        "".length();
        if ("  ".length() < -" ".length()) {
            return;
        }
        while (!Method_4440(Variable_45300, Crown.Field_969[4])) {
            GlStateManager.pushMatrix();
            GlStateManager.color(1.0f, 1.0f, 1.0f);
            GlStateManager.rotate(Variable_45298, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(Variable_45299, 1.0f, 0.0f, 0.0f);
            final float Variable_45301 = 1.085f;
            GlStateManager.scale(Variable_45301, Variable_45301, Variable_45301);
            if (Method_4450(Variable_45275.isSneaking() ? 1 : 0)) {
                final float Variable_45302 = Variable_45275.rotationPitch * -7.0E-4f;
                GlStateManager.translate(0.0, 0.06f - Math.abs(Variable_45302) + 0.02, (double)Variable_45302);
            }
            GlStateManager.rotate((float)(Crown.Field_969[10] * Variable_45300), 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.0, -0.4753, 0.0);
            Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Crown.Field_970[Crown.Field_969[1]]));
            this.crown.isHidden = (Crown.Field_969[1] != 0);
            this.crown.render(0.0571f);
            this.crown.isHidden = (Crown.Field_969[6] != 0);
            this.crownDiamond.isHidden = (Crown.Field_969[1] != 0);
            this.crownDiamond.rotateAngleZ = 0.8f;
            this.crownDiamond.rotationPointZ = 0.6f;
            this.crownDiamond.rotationPointX = 0.4f;
            GlStateManager.translate(-0.22f, 0.0f, 0.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f);
            GL11.glColor4f(0.4f, 0.0f, 0.2f, 255.0f);
            int Variable_45303 = Crown.Field_969[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!Method_4440(Variable_45303, Crown.Field_969[8])) {
                this.crownDiamond.render(0.0561f);
                GlStateManager.translate(0.218f, 0.0f, 0.0f);
                ++Variable_45303;
            }
            GL11.glColor3d(1.0, 1.0, 1.0);
            GlStateManager.color(1.0f, 1.0f, 1.0f);
            this.crownDiamond.isHidden = (Crown.Field_969[6] != 0);
            GlStateManager.popMatrix();
            ++Variable_45300;
        }
    }
    
    public boolean Method_4450(final int n) {
        return this != 0;
    }
    
    public float getSecondRotationX(final AbstractClientPlayer Variable_45299, final float n) {
        if (Method_4445(Minecraft.getMinecraft().thePlayer)) {
            return (float)(((AbstractClientPlayer)this).prevRotationPitch + (((AbstractClientPlayer)this).rotationPitch - ((AbstractClientPlayer)this).prevRotationPitch) * Variable_45299);
        }
        return 0.0f;
    }
    
    public int Method_4451(final float n, final float n2) {
        return fcmpg(this, n);
    }
}
