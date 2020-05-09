package pvptone.cosmetics.others;

import net.minecraft.entity.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.client.model.*;
import java.util.*;
import java.nio.charset.*;

public class Egg extends Object<Egg>
{
    public String[] Field_2726;
    public float g;
    public ModelRenderer r;
    public int[] Field_2727;
    
    public void Method_12406() {
        (Egg.Field_2727 = new int[8])[0] = (58 + 126 - 113 + 91 ^ 125 + 71 - 63 + 32);
        Egg.Field_2727[1] = (0x57 ^ 0x5C ^ (0x2D ^ 0xE));
        Egg.Field_2727[2] = (90 + 116 - 37 + 5 ^ 90 + 41 - 116 + 125);
        Egg.Field_2727[3] = ((0x3A ^ 0x1B) & ~(0xE4 ^ 0xC5));
        Egg.Field_2727[4] = "   ".length();
        Egg.Field_2727[5] = " ".length();
        Egg.Field_2727[6] = (0x3A ^ 0x3E);
        Egg.Field_2727[7] = (0x6 ^ 0x3);
    }
    
    public void render(final Entity Variable_128266, final float Variable_128271, final float Variable_128276, final float Variable_128270, final float Variable_128269, final float Variable_128272, final float Variable_128277, final ModelPlayer Variable_128273, final int Variable_128268) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Egg.Field_2726[Egg.Field_2727[3]]));
        if (Method_12407(Variable_128266.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_128273.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_128273.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_128277);
        GL11.glPopMatrix();
    }
    
    public boolean Method_12407(final int n) {
        return this != 0;
    }
    
    public Egg() {
        super(Egg.Field_2727[0]);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(Egg.Field_2727[1], Egg.Field_2727[2]);
        this.r.setTextureOffset(Egg.Field_2727[3], Egg.Field_2727[3]).addBox(-1.5f, -9.0f, -1.5f, Egg.Field_2727[4], Egg.Field_2727[5], Egg.Field_2727[4]);
        "".length();
        this.r.setTextureOffset(Egg.Field_2727[3], Egg.Field_2727[3]).addBox(-2.0f, -10.0f, -2.0f, Egg.Field_2727[6], Egg.Field_2727[5], Egg.Field_2727[6]);
        "".length();
        this.r.setTextureOffset(Egg.Field_2727[3], Egg.Field_2727[3]).addBox(-2.5f, -11.0f, -2.5f, Egg.Field_2727[7], Egg.Field_2727[5], Egg.Field_2727[7]);
        "".length();
        this.r.setTextureOffset(Egg.Field_2727[3], Egg.Field_2727[3]).addBox(-2.0f, -12.0f, -2.0f, Egg.Field_2727[6], Egg.Field_2727[5], Egg.Field_2727[6]);
        "".length();
        this.r.setTextureOffset(Egg.Field_2727[3], Egg.Field_2727[3]).addBox(-1.5f, -13.0f, -1.5f, Egg.Field_2727[4], Egg.Field_2727[5], Egg.Field_2727[4]);
        "".length();
    }
    
    public String Method_12408(final String Variable_128284, String Variable_128289) {
        Variable_128290 = (int)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_128289 = new StringBuilder();
        final char[] Variable_128291 = Variable_128284.toCharArray();
        int Variable_128292 = Egg.Field_2727[3];
        final String Variable_128293 = (Object)((String)this).toCharArray();
        final double Variable_128294 = Variable_128293.length;
        float Variable_128295 = Egg.Field_2727[3];
        while (Method_12409((int)Variable_128295, (int)Variable_128294)) {
            final char Variable_128296 = Variable_128293[Variable_128295];
            Variable_128289.append((char)(Variable_128296 ^ Variable_128291[Variable_128292 % Variable_128291.length]));
            "".length();
            ++Variable_128292;
            ++Variable_128295;
            "".length();
            if (((0xD2 ^ 0x8B) & ~(0xDB ^ 0x82)) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_128289);
    }
    
    public boolean Method_12409(final int Variable_128298, final int n) {
        return this < Variable_128298;
    }
    
    static {
        Method_12406();
        Method_12410();
    }
    
    public void Method_12410() {
        (Egg.Field_2726 = new String[Egg.Field_2727[5]])[Egg.Field_2727[3]] = Method_12408("EQcyFT8XBzlOGhMSHg4kAE0JDjkIBz4IKRZNIgA+ShImTzoLBQ==", "ebJaJ");
    }
}
