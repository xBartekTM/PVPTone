package pvptone.gui.button.check;

import pvptone.options.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import pvptone.*;

public class CheckBox extends Object<CheckBox>
{
    public String name;
    public Value op;
    public float x;
    public float y;
    public boolean isMouseDown;
    public int buttonId;
    public boolean check;
    public int[] Field_213;
    
    static {
        Method_952();
    }
    
    public boolean Method_951(final int n) {
        return this != 0;
    }
    
    public CheckBox(final int Variable_8999, final int Variable_9002, final int Variable_8995, final Value Variable_8996, final String Variable_9000) {
        super(Variable_8999, Variable_9002, Variable_8995, CheckBox.Field_213[0], CheckBox.Field_213[0], Variable_9000);
        this.check = (CheckBox.Field_213[1] != 0);
        this.a = (CheckBox.Field_213[1] != 0);
        this.buttonId = Variable_8999;
        this.x = (float)Variable_9002;
        this.y = (float)Variable_8995;
        this.op = Variable_8996;
        this.name = Variable_9000;
        this.check = (boolean)Variable_8996.getValueState();
    }
    
    public void drawButton(final Minecraft Variable_9007, final int Variable_9010, final int Variable_9013) {
        super.drawButton(Variable_9007, Variable_9010, Variable_9013);
        Variable_9007.fontRendererObj.drawCenteredString(Variable_9007.fontRendererObj, this.name, this.x + 5.0f, this.y - 10.0f, CheckBox.Field_213[2]);
        if (Method_953(this.check ? 1 : 0)) {
            Gui.drawRect(this.x, this.y, this.x + 10.0f, this.y + 10.0f, CheckBox.Field_213[3]);
            "".length();
            if (((96 + 165 - 134 + 93 ^ 122 + 191 - 265 + 144) & (0x43 ^ 0x18 ^ (0x10 ^ 0x57) ^ -" ".length())) == (0xF2 ^ 0x86 ^ (0xE ^ 0x7E))) {
                return;
            }
        }
        else {
            Gui.drawRect(this.x, this.y, this.x + 10.0f, this.y + 10.0f, CheckBox.Field_213[2]);
        }
    }
    
    public boolean mousePressed(final Minecraft Variable_9018, final int Variable_9015, final int Variable_9020) {
        if (Method_951(super.mousePressed(Variable_9018, Variable_9015, Variable_9020) ? 1 : 0)) {
            final Value op = this.op;
            int n;
            if (Method_951(((boolean)this.op.getValueState()) ? 1 : 0)) {
                n = CheckBox.Field_213[1];
                "".length();
                if (-(((0xB4 ^ 0x8C) & ~(0xFE ^ 0xC6)) ^ (0x86 ^ 0x82)) > 0) {
                    return ((0x6B ^ 0x7A ^ (0x1E ^ 0x4E)) & (150 + 10 - 5 + 46 ^ 14 + 104 - 60 + 78 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = CheckBox.Field_213[4];
            }
            op.setValueState((boolean)(n != 0));
            int check;
            if (Method_951(this.check ? 1 : 0)) {
                check = CheckBox.Field_213[1];
                "".length();
                if (null != null) {
                    return ((152 + 112 - 202 + 97 ^ 125 + 57 - 122 + 87) & (0x61 ^ 0x68 ^ (0x5D ^ 0x58) ^ -" ".length())) != 0x0;
                }
            }
            else {
                check = CheckBox.Field_213[4];
            }
            this.check = (check != 0);
            this.isMouseDown = (CheckBox.Field_213[4] != 0);
            Config.save();
            return CheckBox.Field_213[4] != 0;
        }
        return CheckBox.Field_213[1] != 0;
    }
    
    public void Method_952() {
        (CheckBox.Field_213 = new int[5])[0] = (0xE ^ 0x4);
        CheckBox.Field_213[1] = ((0x8 ^ 0x2) & ~(0x38 ^ 0x32));
        CheckBox.Field_213[2] = -(-(0x4E ^ 0x1F) & (0xFFFFDFFD & 0x61F7FF));
        CheckBox.Field_213[3] = -(-(0xFFFFADB7 & 0x7B6D) & (-1 & 0xDAFFFF));
        CheckBox.Field_213[4] = " ".length();
    }
    
    public void mouseReleased(final int Variable_9023, final int Variable_9025) {
        this.isMouseDown = (CheckBox.Field_213[1] != 0);
    }
    
    public boolean Method_953(final int n) {
        return this == 0;
    }
}
