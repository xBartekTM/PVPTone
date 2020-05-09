package pvptone.utils;

import java.nio.charset.*;
import pvptone.enums.*;
import pvptone.loaders.*;
import pvptone.options.*;
import net.minecraft.client.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import net.minecraft.item.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import java.util.*;
import net.minecraft.potion.*;

public class Utils extends Object<Utils>
{
    public int[] Field_303;
    public String[] Field_304;
    
    public String Method_1369(final String Variable_13346, String Variable_13338) {
        Variable_13350 = (byte)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_13338 = new StringBuilder();
        final char[] Variable_13351 = Variable_13346.toCharArray();
        int Variable_13352 = Utils.Field_303[0];
        final short Variable_13353 = (Object)((String)this).toCharArray();
        final short Variable_13354 = (short)Variable_13353.length;
        short Variable_13355 = (short)Utils.Field_303[0];
        while (Method_1373(Variable_13355, Variable_13354)) {
            final char Variable_13356 = Variable_13353[Variable_13355];
            Variable_13338.append((char)(Variable_13356 ^ Variable_13351[Variable_13352 % Variable_13351.length]));
            "".length();
            ++Variable_13352;
            ++Variable_13355;
            "".length();
            if ((0x53 ^ 0x7F ^ (0xA9 ^ 0x81)) <= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_13338);
    }
    
    public void reloadCosmetics() {
        CosmeticsLoader.u.clear();
        CosmeticsLoader.load(Utils.Field_304[Utils.Field_303[2]], LoadType.WINGS);
        "".length();
        CosmeticsLoader.load(Utils.Field_304[Utils.Field_303[3]], LoadType.ITEMS);
        "".length();
        CosmeticsLoader.load(Utils.Field_304[Utils.Field_303[4]], LoadType.HAT);
        "".length();
        BlacklistLoader.load();
        "".length();
    }
    
    public boolean Method_1370(final int Variable_13352, final int n) {
        return this == Variable_13352;
    }
    
    public boolean Method_1371(final Object o) {
        return this != null;
    }
    
    public void attemptSwing() {
        if (Method_1377(OptionsEnum2.Animation.val ? 1 : 0) && Method_1380(Minecraft.getMinecraft().thePlayer.getItemInUseCount())) {
            int n;
            if (Method_1377(Minecraft.getMinecraft().gameSettings.keyBindAttack.isKeyDown() ? 1 : 0) && Method_1377(Minecraft.getMinecraft().gameSettings.keyBindUseItem.isKeyDown() ? 1 : 0)) {
                n = Utils.Field_303[1];
                "".length();
                if ((0x4F ^ 0x4B) == -" ".length()) {
                    return;
                }
            }
            else {
                n = Utils.Field_303[0];
            }
            Variable_13355 = (n != 0);
            if (Method_1377((int)this)) {
                swingItem(Minecraft.getMinecraft().thePlayer);
            }
        }
    }
    
    public String Method_1372(final String Variable_13364, String Variable_13360) {
        try {
            Variable_13360 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_13364.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_13365 = Cipher.getInstance("Blowfish");
            Variable_13365.init(Utils.Field_303[2], Variable_13360);
            return new String(Variable_13365.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_13366) {
            Variable_13366.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_1373(final int Variable_13367, final int n) {
        return this < Variable_13367;
    }
    
    public void renderItemStack(final Minecraft Variable_13370, final ItemStack Variable_13373, final int Variable_13368, int Variable_13375) {
        if (Method_1371(Variable_13370)) {
            GL11.glPushMatrix();
            Variable_13375 = Minecraft.getMinecraft().getRenderItem();
            Variable_13375.renderItemAndEffectIntoGUI((ItemStack)Variable_13370, (int)Variable_13373, Variable_13368);
            ((Minecraft)this).fontRendererObj.drawString(String.valueOf(new StringBuilder(Utils.Field_304[Utils.Field_303[16]]).append(((ItemStack)Variable_13370).getMaxDamage() - ((ItemStack)Variable_13370).getItemDamage()).append(Utils.Field_304[Utils.Field_303[17]]).append(((ItemStack)Variable_13370).getMaxDamage())), (int)(Variable_13373 + Utils.Field_303[18]), Variable_13368 + Utils.Field_303[6], Utils.Field_303[0]);
            "".length();
            GL11.glPopMatrix();
        }
    }
    
    public void Method_1374() {
        (Utils.Field_303 = new int[20])[0] = ((0x66 ^ 0x23) & ~(0x7B ^ 0x3E));
        Utils.Field_303[1] = " ".length();
        Utils.Field_303[2] = "  ".length();
        Utils.Field_303[3] = "   ".length();
        Utils.Field_303[4] = (0xB2 ^ 0xB6);
        Utils.Field_303[5] = -" ".length();
        Utils.Field_303[6] = (0x6 ^ 0x3);
        Utils.Field_303[7] = (0x1E ^ 0x18);
        Utils.Field_303[8] = (23 + 59 + 69 + 40 ^ 57 + 84 + 26 + 17);
        Utils.Field_303[9] = (0x84 ^ 0x8C);
        Utils.Field_303[10] = (0x45 ^ 0xA ^ (0x4F ^ 0x9));
        Utils.Field_303[11] = (0x5C ^ 0x78 ^ (0x4E ^ 0x60));
        Utils.Field_303[12] = (0x11 ^ 0x1A);
        Utils.Field_303[13] = (8 + 45 + 90 + 19 ^ 41 + 97 - 49 + 85);
        Utils.Field_303[14] = (0x27 ^ 0x4F ^ (0x22 ^ 0x47));
        Utils.Field_303[15] = (0x48 ^ 0x46);
        Utils.Field_303[16] = (0x11 ^ 0x1E);
        Utils.Field_303[17] = (0xDB ^ 0xC7 ^ (0x81 ^ 0x8D));
        Utils.Field_303[18] = (0x99 ^ 0x8D);
        Utils.Field_303[19] = (0x65 ^ 0x75 ^ " ".length());
    }
    
    public String fixColor(final String s) {
        return ((String)this).replace(Utils.Field_304[Utils.Field_303[0]], Utils.Field_304[Utils.Field_303[1]]);
    }
    
    public void Method_1375() {
        (Utils.Field_304 = new String[Utils.Field_303[19]])[Utils.Field_303[0]] = Method_1372("iCHV2mMRgrA=", "bXjmi");
        Utils.Field_304[Utils.Field_303[1]] = Method_1369("w50=", "zJGBw");
        Utils.Field_304[Utils.Field_303[2]] = Method_1369("BTIeCXFCaRkQPwhzU018QzEPG3pDMgMNKgMnEhxlDikHVjwEKA0KZRk+Hg==", "mFjyK");
        Utils.Field_304[Utils.Field_303[3]] = Method_1369("Mh4uMUx1RSkoAj9fY3VBdB0/I0d0HjM1FzQLIiRYOQU3bh8uDzcyWC4SLg==", "ZjZAv");
        Utils.Field_304[Utils.Field_303[4]] = Method_1369("LiMHEUppeAAIBCNiSlVHaCAWA0FoIxoVESg2CwReJTgeThgnIwBPBD4j", "FWsap");
        Utils.Field_304[Utils.Field_303[6]] = Method_1369("GQ==", "PcAcK");
        Utils.Field_304[Utils.Field_303[7]] = Method_1372("bCArDUDAgSE=", "JgIpM");
        Utils.Field_304[Utils.Field_303[8]] = Method_1372("CAhP+vZ58XQ=", "wlPPf");
        Utils.Field_304[Utils.Field_303[9]] = Method_1372("YEFdk/P+DAs=", "qCTsi");
        Utils.Field_304[Utils.Field_303[10]] = Method_1376("+jCqCiv+l2U=", "DJdhb");
        Utils.Field_304[Utils.Field_303[11]] = Method_1372("GXR3AqQ6AQo=", "PMisZ");
        Utils.Field_304[Utils.Field_303[12]] = Method_1369("ES8q", "GfcMA");
        Utils.Field_304[Utils.Field_303[13]] = Method_1376("+/v9qGETJRI=", "OTZWD");
        Utils.Field_304[Utils.Field_303[14]] = Method_1369("Hxk=", "VACpI");
        Utils.Field_304[Utils.Field_303[15]] = Method_1376("9fi/S5MA+5U=", "zgemj");
        Utils.Field_304[Utils.Field_303[16]] = Method_1369("w6Yh", "AGYJV");
        Utils.Field_304[Utils.Field_303[17]] = Method_1372("+BP1SYJO/B4=", "ZGpby");
    }
    
    static {
        Method_1374();
        Method_1375();
    }
    
    public String Method_1376(final String Variable_13383, final String Variable_13388) {
        try {
            final SecretKeySpec Variable_13386 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_13383.getBytes(StandardCharsets.UTF_8)), Utils.Field_303[9]), "DES");
            final Cipher Variable_13387 = Cipher.getInstance("DES");
            Variable_13387.init(Utils.Field_303[2], Variable_13386);
            return new String(Variable_13387.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_13388) {
            Variable_13388.printStackTrace();
            return null;
        }
    }
    
    public void swingItem(EntityPlayerSP Variable_13392) {
        double n;
        if (Method_1377(((EntityPlayerSP)this).isPotionActive(Potion.digSpeed) ? 1 : 0)) {
            n = 1.0 - (1.0 + Potion.digSpeed.getEffectiveness()) * 1.0;
            "".length();
            if ((0x3E ^ 0x3A) <= ((0x4E ^ 0x59) & ~(0xAA ^ 0xBD))) {
                return;
            }
        }
        else if (Method_1377(((EntityPlayerSP)this).isPotionActive(Potion.digSlowdown) ? 1 : 0)) {
            n = 1.0 + (1.0 + Potion.digSlowdown.getEffectiveness()) * 2.0;
            "".length();
            if (((0xDE ^ 0x92 ^ (0x8E ^ 0x80)) & (157 + 103 - 250 + 186 ^ 83 + 35 - 20 + 36 ^ -" ".length())) != ((14 + 132 - 39 + 119 ^ 53 + 142 - 112 + 91) & (80 + 39 - 112 + 129 ^ 101 + 51 - 36 + 80 ^ -" ".length()))) {
                return;
            }
        }
        else {
            n = 6.0;
        }
        Variable_13392 = (int)n;
        if (!Method_1377(((EntityPlayerSP)this).isSwingInProgress ? 1 : 0) || !Method_1373(((EntityPlayerSP)this).swingProgressInt, Variable_13392 / Utils.Field_303[2]) || Method_1379(((EntityPlayerSP)this).swingProgressInt)) {
            ((EntityPlayerSP)this).swingProgressInt = Utils.Field_303[5];
            ((EntityPlayerSP)this).isSwingInProgress = (Utils.Field_303[1] != 0);
        }
    }
    
    public boolean Method_1377(final int n) {
        return this != 0;
    }
    
    public void drawRect(final float Variable_13396, final float Variable_13398, final int Variable_13394, final int Variable_13395, int Variable_13415) {
        Variable_13415 = new ScaledResolution(Minecraft.getMinecraft());
        final int Variable_13416 = Variable_13415.getScaledWidth();
        final int Variable_13417 = Variable_13415.getScaledHeight();
        final int Variable_13418 = (int)(this * (float)(Variable_13416 - Variable_13398));
        final int Variable_13419 = (int)(Variable_13396 * (Variable_13417 - Variable_13394));
        final int Variable_13420 = (int)(Variable_13418 + Variable_13398);
        final int Variable_13421 = Variable_13419 + Variable_13394;
        Gui.drawRect(Variable_13418, Variable_13419, Variable_13420, Variable_13421, Variable_13395);
    }
    
    public int Method_1378(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public boolean isMoving() {
        if (!Method_1381(Method_1378(Minecraft.getMinecraft().thePlayer.moveForward, 0.0f)) || Method_1377(Method_1378(Minecraft.getMinecraft().thePlayer.moveStrafing, 0.0f))) {
            return Utils.Field_303[1] != 0;
        }
        return Utils.Field_303[0] != 0;
    }
    
    public boolean Method_1379(final int n) {
        return this < 0;
    }
    
    public boolean Method_1380(final int n) {
        return this > 0;
    }
    
    public int random(final int Variable_13422, int Variable_13426) {
        Variable_13426 = new Random();
        return (int)(Variable_13426.nextInt((int)(Variable_13422 - this)) + this);
    }
    
    public String getPotionAmplifier(final PotionEffect potionEffect) {
        if (Method_1381(((PotionEffect)this).getAmplifier())) {
            return Utils.Field_304[Utils.Field_303[6]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[1])) {
            return Utils.Field_304[Utils.Field_303[7]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[2])) {
            return Utils.Field_304[Utils.Field_303[8]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[3])) {
            return Utils.Field_304[Utils.Field_303[9]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[4])) {
            return Utils.Field_304[Utils.Field_303[10]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[6])) {
            return Utils.Field_304[Utils.Field_303[11]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[7])) {
            return Utils.Field_304[Utils.Field_303[12]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[8])) {
            return Utils.Field_304[Utils.Field_303[13]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[9])) {
            return Utils.Field_304[Utils.Field_303[14]];
        }
        if (Method_1370(((PotionEffect)this).getAmplifier(), Utils.Field_303[10])) {
            return Utils.Field_304[Utils.Field_303[15]];
        }
        return String.valueOf(new StringBuilder().append(((PotionEffect)this).getAmplifier()));
    }
    
    public boolean Method_1381(final int n) {
        return this == 0;
    }
}
