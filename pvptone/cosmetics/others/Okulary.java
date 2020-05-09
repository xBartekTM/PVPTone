package pvptone.cosmetics.others;

import java.util.*;
import java.nio.charset.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class Okulary extends Object<Okulary>
{
    public int[] Field_1805;
    public String[] Field_1806;
    public ModelRenderer r;
    
    public String Method_8203(final String Variable_85751, String Variable_85757) {
        Variable_85763 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_85757 = new StringBuilder();
        final char[] Variable_85764 = Variable_85751.toCharArray();
        int Variable_85765 = Okulary.Field_1805[3];
        final Exception Variable_85766 = (Object)((String)this).toCharArray();
        final float Variable_85767 = Variable_85766.length;
        float Variable_85768 = Okulary.Field_1805[3];
        while (Method_8206((int)Variable_85768, (int)Variable_85767)) {
            final char Variable_85769 = Variable_85766[Variable_85768];
            Variable_85757.append((char)(Variable_85769 ^ Variable_85764[Variable_85765 % Variable_85764.length]));
            "".length();
            ++Variable_85765;
            ++Variable_85768;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(Variable_85757);
    }
    
    public boolean Method_8204(final int n) {
        return this != 0;
    }
    
    public void Method_8205() {
        (Okulary.Field_1806 = new String[Okulary.Field_1805[2]])[Okulary.Field_1805[3]] = Method_8203("BQ4JBg0DDgJdKAcbJR0WFEQyHQscDgUbGwJEGRMMXgMQBklfGx8V", "qkqrx");
    }
    
    public Okulary() {
        super(Okulary.Field_1805[0]);
        (this.r = new ModelRenderer((ModelBase)this)).addBox(-4.0f, -5.0f, -5.0f, Okulary.Field_1805[1], Okulary.Field_1805[2], Okulary.Field_1805[2]);
        "".length();
        this.r.addBox(-4.0f, -4.0f, -5.0f, Okulary.Field_1805[2], Okulary.Field_1805[2], Okulary.Field_1805[2]);
        "".length();
        this.r.addBox(-4.0f, -3.0f, -5.0f, Okulary.Field_1805[2], Okulary.Field_1805[2], Okulary.Field_1805[2]);
        "".length();
        this.r.addBox(-4.0f, -2.0f, -5.0f, Okulary.Field_1805[1], Okulary.Field_1805[2], Okulary.Field_1805[2]);
        "".length();
        this.r.addBox(3.0f, -4.0f, -5.0f, Okulary.Field_1805[2], Okulary.Field_1805[2], Okulary.Field_1805[2]);
        "".length();
        this.r.addBox(3.0f, -3.0f, -5.0f, Okulary.Field_1805[2], Okulary.Field_1805[2], Okulary.Field_1805[2]);
        "".length();
    }
    
    public boolean Method_8206(final int Variable_85769, final int n) {
        return this < Variable_85769;
    }
    
    static {
        Method_8207();
        Method_8205();
    }
    
    public void Method_8207() {
        (Okulary.Field_1805 = new int[4])[0] = "  ".length();
        Okulary.Field_1805[1] = (0x28 ^ 0x47 ^ (0xE ^ 0x69));
        Okulary.Field_1805[2] = " ".length();
        Okulary.Field_1805[3] = ((66 + 36 + 31 + 16 ^ 47 + 63 - 67 + 126) & (126 + 100 - 209 + 168 ^ 115 + 41 - 100 + 77 ^ -" ".length()));
    }
    
    public void render(final Entity Variable_85773, final float Variable_85779, final float Variable_85782, final float Variable_85770, final float Variable_85777, final float Variable_85778, final float Variable_85776, final ModelPlayer Variable_85772, final int Variable_85771) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Okulary.Field_1806[Okulary.Field_1805[3]]));
        if (Method_8204(Variable_85773.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.05, 0.0);
        }
        this.r.rotateAngleX = Variable_85772.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_85772.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_85776);
        GL11.glPopMatrix();
    }
}
