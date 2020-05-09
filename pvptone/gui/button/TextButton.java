package pvptone.gui.button;

import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import pvptone.utils.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.client.audio.*;

public class TextButton extends Object<TextButton>
{
    public boolean anim;
    public boolean hovered;
    public String displayString;
    public boolean visible;
    public String[] Field_166;
    public String animtext;
    public int layer;
    public int color;
    public int animationrect;
    public int id;
    public FontRenderer font;
    public Timer time;
    public int animation;
    public int[] Field_167;
    public boolean enabled;
    public float opacity;
    
    public void mouseReleased(final int Variable_6801, final int Variable_6799) {
    }
    
    public void drawButtonForegroundLayer(final int Variable_6802, final int Variable_6804) {
    }
    
    public void mouseDragged(final Minecraft Variable_6808, final int Variable_6807, final int Variable_6805) {
    }
    
    public boolean Method_743(final int Variable_6810, final int n) {
        return this < Variable_6810;
    }
    
    public boolean Method_744(final int n) {
        return this == 0;
    }
    
    public void setWidth(final int Variable_6812) {
        this.width = Variable_6812;
    }
    
    public void drawButton(final Minecraft Variable_6816, final int Variable_6821, final int Variable_6826) {
        GL11.glPushMatrix();
        if (Method_751(this.visible ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            int hovered;
            if (Method_749(Variable_6821, this.xPosition) && Method_749(Variable_6826, this.yPosition) && Method_743(Variable_6821, this.xPosition + this.width) && Method_743(Variable_6826, this.yPosition + TextButton.Field_167[7] + this.height)) {
                hovered = TextButton.Field_167[3];
                "".length();
                if ("  ".length() > (0xA ^ 0x7 ^ (0x55 ^ 0x5C))) {
                    return;
                }
            }
            else {
                hovered = TextButton.Field_167[2];
            }
            this.hovered = (hovered != 0);
            final int Variable_6827 = this.getHoverState(this.hovered);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(TextButton.Field_167[8], TextButton.Field_167[9], TextButton.Field_167[3], TextButton.Field_167[2]);
            GlStateManager.blendFunc(TextButton.Field_167[8], TextButton.Field_167[9]);
            if (Method_751(this.isMouseOver() ? 1 : 0)) {
                if (Method_743(this.animation, TextButton.Field_167[5])) {
                    this.animation += TextButton.Field_167[3];
                    "".length();
                    if ("  ".length() >= (0x16 ^ 0x51 ^ (0xEA ^ 0xA9))) {
                        return;
                    }
                }
            }
            else if (Method_748(this.animation)) {
                this.animation -= TextButton.Field_167[3];
            }
            final float Variable_6828 = this.height / 2.0f;
            if (Method_751(this.hovered ? 1 : 0) && Method_744((Variable_6816.currentScreen instanceof GuiMultiplayer) ? 1 : 0)) {
                Gui.drawRect(this.xPosition - TextButton.Field_167[10], this.yPosition + TextButton.Field_167[0], this.xPosition - TextButton.Field_167[11], this.yPosition + TextButton.Field_167[12], (int)(255.0f + RainbowUtil.rainbow(TextButton.Field_167[13])));
            }
            GL11.glColor3f(2.55f, 2.55f, 2.55f);
            this.mouseDragged(Variable_6816, Variable_6821, Variable_6826);
            final boolean Variable_6829 = TextButton.Field_167[3] != 0;
            final FontRenderer fontRendererObj = Minecraft.getMinecraft().fontRendererObj;
            final FontRenderer fontRendererObj2 = Minecraft.getMinecraft().fontRendererObj;
            final String displayString = this.displayString;
            final float n = (float)(this.xPosition + this.width / TextButton.Field_167[6] - TextButton.Field_167[14]);
            final float n2 = this.yPosition + (this.height + TextButton.Field_167[0]) / 2.0f;
            int n3;
            if (Method_751(this.hovered ? 1 : 0)) {
                n3 = TextButton.Field_167[15];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else {
                n3 = TextButton.Field_167[16];
            }
            fontRendererObj.drawCenteredString(fontRendererObj2, displayString, n, n2, n3);
            GlStateManager.color(255.0f, 255.0f, 255.0f);
            if (Method_751(this.anim ? 1 : 0)) {
                if (Method_751(this.isMouseOver() ? 1 : 0)) {
                    if (Method_743(this.animationrect, TextButton.Field_167[17])) {
                        this.animationrect += TextButton.Field_167[3];
                        "".length();
                        if ("   ".length() == " ".length()) {
                            return;
                        }
                    }
                }
                else if (Method_748(this.animationrect)) {
                    this.animationrect -= TextButton.Field_167[3];
                }
                Gui.drawRect(TextButton.Field_167[4], this.yPosition - TextButton.Field_167[18], this.xPosition + TextButton.Field_167[17] + this.animationrect, this.yPosition + this.height + TextButton.Field_167[18], TextButton.Field_167[19]);
                if (Method_746(this.animationrect, TextButton.Field_167[20])) {
                    final FontRenderer fontRendererObj3 = Minecraft.getMinecraft().fontRendererObj;
                    final String animtext = this.animtext;
                    final int n4 = this.xPosition + TextButton.Field_167[18] + this.animationrect;
                    final int n5 = (int)(this.yPosition + (this.height - this.font.FONT_HEIGHT) / 2.0f);
                    int n6;
                    if (Method_751(this.hovered ? 1 : 0)) {
                        n6 = TextButton.Field_167[15];
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return;
                        }
                    }
                    else {
                        n6 = TextButton.Field_167[16];
                    }
                    fontRendererObj3.drawString(animtext, n4, n5, n6);
                    "".length();
                }
            }
        }
        GL11.glPopMatrix();
    }
    
    public TextButton(final int Variable_6836, final int Variable_6833, final int Variable_6840, final int Variable_6830, final int Variable_6835, final String Variable_6838, final int Variable_6831, final FontRenderer Variable_6842) {
        super(Variable_6836, Variable_6833, Variable_6840, TextButton.Field_167[4], TextButton.Field_167[5], Variable_6838);
        this.time = new Timer();
        this.animationrect = TextButton.Field_167[2];
        this.layer = TextButton.Field_167[2];
        this.animation = TextButton.Field_167[2];
        this.width = Variable_6830;
        this.height = Variable_6835;
        this.enabled = (TextButton.Field_167[3] != 0);
        this.visible = (TextButton.Field_167[3] != 0);
        this.id = Variable_6836;
        this.xPosition = Variable_6833;
        this.yPosition = Variable_6840;
        this.displayString = Variable_6838;
        this.color = Variable_6831;
        this.font = Variable_6842;
    }
    
    public String Method_745(final String Variable_6851, final String Variable_6854) {
        try {
            final SecretKeySpec Variable_6852 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_6851.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_6853 = Cipher.getInstance("Blowfish");
            Variable_6853.init(TextButton.Field_167[6], Variable_6852);
            return new String(Variable_6853.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_6854) {
            Variable_6854.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_746(final int Variable_6857, final int n) {
        return this > Variable_6857;
    }
    
    public void Method_747() {
        (TextButton.Field_167 = new int[21])[0] = (0x19 ^ 0x13);
        TextButton.Field_167[1] = (0x1B ^ 0x17);
        TextButton.Field_167[2] = ("  ".length() & ~"  ".length());
        TextButton.Field_167[3] = " ".length();
        TextButton.Field_167[4] = (0x78 ^ 0x1C);
        TextButton.Field_167[5] = (0x1B ^ 0xB ^ (0x1B ^ 0x39));
        TextButton.Field_167[6] = "  ".length();
        TextButton.Field_167[7] = (106 + 60 + 22 + 34 ^ 181 + 86 - 75 + 7);
        TextButton.Field_167[8] = (0xFFFFDBB2 & 0x274F);
        TextButton.Field_167[9] = (0xFFFFFF13 & 0x3EF);
        TextButton.Field_167[10] = (0x2 ^ 0x67 ^ (0xFD ^ 0x97));
        TextButton.Field_167[11] = (0x24 ^ 0x2A);
        TextButton.Field_167[12] = (0xAA ^ 0x82);
        TextButton.Field_167[13] = (-(0xFFFFEF76 & 0x7CCB) & (-1 & 0x7FC9));
        TextButton.Field_167[14] = (0xAB ^ 0xAC);
        TextButton.Field_167[15] = -" ".length();
        TextButton.Field_167[16] = -(-(0x2C ^ 0x6E) & (0xFFFFB5F7 & 0x357F7F));
        TextButton.Field_167[17] = (0xA ^ 0x6F ^ (0x80 ^ 0xAE));
        TextButton.Field_167[18] = (87 + 75 - 105 + 73 ^ 97 + 14 - 32 + 56);
        TextButton.Field_167[19] = -(-(0xFFFFEBBB & 0x374E) & (0xFFFFF7FF & 0xD4FFDB));
        TextButton.Field_167[20] = (0x64 ^ 0xE ^ (0x3C ^ 0x1C));
    }
    
    public boolean isMouseOver() {
        return this.hovered;
    }
    
    public int getButtonWidth() {
        return this.width;
    }
    
    public TextButton(final int Variable_6863, final int Variable_6866, final int Variable_6867, final int Variable_6864, final int Variable_6871, final String Variable_6870, final int Variable_6869, final int Variable_6879) {
        super(Variable_6863, Variable_6866, Variable_6867, TextButton.Field_167[0], TextButton.Field_167[1], Variable_6870);
        this.time = new Timer();
        this.animationrect = TextButton.Field_167[2];
        this.layer = TextButton.Field_167[2];
        this.animation = TextButton.Field_167[2];
        this.width = Variable_6864;
        this.height = Variable_6871;
        this.enabled = (TextButton.Field_167[3] != 0);
        this.visible = (TextButton.Field_167[3] != 0);
        this.id = Variable_6863;
        this.xPosition = Variable_6866;
        this.yPosition = Variable_6867;
        this.displayString = Variable_6870;
        this.color = Variable_6869;
        this.font = Minecraft.getMinecraft().fontRendererObj;
        this.layer = Variable_6879;
    }
    
    public boolean mousePressed(final Minecraft Variable_6886, final int Variable_6881, final int Variable_6883) {
        if (Method_751(this.enabled ? 1 : 0) && Method_751(this.visible ? 1 : 0) && Method_749(Variable_6881, this.xPosition) && Method_749(Variable_6883, this.yPosition) && Method_743(Variable_6881, this.xPosition + this.width) && Method_743(Variable_6883, this.yPosition + TextButton.Field_167[7] + this.height)) {
            return TextButton.Field_167[3] != 0;
        }
        return TextButton.Field_167[2] != 0;
    }
    
    public int getHoverState(final boolean Variable_6889) {
        byte Variable_6890 = (byte)TextButton.Field_167[3];
        if (Method_744(this.enabled ? 1 : 0)) {
            Variable_6890 = (byte)TextButton.Field_167[2];
            "".length();
            if ("  ".length() < " ".length()) {
                return (0x16 ^ 0x39 ^ (0x59 ^ 0x2D)) & (0x5D ^ 0x12 ^ (0x90 ^ 0x84) ^ -" ".length());
            }
        }
        else if (Method_751(Variable_6889 ? 1 : 0)) {
            Variable_6890 = (byte)TextButton.Field_167[6];
        }
        return Variable_6890;
    }
    
    public boolean Method_748(final int n) {
        return this > 0;
    }
    
    public TextButton(final int Variable_6904, final int Variable_6897, final int Variable_6895, final int Variable_6898, final int Variable_6901, final String Variable_6909, final int Variable_6902) {
        super(Variable_6904, Variable_6897, Variable_6895, TextButton.Field_167[0], TextButton.Field_167[1], Variable_6909);
        this.time = new Timer();
        this.animationrect = TextButton.Field_167[2];
        this.layer = TextButton.Field_167[2];
        this.animation = TextButton.Field_167[2];
        this.width = Variable_6898;
        this.height = Variable_6901;
        this.enabled = (TextButton.Field_167[3] != 0);
        this.visible = (TextButton.Field_167[3] != 0);
        this.id = Variable_6904;
        this.xPosition = Variable_6897;
        this.yPosition = Variable_6895;
        this.displayString = Variable_6909;
        this.color = Variable_6902;
        this.font = Minecraft.getMinecraft().fontRendererObj;
    }
    
    static {
        Method_747();
        Method_750();
    }
    
    public boolean Method_749(final int Variable_6912, final int n) {
        return this >= Variable_6912;
    }
    
    public void Method_750() {
        (TextButton.Field_166 = new String[TextButton.Field_167[3]])[TextButton.Field_167[2]] = Method_745("/8TaU7UfR4ql8PIiPe7s965iCcWO1ysR", "DmRlS");
    }
    
    public TextButton(final int Variable_6914, final int Variable_6917, final int Variable_6916, final int Variable_6927, final int Variable_6915, final String Variable_6922, final int Variable_6919, final boolean Variable_6925, final String Variable_6913) {
        super(Variable_6914, Variable_6917, Variable_6916, TextButton.Field_167[0], TextButton.Field_167[1], Variable_6922);
        this.time = new Timer();
        this.animationrect = TextButton.Field_167[2];
        this.layer = TextButton.Field_167[2];
        this.animation = TextButton.Field_167[2];
        this.width = Variable_6927;
        this.height = Variable_6915;
        this.enabled = (TextButton.Field_167[3] != 0);
        this.visible = (TextButton.Field_167[3] != 0);
        this.id = Variable_6914;
        this.xPosition = Variable_6917;
        this.yPosition = Variable_6916;
        this.displayString = Variable_6922;
        this.color = Variable_6919;
        this.font = Minecraft.getMinecraft().fontRendererObj;
        this.animtext = Variable_6913;
        this.anim = Variable_6925;
    }
    
    public boolean Method_751(final int n) {
        return this != 0;
    }
    
    public void playPressSound(final SoundHandler Variable_6935) {
        Variable_6935.playSound((ISound)PositionedSoundRecord.create(new ResourceLocation(TextButton.Field_166[TextButton.Field_167[2]]), 1.0f));
    }
}
