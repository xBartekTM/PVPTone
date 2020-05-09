package pvptone.gui.button.slider;

import pvptone.options.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.*;
import pvptone.*;

public class PvpToneSlider2 extends Object<PvpToneSlider2>
{
    public String name;
    public OptionsEnum op;
    public boolean isMouseDown;
    public double dragX;
    public int buttonId;
    public int[] Field_2530;
    public double lastDragX;
    public float y;
    public float sliderPosition;
    public boolean dragging;
    public float x;
    public float max;
    public float min;
    
    public boolean Method_11491(final int n) {
        return this > 0;
    }
    
    public int Method_11492(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public void mouseReleased(final int Variable_118552, final int Variable_118553) {
        this.isMouseDown = (PvpToneSlider2.Field_2530[9] != 0);
    }
    
    public PvpToneSlider2(final int Variable_118558, final int Variable_118556, final int Variable_118562, final OptionsEnum Variable_118557, final int Variable_118560, final int Variable_118564, final String Variable_118561, final String Variable_118569) {
        super(Variable_118558, Variable_118556, Variable_118562, PvpToneSlider2.Field_2530[0], PvpToneSlider2.Field_2530[1], Variable_118561);
        this.sliderPosition = 1.0f;
        this.buttonId = Variable_118558;
        this.x = (float)Variable_118556;
        this.y = (float)Variable_118562;
        this.op = OptionsEnum.getByName(Variable_118569);
        this.sliderPosition = (Variable_118557.val - Variable_118560) / (Variable_118564 - Variable_118560);
        this.name = Variable_118561;
        this.min = (float)Variable_118560;
        this.max = (float)Variable_118564;
    }
    
    public void Method_11493() {
        (PvpToneSlider2.Field_2530 = new int[10])[0] = (0x2F ^ 0x4B);
        PvpToneSlider2.Field_2530[1] = (0xBC ^ 0xB6);
        PvpToneSlider2.Field_2530[2] = -(-(0xFFFFAF3F & 0x76C1) & (0xFFFFFFDE & 0xDCFFFD));
        PvpToneSlider2.Field_2530[3] = -(0xFFFFEFF6 & 0x99FED9);
        PvpToneSlider2.Field_2530[4] = -(0xFFFFDFFF & 0x7AFFBB);
        PvpToneSlider2.Field_2530[5] = -(-(0x1A ^ 0x4B) & (-1 & 0x61D7FD));
        PvpToneSlider2.Field_2530[6] = (0x6E ^ 0x6A);
        PvpToneSlider2.Field_2530[7] = (0xC ^ 0x19 ^ (0x9E ^ 0x83));
        PvpToneSlider2.Field_2530[8] = " ".length();
        PvpToneSlider2.Field_2530[9] = ((0xD9 ^ 0xC1) & ~(0x6E ^ 0x76));
    }
    
    static {
        Method_11493();
    }
    
    public void drawButton(final Minecraft Variable_118573, final int Variable_118577, final int Variable_118574) {
        super.drawButton(Variable_118573, Variable_118577, Variable_118574);
        Gui.drawRect(this.x, this.y, this.x + 100.0f, this.y + 10.0f, PvpToneSlider2.Field_2530[2]);
        Gui.drawRect(this.x, this.y, this.x + this.sliderPosition * 100.0f, this.y + 10.0f, PvpToneSlider2.Field_2530[3]);
        Variable_118573.fontRendererObj.drawCenteredString(Variable_118573.fontRendererObj, String.valueOf(new StringBuilder(String.valueOf((int)(this.sliderPosition * 100.0f)))), this.x + 50.0f, this.y + 1.0f, PvpToneSlider2.Field_2530[4]);
        Variable_118573.fontRendererObj.drawCenteredString(Variable_118573.fontRendererObj, this.name, this.x + 50.0f, this.y - 10.0f, PvpToneSlider2.Field_2530[5]);
    }
    
    public boolean Method_11494(final int n) {
        return this != 0;
    }
    
    public void mouseDragged(final Minecraft Variable_118585, final int Variable_118582, final int Variable_118586) {
        if (Method_11494(this.visible ? 1 : 0)) {
            if (Method_11494(this.isMouseDown ? 1 : 0)) {
                this.sliderPosition = (Variable_118582 - (this.xPosition + PvpToneSlider2.Field_2530[6])) / (float)(this.width - PvpToneSlider2.Field_2530[7]);
                if (Method_11498(Method_11492(this.sliderPosition, 0.0f))) {
                    this.sliderPosition = 0.0f;
                }
                if (Method_11491(Method_11495(this.sliderPosition, 1.0f))) {
                    this.sliderPosition = 1.0f;
                }
            }
            this.op.val = this.min + (this.max - this.min) * this.sliderPosition;
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            Config.save();
        }
    }
    
    public int Method_11495(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public int Method_11496(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public int Method_11497(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public boolean Method_11498(final int n) {
        return this < 0;
    }
    
    public boolean mousePressed(final Minecraft Variable_118591, final int Variable_118592, final int Variable_118589) {
        if (Method_11494(super.mousePressed(Variable_118591, Variable_118592, Variable_118589) ? 1 : 0)) {
            this.sliderPosition = (Variable_118592 - (this.xPosition + PvpToneSlider2.Field_2530[6])) / (float)(this.width - PvpToneSlider2.Field_2530[7]);
            if (Method_11498(Method_11496(this.sliderPosition, 0.0f))) {
                this.sliderPosition = 0.0f;
            }
            if (Method_11491(Method_11497(this.sliderPosition, 1.0f))) {
                this.sliderPosition = 1.0f;
            }
            this.op.val = this.min + (this.max - this.min) * this.sliderPosition;
            this.isMouseDown = (PvpToneSlider2.Field_2530[8] != 0);
            Config.save();
            return PvpToneSlider2.Field_2530[8] != 0;
        }
        return PvpToneSlider2.Field_2530[9] != 0;
    }
}
