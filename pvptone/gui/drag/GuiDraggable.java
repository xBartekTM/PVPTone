package pvptone.gui.drag;

import pvptone.gui.ingame.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.io.*;
import java.util.*;

public class GuiDraggable extends Object<GuiDraggable>
{
    public HashMap<String, PvpToneUI> windowsByName;
    public boolean disableRender;
    public int offsetX;
    public String[] Field_959;
    public ArrayList<PvpToneUI> windows;
    public long time;
    public PvpToneUI lastClickedWindow;
    public int[] Field_960;
    public int offsetY;
    
    public GuiDraggable() {
        this.time = 0L;
        this.windows = PvpToneGuiIngame.windows;
        this.windowsByName = new HashMap<String, PvpToneUI>();
        this.disableRender = (GuiDraggable.Field_960[0] != 0);
        this.mc = Minecraft.getMinecraft();
        this.itemRender = this.mc.getRenderItem();
        this.fontRendererObj = this.mc.fontRendererObj;
        this.time = System.currentTimeMillis() + 5000L;
    }
    
    public void mouseReleased(final int Variable_44783, final int Variable_44778, final int Variable_44781) {
        if (Method_4395(this.lastClickedWindow)) {
            this.lastClickedWindow.calculatePositions(this.width, this.height);
            this.lastClickedWindow = null;
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            super.mouseReleased(Variable_44783, Variable_44778, Variable_44781);
        }
    }
    
