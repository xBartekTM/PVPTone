package pvptone.gui.ingame.ui;

import java.util.*;
import java.nio.charset.*;
import pvptone.utils.*;
import net.minecraft.entity.player.*;

public class ArmorStatus extends Object<ArmorStatus>
{
    public int[] Field_757;
    public String[] Field_758;
    
    public String Method_3432(final String Variable_34802, String Variable_34798) {
        Variable_34803 = (float)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_34798 = new StringBuilder();
        final char[] Variable_34804 = Variable_34802.toCharArray();
        int Variable_34805 = ArmorStatus.Field_757[0];
        final byte Variable_34806 = (Object)((String)this).toCharArray();
        final long Variable_34807 = Variable_34806.length;
        double Variable_34808 = ArmorStatus.Field_757[0];
        while (Method_3436((int)Variable_34808, (int)Variable_34807)) {
            final char Variable_34809 = Variable_34806[Variable_34808];
            Variable_34798.append((char)(Variable_34809 ^ Variable_34804[Variable_34805 % Variable_34804.length]));
            "".length();
            ++Variable_34805;
            ++Variable_34808;
            "".length();
            if (((0x69 ^ 0x41 ^ (0x2A ^ 0x21)) & (65 + 17 - 30 + 114 ^ 24 + 104 - 8 + 13 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(Variable_34798);
    }
    
    static {
        Method_3438();
        Method_3439();
    }
    
    public ArmorStatus() {
        super(ArmorStatus.Field_758[ArmorStatus.Field_757[0]], ArmorStatus.Field_757[1], ArmorStatus.Field_757[2]);
    }
    
    public boolean Method_3433(final int n) {
        return this == 0;
    }
    
    public boolean Method_3434(final int Variable_34817, final int n) {
        return this <= Variable_34817;
    }
    
    public boolean Method_3435(final Object o) {
        return this != null;
    }
    
    public void renderGameOverlay(final int Variable_34829, final int Variable_34828, final float Variable_34830) {
        if (Method_3433(this.visible ? 1 : 0)) {
            return;
        }
        final int Variable_34831 = this.left;
        final int Variable_34832 = this.top;
        final EntityPlayer Variable_34833 = (EntityPlayer)this.mc.thePlayer;
        int Variable_34834 = ArmorStatus.Field_757[0];
        "".length();
        if (((0xFF ^ 0xB0) & ~(0xE9 ^ 0xA6)) != 0x0) {
            return;
        }
        while (!Method_3434(Variable_34834, ArmorStatus.Field_757[6])) {
            Utils.renderItemStack(this.mc, Variable_34833.getCurrentArmor(ArmorStatus.Field_757[3] * Variable_34834), Variable_34831, ArmorStatus.Field_757[4] + Variable_34832 + Variable_34834 * ArmorStatus.Field_757[5]);
            --Variable_34834;
        }
        if (Method_3435(Variable_34833.getHeldItem()) && Method_3437(Variable_34833.getHeldItem().getMaxItemUseDuration())) {
            Utils.renderItemStack(this.mc, Variable_34833.getHeldItem(), Variable_34831, Variable_34832 + ArmorStatus.Field_757[7]);
        }
    }
    
    public boolean Method_3436(final int Variable_34832, final int n) {
        return this < Variable_34832;
    }
    
    public boolean Method_3437(final int n) {
        return this != 0;
    }
    
    public void Method_3438() {
        (ArmorStatus.Field_757 = new int[9])[0] = ((126 + 78 - 109 + 95 ^ 92 + 124 - 171 + 85) & (((0xD4 ^ 0xB7) & ~(0xC1 ^ 0xA2)) ^ (0x68 ^ 0x54) ^ -" ".length()));
        ArmorStatus.Field_757[1] = (0xAA ^ 0xA2 ^ (0x4 ^ 0x53));
        ArmorStatus.Field_757[2] = (0x69 ^ 0x32 ^ (0xA7 ^ 0xAC));
        ArmorStatus.Field_757[3] = -" ".length();
        ArmorStatus.Field_757[4] = (0x5D ^ 0x19 ^ (0xF5 ^ 0x9C));
        ArmorStatus.Field_757[5] = ("  ".length() ^ (0x41 ^ 0x4C));
        ArmorStatus.Field_757[6] = -(0x36 ^ 0x39 ^ (0xA0 ^ 0xAB));
        ArmorStatus.Field_757[7] = (0x6D ^ 0x51);
        ArmorStatus.Field_757[8] = " ".length();
    }
    
    public void Method_3439() {
        (ArmorStatus.Field_758 = new String[ArmorStatus.Field_757[8]])[ArmorStatus.Field_757[0]] = Method_3432("FAsFDDwGDQkXOyY=", "UyhcN");
    }
}
