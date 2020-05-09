package pvptone.gui;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;
import pvptone.loaders.*;
import pvptone.utils.*;

public class BlacklistGui extends Object<BlacklistGui>
{
    public String[] Field_1957;
    public String admin;
    public int[] Field_1958;
    public String name;
    public String reason;
    public String time;
    
    public String Method_8896(final String Variable_93046, final String Variable_93049) {
        try {
            final SecretKeySpec Variable_93047 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_93046.getBytes(StandardCharsets.UTF_8)), BlacklistGui.Field_1958[4]), "DES");
            final Cipher Variable_93048 = Cipher.getInstance("DES");
            Variable_93048.init(BlacklistGui.Field_1958[2], Variable_93047);
            return new String(Variable_93048.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_93049) {
            Variable_93049.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_8897(final int n) {
        return this >= 0;
    }
    
    public void Method_8898() {
        (BlacklistGui.Field_1958 = new int[17])[0] = ((0xC0 ^ 0xBC ^ (0xBB ^ 0x83)) & (0x37 ^ 0x1 ^ (0x2A ^ 0x58) ^ -" ".length()));
        BlacklistGui.Field_1958[1] = " ".length();
        BlacklistGui.Field_1958[2] = "  ".length();
        BlacklistGui.Field_1958[3] = (0x5A ^ 0x77);
        BlacklistGui.Field_1958[4] = (0xAF ^ 0xA7);
        BlacklistGui.Field_1958[5] = (0x91 ^ 0x94);
        BlacklistGui.Field_1958[6] = (0x3A ^ 0x8 ^ (0xE4 ^ 0x8C));
        BlacklistGui.Field_1958[7] = -" ".length();
        BlacklistGui.Field_1958[8] = "   ".length();
        BlacklistGui.Field_1958[9] = (0x69 ^ 0x6D);
        BlacklistGui.Field_1958[10] = (0xB6 ^ 0xB9);
        BlacklistGui.Field_1958[11] = (0x62 ^ 0x64);
        BlacklistGui.Field_1958[12] = (0xBE ^ 0x94 ^ (0x2C ^ 0x1));
        BlacklistGui.Field_1958[13] = (129 + 64 - 106 + 53 ^ 33 + 95 + 2 + 16);
        BlacklistGui.Field_1958[14] = (0x2D ^ 0x72 ^ (0x60 ^ 0x36));
        BlacklistGui.Field_1958[15] = (0x5E ^ 0xC ^ (0x64 ^ 0x3C));
        BlacklistGui.Field_1958[16] = (0x43 ^ 0x48);
    }
    
    public void Method_8899() {
        (BlacklistGui.Field_1957 = new String[BlacklistGui.Field_1958[16]])[BlacklistGui.Field_1958[0]] = Method_8896("e9JaIWIQARqhWsiF4vG+pyKxgiEwrWfdfEzQwGDWS3gHuPhPmkfVhw==", "sNJtX");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[1]] = Method_8901("LCs+PQMqKzVmJi4+EiYYPWEBPB93IikuGXY+KC4=", "XNFIv");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[2]] = Method_8903("rL5U5qH70zGqjYlzPcEbYQofISV+36F22zQPvzEyJmY=", "MmqYK");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[8]] = Method_8903("IhKdlx2vejinmZ/zm2KHYgXHFZdQ3FY8", "pOoVb");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[9]] = Method_8896("+G9l0SwjHks=", "lLyPb");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[5]] = Method_8896("wxBfF7GdFPzHT369RFwCFg==", "UaFjA");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[11]] = Method_8901("Ng==", "ixlIM");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[12]] = Method_8901("aQ==", "INlWe");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[4]] = Method_8903("mCi2FKDCy34=", "mRqvO");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[14]] = Method_8901("w41WKgUbBQwKBBYJGwUVTx0YBxEMEAQFGQpQQcOMFg==", "jakpo");
        BlacklistGui.Field_1957[BlacklistGui.Field_1958[15]] = Method_8896("zZa7DgREDsE=", "mRgfm");
    }
    
    public BlacklistGui(final String Variable_93056, final String Variable_93051, final String Variable_93052, final String Variable_93054) {
        this.name = Variable_93056;
        this.admin = Variable_93051;
        this.reason = Variable_93052;
        this.time = Variable_93054;
    }
    
    public int Method_8900(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: lload_2        
        //     2: lcmp           
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public String Method_8901(final String Variable_93065, String Variable_93066) {
        Variable_93071 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_93066 = new StringBuilder();
        final char[] Variable_93072 = Variable_93065.toCharArray();
        int Variable_93073 = BlacklistGui.Field_1958[0];
        final short Variable_93074 = (Object)((String)this).toCharArray();
        final int Variable_93075 = Variable_93074.length;
        byte Variable_93076 = (byte)BlacklistGui.Field_1958[0];
        while (Method_8902(Variable_93076, Variable_93075)) {
            final char Variable_93077 = Variable_93074[Variable_93076];
            Variable_93066.append((char)(Variable_93077 ^ Variable_93072[Variable_93073 % Variable_93072.length]));
            "".length();
            ++Variable_93073;
            ++Variable_93076;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(Variable_93066);
    }
    
    static {
        Method_8898();
        Method_8899();
    }
    
    public boolean Method_8902(final int Variable_93076, final int n) {
        return this < Variable_93076;
    }
    
    public void drawScreen(final int Variable_93082, final int Variable_93078, final float Variable_93085) {
        final ScaledResolution Variable_93086 = new ScaledResolution(Minecraft.getMinecraft());
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(BlacklistGui.Field_1957[BlacklistGui.Field_1958[0]]));
        drawModalRectWithCustomSizedTexture(BlacklistGui.Field_1958[0], BlacklistGui.Field_1958[0], 0.0f, 0.0f, Variable_93086.getScaledWidth(), Variable_93086.getScaledHeight(), (float)Variable_93086.getScaledWidth(), (float)Variable_93086.getScaledHeight());
        super.drawScreen(Variable_93082, Variable_93078, Variable_93085);
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(BlacklistGui.Field_1957[BlacklistGui.Field_1958[1]]));
        GlStateManager.enableAlpha();
        Gui.drawModalRectWithCustomSizedTexture(this.width / BlacklistGui.Field_1958[2] - BlacklistGui.Field_1958[3] + BlacklistGui.Field_1958[4], BlacklistGui.Field_1958[5], 5.0f, 0.0f, BlacklistGui.Field_1958[6], BlacklistGui.Field_1958[6], 90.0f, 90.0f);
        GlStateManager.bindTexture(BlacklistGui.Field_1958[0]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, BlacklistGui.Field_1957[BlacklistGui.Field_1958[2]], (float)(this.width / BlacklistGui.Field_1958[2]), (float)(this.height / BlacklistGui.Field_1958[2]), BlacklistGui.Field_1958[7]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(BlacklistGui.Field_1957[BlacklistGui.Field_1958[8]]).append(this.admin).append(BlacklistGui.Field_1957[BlacklistGui.Field_1958[9]])), (float)(this.width / BlacklistGui.Field_1958[2]), (float)(this.height / BlacklistGui.Field_1958[2] + BlacklistGui.Field_1958[10]), BlacklistGui.Field_1958[7]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(BlacklistGui.Field_1957[BlacklistGui.Field_1958[5]]).append(this.reason.replace(BlacklistGui.Field_1957[BlacklistGui.Field_1958[11]], BlacklistGui.Field_1957[BlacklistGui.Field_1958[12]])).append(BlacklistGui.Field_1957[BlacklistGui.Field_1958[4]])), (float)(this.width / BlacklistGui.Field_1958[2]), (float)(this.height / BlacklistGui.Field_1958[2] + BlacklistGui.Field_1958[13]), BlacklistGui.Field_1958[7]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(BlacklistGui.Field_1957[BlacklistGui.Field_1958[14]]).append(DataUtil.secondsToString(BlacklistLoader.timeexit)).append(BlacklistGui.Field_1957[BlacklistGui.Field_1958[15]])), (float)(this.width / BlacklistGui.Field_1958[2]), (float)(this.height / BlacklistGui.Field_1958[2] + BlacklistGui.Field_1958[3]), BlacklistGui.Field_1958[7]);
        if (Method_8904(Method_8900(BlacklistLoader.timeexit, 0L)) && Method_8897(Method_8900(System.currentTimeMillis(), BlacklistLoader.timeexit))) {
            System.exit(BlacklistGui.Field_1958[0]);
        }
    }
    
    public String Method_8903(final String Variable_93092, String Variable_93089) {
        try {
            Variable_93089 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_93092.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_93093 = Cipher.getInstance("Blowfish");
            Variable_93093.init(BlacklistGui.Field_1958[2], Variable_93089);
            return new String(Variable_93093.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_93094) {
            Variable_93094.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_8904(final int n) {
        return this != 0;
    }
}
