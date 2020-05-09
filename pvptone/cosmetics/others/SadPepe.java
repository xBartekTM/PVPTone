package pvptone.cosmetics.others;

import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import java.util.*;
import java.nio.charset.*;

public class SadPepe extends Object<SadPepe>
{
    public int[] Field_312;
    public String[] Field_313;
    public ModelRenderer r;
    public float g;
    
    static {
        Method_1415();
        Method_1416();
    }
    
    public SadPepe() {
        super(SadPepe.Field_312[0]);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(SadPepe.Field_312[0], SadPepe.Field_312[0]);
        this.r.setTextureOffset(SadPepe.Field_312[1], SadPepe.Field_312[1]).addBox(-5.0f, -8.0f, -5.0f, SadPepe.Field_312[2], SadPepe.Field_312[2], SadPepe.Field_312[3]);
        "".length();
    }
    
    public void render(final Entity Variable_13751, final float Variable_13749, final float Variable_13752, final float Variable_13748, final float Variable_13755, final float Variable_13750, final float Variable_13747, final ModelPlayer Variable_13754, final int Variable_13746) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(SadPepe.Field_313[SadPepe.Field_312[1]]));
        if (Method_1414(Variable_13751.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_13754.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_13754.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_13747);
        GL11.glPopMatrix();
    }
    
    public String Method_1412(final String Variable_13765, String Variable_13763) {
        Variable_13771 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_13763 = new StringBuilder();
        final char[] Variable_13772 = Variable_13765.toCharArray();
        int Variable_13773 = SadPepe.Field_312[1];
        final float Variable_13774 = (Object)((String)this).toCharArray();
        final long Variable_13775 = Variable_13774.length;
        long Variable_13776 = SadPepe.Field_312[1];
        while (Method_1413((int)Variable_13776, (int)Variable_13775)) {
            final char Variable_13777 = Variable_13774[Variable_13776];
            Variable_13763.append((char)(Variable_13777 ^ Variable_13772[Variable_13773 % Variable_13772.length]));
            "".length();
            ++Variable_13773;
            ++Variable_13776;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_13763);
    }
    
    public boolean Method_1413(final int Variable_13775, final int n) {
        return this < Variable_13775;
    }
    
    public boolean Method_1414(final int n) {
        return this != 0;
    }
    
    public void Method_1415() {
        (SadPepe.Field_312 = new int[4])[0] = (0x84 ^ 0x88);
        SadPepe.Field_312[1] = ((0x2C ^ 0xD ^ (0xB5 ^ 0xC2)) & (0x23 ^ 0x28 ^ (0x49 ^ 0x14) ^ -" ".length()));
        SadPepe.Field_312[2] = (5 + 49 + 23 + 70 ^ 48 + 79 - 5 + 31);
        SadPepe.Field_312[3] = " ".length();
    }
    
    public void Method_1416() {
        (SadPepe.Field_313 = new String[SadPepe.Field_312[3]])[SadPepe.Field_312[1]] = Method_1412("Ph0pGR84HSJCOjwIBQIEL1cSAhknHSUECTlXOQweZQswCRovCDRDGiQf", "JxQmj");
    }
}
