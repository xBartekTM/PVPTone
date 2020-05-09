package pvptone.gui.ingame.ui;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.minecraft.client.*;

public class Cps extends Object<Cps>
{
    public long lastPress;
    public int[] Field_2887;
    public String[] Field_2888;
    public boolean pressed;
    public ArrayDeque<Long> clicks;
    
    public void addClick() {
        this.lastPress = System.currentTimeMillis();
        this.clicks.add(this.lastPress);
        "".length();
    }
    
    public Cps() {
        super(Cps.Field_2888[Cps.Field_2887[0]], Cps.Field_2887[1], Cps.Field_2887[2]);
        this.clicks = new ArrayDeque<Long>();
        this.lastPress = 0L;
        this.pressed = (Cps.Field_2887[3] != 0);
    }
    
    public boolean Method_13152(final int n) {
        return this >= 0;
    }
    
    public String Method_13153(final String Variable_136723, final String Variable_136726) {
        try {
            final SecretKeySpec Variable_136724 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_136723.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_136725 = Cipher.getInstance("Blowfish");
            Variable_136725.init(Cps.Field_2887[6], Variable_136724);
            return new String(Variable_136725.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_136726) {
            Variable_136726.printStackTrace();
            return null;
        }
    }
    
    public boolean Method_13154(final int Variable_136727, final int n) {
        return this != Variable_136727;
    }
    
    public boolean Method_13155(final int n) {
        return this > 0;
    }
    
    public int Method_13156(final long p0, final long p1) {
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
    
    public void Method_13157() {
        (Cps.Field_2887 = new int[9])[0] = ((0xE ^ 0x3F ^ (0x23 ^ 0x41)) & (167 + 70 - 96 + 111 ^ 6 + 154 - 103 + 118 ^ -" ".length()));
        Cps.Field_2887[1] = (0x6B ^ 0x48);
        Cps.Field_2887[2] = (112 + 43 - 126 + 122 ^ 46 + 29 - 29 + 106);
        Cps.Field_2887[3] = " ".length();
        Cps.Field_2887[4] = (0x2F ^ 0x7);
        Cps.Field_2887[5] = (0x69 ^ 0x73 ^ (0x23 ^ 0x2D));
        Cps.Field_2887[6] = "  ".length();
        Cps.Field_2887[7] = (-(0xFFFFC3ED & 0x7DF6) & (0xFFFFDFFF & 0x7A1F7FFF));
        Cps.Field_2887[8] = -(-(0xFFFFCEDE & 0x71BB) & (0xFFFFFFFB & 0x1F5FBD));
    }
    
    public boolean Method_13158(final int n) {
        return this != 0;
    }
    
    static {
        Method_13157();
        Method_13160();
    }
    
    public void renderGameOverlay(final int Variable_136739, final int Variable_136740, final float Variable_136731) {
        if (Method_13159(this.visible ? 1 : 0)) {
            return;
        }
        final int Variable_136741 = Cps.Field_2887[4];
        final int Variable_136742 = Cps.Field_2887[5];
        final boolean Variable_136743 = Minecraft.getMinecraft().gameSettings.keyBindAttack.isKeyDown();
        if (Method_13154(Variable_136743 ? 1 : 0, this.pressed ? 1 : 0)) {
            this.pressed = Variable_136743;
            this.lastPress = System.currentTimeMillis();
            if (Method_13158(Variable_136743 ? 1 : 0)) {
                this.addClick();
            }
        }
        final int Variable_136744 = Cps.Field_2887[6];
        final String Variable_136745 = String.valueOf(new StringBuilder(Cps.Field_2888[Cps.Field_2887[3]]).append(this.getCPS()));
        final int Variable_136746 = this.fontRenderer.FONT_HEIGHT;
        final int Variable_136747 = this.fontRenderer.getStringWidth(Variable_136745);
        final int Variable_136748 = this.left;
        final int Variable_136749 = this.top;
        drawRect(this.left, this.top, this.right, this.bottom, Cps.Field_2887[7]);
        this.fontRenderer.drawString(Variable_136745, Variable_136748 + Variable_136744, Variable_136749 + Variable_136744, Cps.Field_2887[8]);
        "".length();
    }
    
    public int getCPS() {
        final ArrayDeque<Long> Variable_136763 = this.clicks;
        final long Variable_136764 = System.currentTimeMillis();
        final long Variable_136765 = Variable_136764 - 1000L;
        final long Variable_136766 = Variable_136764 + 1000L;
        "".length();
        if ("   ".length() != "   ".length()) {
            return (0x49 ^ 0x1) & ~(0x64 ^ 0x2C);
        }
        while (!Method_13158(Variable_136763.isEmpty() ? 1 : 0)) {
            final long Variable_136767 = Variable_136763.peek();
            if (Method_13152(Method_13156(Variable_136767, Variable_136765)) && !Method_13155(Method_13156(Variable_136767, Variable_136766))) {
                break;
            }
            Variable_136763.poll();
            "".length();
        }
        return Variable_136763.size();
    }
    
    public boolean Method_13159(final int n) {
        return this == 0;
    }
    
    public void Method_13160() {
        (Cps.Field_2888 = new String[Cps.Field_2887[6]])[Cps.Field_2887[0]] = Method_13153("ksVXKyC3t7I=", "NMOVk");
        Cps.Field_2888[Cps.Field_2887[3]] = Method_13153("MFstGibz0H0=", "BEmwh");
    }
}
