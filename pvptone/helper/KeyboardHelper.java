package pvptone.helper;

import net.minecraft.client.*;
import pvptone.gui.options.*;
import net.minecraft.client.gui.*;
import pvptone.mods.*;
import pvptone.options.*;
import net.minecraft.util.*;
import pvptone.gui.ingame.*;
import pvptone.gui.drag.*;
import pvptone.utils.*;
import pvptone.cosmetics.builder.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class KeyboardHelper extends Object<KeyboardHelper>
{
    public int[] Field_1508;
    public String[] Field_1509;
    
    public boolean Method_6870(final int Variable_71557, final int n) {
        return this == Variable_71557;
    }
    
    public void Method_6871() {
        (KeyboardHelper.Field_1509 = new String[KeyboardHelper.Field_1508[7]])[KeyboardHelper.Field_1508[0]] = Method_6876("Hjs3OwkGOS8=", "iWVXs");
        KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[1]] = Method_6877("U/JTcGLqFiKLafmDv/tEOQ==", "Lekkv");
        KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[2]] = Method_6875("PmqWy6/HHYAtziEtsM1CpzuL/nSmMexk301JKawG285qnOMtXDvnfg==", "YaQLN");
        KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[3]] = Method_6877("TMAEDGaMQDY=", "omRyc");
        KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[6]] = Method_6877("DfLj9Kn9j8COUA/3IjuMRsfsJ+eu4lOd", "xPytM");
    }
    
    public boolean Method_6872(final int n) {
        return this != 0;
    }
    
    public boolean Method_6873(final int Variable_71561, final int n) {
        return this < Variable_71561;
    }
    
    public void key(int Variable_71565) {
        if (Method_6870((int)this, Minecraft.getMinecraft().gameSettings.keyBindOptions.getKeyCode())) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new PvptoneOptions());
        }
        if (Method_6870((int)this, Minecraft.getMinecraft().gameSettings.keyBind360.getKeyCode())) {
            Mod360.start((int)this);
        }
        if (Method_6870((int)this, Minecraft.getMinecraft().gameSettings.keyBindAutosprint.getKeyCode())) {
            final OptionsEnum2 autoSprint = OptionsEnum2.AutoSprint;
            int val;
            if (Method_6872(OptionsEnum2.AutoSprint.val ? 1 : 0)) {
                val = KeyboardHelper.Field_1508[0];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                val = KeyboardHelper.Field_1508[1];
            }
            autoSprint.val = (val != 0);
            String s;
            if (Method_6872(OptionsEnum2.AutoSprint.val ? 1 : 0)) {
                s = KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[0]];
                "".length();
                if (((0xFF ^ 0xB7) & ~(0x17 ^ 0x5F)) != ((0xB ^ 0x68) & ~(0x43 ^ 0x20))) {
                    return;
                }
            }
            else {
                s = KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[1]];
            }
            Variable_71565 = s;
            final ChatComponentText Variable_71566 = new ChatComponentText(String.valueOf(new StringBuilder(KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[2]]).append(Variable_71565).append(KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[3]])));
            Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage((IChatComponent)Variable_71566);
        }
        if (Method_6870((int)this, KeyboardHelper.Field_1508[4])) {
            PvpToneGuiIngame.init();
        }
        if (Method_6870((int)this, Minecraft.getMinecraft().gameSettings.keyBindGui.getKeyCode())) {
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiDraggable());
        }
        if (Method_6870((int)this, Minecraft.getMinecraft().gameSettings.keyBindPrzeladuj.getKeyCode())) {
            Utils.reloadCosmetics();
        }
        if (Method_6870((int)this, KeyboardHelper.Field_1508[5])) {
            System.out.println(KeyboardHelper.Field_1509[KeyboardHelper.Field_1508[6]]);
            CosmeticsManager.c.clear();
            CosmeticsManager.init();
        }
    }
    
    public void Method_6874() {
        (KeyboardHelper.Field_1508 = new int[9])[0] = ((0x71 ^ 0x25) & ~(0xEF ^ 0xBB));
        KeyboardHelper.Field_1508[1] = " ".length();
        KeyboardHelper.Field_1508[2] = "  ".length();
        KeyboardHelper.Field_1508[3] = "   ".length();
        KeyboardHelper.Field_1508[4] = (12 + 137 - 100 + 97 ^ 169 + 171 - 257 + 97);
        KeyboardHelper.Field_1508[5] = (0x4 ^ 0x6A ^ (0xD0 ^ 0x9B));
        KeyboardHelper.Field_1508[6] = (0x50 ^ 0x54);
        KeyboardHelper.Field_1508[7] = (113 + 115 - 106 + 14 ^ 57 + 51 - 103 + 136);
        KeyboardHelper.Field_1508[8] = (0xAF ^ 0xA7);
    }
    
    static {
        Method_6874();
        Method_6871();
    }
    
    public String Method_6875(final String Variable_71571, String Variable_71573) {
        try {
            Variable_71573 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_71571.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_71574 = Cipher.getInstance("Blowfish");
            Variable_71574.init(KeyboardHelper.Field_1508[2], Variable_71573);
            return new String(Variable_71574.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_71575) {
            Variable_71575.printStackTrace();
            return null;
        }
    }
    
    public String Method_6876(final String Variable_71581, String Variable_71591) {
        Variable_71584 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_71591 = new StringBuilder();
        final char[] Variable_71592 = Variable_71581.toCharArray();
        int Variable_71593 = KeyboardHelper.Field_1508[0];
        final int Variable_71594 = (Object)((String)this).toCharArray();
        final Exception Variable_71595 = (Exception)Variable_71594.length;
        char Variable_71596 = (char)KeyboardHelper.Field_1508[0];
        while (Method_6873(Variable_71596, (int)Variable_71595)) {
            final char Variable_71597 = Variable_71594[Variable_71596];
            Variable_71591.append((char)(Variable_71597 ^ Variable_71592[Variable_71593 % Variable_71592.length]));
            "".length();
            ++Variable_71593;
            ++Variable_71596;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_71591);
    }
    
    public String Method_6877(final String Variable_71596, String Variable_71595) {
        try {
            Variable_71595 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_71596.getBytes(StandardCharsets.UTF_8)), KeyboardHelper.Field_1508[8]), "DES");
            final Cipher Variable_71597 = Cipher.getInstance("DES");
            Variable_71597.init(KeyboardHelper.Field_1508[2], Variable_71595);
            return new String(Variable_71597.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_71598) {
            Variable_71598.printStackTrace();
            return null;
        }
    }
}
