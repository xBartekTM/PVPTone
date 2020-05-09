package pvptone.utils;

import net.minecraft.client.*;

public class ButtonAnim extends Object<ButtonAnim>
{
    public int[] Field_1966;
    public float a;
    
    public boolean Method_8931(final int n) {
        return this >= 0;
    }
    
    public int Method_8932(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public void Method_8933() {
        (ButtonAnim.Field_1966 = new int[2])[0] = (0x39 ^ 0x5D);
        ButtonAnim.Field_1966[1] = 126 + 115 - 238 + 197;
    }
    
    static {
        Method_8933();
    }
    
    public boolean Method_8934(final int n) {
        return this != 0;
    }
    
    public ButtonAnim() {
        this.a = 0.0f;
    }
    
    public boolean Method_8935(final int n) {
        return this <= 0;
    }
    
    public boolean Method_8936(final int Variable_93393, final int n) {
        return this > Variable_93393;
    }
    
    public boolean Method_8937(final int n) {
        return this < 0;
    }
    
    public int Method_8938(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public void animation(final boolean Variable_93396) {
        final int Variable_93397 = Minecraft.getDebugFPS();
        if (Method_8934(Variable_93396 ? 1 : 0)) {
            if (Method_8937(Method_8932(this.a, 50.0f))) {
                if (Method_8939(Variable_93397, ButtonAnim.Field_1966[0])) {
                    this.a += 2.0f;
                    "".length();
                    if (((0x24 ^ 0x1C) & ~(0xF9 ^ 0xC1)) < -" ".length()) {
                        return;
                    }
                }
                else if (!Method_8936(Variable_93397, ButtonAnim.Field_1966[1]) || Method_8940(Variable_93397, ButtonAnim.Field_1966[0])) {
                    this.a += (float)0.2;
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
            }
        }
        else {
            if (Method_8931(Method_8938(this.a, 0.0f))) {
                --this.a;
            }
            if (Method_8935(Method_8932(this.a, 0.0f))) {
                this.a = 0.0f;
            }
        }
    }
    
    public boolean Method_8939(final int Variable_93402, final int n) {
        return this <= Variable_93402;
    }
    
    public boolean Method_8940(final int Variable_93404, final int n) {
        return this >= Variable_93404;
    }
}