    public void drawScreen(final int Variable_44792, final int Variable_44786, final float Variable_44795) {
        this.disableRender = (GuiDraggable.Field_960[4] != 0);
        this.drawDefaultBackground();
        final int Variable_44796 = (int)this.windows.iterator();
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!Method_4393(((Iterator)Variable_44796).hasNext() ? 1 : 0)) {
            final PvpToneUI Variable_44797 = ((Iterator<PvpToneUI>)Variable_44796).next();
            Variable_44797.renderGameOverlay0(this.width, this.height, Variable_44795);
            this.drawBorder(Variable_44797);
            if (Method_4391(Variable_44792, Variable_44797.left) && Method_4391(Variable_44786, Variable_44797.top) && Method_4396(Variable_44792, Variable_44797.right) && Method_4396(Variable_44786, Variable_44797.bottom)) {
                final FontRenderer fontRendererObj = this.fontRendererObj;
                final StringBuilder sb = new StringBuilder(GuiDraggable.Field_959[GuiDraggable.Field_960[0]]);
                String s;
                if (Method_4390(Variable_44797.visible ? 1 : 0)) {
                    s = GuiDraggable.Field_959[GuiDraggable.Field_960[4]];
                    "".length();
                    if ((0x27 ^ 0x23) < 0) {
                        return;
                    }
                }
                else {
                    s = GuiDraggable.Field_959[GuiDraggable.Field_960[1]];
                }
                this.drawString(fontRendererObj, String.valueOf(sb.append(s)), Variable_44792, Variable_44786 + GuiDraggable.Field_960[5], GuiDraggable.Field_960[6]);
            }
        }
    }
    
    public String Method_4383(final String Variable_44807, String Variable_44804) {
        Variable_44805 = (Exception)new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_44804 = new StringBuilder();
        final char[] Variable_44808 = Variable_44807.toCharArray();
        int Variable_44809 = GuiDraggable.Field_960[0];
        final byte Variable_44810 = (Object)((String)this).toCharArray();
        final long Variable_44811 = Variable_44810.length;
        String Variable_44812 = (String)GuiDraggable.Field_960[0];
        while (Method_4396((int)Variable_44812, (int)Variable_44811)) {
            final char Variable_44813 = Variable_44810[Variable_44812];
            Variable_44804.append((char)(Variable_44813 ^ Variable_44808[Variable_44809 % Variable_44808.length]));
            "".length();
            ++Variable_44809;
            ++Variable_44812;
            "".length();
            if (" ".length() == ((0xA3 ^ 0xBB) & ~(0x40 ^ 0x58))) {
                return null;
            }
        }
        return String.valueOf(Variable_44804);
    }
    
    public int Method_4384(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_2        
        //     2: dcmpl          
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean Method_4385(final Object o) {
        return this == null;
    }
    
    public void drawBorder(final PvpToneUI Variable_44814) {
        if (Method_4386(Variable_44814.bottom, this.height / GuiDraggable.Field_960[1])) {
            this.drawCenteredString(this.mc.fontRendererObj, Variable_44814.name, Variable_44814.left + Math.abs(Variable_44814.left - Variable_44814.right) / GuiDraggable.Field_960[1], Variable_44814.top - GuiDraggable.Field_960[2], GuiDraggable.Field_960[3]);
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            this.drawCenteredString(this.mc.fontRendererObj, Variable_44814.name, Variable_44814.left + Math.abs(Variable_44814.left - Variable_44814.right) / GuiDraggable.Field_960[1], Variable_44814.bottom, GuiDraggable.Field_960[3]);
        }
        this.drawHorizontalLine(Variable_44814.left - GuiDraggable.Field_960[4], Variable_44814.right, Variable_44814.top - GuiDraggable.Field_960[4], GuiDraggable.Field_960[3]);
        this.drawHorizontalLine(Variable_44814.left - GuiDraggable.Field_960[4], Variable_44814.right, Variable_44814.bottom, GuiDraggable.Field_960[3]);
    }
    
    public boolean Method_4386(final int Variable_44818, final int n) {
        return this > Variable_44818;
    }
    
    public String Method_4387(final String Variable_44821, final String Variable_44824) {
        try {
            final SecretKeySpec Variable_44822 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_44821.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_44823 = Cipher.getInstance("Blowfish");
            Variable_44823.init(GuiDraggable.Field_960[1], Variable_44822);
            return new String(Variable_44823.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_44824) {
            Variable_44824.printStackTrace();
            return null;
        }
    }
    
    public void Method_4388() {
        (GuiDraggable.Field_960 = new int[8])[0] = ((0xF4 ^ 0xBA) & ~(0x7A ^ 0x34));
        GuiDraggable.Field_960[1] = "  ".length();
        GuiDraggable.Field_960[2] = (0xF ^ 0x5);
        GuiDraggable.Field_960[3] = -(-(0xFFFFFFAD & 0x187B) & (0xFFFFFFFE & 0x36FFFF));
        GuiDraggable.Field_960[4] = " ".length();
        GuiDraggable.Field_960[5] = (0xC ^ 0x3);
        GuiDraggable.Field_960[6] = -" ".length();
        GuiDraggable.Field_960[7] = "   ".length();
    }
    
    public boolean Method_4389(final int n) {
        return this < 0;
    }
    
    public void mouseClickMove(final int Variable_44830, final int Variable_44833, final int Variable_44834, final long Variable_44832) {
        if (Method_4385(this.lastClickedWindow)) {
            super.mouseClickMove(Variable_44830, Variable_44833, Variable_44834, Variable_44832);
            return;
        }
        if (Method_4390(this.width - this.lastClickedWindow.sizeW)) {
            this.lastClickedWindow.posX = (Variable_44830 - this.offsetX) * 1.0 / (this.width - this.lastClickedWindow.sizeW);
        }
        if (Method_4390(this.height - this.lastClickedWindow.sizeH)) {
            this.lastClickedWindow.posY = (Variable_44833 - this.offsetY) * 1.0 / (this.height - this.lastClickedWindow.sizeH);
        }
        if (Method_4389(Method_4392(this.lastClickedWindow.posX, 0.0))) {
            this.lastClickedWindow.posX = 0.0;
        }
        if (Method_4389(Method_4392(this.lastClickedWindow.posY, 0.0))) {
            this.lastClickedWindow.posY = 0.0;
        }
        if (Method_4397(Method_4384(this.lastClickedWindow.posX, 1.0))) {
            this.lastClickedWindow.posX = 1.0;
        }
        if (Method_4397(Method_4384(this.lastClickedWindow.posY, 1.0))) {
            this.lastClickedWindow.posY = 1.0;
        }
        this.lastClickedWindow.calculatePositions(this.width, this.height);
    }
    
    static {
        Method_4388();
        Method_4394();
    }
    
    public boolean Method_4390(final int n) {
        return this != 0;
    }
    
    public boolean Method_4391(final int Variable_44840, final int n) {
        return this >= Variable_44840;
    }
    
    public int Method_4392(final double p0, final double p1) {
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
    
    public boolean Method_4393(final int n) {
        return this == 0;
    }
    
    public void Method_4394() {
        (GuiDraggable.Field_959 = new String[GuiDraggable.Field_960[7]])[GuiDraggable.Field_960[0]] = Method_4383("Hw4NGj09CEQhAxlCBRMqdA8KGDZ0", "TbdqS");
        GuiDraggable.Field_959[GuiDraggable.Field_960[4]] = Method_4387("qIzMuIwffkw=", "vzzFH");
        GuiDraggable.Field_959[GuiDraggable.Field_960[1]] = Method_4383("PzYsEB0mOg==", "OYFqj");
    }
    
    public void mouseClicked(final int Variable_44849, final int Variable_44845, final int Variable_44844) throws IOException {
        if (Method_4393(Variable_44844)) {
            int Variable_44850 = this.windows.size() - GuiDraggable.Field_960[4];
            "".length();
            if ((0x53 ^ 0x56) == 0x0) {
                return;
            }
            while (!Method_4389(Variable_44850)) {
                final PvpToneUI Variable_44851 = this.windows.get(Variable_44850);
                if (Method_4391(Variable_44849, Variable_44851.left) && Method_4391(Variable_44845, Variable_44851.top) && Method_4396(Variable_44849, Variable_44851.right) && Method_4396(Variable_44845, Variable_44851.bottom)) {
                    this.offsetX = Variable_44849 - Variable_44851.left;
                    this.offsetY = Variable_44845 - Variable_44851.top;
                    this.windows.remove(Variable_44850);
                    "".length();
                    this.windows.add(Variable_44851);
                    "".length();
                    this.lastClickedWindow = Variable_44851;
                    return;
                }
                --Variable_44850;
            }
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            final int Variable_44852 = (int)this.windows.iterator();
            "".length();
            if (((0xA ^ 0x2C) & ~(0xB3 ^ 0x95)) != 0x0) {
                return;
            }
            while (!Method_4393(((Iterator)Variable_44852).hasNext() ? 1 : 0)) {
                final PvpToneUI Variable_44853 = ((Iterator<PvpToneUI>)Variable_44852).next();
                if (Method_4391(Variable_44849, Variable_44853.left) && Method_4391(Variable_44845, Variable_44853.top) && Method_4396(Variable_44849, Variable_44853.right) && Method_4396(Variable_44845, Variable_44853.bottom)) {
                    final PvpToneUI pvpToneUI = Variable_44853;
                    int visible;
                    if (Method_4390(Variable_44853.visible ? 1 : 0)) {
                        visible = GuiDraggable.Field_960[0];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        visible = GuiDraggable.Field_960[4];
                    }
                    pvpToneUI.visible = (visible != 0);
                }
            }
        }
        super.mouseClicked(Variable_44849, Variable_44845, Variable_44844);
    }
    
    public boolean Method_4395(final Object o) {
        return this != null;
    }
    
    public void onGuiClosed() {
        this.disableRender = (GuiDraggable.Field_960[0] != 0);
    }
    
    public boolean Method_4396(final int Variable_44859, final int n) {
        return this < Variable_44859;
    }
    
    public boolean Method_4397(final int n) {
        return this > 0;
    }
}
