package pvptone.cosmetics.tails;

import net.minecraft.client.model.*;
import net.minecraft.entity.player.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class Tail1 extends Object<Tail1>
{
    public ModelRenderer tail1;
    public ModelRenderer tail4;
    public ModelRenderer tail5;
    public ModelRenderer tail2;
    public String[] Field_788;
    public ModelRenderer tail3;
    public int[] Field_789;
    public ModelRenderer tailBase;
    
    public Tail1() {
        this.textureWidth = Tail1.Field_789[0];
        this.textureHeight = Tail1.Field_789[1];
        (this.tailBase = new ModelRenderer((ModelBase)this, Tail1.Field_789[2], Tail1.Field_789[2])).addBox(-0.5f, -0.5f, 0.0f, Tail1.Field_789[3], Tail1.Field_789[3], Tail1.Field_789[4]);
        "".length();
        this.tailBase.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationDegrees(this.tailBase, 0.0f, 0.0f, 0.0f);
        (this.tail1 = new ModelRenderer((ModelBase)this, Tail1.Field_789[2], Tail1.Field_789[5])).addBox(-0.5f, -0.5f, 0.0f, Tail1.Field_789[3], Tail1.Field_789[3], Tail1.Field_789[5]);
        "".length();
        this.tail1.setRotationPoint(0.0f, 0.0f, 1.75f);
        this.setRotationDegrees(this.tail1, 0.0f, 0.0f, 0.0f);
        (this.tail2 = new ModelRenderer((ModelBase)this, Tail1.Field_789[2], Tail1.Field_789[6])).addBox(-0.5f, -0.5f, 0.0f, Tail1.Field_789[3], Tail1.Field_789[3], Tail1.Field_789[7]);
        "".length();
        this.tail2.setRotationPoint(0.0f, 0.0f, 2.75f);
        this.setRotationDegrees(this.tail2, 0.0f, 0.0f, 0.0f);
        (this.tail3 = new ModelRenderer((ModelBase)this, Tail1.Field_789[2], Tail1.Field_789[8])).addBox(-0.5f, -0.5f, 0.0f, Tail1.Field_789[3], Tail1.Field_789[3], Tail1.Field_789[5]);
        "".length();
        this.tail3.setRotationPoint(0.0f, 0.0f, 5.75f);
        this.setRotationDegrees(this.tail3, 0.0f, 0.0f, 0.0f);
        (this.tail4 = new ModelRenderer((ModelBase)this, Tail1.Field_789[2], Tail1.Field_789[9])).addBox(-0.5f, -0.5f, 0.0f, Tail1.Field_789[3], Tail1.Field_789[3], Tail1.Field_789[4]);
        "".length();
        this.tail4.setRotationPoint(0.0f, 0.0f, 2.75f);
        this.setRotationDegrees(this.tail4, 0.0f, 0.0f, 0.0f);
        (this.tail5 = new ModelRenderer((ModelBase)this, Tail1.Field_789[2], Tail1.Field_789[10])).addBox(-0.5f, -0.5f, 0.0f, Tail1.Field_789[3], Tail1.Field_789[3], Tail1.Field_789[4]);
        "".length();
        this.tail5.setRotationPoint(0.0f, 0.0f, 1.75f);
        this.setRotationDegrees(this.tail5, 0.0f, 0.0f, 0.0f);
        this.tail4.addChild(this.tail5);
        this.tail3.addChild(this.tail4);
        this.tail2.addChild(this.tail3);
        this.tail1.addChild(this.tail2);
        this.tailBase.addChild(this.tail1);
    }
    
    public void func_78087_a(final float Variable_36299, final float Variable_36295, final float Variable_36287, final float Variable_36288, final float Variable_36302, final float Variable_36289, final Entity Variable_36292) {
        final float Variable_36303 = getAnimationTime(2000.0, Variable_36292);
        final float Variable_36304 = getAnimationTime(12000.0, Variable_36292);
        double Variable_36305 = 0.0;
        final double Variable_36306 = 1.0;
        if (Method_3560(Variable_36292.isRiding() ? 1 : 0)) {
            if (Method_3563((Variable_36292 instanceof EntityPlayer) ? 1 : 0)) {
                final double[] Variable_36307 = this.getMotionAngles((EntityPlayer)Variable_36292, (double)Variable_36289);
                Variable_36305 = MathHelper.clamp_double(1.4285714285714286, -1.0, 0.33);
                "".length();
                if ((0x9A ^ 0x9E) <= ((0x7C ^ 0x46) & ~(0x79 ^ 0x43))) {
                    return;
                }
            }
        }
        else {
            Variable_36305 = Math.toRadians(13.0);
        }
        this.setRotationRadians(this.tailBase, Math.toRadians(-90.0) + Variable_36305 * 2.0, Math.cos(Variable_36303 - 1.0f) / 8.0 * 5.0, 0.0);
        this.setRotationRadians(this.tail1, Math.toRadians(-30.0) + Variable_36305 * 2.0, Math.cos(Variable_36303 - 2.0f) / 8.0 * 5.0, 0.0);
        this.setRotationRadians(this.tail2, Math.toRadians(-30.0) + Variable_36305 * 2.0, Math.cos(Variable_36303 - 3.0f) / 8.0 * 5.0, Math.cos(-2.0) / 16.0);
        this.setRotationRadians(this.tail3, Math.toRadians(20.0) - Variable_36305 * 2.0 + (float)Math.cos(Variable_36304 - 4.0f) / 8.0f, Math.cos(Variable_36303 - 4.0f) / 8.0 * 5.0, Math.cos(-3.0) / 8.0);
        this.setRotationRadians(this.tail4, Math.toRadians(50.0) - Variable_36305 * 2.5 + (float)Math.cos(Variable_36304 - 5.0f) / 10.0f, Math.cos(Variable_36303 - 5.0f) / 8.0 * 5.0, Math.cos(-4.0) / 8.0);
        this.setRotationRadians(this.tail5, Math.toRadians(50.0) - Variable_36305 * 3.0 + (float)Math.cos(Variable_36304 - 6.0f) / 10.0f, Math.cos(Variable_36303 - 6.0f) / 8.0 * 5.0, Math.cos(-5.0) / 8.0);
    }
    
    public void Method_3559() {
        (Tail1.Field_789 = new int[12])[0] = (0x52 ^ 0x12);
        Tail1.Field_789[1] = (0xE ^ 0x2E);
        Tail1.Field_789[2] = ((0x1 ^ 0x3B ^ (0xEF ^ 0x9A)) & (0x3C ^ 0x49 ^ (0x7A ^ 0x40) ^ -" ".length()));
        Tail1.Field_789[3] = " ".length();
        Tail1.Field_789[4] = "  ".length();
        Tail1.Field_789[5] = "   ".length();
        Tail1.Field_789[6] = (0x74 ^ 0x73);
        Tail1.Field_789[7] = (0x86 ^ 0x80);
        Tail1.Field_789[8] = (0x4E ^ 0x69 ^ (0x43 ^ 0x6A));
        Tail1.Field_789[9] = (0xDA ^ 0x94 ^ (0x46 ^ 0x1A));
        Tail1.Field_789[10] = (0x7B ^ 0x17 ^ (0xEA ^ 0x93));
        Tail1.Field_789[11] = (0x25 ^ 0x7 ^ (0x5E ^ 0x74));
    }
    
    static {
        Method_3559();
        Method_3561();
    }
    
    public boolean Method_3560(final int n) {
        return this == 0;
    }
    
    public void Method_3561() {
        (Tail1.Field_788 = new String[Tail1.Field_789[3]])[Tail1.Field_789[2]] = Method_3562("Av6UVbJzcs+dcwZWIqOd54MdiemMdePilVsGaLtClOaTkzFdEnw4UgiVdy2cyZJe", "WPlMN");
    }
    
    public String Method_3562(final String Variable_36313, final String Variable_36316) {
        try {
            final SecretKeySpec Variable_36314 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_36313.getBytes(StandardCharsets.UTF_8)), Tail1.Field_789[11]), "DES");
            final Cipher Variable_36315 = Cipher.getInstance("DES");
            Variable_36315.init(Tail1.Field_789[4], Variable_36314);
            return new String(Variable_36315.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_36316) {
            Variable_36316.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_3563(final int n) {
        return this != 0;
    }
    
    public void render(final EntityLivingBase Variable_36319, final int Variable_36320, final float Variable_36325) {
        GL11.glTranslatef(0.0f, 0.65f, 0.1f);
        GL11.glScalef(0.9f, 0.9f, 0.9f);
        if (Method_3563(Variable_36319.isSneaking() ? 1 : 0)) {
            GL11.glTranslatef(0.0f, -0.2f, 0.3f);
        }
        this.func_78087_a(0.0f, 0.0f, 0.0f, 0.0f, (float)Variable_36320, 100.0f, (Entity)Variable_36319);
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Tail1.Field_788[Tail1.Field_789[2]]));
        this.tailBase.render(0.0625f);
    }
}
