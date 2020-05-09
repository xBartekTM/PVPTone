package pvptone.gui.button;

import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class IconButton extends Object<IconButton>
{
    public String[] Field_2665;
    public int[] Field_2666;
    public float targetX;
    public ResourceLocation icon;
    public float currentX;
    
    public boolean Method_12113(final int Variable_125041, final int n) {
        return this < Variable_125041;
    }
    
    public void Method_12114() {
        (IconButton.Field_2666 = new int[9])[0] = ((0xA1 ^ 0xBA) & ~(0x49 ^ 0x52));
        IconButton.Field_2666[1] = " ".length();
        IconButton.Field_2666[2] = "  ".length();
        IconButton.Field_2666[3] = (0xC0 ^ 0x8B);
        IconButton.Field_2666[4] = (41 + 29 + 31 + 54 ^ 12 + 150 - 107 + 138);
        IconButton.Field_2666[5] = (0x73 ^ 0x79);
        IconButton.Field_2666[6] = (141 + 63 - 75 + 31 ^ 85 + 55 + 43 + 2);
        IconButton.Field_2666[7] = -" ".length();
        IconButton.Field_2666[8] = (135 + 86 - 88 + 14 ^ 96 + 47 - 11 + 23);
    }
    
    public boolean Method_12115(final int Variable_125043, final int n) {
        return this >= Variable_125043;
    }
    
    static {
        Method_12114();
        Method_12116();
    }
    
    public void Method_12116() {
        (IconButton.Field_2665 = new String[IconButton.Field_2666[2]])[IconButton.Field_2666[0]] = Method_12117("JiOnErfrEizlFjJE+JMwq4+xK+tZRWNke5Lqh7kVeUA=", "bsAyR");
        IconButton.Field_2665[IconButton.Field_2666[1]] = Method_12117("qeNzvH3NHfo=", "hXTQe");
    }
    
    public void drawButton(final Minecraft Variable_125050, final int Variable_125046, final int Variable_125045) {
        if (Method_12118(this.visible ? 1 : 0)) {
            int hovered;
            if (Method_12115(Variable_125046, this.xPosition + this.width / IconButton.Field_2666[2]) && Method_12115(Variable_125045, this.yPosition) && Method_12113(Variable_125046, this.xPosition + this.width / IconButton.Field_2666[2] + IconButton.Field_2666[3]) && Method_12113(Variable_125045, this.yPosition + IconButton.Field_2666[4])) {
                hovered = IconButton.Field_2666[1];
                "".length();
                if ((0x42 ^ 0x46) == 0x0) {
                    return;
                }
            }
            else {
                hovered = IconButton.Field_2666[0];
            }
            this.hovered = (hovered != 0);
            this.mouseDragged(Variable_125050, Variable_125046, Variable_125045);
            float targetX;
            if (Method_12118(this.hovered ? 1 : 0)) {
                targetX = 10.0f;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                targetX = 0.0f;
            }
            this.targetX = targetX;
            final float Variable_125051 = (this.targetX - this.currentX) * 0.6f;
            this.currentX += Variable_125051;
            GlStateManager.pushMatrix();
            final float Variable_125052 = (float)(this.xPosition + this.width / IconButton.Field_2666[2]);
            GlStateManager.translate(Variable_125052, this.yPosition - this.currentX, 1.0f);
            GlStateManager.enableAlpha();
            Variable_125050.getTextureManager().bindTexture(this.icon);
            drawModalRectWithCustomSizedTexture(IconButton.Field_2666[5], IconButton.Field_2666[6], 0.0f, 0.0f, this.width, this.height, (float)this.width, (float)this.height);
            GlStateManager.bindTexture(IconButton.Field_2666[0]);
            Minecraft.getMinecraft().fontRendererObj.drawString(this.displayString, 37.0f - Minecraft.getMinecraft().fontRendererObj.getStringWidth(this.displayString) / IconButton.Field_2666[2], 80.0f, IconButton.Field_2666[7]);
            "".length();
            GlStateManager.disableAlpha();
            GlStateManager.popMatrix();
        }
    }
    
    public String Method_12117(final String Variable_125060, String Variable_125057) {
        try {
            Variable_125057 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_125060.getBytes(StandardCharsets.UTF_8)), IconButton.Field_2666[8]), "DES");
            final Cipher Variable_125061 = Cipher.getInstance("DES");
            Variable_125061.init(IconButton.Field_2666[2], Variable_125057);
            return new String(Variable_125061.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_125062) {
            Variable_125062.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_12118(final int n) {
        return this != 0;
    }
    
    public boolean mousePressed(final Minecraft Variable_125067, final int Variable_125066, final int Variable_125069) {
        if (Method_12118(this.visible ? 1 : 0) && Method_12115(Variable_125066, this.xPosition + this.width / IconButton.Field_2666[2]) && Method_12115(Variable_125069, this.yPosition) && Method_12113(Variable_125066, this.xPosition + this.width / IconButton.Field_2666[2] + IconButton.Field_2666[3]) && Method_12113(Variable_125069, this.yPosition + IconButton.Field_2666[4])) {
            return IconButton.Field_2666[1] != 0;
        }
        return IconButton.Field_2666[0] != 0;
    }
    
    public IconButton(final int Variable_125082, final int Variable_125074, final int Variable_125081, final int Variable_125077, final int Variable_125078, final String Variable_125076, final String Variable_125073) {
        super(Variable_125082, Variable_125074, Variable_125081, Variable_125077, Variable_125078, Variable_125073);
        this.icon = new ResourceLocation(String.valueOf(new StringBuilder(IconButton.Field_2665[IconButton.Field_2666[0]]).append(Variable_125076).append(IconButton.Field_2665[IconButton.Field_2666[1]])));
    }
}
