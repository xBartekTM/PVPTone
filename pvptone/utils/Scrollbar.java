package pvptone.utils;

import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.input.*;

public class Scrollbar extends Object<Scrollbar>
{
    public int posBottom;
    public int posTop;
    public boolean hold;
    public int clickY;
    public double backLength;
    public int right;
    public int scrollY;
    public int top;
    public int entryHeight;
    public int left;
    public int listSize;
    public int[] Field_1094;
    public int speed;
    public double barLength;
    
    public void setEntryHeight(final int Variable_50379) {
        this.entryHeight = Variable_50379;
    }
    
    public boolean Method_4977(final int Variable_50384, final int n) {
        return this < Variable_50384;
    }
    
    public int Method_4978(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_2        
        //     2: dcmpg          
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public int getScrollY() {
        return this.scrollY;
    }
    
    public boolean isHidden() {
        int n;
        if (Method_4984(this.listSize)) {
            n = Scrollbar.Field_1094[1];
            "".length();
            if (((0x1C ^ 0x2E) & ~(0x4 ^ 0x36)) != ((0xE3 ^ 0xAB) & ~(0x11 ^ 0x59))) {
                return ((0x4A ^ 0x3) & ~(0x32 ^ 0x7B)) != 0x0;
            }
        }
        else if (Method_4982(this.posBottom - this.posTop, this.listSize * this.entryHeight)) {
            n = Scrollbar.Field_1094[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0x53 ^ 0x22 ^ (0x77 ^ 0x16)) & (0x18 ^ 0x4 ^ (0x68 ^ 0x64) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Scrollbar.Field_1094[0];
        }
        return n != 0;
    }
    
    public boolean Method_4979(final int n) {
        return this < 0;
    }
    
    public void mouseAction(final int Variable_50396, final int Variable_50391, boolean Variable_50399) {
        this.calc();
        boolean Variable_50400 = Scrollbar.Field_1094[0] != 0;
        if (Method_4984(Variable_50399 ? 1 : 0)) {
            this.hold = (Scrollbar.Field_1094[0] != 0);
            if (Method_4987(Variable_50396, this.right) && Method_4982(Variable_50396, this.left) && Method_4982(Variable_50391, this.top) && Method_4985(Method_4978(Variable_50391, this.top + this.barLength))) {
                this.hold = (Scrollbar.Field_1094[1] != 0);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                if (!Method_4987(Variable_50396, this.right) || !Method_4982(Variable_50396, this.left) || !Method_4982(Variable_50391, this.posTop) || Method_4988(Variable_50391, this.posBottom)) {
                    return;
                }
                Variable_50399 = (Scrollbar.Field_1094[1] != 0);
                Variable_50400 = (Scrollbar.Field_1094[1] != 0);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
        }
        else if (Method_4984(this.hold ? 1 : 0)) {
            return;
        }
        final int Variable_50401 = this.scrollY;
        final double Variable_50402 = this.backLength / (this.listSize * this.entryHeight);
        final int Variable_50403 = (int)(-Variable_50391 / Variable_50402);
        if (Method_4980(Variable_50399 ? 1 : 0)) {
            this.scrollY = Variable_50403 - this.clickY;
            "".length();
            if ("  ".length() < ((1 + 16 + 121 + 0 ^ 50 + 122 - 16 + 42) & (0x53 ^ 0x47 ^ (0xEF ^ 0xB7) ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.clickY = Variable_50403 - this.scrollY;
        }
        if (Method_4977(this.listSize * this.entryHeight + this.scrollY, this.posBottom - this.posTop) && Method_4984(Variable_50400 ? 1 : 0)) {
            this.scrollY = Variable_50401;
        }
        if (Method_4986(this.scrollY) && Method_4984(Variable_50400 ? 1 : 0)) {
            this.scrollY = Variable_50401;
        }
        if (Method_4980(Variable_50400 ? 1 : 0)) {
            if (Method_4977(this.listSize * this.entryHeight + this.scrollY, this.posBottom - this.posTop)) {
                this.scrollY += this.posBottom - this.posTop - (this.listSize * this.entryHeight + this.scrollY);
            }
            if (Method_4986(this.scrollY)) {
                this.scrollY = Scrollbar.Field_1094[0];
            }
        }
    }
    
    static {
        Method_4981();
    }
    
    public boolean Method_4980(final int n) {
        return this != 0;
    }
    
    public void Method_4981() {
        (Scrollbar.Field_1094 = new int[10])[0] = ((14 + 68 - 8 + 155 ^ 53 + 24 - 29 + 114) & (0xA ^ 0x77 ^ (0x7E ^ 0x44) ^ -" ".length()));
        Scrollbar.Field_1094[1] = " ".length();
        Scrollbar.Field_1094[2] = (-(0xFFFFECDD & 0x7F7F) & (0xFFFFFF5F & 0x6FFE));
        Scrollbar.Field_1094[3] = (-(0xFFFFDFFF & 0x7CC5) & (0xFFFFFFEF & 0x5FD7));
        Scrollbar.Field_1094[4] = (0xFFFFFD5B & 0x1FA5);
        Scrollbar.Field_1094[5] = (0x27 ^ 0x20);
        Scrollbar.Field_1094[6] = 69 + 79 - 10 + 117;
        Scrollbar.Field_1094[7] = 34 + 98 - 80 + 76;
        Scrollbar.Field_1094[8] = 6 + 140 - 109 + 155;
        Scrollbar.Field_1094[9] = (0xFFFFFD63 & 0x1F9C);
    }
    
    public void calc() {
        final double Variable_50411 = this.entryHeight;
        final double Variable_50412 = this.listSize * this.entryHeight;
        final double Variable_50413 = this.posBottom - this.posTop;
        if (Method_4979(Method_4983(Variable_50413, Variable_50412))) {
            final double Variable_50414 = Variable_50413 / Variable_50412;
            final double Variable_50415 = Variable_50414 * Variable_50413;
            final double Variable_50416 = this.scrollY / Variable_50414 * Variable_50414 * Variable_50414;
            this.top = (int)(-Variable_50416) + this.posTop;
            this.barLength = Variable_50415;
            this.backLength = Variable_50413;
        }
    }
    
    public boolean Method_4982(final int Variable_50422, final int n) {
        return this >= Variable_50422;
    }
    
    public int Method_4983(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_2        
        //     2: dcmpg          
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void reset() {
        this.scrollY = Scrollbar.Field_1094[0];
    }
    
    public void setSpeed(final int Variable_50425) {
        this.speed = Variable_50425;
    }
    
    public void draw() {
        if (Method_4984(this.isHidden() ? 1 : 0)) {
            this.calc();
            final Tessellator Variable_50434 = Tessellator.getInstance();
            final WorldRenderer Variable_50435 = Variable_50434.getWorldRenderer();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(Scrollbar.Field_1094[2], Scrollbar.Field_1094[3], Scrollbar.Field_1094[0], Scrollbar.Field_1094[1]);
            GlStateManager.disableAlpha();
            GlStateManager.shadeModel(Scrollbar.Field_1094[4]);
            GlStateManager.disableTexture2D();
            Variable_50435.begin(Scrollbar.Field_1094[5], DefaultVertexFormats.POSITION_TEX_COLOR);
            Variable_50435.pos((double)this.left, (double)this.posBottom, 0.0).tex(0.0, 1.0).color(Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.right, (double)this.posBottom, 0.0).tex(1.0, 1.0).color(Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.right, (double)this.posTop, 0.0).tex(1.0, 0.0).color(Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.left, (double)this.posTop, 0.0).tex(0.0, 0.0).color(Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[0], Scrollbar.Field_1094[6]).endVertex();
            Variable_50434.draw();
            Variable_50435.begin(Scrollbar.Field_1094[5], DefaultVertexFormats.POSITION_TEX_COLOR);
            Variable_50435.pos((double)this.left, this.top + this.barLength, 0.0).tex(0.0, 1.0).color(Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.right, this.top + this.barLength, 0.0).tex(1.0, 1.0).color(Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.right, (double)this.top, 0.0).tex(1.0, 0.0).color(Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.left, (double)this.top, 0.0).tex(0.0, 0.0).color(Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[7], Scrollbar.Field_1094[6]).endVertex();
            Variable_50434.draw();
            Variable_50435.begin(Scrollbar.Field_1094[5], DefaultVertexFormats.POSITION_TEX_COLOR);
            Variable_50435.pos((double)this.left, this.top + this.barLength - 1.0, 0.0).tex(0.0, 1.0).color(Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)(this.right - Scrollbar.Field_1094[1]), this.top + this.barLength - 1.0, 0.0).tex(1.0, 1.0).color(Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)(this.right - Scrollbar.Field_1094[1]), (double)this.top, 0.0).tex(1.0, 0.0).color(Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[6]).endVertex();
            Variable_50435.pos((double)this.left, (double)this.top, 0.0).tex(0.0, 0.0).color(Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[8], Scrollbar.Field_1094[6]).endVertex();
            Variable_50434.draw();
            GlStateManager.enableTexture2D();
            GlStateManager.shadeModel(Scrollbar.Field_1094[9]);
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
        }
    }
    
    public void update(final int Variable_50437) {
        this.listSize = Variable_50437 + Scrollbar.Field_1094[1];
    }
    
    public boolean Method_4984(final int n) {
        return this == 0;
    }
    
    public void setScrollY(final int Variable_50441) {
        this.scrollY = Variable_50441;
    }
    
    public void init() {
        this.setDefaultPosition();
    }
    
    public boolean Method_4985(final int n) {
        return this <= 0;
    }
    
    public boolean Method_4986(final int n) {
        return this > 0;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public boolean Method_4987(final int Variable_50450, final int n) {
        return this <= Variable_50450;
    }
    
    public void setPosition(final int Variable_50456, final int Variable_50460, final int Variable_50454, final int Variable_50453) {
        this.left = Variable_50456;
        this.posTop = Variable_50460;
        this.right = Variable_50454;
        this.posBottom = Variable_50453;
        this.calc();
    }
    
    public boolean Method_4988(final int Variable_50463, final int n) {
        return this > Variable_50463;
    }
    
    public void setDefaultPosition() {
    }
    
    public Scrollbar(final int Variable_50465) {
        this.speed = Scrollbar.Field_1094[1];
        this.entryHeight = Variable_50465;
        this.setDefaultPosition();
    }
    
    public void mouseInput() {
        final int Variable_50472 = Mouse.getEventDWheel();
        if (Method_4986(Variable_50472)) {
            if (Method_4979(this.scrollY)) {
                this.scrollY += this.speed;
                "".length();
                if (" ".length() == ((0xA ^ 0x2E) & ~(0xB0 ^ 0x94))) {
                    return;
                }
            }
        }
        else if (Method_4979(Variable_50472) && Method_4988(this.listSize * this.entryHeight + this.scrollY, this.posBottom - this.posTop)) {
            this.scrollY -= this.speed;
        }
        if (Method_4977(this.listSize * this.entryHeight + this.scrollY, this.posBottom - this.posTop)) {
            this.scrollY += this.posBottom - this.posTop - (this.listSize * this.entryHeight + this.scrollY);
        }
        if (Method_4986(this.scrollY)) {
            this.scrollY = Scrollbar.Field_1094[0];
        }
    }
}
