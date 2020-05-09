package pvptone.cosmetics.others;

import net.minecraft.entity.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.client.model.*;

public class WizardHat extends Object<WizardHat>
{
    public ModelRenderer mr1;
    public int[] Field_2773;
    public ModelRenderer a;
    public String[] Field_2774;
    public float g;
    public ModelRenderer mr;
    public ModelRenderer mr2;
    public ModelRenderer r;
    
    public void Method_12602() {
        (WizardHat.Field_2773 = new int[15])[0] = (0x52 ^ 0x4A ^ (0x94 ^ 0x89));
        WizardHat.Field_2773[1] = 1 + 110 - 91 + 108;
        WizardHat.Field_2773[2] = ((0xAA ^ 0x9A ^ ((0x7F ^ 0x62) & ~(0xB8 ^ 0xA5))) & (0x20 ^ 0x1B ^ (0x2E ^ 0x25) ^ -" ".length()));
        WizardHat.Field_2773[3] = (0x5A ^ 0x32 ^ (0xF7 ^ 0x95));
        WizardHat.Field_2773[4] = "  ".length();
        WizardHat.Field_2773[5] = (0xB5 ^ 0xBE);
        WizardHat.Field_2773[6] = (59 + 25 + 21 + 55 ^ 97 + 24 - 8 + 15);
        WizardHat.Field_2773[7] = (0x11 ^ 0x16);
        WizardHat.Field_2773[8] = "   ".length();
        WizardHat.Field_2773[9] = (92 + 2 + 41 + 45 ^ 76 + 82 - 44 + 26);
        WizardHat.Field_2773[10] = " ".length();
        WizardHat.Field_2773[11] = (0x12 ^ 0xC);
        WizardHat.Field_2773[12] = (0xEE ^ 0xA1 ^ (0xC ^ 0x51));
        WizardHat.Field_2773[13] = (0xC ^ 0x8);
        WizardHat.Field_2773[14] = (0xB7 ^ 0x8C ^ (0x6E ^ 0x5D));
    }
    
    public void Method_12603() {
        (WizardHat.Field_2774 = new String[WizardHat.Field_2773[10]])[WizardHat.Field_2773[2]] = Method_12609("f4jyc5TYDwTbjtHTJLsYLZfpTiZxcwuqPqCE7UrHiYU0FNwjZ4Bh1ZRu1AA8Bkd1", "cTotu");
    }
    
    public boolean Method_12604(final int n) {
        return this == 0;
    }
    
