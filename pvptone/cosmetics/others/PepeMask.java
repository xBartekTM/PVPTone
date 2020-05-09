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

public class PepeMask extends Object<PepeMask>
{
    public String[] Field_2615;
    public ModelRenderer r;
    public float g;
    public int[] Field_2616;
    
    static {
        Method_11895();
        Method_11897();
    }
    
    public PepeMask() {
        super(PepeMask.Field_2616[0]);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(PepeMask.Field_2616[1], PepeMask.Field_2616[1]);
        this.r.setTextureOffset(PepeMask.Field_2616[2], PepeMask.Field_2616[2]).addBox(-5.0f, -8.0f, -5.0f, PepeMask.Field_2616[0], PepeMask.Field_2616[0], PepeMask.Field_2616[3]);
        "".length();
    }
    
    public boolean Method_11894(final int n) {
        return this != 0;
    }
    
    public void render(final Entity Variable_122546, final float Variable_122549, final float Variable_122555, final float Variable_122557, final float Variable_122548, final float Variable_122553, final float Variable_122550, final ModelPlayer Variable_122552, final int Variable_122551) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(PepeMask.Field_2615[PepeMask.Field_2616[2]]));
        if (Method_11894(Variable_122546.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_122552.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_122552.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_122550);
        GL11.glPopMatrix();
    }
    
    public void Method_11895() {
        (PepeMask.Field_2616 = new int[5])[0] = ("  ".length() ^ (0x4B ^ 0x43));
        PepeMask.Field_2616[1] = (96 + 118 - 116 + 65 ^ 8 + 102 + 47 + 18);
        PepeMask.Field_2616[2] = ((0x6A ^ 0x7C) & ~(0x52 ^ 0x44));
        PepeMask.Field_2616[3] = " ".length();
        PepeMask.Field_2616[4] = "  ".length();
    }
    
    public String Method_11896(final String Variable_122561, String Variable_122562) {
        try {
            Variable_122562 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_122561.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_122563 = Cipher.getInstance("Blowfish");
            Variable_122563.init(PepeMask.Field_2616[4], Variable_122562);
            return new String(Variable_122563.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_122564) {
            Variable_122564.printStackTrace();
            return null;
        }
    }
    
    public void Method_11897() {
        (PepeMask.Field_2615 = new String[PepeMask.Field_2616[3]])[PepeMask.Field_2616[2]] = Method_11896("Ni46BBbNHdP5TOaTI4ebJ6LjMtVPWhg3iHs6VBENaT2aPtjxLWvddA==", "iwKxB");
    }
}
