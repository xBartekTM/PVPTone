package pvptone.gui;

import java.io.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PvptoneOptions extends Object<PvptoneOptions>
{
    public int[] Field_916;
    public ScrollList scrollerThingy;
    public String[] Field_917;
    
    public void mouseReleased(final int Variable_42520, final int Variable_42517, final int Variable_42518) {
        if (!Method_4168(Variable_42518) || Method_4168(this.scrollerThingy.mouseReleased(Variable_42520, Variable_42517, Variable_42518) ? 1 : 0)) {
            super.mouseReleased(Variable_42520, Variable_42517, Variable_42518);
        }
    }
    
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.scrollerThingy.handleMouseInput();
    }
    
    public void Method_4166() {
        (PvptoneOptions.Field_916 = new int[5])[0] = ((0x4D ^ 0x56) & ~(0x6B ^ 0x70));
        PvptoneOptions.Field_916[1] = "  ".length();
        PvptoneOptions.Field_916[2] = (0x9C ^ 0x94);
        PvptoneOptions.Field_916[3] = (-" ".length() & (-1 & 0xFFFFFF));
        PvptoneOptions.Field_916[4] = " ".length();
    }
    
    public void mouseClicked(final int Variable_42526, final int Variable_42528, final int Variable_42527) throws IOException {
        if (!Method_4168(Variable_42527) || Method_4168(this.scrollerThingy.mouseClicked(Variable_42526, Variable_42528, Variable_42527) ? 1 : 0)) {
            super.mouseClicked(Variable_42526, Variable_42528, Variable_42527);
        }
    }
    
    public String Method_4167(final String Variable_42535, final String Variable_42539) {
        try {
            final SecretKeySpec Variable_42537 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_42535.getBytes(StandardCharsets.UTF_8)), PvptoneOptions.Field_916[2]), "DES");
            final Cipher Variable_42538 = Cipher.getInstance("DES");
            Variable_42538.init(PvptoneOptions.Field_916[1], Variable_42537);
            return new String(Variable_42538.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_42539) {
            Variable_42539.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_4168(final int n) {
        return this == 0;
    }
    
    public void initGui() {
        this.scrollerThingy = new ScrollList(this.mc, this);
        this.buttonList.clear();
    }
    
    public void drawScreen(final int Variable_42546, final int Variable_42550, final float Variable_42548) {
        this.scrollerThingy.drawScreen(Variable_42546, Variable_42550, Variable_42548);
        this.drawCenteredString(this.fontRendererObj, PvptoneOptions.Field_917[PvptoneOptions.Field_916[0]], this.width / PvptoneOptions.Field_916[1], PvptoneOptions.Field_916[2], PvptoneOptions.Field_916[3]);
        super.drawScreen(Variable_42546, Variable_42550, Variable_42548);
    }
    
    public void Method_4169() {
        (PvptoneOptions.Field_917 = new String[PvptoneOptions.Field_916[4]])[PvptoneOptions.Field_916[0]] = Method_4167("aw2DrCgSyZikXNWL7zrR8tzAzDOj538LespkIucZRiA=", "HPysu");
    }
    
    static {
        Method_4166();
        Method_4169();
    }
}