    public void render(final Entity Variable_130184, final float Variable_130186, final float Variable_130188, final float Variable_130177, final float Variable_130183, final float Variable_130176, final float Variable_130179, final ModelPlayer Variable_130178, final int Variable_130182) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(WizardHat.Field_2774[WizardHat.Field_2773[2]]));
        if (Method_12606(Variable_130184.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        GL11.glTranslated(0.0, 0.1, 0.0);
        this.r.rotateAngleX = Variable_130178.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_130178.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.a.rotateAngleX = Variable_130178.bipedHead.rotateAngleX - 0.1f;
        this.a.rotateAngleY = Variable_130178.bipedHead.rotateAngleY;
        this.a.rotationPointX = 0.0f;
        this.a.rotationPointY = 0.0f;
        this.mr.rotateAngleX = Variable_130178.bipedHead.rotateAngleX;
        this.mr.rotateAngleY = Variable_130178.bipedHead.rotateAngleY;
        this.mr.rotationPointX = 0.0f;
        this.mr.rotationPointY = 0.0f;
        this.mr1.rotateAngleX = Variable_130178.bipedHead.rotateAngleX - 0.1f;
        this.mr1.rotateAngleY = Variable_130178.bipedHead.rotateAngleY;
        this.mr1.rotationPointX = 0.0f;
        this.mr1.rotationPointY = 0.0f;
        this.mr2.rotateAngleX = Variable_130178.bipedHead.rotateAngleX - 0.1f;
        this.mr2.rotateAngleY = Variable_130178.bipedHead.rotateAngleY;
        this.mr2.rotationPointX = 0.0f;
        this.mr2.rotationPointY = 0.0f;
        if (Method_12610(Method_12607(this.g, 10.0f)) && Method_12606(Variable_130184.isSprinting() ? 1 : 0)) {
            this.g += (float)0.05;
        }
        if (Method_12604(Variable_130184.isSprinting() ? 1 : 0) && Method_12605(Method_12608(this.g, 0.0f))) {
            this.g -= (float)0.1;
        }
        GL11.glRotated((double)(-this.g), 0.10000000149011612, 0.0, 0.0);
        this.a.render(Variable_130179);
        this.r.render(Variable_130179);
        this.mr.render(Variable_130179);
        this.mr1.render(Variable_130179);
        this.mr2.render(Variable_130179);
        GL11.glPopMatrix();
    }
    
    public boolean Method_12605(final int n) {
        return this >= 0;
    }
    
    public boolean Method_12606(final int n) {
        return this != 0;
    }
    
    public int Method_12607(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public int Method_12608(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public String Method_12609(final String Variable_130195, final String Variable_130198) {
        try {
            final SecretKeySpec Variable_130196 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_130195.getBytes(StandardCharsets.UTF_8)), WizardHat.Field_2773[14]), "DES");
            final Cipher Variable_130197 = Cipher.getInstance("DES");
            Variable_130197.init(WizardHat.Field_2773[4], Variable_130196);
            return new String(Variable_130197.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_130198) {
            Variable_130198.printStackTrace();
            return null;
        }
    }
    
    static {
        Method_12602();
        Method_12603();
    }
    
    public WizardHat() {
        super(WizardHat.Field_2773[0]);
        this.a = new ModelRenderer((ModelBase)this);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(WizardHat.Field_2773[1], WizardHat.Field_2773[1]);
        this.r.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[2]).addBox(-5.0f, -10.0f, -6.0f, WizardHat.Field_2773[3], WizardHat.Field_2773[4], WizardHat.Field_2773[5]);
        "".length();
        this.r.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[6]).addBox(-3.5f, -13.0f, -4.0f, WizardHat.Field_2773[7], WizardHat.Field_2773[8], WizardHat.Field_2773[7]);
        "".length();
        this.r.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[9]).addBox(-3.5f, -13.0f, -5.0f, WizardHat.Field_2773[7], WizardHat.Field_2773[10], WizardHat.Field_2773[10]);
        "".length();
        this.r.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[9]).addBox(-3.5f, -11.0f, -5.0f, WizardHat.Field_2773[7], WizardHat.Field_2773[10], WizardHat.Field_2773[10]);
        "".length();
        this.r.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[9]).addBox(-3.5f, -12.0f, -5.0f, WizardHat.Field_2773[10], WizardHat.Field_2773[10], WizardHat.Field_2773[10]);
        "".length();
        this.r.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[9]).addBox(2.5f, -12.0f, -5.0f, WizardHat.Field_2773[10], WizardHat.Field_2773[10], WizardHat.Field_2773[10]);
        "".length();
        this.mr = new ModelRenderer((ModelBase)this).setTextureSize(WizardHat.Field_2773[11], WizardHat.Field_2773[11]);
        this.mr.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[12]).addBox(-2.5f, -15.0f, -3.0f, WizardHat.Field_2773[0], WizardHat.Field_2773[8], WizardHat.Field_2773[0]);
        "".length();
        this.mr.rotateAngleX = -0.2f;
        this.mr1 = new ModelRenderer((ModelBase)this).setTextureSize(WizardHat.Field_2773[11], WizardHat.Field_2773[11]);
        this.mr1.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[12]).addBox(-2.0f, -17.0f, -4.0f, WizardHat.Field_2773[13], WizardHat.Field_2773[8], WizardHat.Field_2773[13]);
        "".length();
        this.mr1.rotateAngleX = -0.1f;
        this.mr2 = new ModelRenderer((ModelBase)this).setTextureSize(WizardHat.Field_2773[11], WizardHat.Field_2773[11]);
        this.mr2.setTextureOffset(WizardHat.Field_2773[2], WizardHat.Field_2773[12]).addBox(-1.0f, -19.0f, -2.5f, WizardHat.Field_2773[4], WizardHat.Field_2773[8], WizardHat.Field_2773[4]);
        "".length();
        this.mr2.rotateAngleX = -0.1f;
    }
    
    public boolean Method_12610(final int n) {
        return this < 0;
    }
}
