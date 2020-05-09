package pvptone.cosmetics.wings;

import pvptone.utils.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

public final class Wings extends Object<Wings>
{
    public Timer timer;
    public int[] Field_2115;
    public String[] Field_2116;
    public float animation;
    public float airTicks;
    public int id;
    
    public String Method_9615(final String Variable_100081, String Variable_100077) {
        try {
            Variable_100077 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_100081.getBytes(StandardCharsets.UTF_8)), Wings.Field_2115[7]), "DES");
            final Cipher Variable_100082 = Cipher.getInstance("DES");
            Variable_100082.init(Wings.Field_2115[4], Variable_100077);
            return new String(Variable_100082.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_100083) {
            Variable_100083.printStackTrace();
            return null;
        }
    }
    
    public Wings() {
        this.timer = new Timer();
        this.animation = 0.0f;
    }
    
    public void renderWingsIn3D(WorldRenderer Variable_100097) {
        Variable_100097 = Wings.Field_2115[0];
        final Tessellator Variable_100098 = Tessellator.getInstance();
        GL11.glPushMatrix();
        GL11.glTranslated(0.0, 0.0, 0.0);
        GL11.glEnable(Wings.Field_2115[1]);
        GL11.glTranslatef(1.0f, -0.10000001f, 0.1f);
        GL11.glScalef(1.875f, 1.875f, 1.0f);
        GL11.glRotatef(0.0f, 0.0f, 200.0f, 0.0f);
        GL11.glRotatef(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-0.9375f, -0.0625f, 0.0f);
        GL11.glScaled(1.0, 1.0, 0.5);
        ((WorldRenderer)this).begin(Wings.Field_2115[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        ((WorldRenderer)this).pos(0.0, 0.0, 0.0).tex(1.0, 1.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 0.0, 0.0).tex(0.0, 1.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 1.0, 0.0).tex(0.0, 0.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        ((WorldRenderer)this).pos(0.0, 1.0, 0.0).tex(1.0, 0.0).normal(0.0f, 0.0f, 1.0f).endVertex();
        Variable_100098.draw();
        ((WorldRenderer)this).begin(Wings.Field_2115[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        ((WorldRenderer)this).pos(0.0, 1.0, -0.078125).tex(1.0, 0.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 1.0, -0.078125).tex(0.0, 0.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        ((WorldRenderer)this).pos(1.0, 0.0, -0.078125).tex(0.0, 1.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        ((WorldRenderer)this).pos(0.0, 0.0, -0.078125).tex(1.0, 1.0).normal(0.0f, 0.0f, -1.0f).endVertex();
        Variable_100098.draw();
        ((WorldRenderer)this).begin(Wings.Field_2115[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_100099 = Wings.Field_2115[2];
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!Method_9617(Method_9622((float)Variable_100099, 32.0f))) {
            final float Variable_100100 = Variable_100099 / 32.0f;
            final float Variable_100101 = 1.0f + -1.0f * Variable_100100 - 0.015625f;
            ((WorldRenderer)this).pos((double)Variable_100100, 0.0, -0.078125).tex((double)Variable_100101, 1.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_100100, 0.0, 0.0).tex((double)Variable_100101, 1.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_100100, 1.0, 0.0).tex((double)Variable_100101, 0.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_100100, 1.0, -0.078125).tex((double)Variable_100101, 0.0).normal(-1.0f, 0.0f, 0.0f).endVertex();
            ++Variable_100099;
        }
        Variable_100098.draw();
        ((WorldRenderer)this).begin(Wings.Field_2115[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_100102 = Wings.Field_2115[2];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!Method_9617(Method_9622((float)Variable_100102, 32.0f))) {
            float Variable_100103 = Variable_100102 / 32.0f;
            final float Variable_100104 = 1.0f + -1.0f * Variable_100103 - 0.015625f;
            Variable_100103 += 0.03125f;
            ((WorldRenderer)this).pos((double)Variable_100103, 1.0, -0.078125).tex((double)Variable_100104, 0.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_100103, 1.0, 0.0).tex((double)Variable_100104, 0.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_100103, 0.0, 0.0).tex((double)Variable_100104, 1.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos((double)Variable_100103, 0.0, -0.078125).tex((double)Variable_100104, 1.0).normal(1.0f, 0.0f, 0.0f).endVertex();
            ++Variable_100102;
        }
        Variable_100098.draw();
        ((WorldRenderer)this).begin(Wings.Field_2115[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_100105 = Wings.Field_2115[2];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!Method_9617(Method_9622((float)Variable_100105, 32.0f))) {
            float Variable_100106 = Variable_100105 / 32.0f;
            final float Variable_100107 = 1.0f + -1.0f * Variable_100106 - 0.015625f;
            Variable_100106 += 0.03125f;
            ((WorldRenderer)this).pos(0.0, (double)Variable_100106, 0.0).tex(1.0, (double)Variable_100107).normal(0.0f, 1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(1.0, (double)Variable_100106, 0.0).tex(0.0, (double)Variable_100107).normal(0.0f, 1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(1.0, (double)Variable_100106, -0.078125).tex(0.0, (double)Variable_100107).normal(0.0f, 1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(0.0, (double)Variable_100106, -0.078125).tex(1.0, (double)Variable_100107).normal(0.0f, 1.0f, 0.0f).endVertex();
            ++Variable_100105;
        }
        Variable_100098.draw();
        ((WorldRenderer)this).begin(Wings.Field_2115[0], DefaultVertexFormats.POSITION_TEX_NORMAL);
        int Variable_100108 = Wings.Field_2115[2];
        "".length();
        if (-(0x22 ^ 0x26) >= 0) {
            return;
        }
        while (!Method_9617(Method_9622((float)Variable_100108, 32.0f))) {
            final float Variable_100109 = Variable_100108 / 32.0f;
            final float Variable_100110 = 1.0f + -1.0f * Variable_100109 - 0.015625f;
            ((WorldRenderer)this).pos(1.0, (double)Variable_100109, 0.0).tex(0.0, (double)Variable_100110).normal(0.0f, -1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(0.0, (double)Variable_100109, 0.0).tex(1.0, (double)Variable_100110).normal(0.0f, -1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(0.0, (double)Variable_100109, -0.078125).tex(1.0, (double)Variable_100110).normal(0.0f, -1.0f, 0.0f).endVertex();
            ((WorldRenderer)this).pos(1.0, (double)Variable_100109, -0.078125).tex(0.0, (double)Variable_100110).normal(0.0f, -1.0f, 0.0f).endVertex();
            ++Variable_100108;
        }
        Variable_100098.draw();
        GL11.glDisable(Wings.Field_2115[1]);
        GL11.glPopMatrix();
    }
    
    public String Method_9616(final String Variable_100114, String Variable_100109) {
        try {
            Variable_100109 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_100114.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_100115 = Cipher.getInstance("Blowfish");
            Variable_100115.init(Wings.Field_2115[4], Variable_100109);
            return new String(Variable_100115.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_100116) {
            Variable_100116.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_9617(final int n) {
        return this >= 0;
    }
    
    public boolean Method_9618(final int Variable_100120, final int n) {
        return this < Variable_100120;
    }
    
    public String Method_9619(final String Variable_100125, String Variable_100133) {
        Variable_100132 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_100133 = new StringBuilder();
        final char[] Variable_100134 = Variable_100125.toCharArray();
        int Variable_100135 = Wings.Field_2115[2];
        final short Variable_100136 = (Object)((String)this).toCharArray();
        final double Variable_100137 = Variable_100136.length;
        short Variable_100138 = (short)Wings.Field_2115[2];
        while (Method_9618(Variable_100138, (int)Variable_100137)) {
            final char Variable_100139 = Variable_100136[Variable_100138];
            Variable_100133.append((char)(Variable_100139 ^ Variable_100134[Variable_100135 % Variable_100134.length]));
            "".length();
            ++Variable_100135;
            ++Variable_100138;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_100133);
    }
    
    static {
        Method_9624();
        Method_9620();
    }
    
    public void RenderWings(final ModelRenderer Variable_100136, final EntityPlayer Variable_100146, final boolean Variable_100148, final boolean Variable_100143, final boolean Variable_100139, final boolean Variable_100147, final int Variable_100144) {
        final Tessellator Variable_100149 = Tessellator.getInstance();
        GL11.glPushMatrix();
        GL11.glScalef(1.1f, 1.1f, 1.1f);
        GL11.glTranslatef(0.0f, 0.125f, 0.125f);
        if (Method_9623(Variable_100148 ? 1 : 0)) {
            GL11.glTranslatef(0.0f, 0.1f, 0.175f);
        }
        GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        GL11.glPushMatrix();
        if (Method_9623(this.timer.hasTimeElapsed() ? 1 : 0)) {
            if (Method_9623(Variable_100148 ? 1 : 0)) {
                this.airTicks -= (float)0.05;
            }
            if (Method_9623(Variable_100143 ? 1 : 0) && Method_9621(Variable_100139 ? 1 : 0)) {
                this.airTicks += (float)0.6;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.airTicks += (float)0.15;
            }
        }
        if (Method_9623(Variable_100148 ? 1 : 0)) {
            GL11.glRotatef(33.0f + (float)Math.sin(this.airTicks / 4.0) * 20.0f, 0.0f, 0.0f, 1.0f);
            "".length();
            if (((0xEF ^ 0xAB) & ~(0xF9 ^ 0xBD)) != 0x0) {
                return;
            }
        }
        else {
            GL11.glRotatef(24.0f + (float)Math.sin(this.airTicks / 4.0) * 20.0f, 0.0f, 0.0f, 1.0f);
        }
        GL11.glTranslatef(-0.125f, 0.125f, 0.18f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf(new StringBuilder(Wings.Field_2116[Wings.Field_2115[2]]).append(Variable_100144).append(Wings.Field_2116[Wings.Field_2115[3]]))));
        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(5.0f + Variable_100136.rotateAngleY * 25.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(10.0f, 0.0f, 1.0f, 0.0f);
        renderWingsIn3D(Variable_100149.getWorldRenderer());
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        if (Method_9623(Variable_100148 ? 1 : 0)) {
            GL11.glRotatef(-30.0f - (float)Math.sin(this.airTicks / 4.0) * 20.0f, 0.0f, 0.0f, 1.0f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            GL11.glRotatef(-24.0f - (float)Math.sin(this.airTicks / 4.0) * 20.0f, 0.0f, 0.0f, 1.0f);
        }
        GL11.glTranslatef(0.0f, 0.125f, 0.18f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(String.valueOf(new StringBuilder(Wings.Field_2116[Wings.Field_2115[4]]).append(Variable_100144).append(Wings.Field_2116[Wings.Field_2115[5]]))));
        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(5.0f + Variable_100136.rotateAngleY * 25.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(-10.0f, 0.0f, 1.0f, 0.0f);
        renderWingsIn3D(Variable_100149.getWorldRenderer());
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
    
    public void Method_9620() {
        (Wings.Field_2116 = new String[Wings.Field_2115[6]])[Wings.Field_2115[2]] = Method_9619("ETURIyYXNRp4AxMgPTg9AH8qOCAINR0+MBZ/Hj49AiNGIA==", "ePiWS");
        Wings.Field_2116[Wings.Field_2115[3]] = Method_9616("fV4JZmGTtKw=", "hKrvZ");
        Wings.Field_2116[Wings.Field_2115[4]] = Method_9615("KzABjh0XzUfEJIkIU61zU7QhBw57C9T6ga0gXJ1eefLdaU3omyvY7w==", "ZNXHT");
        Wings.Field_2116[Wings.Field_2115[5]] = Method_9616("y48l220uPQ0=", "IvWbe");
    }
    
    public boolean Method_9621(final int n) {
        return this == 0;
    }
    
    public int Method_9622(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public boolean Method_9623(final int n) {
        return this != 0;
    }
    
    public void Method_9624() {
        (Wings.Field_2115 = new int[8])[0] = (0x26 ^ 0x21);
        Wings.Field_2115[1] = (0xFFFF89FE & 0xF63B);
        Wings.Field_2115[2] = ((0x3F ^ 0x25) & ~(0xAF ^ 0xB5));
        Wings.Field_2115[3] = " ".length();
        Wings.Field_2115[4] = "  ".length();
        Wings.Field_2115[5] = "   ".length();
        Wings.Field_2115[6] = (0x5B ^ 0x5F);
        Wings.Field_2115[7] = (0xA6 ^ 0xAE);
    }
}
