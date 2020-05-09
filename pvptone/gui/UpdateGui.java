package pvptone.gui;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;
import pvptone.*;

public class UpdateGui extends Object<UpdateGui>
{
    public String version;
    public String[] Field_2799;
    public int[] Field_2800;
    
    public void Method_12738() {
        (UpdateGui.Field_2799 = new String[UpdateGui.Field_2800[4]])[UpdateGui.Field_2800[0]] = Method_12743("FFLE6NBi1KtpyjGvkb6lR0z0y8x3nlEFqQ+uUR8VBhgZh2QulpN81w==", "rxNqm");
        UpdateGui.Field_2799[UpdateGui.Field_2800[1]] = Method_12739("OycOIB89JwV7OjkyIjsEKm0xIQNgLhkzBWEyGDM=", "OBvTj");
        UpdateGui.Field_2799[UpdateGui.Field_2800[2]] = Method_12743("1yXPD71AtSbpG4LkEUFlBZAa/lkBxBb7N5DHqsFji+Y=", "cnBjC");
        UpdateGui.Field_2799[UpdateGui.Field_2800[8]] = Method_12743("kc/S4Lmtk2eDro/lNBzpWaXWKuKUHOjQ", "vCTJS");
        UpdateGui.Field_2799[UpdateGui.Field_2800[9]] = Method_12743("UhG3So4GOl8=", "qkZBj");
        UpdateGui.Field_2799[UpdateGui.Field_2800[5]] = Method_12739("w6BdJhwRJkofFhQ0AAlJRsOgDA==", "Gjhsf");
        UpdateGui.Field_2799[UpdateGui.Field_2800[11]] = Method_12739("w6MS", "DtWrW");
        UpdateGui.Field_2799[UpdateGui.Field_2800[13]] = Method_12742("GfMcgnc8GN1KxMAFbcX2a5aefaYHj7p3nHiBAqJQOmvMMwiRRY9euGt4gSvKcTMZB01uFmd/CUACRdoxQAjJuQ==", "QQmXO");
    }
    
    public String Method_12739(final String Variable_131567, String Variable_131564) {
        Variable_131573 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_131564 = new StringBuilder();
        final char[] Variable_131574 = Variable_131567.toCharArray();
        int Variable_131575 = UpdateGui.Field_2800[0];
        final long Variable_131576 = (Object)((String)this).toCharArray();
        final Exception Variable_131577 = (Exception)Variable_131576.length;
        long Variable_131578 = UpdateGui.Field_2800[0];
        while (Method_12741((int)Variable_131578, (int)Variable_131577)) {
            final char Variable_131579 = Variable_131576[Variable_131578];
            Variable_131564.append((char)(Variable_131579 ^ Variable_131574[Variable_131575 % Variable_131574.length]));
            "".length();
            ++Variable_131575;
            ++Variable_131578;
            "".length();
            if (-(26 + 81 + 12 + 29 ^ 142 + 13 - 127 + 117) >= 0) {
                return null;
            }
        }
        return String.valueOf(Variable_131564);
    }
    
    public void Method_12740() {
        (UpdateGui.Field_2800 = new int[14])[0] = ((0xE2 ^ 0x98 ^ (0x2A ^ 0x58)) & (99 + 133 - 201 + 119 ^ 72 + 105 - 46 + 27 ^ -" ".length()));
        UpdateGui.Field_2800[1] = " ".length();
        UpdateGui.Field_2800[2] = "  ".length();
        UpdateGui.Field_2800[3] = (124 + 141 - 167 + 86 ^ 92 + 1 - 18 + 74);
        UpdateGui.Field_2800[4] = (0x52 ^ 0x5A);
        UpdateGui.Field_2800[5] = (0x4E ^ 0x9 ^ (0xDD ^ 0x9F));
        UpdateGui.Field_2800[6] = (0x22 ^ 0x46 ^ (0x8A ^ 0xB4));
        UpdateGui.Field_2800[7] = -" ".length();
        UpdateGui.Field_2800[8] = "   ".length();
        UpdateGui.Field_2800[9] = (0x9C ^ 0x98);
        UpdateGui.Field_2800[10] = (0x55 ^ 0x49 ^ (0x2C ^ 0x3F));
        UpdateGui.Field_2800[11] = (0x39 ^ 0x3F);
        UpdateGui.Field_2800[12] = (0x36 ^ 0x52 ^ (0x24 ^ 0x5E));
        UpdateGui.Field_2800[13] = (37 + 115 - 103 + 109 ^ 91 + 132 - 106 + 36);
    }
    
