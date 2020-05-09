package pvptone.cosmetics.item;

import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import java.util.*;
import java.nio.charset.*;
import net.minecraft.client.model.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import pvptone.mods.emoticons.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public final class Item extends Object<Item>
{
    public float airTicks;
    public int id;
    public String[] Field_481;
    public int[] Field_482;
    
    public void renderWingsIn3D(WorldRenderer Variable_21815) {
        Variable_21815 = Item.Field_482[0];
        final Tessellator Variable_21816 = Tessellator.getInstance();
        GL11.glPushMatrix();
        GL11.glTranslated(0.0, 0.0, 0.0);
        GL11.glEnable(Item.Field_482[1]);
        GL11.glScalef(1.5f, 1.5f, 0.3f);
        GL11.glScaled(2.0, 1.5, 2.0);
        ((WorldRenderer)this).begin(Item.Field_482[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        ((WorldRenderer)this).pos(0.0, 0.0, 0.0).tex(1.0, 1.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 0.0, 0.0).tex(0.0, 1.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 1.0, 0.0).tex(0.0, 0.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        ((WorldRenderer)this).pos(0.0, 1.0, 0.0).tex(1.0, 0.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        Variable_21816.draw();
        ((WorldRenderer)this).begin(Item.Field_482[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        ((WorldRenderer)this).pos(0.0, 1.0, -0.078125).tex(1.0, 0.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 1.0, -0.078125).tex(0.0, 0.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 0.0, -0.078125).tex(0.0, 1.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        ((WorldRenderer)this).pos(0.0, 0.0, -0.078125).tex(1.0, 1.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        Variable_21816.draw();
        ((WorldRenderer)this).begin(Item.Field_482[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_21817 = Item.Field_482[2];
        "".length();
        if (((0x8D ^ 0xA6 ^ (0xA0 ^ 0x83)) & (0x81 ^ 0x85 ^ (0x68 ^ 0x64) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!Method_2192(Method_2190((float)Variable_21817, 32.0f))) {
            final float Variable_21818 = Variable_21817 / 32.0f;
            final float Variable_21819 = 1.0f + -1.0f * Variable_21818 - 0.015625f;
            ((WorldRenderer)this).pos((double)Variable_21818, 0.0, -0.078125).tex((double)Variable_21819, 1.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_21818, 0.0, 0.0).tex((double)Variable_21819, 1.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_21818, 1.0, 0.0).tex((double)Variable_21819, 0.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_21818, 1.0, -0.078125).tex((double)Variable_21819, 0.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ++Variable_21817;
        }
        Variable_21816.draw();
        ((WorldRenderer)this).begin(Item.Field_482[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_21820 = Item.Field_482[2];
        "".length();
        if ((0x17 ^ 0x13) == "   ".length()) {
            return;
        }
        while (!Method_2192(Method_2190((float)Variable_21820, 32.0f))) {
            float Variable_21821 = Variable_21820 / 32.0f;
            final float Variable_21822 = 1.0f + -1.0f * Variable_21821 - 0.015625f;
            Variable_21821 += 0.03125f;
            ((WorldRenderer)this).pos((double)Variable_21821, 1.0, -0.078125).tex((double)Variable_21822, 0.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_21821, 1.0, 0.0).tex((double)Variable_21822, 0.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_21821, 0.0, 0.0).tex((double)Variable_21822, 1.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_21821, 0.0, -0.078125).tex((double)Variable_21822, 1.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ++Variable_21820;
        }
        Variable_21816.draw();
        ((WorldRenderer)this).begin(Item.Field_482[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_21823 = Item.Field_482[2];
        "".length();
        if (null != null) {
            return;
        }
        while (!Method_2192(Method_2190((float)Variable_21823, 32.0f))) {
            float Variable_21824 = Variable_21823 / 32.0f;
            final float Variable_21825 = 1.0f + -1.0f * Variable_21824 - 0.015625f;
            Variable_21824 += 0.03125f;
            ((WorldRenderer)this).pos(0.0, (double)Variable_21824, 0.0).tex(1.0, (double)Variable_21825).normal(0.0f, 1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(1.0, (double)Variable_21824, 0.0).tex(0.0, (double)Variable_21825).normal(0.0f, 1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(1.0, (double)Variable_21824, -0.078125).tex(0.0, (double)Variable_21825).normal(0.0f, 1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(0.0, (double)Variable_21824, -0.078125).tex(1.0, (double)Variable_21825).normal(0.0f, 1.0f, 0.0f).endVertex();
            ++Variable_21823;
        }
        Variable_21816.draw();
        ((WorldRenderer)this).begin(Item.Field_482[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_21826 = Item.Field_482[2];
        "".length();
        if ("   ".length() < "  ".length()) {
            return;
        }
        while (!Method_2192(Method_2190((float)Variable_21826, 32.0f))) {
            final float Variable_21827 = Variable_21826 / 32.0f;
            final float Variable_21828 = 1.0f + -1.0f * Variable_21827 - 0.015625f;
            ((WorldRenderer)this).pos(1.0, (double)Variable_21827, 0.0).tex(0.0, (double)Variable_21828).normal(0.0f, -1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(0.0, (double)Variable_21827, 0.0).tex(1.0, (double)Variable_21828).normal(0.0f, -1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(0.0, (double)Variable_21827, -0.078125).tex(1.0, (double)Variable_21828).normal(0.0f, -1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(1.0, (double)Variable_21827, -0.078125).tex(0.0, (double)Variable_21828).normal(0.0f, -1.0f, 0.0f).endVertex();
            ++Variable_21826;
        }
        Variable_21816.draw();
        GL11.glDisable(Item.Field_482[1]);
        GL11.glPopMatrix();
    }
    
    public int Method_2190(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public String Method_2191(final String Variable_21833, String Variable_21840) {
        Variable_21841 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_21840 = new StringBuilder();
        final char[] Variable_21842 = Variable_21833.toCharArray();
        int Variable_21843 = Item.Field_482[2];
        final int Variable_21844 = (Object)((String)this).toCharArray();
        final char Variable_21845 = (char)Variable_21844.length;
        char Variable_21846 = (char)Item.Field_482[2];
        while (Method_2196(Variable_21846, Variable_21845)) {
            final char Variable_21847 = Variable_21844[Variable_21846];
            Variable_21840.append((char)(Variable_21847 ^ Variable_21842[Variable_21843 % Variable_21842.length]));
            "".length();
            ++Variable_21843;
            ++Variable_21846;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(Variable_21840);
    }
    
    public boolean Method_2192(final int n) {
        return this >= 0;
    }
    
    public void Method_2193() {
        (Item.Field_482 = new int[7])[0] = (0xC6 ^ 0xC1);
        Item.Field_482[1] = (-(0xFFFFCFCA & 0x3FF7) & (0xFFFFDFFB & 0xAFFF));
        Item.Field_482[2] = ((0xAF ^ 0xB2 ^ (0x48 ^ 0x5C)) & (0x47 ^ 0x68 ^ (0x80 ^ 0xA6) ^ -" ".length()));
        Item.Field_482[3] = " ".length();
        Item.Field_482[4] = "  ".length();
        Item.Field_482[5] = "   ".length();
        Item.Field_482[6] = (0x23 ^ 0x7E ^ (0x7C ^ 0x25));
    }
    
    public void render(final ModelRenderer Variable_21848, final float Variable_21850, final int Variable_21851) {
        final Tessellator Variable_21852 = Tessellator.getInstance();
        GL11.glPushMatrix();
        GL11.glRotatef(100.0f + Variable_21848.rotateAngleX * 50.0f, 1.0f, 0.0f, 0.0f);
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf(new StringBuilder(Item.Field_481[Item.Field_482[2]]).append(Variable_21851).append(Item.Field_481[Item.Field_482[3]]))));
        GL11.glTranslated(0.4, 0.5, 1.4);
        GL11.glRotatef(90.0f, 0.0f, 100.0f, 0.0f);
        GL11.glRotated(180.0, 110.0, 0.0, 0.0);
        GL11.glRotatef(0.0f + Variable_21848.rotateAngleY * 30.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(0.0f + Variable_21848.rotateAngleZ * 30.0f, 1.0f, 0.0f, 0.0f);
        if (Method_2195(Dab.dabbing ? 1 : 0)) {
            GL11.glTranslated(-0.5, 0.0, 0.0);
        }
        renderWingsIn3D(Variable_21852.getWorldRenderer());
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf(new StringBuilder(Item.Field_481[Item.Field_482[4]]).append(Variable_21851).append(Item.Field_481[Item.Field_482[5]]))));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
    
    public void Method_2194() {
        (Item.Field_481 = new String[Item.Field_482[6]])[Item.Field_482[2]] = Method_2197("FtT+oT02JeKjLTujkVrrxGfQSJ5fKDGmS/8ePkcpcANcX5d7oC2A0w==", "pwlYC");
        Item.Field_481[Item.Field_482[3]] = Method_2197("bcUDHnrIw+c=", "fWAgO");
        Item.Field_481[Item.Field_482[4]] = Method_2191("HDYWDTgaNh1WHR4jOhYjDXwtFj4FNhoQLht8Bw0oBSBBEA==", "hSnyM");
        Item.Field_481[Item.Field_482[5]] = Method_2197("F8MD4Sa19tk=", "bOMse");
    }
    
    static {
        Method_2193();
        Method_2194();
    }
    
    public boolean Method_2195(final int n) {
        return this != 0;
    }
    
    public boolean Method_2196(final int Variable_21855, final int n) {
        return this < Variable_21855;
    }
    
    public String Method_2197(final String Variable_21859, String Variable_21857) {
        try {
            Variable_21857 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_21859.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_21860 = Cipher.getInstance("Blowfish");
            Variable_21860.init(Item.Field_482[4], Variable_21857);
            return new String(Variable_21860.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_21861) {
            Variable_21861.printStackTrace();
            return null;
        }
    }
}
