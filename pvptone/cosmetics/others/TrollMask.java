package pvptone.cosmetics.others;

import java.util.*;
import java.nio.charset.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public class TrollMask extends Object<TrollMask>
{
    public float g;
    public String[] Field_2721;
    public ModelRenderer r;
    public int[] Field_2722;
    
    public boolean Method_12390(final int Variable_128150, final int n) {
        return this < Variable_128150;
    }
    
    public void Method_12391() {
        (TrollMask.Field_2722 = new int[5])[0] = (0xB3 ^ 0xA8 ^ (0xA9 ^ 0xBB));
        TrollMask.Field_2722[1] = (92 + 91 - 19 + 4 ^ 12 + 50 + 8 + 94);
        TrollMask.Field_2722[2] = (("   ".length() ^ (0x17 ^ 0x5D)) & (0x57 ^ 0x7C ^ (0x14 ^ 0x76) ^ -" ".length()) & (((154 + 67 - 51 + 17 ^ 34 + 27 + 28 + 51) & (90 + 72 - 58 + 76 ^ 76 + 29 - 23 + 49 ^ -" ".length())) ^ -" ".length()));
        TrollMask.Field_2722[3] = (0x39 ^ 0x33);
        TrollMask.Field_2722[4] = " ".length();
    }
    
    public String Method_12392(final String Variable_128154, String Variable_128163) {
        Variable_128165 = (char)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_128163 = new StringBuilder();
        final char[] Variable_128166 = Variable_128154.toCharArray();
        int Variable_128167 = TrollMask.Field_2722[2];
        final char Variable_128168 = (Object)((String)this).toCharArray();
        final String Variable_128169 = (String)Variable_128168.length;
        byte Variable_128170 = (byte)TrollMask.Field_2722[2];
        while (Method_12390(Variable_128170, (int)Variable_128169)) {
            final char Variable_128171 = Variable_128168[Variable_128170];
            Variable_128163.append((char)(Variable_128171 ^ Variable_128166[Variable_128167 % Variable_128166.length]));
            "".length();
            ++Variable_128167;
            ++Variable_128170;
            "".length();
            if ("   ".length() >= (148 + 46 - 77 + 82 ^ 145 + 108 - 177 + 119)) {
                return null;
            }
        }
        return String.valueOf(Variable_128163);
    }
    
    static {
        Method_12391();
        Method_12393();
    }
    
    public TrollMask() {
        super(TrollMask.Field_2722[0]);
        this.g = 0.0f;
        this.r = new ModelRenderer((ModelBase)this).setTextureSize(TrollMask.Field_2722[1], TrollMask.Field_2722[1]);
        this.r.setTextureOffset(TrollMask.Field_2722[2], TrollMask.Field_2722[2]).addBox(-5.0f, -8.0f, -5.0f, TrollMask.Field_2722[3], TrollMask.Field_2722[3], TrollMask.Field_2722[4]);
        "".length();
    }
    
    public void Method_12393() {
        (TrollMask.Field_2721 = new String[TrollMask.Field_2722[4]])[TrollMask.Field_2722[2]] = Method_12392("BD8oDA0CPyNXKAYqBBcWFXUTFwsdPyQRGwN1OBkMXy4iFxQcdCAWHw==", "pZPxx");
    }
    
    public void render(final Entity Variable_128169, final float Variable_128178, final float Variable_128179, final float Variable_128173, final float Variable_128174, final float Variable_128176, final float Variable_128175, final ModelPlayer Variable_128177, final int Variable_128182) {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(TrollMask.Field_2721[TrollMask.Field_2722[2]]));
        if (Method_12394(Variable_128169.isSneaking() ? 1 : 0)) {
            GL11.glTranslated(0.0, 0.1, 0.0);
        }
        this.r.rotateAngleX = Variable_128177.bipedHead.rotateAngleX;
        this.r.rotateAngleY = Variable_128177.bipedHead.rotateAngleY;
        this.r.rotationPointX = 0.0f;
        this.r.rotationPointY = 0.0f;
        this.r.render(Variable_128175);
        GL11.glPopMatrix();
    }
    
    public boolean Method_12394(final int n) {
        return this != 0;
    }
}