    public boolean Method_12741(final int Variable_131579, final int n) {
        return this < Variable_131579;
    }
    
    public String Method_12742(final String Variable_131586, final String Variable_131589) {
        try {
            final SecretKeySpec Variable_131587 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_131586.getBytes(StandardCharsets.UTF_8)), UpdateGui.Field_2800[4]), "DES");
            final Cipher Variable_131588 = Cipher.getInstance("DES");
            Variable_131588.init(UpdateGui.Field_2800[2], Variable_131587);
            return new String(Variable_131588.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_131589) {
            Variable_131589.printStackTrace();
            return null;
        }
    }
    
    public UpdateGui(final String Variable_131590) {
        this.version = Variable_131590;
    }
    
    public String Method_12743(final String Variable_131596, final String Variable_131599) {
        try {
            final SecretKeySpec Variable_131597 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_131596.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_131598 = Cipher.getInstance("Blowfish");
            Variable_131598.init(UpdateGui.Field_2800[2], Variable_131597);
            return new String(Variable_131598.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_131599) {
            Variable_131599.printStackTrace();
            return null;
        }
    }
    
    static {
        Method_12740();
        Method_12738();
    }
    
    public void drawScreen(final int Variable_131610, final int Variable_131604, final float Variable_131608) {
        final ScaledResolution Variable_131611 = new ScaledResolution(Minecraft.getMinecraft());
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(UpdateGui.Field_2799[UpdateGui.Field_2800[0]]));
        drawModalRectWithCustomSizedTexture(UpdateGui.Field_2800[0], UpdateGui.Field_2800[0], 0.0f, 0.0f, Variable_131611.getScaledWidth(), Variable_131611.getScaledHeight(), (float)Variable_131611.getScaledWidth(), (float)Variable_131611.getScaledHeight());
        super.drawScreen(Variable_131610, Variable_131604, Variable_131608);
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(UpdateGui.Field_2799[UpdateGui.Field_2800[1]]));
        GlStateManager.enableAlpha();
        Gui.drawModalRectWithCustomSizedTexture(this.width / UpdateGui.Field_2800[2] - UpdateGui.Field_2800[3] + UpdateGui.Field_2800[4], UpdateGui.Field_2800[5], 5.0f, 0.0f, UpdateGui.Field_2800[6], UpdateGui.Field_2800[6], 90.0f, 90.0f);
        GlStateManager.bindTexture(UpdateGui.Field_2800[0]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, UpdateGui.Field_2799[UpdateGui.Field_2800[2]], (float)(this.width / UpdateGui.Field_2800[2]), (float)(this.height / UpdateGui.Field_2800[2]), UpdateGui.Field_2800[7]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(UpdateGui.Field_2799[UpdateGui.Field_2800[8]]).append(Config.version).append(UpdateGui.Field_2799[UpdateGui.Field_2800[9]])), (float)(this.width / UpdateGui.Field_2800[2]), (float)(this.height / UpdateGui.Field_2800[2] + UpdateGui.Field_2800[10]), UpdateGui.Field_2800[7]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, String.valueOf(new StringBuilder(UpdateGui.Field_2799[UpdateGui.Field_2800[5]]).append(this.version).append(UpdateGui.Field_2799[UpdateGui.Field_2800[11]])), (float)(this.width / UpdateGui.Field_2800[2]), (float)(this.height / UpdateGui.Field_2800[2] + UpdateGui.Field_2800[12]), UpdateGui.Field_2800[7]);
        Minecraft.getMinecraft().fontRendererObj.drawCenteredString(this.fontRendererObj, UpdateGui.Field_2799[UpdateGui.Field_2800[13]], (float)(this.width / UpdateGui.Field_2800[2]), (float)(this.height / UpdateGui.Field_2800[2] + UpdateGui.Field_2800[3]), UpdateGui.Field_2800[7]);
    }
}
