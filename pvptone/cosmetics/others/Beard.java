package pvptone.cosmetics.others;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class Beard extends Object<Beard>
{
    public int[] Field_2122;
    public String[] Field_2123;
    public float g;
    public ModelRenderer r;
    
    public void Method_9647() {
        (Beard.Field_2122 = new int[10])[0] = (0x5D ^ 0x5B);
        Beard.Field_2122[1] = (39 + 74 + 48 + 2 ^ 24 + 29 + 54 + 32);
        Beard.Field_2122[2] = (0x4C ^ 0x6E);
        Beard.Field_2122[3] = ((0xDB ^ 0x8C) & ~(0xF2 ^ 0xA5));
        Beard.Field_2122[4] = (0x46 ^ 0x60 ^ (0xAD ^ 0x81));
        Beard.Field_2122[5] = "   ".length();
        Beard.Field_2122[6] = "  ".length();
        Beard.Field_2122[7] = (0x7C ^ 0x74);
        Beard.Field_2122[8] = (0x9D ^ 0x99);
        Beard.Field_2122[9] = " ".length();
    }
    
    public boolean Method_9648(final int n) {
        return this != 0;
    }
    
    public boolean Method_9649(final int n) {
        return this < 0;
    }
    
    public boolean Method_9650(final int n) {
        return this >= 0;
    }
    
    public int Method_9651(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public int Method_9652(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    static {
        Method_9647();
        Method_9653();
    }
    
    public void Method_9653() {
        (Beard.Field_2123 = new String[Beard.Field_2122[9]])[Beard.Field_2122[3]] = Method_9654("ru7dY1Sf3NnWQJZo00qc//mjPlN16umkOWjSaeWpTKojp0VhAm+d26a92j40rMqb", "XhbLu");
    }
    
    public String Method_9654(final String Variable_100381, final String Variable_100384) {
        try {
            final SecretKeySpec Variable_100382 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_100381.getBytes(StandardCharsets.UTF_8)), Beard.Field_2122[7]), "DES");
            final Cipher Variable_100383 = Cipher.getInstance("DES");
            Variable_100383.init(Beard.Field_2122[6], Variable_100382);
            return new String(Variable_100383.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_100384) {
            Variable_100384.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_9655(final int n) {
        return this == 0;
    }
    
    public Beard() {
        super(Beard.Field_2122[0]);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(Beard.Field_2122[1], Beard.Field_2122[2]);
        this.r.setTextureOffset(Beard.Field_2122[3], Beard.Field_2122[3]).addBox(-5.0f, -1.0f, -5.0f, Beard.Field_2122[4], Beard.Field_2122[5], Beard.Field_2122[6]);
        "".length();
        this.r.setTextureOffset(Beard.Field_2122[3], Beard.Field_2122[3]).addBox(-4.0f, 1.0f, -4.9f, Beard.Field_2122[7], Beard.Field_2122[5], Beard.Field_2122[6]);
        "".length();
        this.r.setTextureOffset(Beard.Field_2122[3], Beard.Field_2122[3]).addBox(-3.0f, 3.0f, -4.8f, Beard.Field_2122[0], Beard.Field_2122[5], Beard.Field_2122[6]);
        "".length();
        this.r.setTextureOffset(Beard.Field_2122[3], Beard.Field_2122[3]).addBox(-2.0f, 5.0f, -4.7f, Beard.Field_2122[8], Beard.Field_2122[5], Beard.Field_2122[6]);
        "".length();
        this.r.setTextureOffset(Beard.Field_2122[3], Beard.Field_2122[3]).addBox(-1.0f, 7.0f, -4.6f, Beard.Field_2122[6], Beard.Field_2122[5], Beard.Field_2122[6]);
        "".length();
    }
    
    public void render(final Entity Variable_100387, final float Variable_100386, final float Variable_100391, final float Variable_100393, final float Variable_100396, final float Variable_100388, final float Variable_100395, final ModelPlayer Variable_100389, final int Variable_100394) {
        if (Method_9649(Method_9651(this.g, 20.0f)) && Method_9648(Variable_100387.isSprinting() ? 1 : 0)) {
            this.g += (float)0.05;
        }
        if (Method_9655(Variable_100387.isSprinting() ? 1 : 0) && Method_9650(Method_9652(this.g, 0.0f))) {
            this.g -= (float)0.1;
        }
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Beard.Field_2123[Beard.Field_2122[3]]));
        if (Method_9648(Variable_100387.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_100389.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_100389.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        GL11.glRotated((double)this.g, 0.10000000149011612, 0.0, 0.0);
        this.r.render(Variable_100395);
        GL11.glPopMatrix();
    }
}
