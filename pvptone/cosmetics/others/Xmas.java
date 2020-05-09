package pvptone.cosmetics.others;

import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class Xmas extends Object<Xmas>
{
    public int[] Field_2277;
    public ModelRenderer r;
    public String[] Field_2278;
    
    public boolean Method_10397(final int n) {
        return this != 0;
    }
    
    public Xmas() {
        super(Xmas.Field_2277[0]);
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(Xmas.Field_2277[1], Xmas.Field_2277[2]);
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[3]).addBox(-5.5f, -9.0f, -5.5f, Xmas.Field_2277[4], Xmas.Field_2277[5], Xmas.Field_2277[4]);
        "".length();
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[3]).addBox(-5.5f, -8.0f, -5.5f, Xmas.Field_2277[4], Xmas.Field_2277[5], Xmas.Field_2277[4]);
        "".length();
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[3]).addBox(-5.5f, -7.0f, -5.5f, Xmas.Field_2277[4], Xmas.Field_2277[5], Xmas.Field_2277[4]);
        "".length();
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[6]).addBox(-4.0f, -11.0f, -4.0f, Xmas.Field_2277[7], Xmas.Field_2277[8], Xmas.Field_2277[7]);
        "".length();
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[6]).addBox(-3.0f, -13.0f, -3.0f, Xmas.Field_2277[0], Xmas.Field_2277[8], Xmas.Field_2277[0]);
        "".length();
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[6]).addBox(-3.0f, -15.0f, -2.0f, Xmas.Field_2277[9], Xmas.Field_2277[9], Xmas.Field_2277[9]);
        "".length();
        this.r.setTextureOffset(Xmas.Field_2277[3], Xmas.Field_2277[3]).addBox(-5.0f, -16.0f, -1.5f, Xmas.Field_2277[10], Xmas.Field_2277[8], Xmas.Field_2277[10]);
        "".length();
    }
    
    public void Method_10398() {
        (Xmas.Field_2277 = new int[11])[0] = (0x16 ^ 0x2A ^ (0x77 ^ 0x4D));
        Xmas.Field_2277[1] = (0x1 ^ 0x19 ^ (0x9C ^ 0xAC));
        Xmas.Field_2277[2] = (0x19 ^ 0x3B);
        Xmas.Field_2277[3] = ((0x8C ^ 0xA4) & ~(0xAC ^ 0x84));
        Xmas.Field_2277[4] = (0x1E ^ 0x15);
        Xmas.Field_2277[5] = " ".length();
        Xmas.Field_2277[6] = (0xAD ^ 0xB9);
        Xmas.Field_2277[7] = (0xA4 ^ 0xAC);
        Xmas.Field_2277[8] = "  ".length();
        Xmas.Field_2277[9] = (0x7C ^ 0x78);
        Xmas.Field_2277[10] = "   ".length();
    }
    
    static {
        Method_10398();
        Method_10399();
    }
    
    public void render(final Entity Variable_107646, final float Variable_107652, final float Variable_107657, final float Variable_107645, final float Variable_107651, final float Variable_107649, final float Variable_107650, final ModelPlayer Variable_107647, final int Variable_107656) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Xmas.Field_2278[Xmas.Field_2277[3]]));
        if (Method_10397(Variable_107646.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_107647.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_107647.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_107650);
        GL11.glPopMatrix();
    }
    
    public void Method_10399() {
        (Xmas.Field_2278 = new String[Xmas.Field_2277[5]])[Xmas.Field_2277[3]] = Method_10400("+OzkQg25gcrnicM6lOr98jPZYNlJ6Nb34cE1+tP2ogzNrGG7RKYtpg==", "zKKmh");
    }
    
    public String Method_10400(final String Variable_107660, String Variable_107661) {
        try {
            Variable_107661 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_107660.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_107662 = Cipher.getInstance("Blowfish");
            Variable_107662.init(Xmas.Field_2277[8], Variable_107661);
            return new String(Variable_107662.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_107663) {
            Variable_107663.printStackTrace();
            return null;
        }
    }
}
