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

public class Hat extends Object<Hat>
{
    public int[] Field_2401;
    public ModelRenderer r;
    public String[] Field_2402;
    
    public String Method_10948(final String Variable_113565, String Variable_113566) {
        try {
            Variable_113566 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_113565.getBytes(StandardCharsets.UTF_8)), Hat.Field_2401[4]), "DES");
            final Cipher Variable_113567 = Cipher.getInstance("DES");
            Variable_113567.init(Hat.Field_2401[2], Variable_113566);
            return new String(Variable_113567.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_113568) {
            Variable_113568.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_10949(final int n) {
        return this != 0;
    }
    
    public void Method_10950() {
        (Hat.Field_2401 = new int[6])[0] = " ".length();
        Hat.Field_2401[1] = (0x18 ^ 0x13);
        Hat.Field_2401[2] = "  ".length();
        Hat.Field_2401[3] = (0xC6 ^ 0xC1);
        Hat.Field_2401[4] = ("  ".length() ^ (0x90 ^ 0x9A));
        Hat.Field_2401[5] = ((0x36 ^ 0x3C ^ (0xDB ^ 0xB1)) & (39 + 13 + 2 + 148 ^ 157 + 135 - 265 + 143 ^ -" ".length()) & (((0x53 ^ 0x6C ^ (0x33 ^ 0x54)) & (0x51 ^ 0x21 ^ (0xEB ^ 0xC3) ^ -" ".length())) ^ -" ".length()));
    }
    
    static {
        Method_10950();
        Method_10952();
    }
    
    public Hat() {
        super(Hat.Field_2401[0]);
        (this.r = new ModelRenderer((ModelBase)this)).addBox(-5.5f, -9.0f, -5.5f, Hat.Field_2401[1], Hat.Field_2401[2], Hat.Field_2401[1]);
        "".length();
        this.r.addBox(-3.5f, -12.0f, -3.5f, Hat.Field_2401[3], Hat.Field_2401[4], Hat.Field_2401[3]);
        "".length();
    }
    
    public String Method_10951(final String Variable_113581, final String Variable_113584) {
        try {
            final SecretKeySpec Variable_113582 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_113581.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_113583 = Cipher.getInstance("Blowfish");
            Variable_113583.init(Hat.Field_2401[2], Variable_113582);
            return new String(Variable_113583.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_113584) {
            Variable_113584.printStackTrace();
            return null;
        }
    }
    
    public void render(final Entity Variable_113589, final float Variable_113597, final float Variable_113596, final float Variable_113587, final float Variable_113591, final float Variable_113599, final float Variable_113586, final ModelPlayer Variable_113590, final int Variable_113592) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf(new StringBuilder(Hat.Field_2402[Hat.Field_2401[5]]).append(Variable_113592).append(Hat.Field_2402[Hat.Field_2401[0]]))));
        if (Method_10949(Variable_113589.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_113590.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_113590.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_113586);
        GL11.glPopMatrix();
    }
    
    public void Method_10952() {
        (Hat.Field_2402 = new String[Hat.Field_2401[2]])[Hat.Field_2401[5]] = Method_10951("wyVdtDmIcaj+gg80hxo+B0HE0CrEd0m9AnOWC43QiTncrKjq/pr/Rw==", "KoOuu");
        Hat.Field_2402[Hat.Field_2401[0]] = Method_10948("I+oPAya+L7I=", "pAHIs");
    }
}
