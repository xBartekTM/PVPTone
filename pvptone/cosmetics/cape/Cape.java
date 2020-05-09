package pvptone.cosmetics.cape;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.client.entity.*;
import org.apache.commons.io.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import java.io.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.client.renderer.*;
import java.awt.image.*;
import java.awt.*;

public class Cape extends Object<Cape>
{
    public int[] Field_749;
    public String[] Field_750;
    
    public String Method_3400(final String Variable_34421, final String Variable_34424) {
        try {
            final SecretKeySpec Variable_34422 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_34421.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_34423 = Cipher.getInstance("Blowfish");
            Variable_34423.init(Cape.Field_749[2], Variable_34422);
            return new String(Variable_34423.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_34424) {
            Variable_34424.printStackTrace();
            return null;
        }
    }
    
    static {
        Method_3404();
        Method_3407();
    }
    
    public boolean Method_3401(final int Variable_34429, final int n) {
        return this < Variable_34429;
    }
    
    public String Method_3402(final String Variable_34433, String Variable_34434) {
        try {
            Variable_34434 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_34433.getBytes(StandardCharsets.UTF_8)), Cape.Field_749[6]), "DES");
            final Cipher Variable_34435 = Cipher.getInstance("DES");
            Variable_34435.init(Cape.Field_749[2], Variable_34434);
            return new String(Variable_34435.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_34436) {
            Variable_34436.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_3403(final int n) {
        return this == 0;
    }
    
    public void Method_3404() {
        (Cape.Field_749 = new int[7])[0] = ((0xC0 ^ 0x94 ^ (0x17 ^ 0x66)) & (28 + 107 - 17 + 24 ^ 141 + 88 - 127 + 69 ^ -" ".length()));
        Cape.Field_749[1] = " ".length();
        Cape.Field_749[2] = "  ".length();
        Cape.Field_749[3] = (0x6D ^ 0x52 ^ 113 + 2 - 57 + 69);
        Cape.Field_749[4] = (0x39 ^ 0x19);
        Cape.Field_749[5] = "   ".length();
        Cape.Field_749[6] = (0xAF ^ 0xA7);
    }
    
    public void downloadCape(final AbstractClientPlayer Variable_34453, int Variable_34448) {
        Variable_34448 = ((AbstractClientPlayer)this).getName();
        if (Method_3405((int)Variable_34453) && Method_3406(Variable_34448) && Method_3403(Variable_34448.isEmpty() ? 1 : 0)) {
            final String Variable_34454 = String.valueOf(new StringBuilder(Cape.Field_750[Cape.Field_749[0]]).append((int)Variable_34453).append(Cape.Field_750[Cape.Field_749[1]]));
            final String Variable_34455 = FilenameUtils.getBaseName(Variable_34454);
            final ResourceLocation Variable_34456 = new ResourceLocation(String.valueOf(new StringBuilder(Cape.Field_750[Cape.Field_749[2]]).append(Variable_34455)));
            final TextureManager Variable_34457 = Minecraft.getMinecraft().getTextureManager();
            final ITextureObject Variable_34458 = Variable_34457.getTexture(Variable_34456);
            if (Method_3406(Variable_34458) && Method_3405((Variable_34458 instanceof ThreadDownloadImageData) ? 1 : 0)) {
                final ThreadDownloadImageData Variable_34459 = (ThreadDownloadImageData)Variable_34458;
                if (Method_3406(Variable_34459.imageFound)) {
                    if (Method_3405(((boolean)Variable_34459.imageFound) ? 1 : 0)) {
                        ((AbstractClientPlayer)this).setLocationOfCape(Variable_34456);
                    }
                    return;
                }
            }
            final IImageBuffer Variable_34460 = (IImageBuffer)new Object<Cape$1>(this, Variable_34456) {
                public ImageBufferDownload ibd = new ImageBufferDownload();
                public ResourceLocation val$resourcelocation;
                public AbstractClientPlayer val$p_downloadCape_0_;
                
                public BufferedImage parseUserSkin(final BufferedImage Variable_70498) {
                    return Cape.parseCape(Variable_70498);
                }
                
                public void skinAvailable() {
                    this.val$p_downloadCape_0_.setLocationOfCape(this.val$resourcelocation);
                }
            };
            final ThreadDownloadImageData Variable_34461 = new ThreadDownloadImageData((File)null, Variable_34454, (ResourceLocation)null, Variable_34460);
            Variable_34457.loadTexture(Variable_34456, (ITextureObject)Variable_34461);
            "".length();
        }
    }
    
    public boolean Method_3405(final int n) {
        return this != 0;
    }
    
    public BufferedImage parseCape(BufferedImage Variable_34476) {
        Variable_34476 = Cape.Field_749[3];
        int Variable_34477 = Cape.Field_749[4];
        final int Variable_34478 = ((BufferedImage)this).getWidth();
        final int Variable_34479 = ((BufferedImage)this).getHeight();
        "".length();
        if (-" ".length() > -" ".length()) {
            return null;
        }
        while (!Method_3408(Variable_34476, Variable_34478) || !Method_3408(Variable_34477, Variable_34479)) {
            Variable_34476 *= Cape.Field_749[2];
            Variable_34477 *= Cape.Field_749[2];
        }
        final BufferedImage Variable_34480 = new BufferedImage(Variable_34476, Variable_34477, Cape.Field_749[2]);
        final Graphics Variable_34481 = Variable_34480.getGraphics();
        Variable_34481.drawImage((Image)this, Cape.Field_749[0], Cape.Field_749[0], null);
        "".length();
        Variable_34481.dispose();
        return Variable_34480;
    }
    
    public boolean Method_3406(final Object o) {
        return this != null;
    }
    
    public void Method_3407() {
        (Cape.Field_750 = new String[Cape.Field_749[5]])[Cape.Field_749[0]] = Method_3400("A/jqEfrCobUi7gW2HXrrpid3LPyBYBThMfe26AofZNWlX9KUyA3P5aX07XHs6VST", "SDlmm");
        Cape.Field_750[Cape.Field_749[1]] = Method_3402("mlnh9nI2AG0=", "fyvYB");
        Cape.Field_750[Cape.Field_749[2]] = Method_3409("IhUCDyEnWw==", "AtrjN");
    }
    
    public boolean Method_3408(final int Variable_34478, final int n) {
        return this >= Variable_34478;
    }
    
    public String Method_3409(final String Variable_34492, String Variable_34491) {
        Variable_34489 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_34491 = new StringBuilder();
        final char[] Variable_34493 = Variable_34492.toCharArray();
        int Variable_34494 = Cape.Field_749[0];
        final boolean Variable_34495 = (Object)((String)this).toCharArray();
        final byte Variable_34496 = (byte)Variable_34495.length;
        double Variable_34497 = Cape.Field_749[0];
        while (Method_3401((int)Variable_34497, Variable_34496)) {
            final char Variable_34498 = Variable_34495[Variable_34497];
            Variable_34491.append((char)(Variable_34498 ^ Variable_34493[Variable_34494 % Variable_34493.length]));
            "".length();
            ++Variable_34494;
            ++Variable_34497;
            "".length();
            if (-(0x71 ^ 0x1 ^ (0xEC ^ 0x99)) >= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_34491);
    }
}
