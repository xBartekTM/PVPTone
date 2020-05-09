package pvptone.gui.ingame.ui;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraft.client.resources.*;
import pvptone.utils.*;
import java.util.*;

public class ActiveEffects extends Object<ActiveEffects>
{
    public String[] Field_1317;
    public int[] Field_1318;
    
    public String Method_5945(final String Variable_60434, final String Variable_60439) {
        try {
            final SecretKeySpec Variable_60437 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_60434.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_60438 = Cipher.getInstance("Blowfish");
            Variable_60438.init(ActiveEffects.Field_1318[8], Variable_60437);
            return new String(Variable_60438.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_60439) {
            Variable_60439.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_5946(final int n) {
        return this == 0;
    }
    
    public String Method_5947(final String Variable_60446, String Variable_60448) {
        Variable_60453 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_60448 = new StringBuilder();
        final char[] Variable_60454 = Variable_60446.toCharArray();
        int Variable_60455 = ActiveEffects.Field_1318[0];
        final byte Variable_60456 = (Object)((String)this).toCharArray();
        final double Variable_60457 = Variable_60456.length;
        int Variable_60458 = ActiveEffects.Field_1318[0];
        while (Method_5950(Variable_60458, (int)Variable_60457)) {
            final char Variable_60459 = Variable_60456[Variable_60458];
            Variable_60448.append((char)(Variable_60459 ^ Variable_60454[Variable_60455 % Variable_60454.length]));
            "".length();
            ++Variable_60455;
            ++Variable_60458;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(Variable_60448);
    }
    
    public void renderGameOverlay(final int Variable_60476, final int Variable_60462, final float Variable_60468) {
        if (Method_5946(this.visible ? 1 : 0)) {
            return;
        }
        final int Variable_60477 = this.left;
        final int Variable_60478 = this.top;
        int Variable_60479 = ActiveEffects.Field_1318[0];
        final long Variable_60480 = (long)this.mc.thePlayer.getActivePotionEffects().iterator();
        "".length();
        if (((0xA5 ^ 0x9E) & ~(0x15 ^ 0x2E)) > 0) {
            return;
        }
        while (!Method_5946(((Iterator)Variable_60480).hasNext() ? 1 : 0)) {
            final PotionEffect Variable_60481 = ((Iterator<PotionEffect>)Variable_60480).next();
            final Potion Variable_60482 = Potion.potionTypes[Variable_60481.getPotionID()];
            if (Method_5948(Variable_60482.hasStatusIcon() ? 1 : 0)) {
                final int Variable_60483 = Variable_60482.getStatusIconIndex();
                this.mc.getTextureManager().bindTexture(new ResourceLocation(ActiveEffects.Field_1317[ActiveEffects.Field_1318[3]]));
                this.drawTexturedModalRect(Variable_60477 + ActiveEffects.Field_1318[4], Variable_60478 + Variable_60479, Variable_60483 % ActiveEffects.Field_1318[5] * ActiveEffects.Field_1318[6], ActiveEffects.Field_1318[7] + Variable_60483 / ActiveEffects.Field_1318[5] * ActiveEffects.Field_1318[6], ActiveEffects.Field_1318[6], ActiveEffects.Field_1318[6]);
            }
            this.mc.fontRendererObj.drawStringWithShadow(String.valueOf(new StringBuilder(String.valueOf(I18n.format(Variable_60482.getName(), new Object[ActiveEffects.Field_1318[0]]))).append(ActiveEffects.Field_1317[ActiveEffects.Field_1318[8]]).append(Utils.getPotionAmplifier(Variable_60481)).append(ActiveEffects.Field_1317[ActiveEffects.Field_1318[9]]).append(Potion.getDurationString(Variable_60481))), (float)(Variable_60477 + ActiveEffects.Field_1318[10] + ActiveEffects.Field_1318[6]), (float)(Variable_60478 + Variable_60479 + ActiveEffects.Field_1318[11]), ActiveEffects.Field_1318[12]);
            "".length();
            Variable_60479 += 16;
        }
    }
    
    public boolean Method_5948(final int n) {
        return this != 0;
    }
    
    public String Method_5949(final String Variable_60481, final String Variable_60484) {
        try {
            final SecretKeySpec Variable_60482 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_60481.getBytes(StandardCharsets.UTF_8)), ActiveEffects.Field_1318[5]), "DES");
            final Cipher Variable_60483 = Cipher.getInstance("DES");
            Variable_60483.init(ActiveEffects.Field_1318[8], Variable_60482);
            return new String(Variable_60483.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_60484) {
            Variable_60484.printStackTrace();
            return null;
        }
    }
    
    public ActiveEffects() {
        super(ActiveEffects.Field_1317[ActiveEffects.Field_1318[0]], ActiveEffects.Field_1318[1], ActiveEffects.Field_1318[2]);
    }
    
    public boolean Method_5950(final int Variable_60490, final int n) {
        return this < Variable_60490;
    }
    
    static {
        Method_5952();
        Method_5951();
    }
    
    public void Method_5951() {
        (ActiveEffects.Field_1317 = new String[ActiveEffects.Field_1318[13]])[ActiveEffects.Field_1318[0]] = Method_5947("JBIYCB8ANAoHDAYFHw==", "eqlai");
        ActiveEffects.Field_1317[ActiveEffects.Field_1318[3]] = Method_5945("3StljTZgBjQkngaTUgB7UbXSnWW6RTksBTP9VkG7dL5EDN/Bord5JA==", "wHmmq");
        ActiveEffects.Field_1317[ActiveEffects.Field_1318[8]] = Method_5949("dLmu5QYMtYU=", "MoDuw");
        ActiveEffects.Field_1317[ActiveEffects.Field_1318[9]] = Method_5947("dA==", "TzXie");
    }
    
    public void Method_5952() {
        (ActiveEffects.Field_1318 = new int[14])[0] = ((25 + 27 + 34 + 53 ^ 90 + 87 - 88 + 77) & (0x4F ^ 0x27 ^ (0x42 ^ 0x7) ^ -" ".length()));
        ActiveEffects.Field_1318[1] = (0xF ^ 0x7 ^ (0x5D ^ 0xA));
        ActiveEffects.Field_1318[2] = (0x6 ^ 0x5C);
        ActiveEffects.Field_1318[3] = " ".length();
        ActiveEffects.Field_1318[4] = (82 + 30 - 42 + 75 ^ 80 + 143 - 150 + 78);
        ActiveEffects.Field_1318[5] = (0x4A ^ 0x47 ^ (0x52 ^ 0x57));
        ActiveEffects.Field_1318[6] = (0xD4 ^ 0xC6);
        ActiveEffects.Field_1318[7] = 110 + 58 - 46 + 76;
        ActiveEffects.Field_1318[8] = "  ".length();
        ActiveEffects.Field_1318[9] = "   ".length();
        ActiveEffects.Field_1318[10] = (0x2C ^ 0x26);
        ActiveEffects.Field_1318[11] = (0x10 ^ 0x15);
        ActiveEffects.Field_1318[12] = (-(102 + 28 - 52 + 51) & (-1 & 0x7F7FFF));
        ActiveEffects.Field_1318[13] = (0xA5 ^ 0xA1);
    }
}
