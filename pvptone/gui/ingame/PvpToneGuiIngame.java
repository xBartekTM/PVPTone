package pvptone.gui.ingame;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import pvptone.gui.ingame.ui.*;
import java.util.*;

public class PvpToneGuiIngame extends Object<PvpToneGuiIngame>
{
    public ArrayList<PvpToneUI> windows;
    
    public void render() {
    }
    
    static {
        PvpToneGuiIngame.windows = new ArrayList<PvpToneUI>();
    }
    
    public void renderGameOverlay(float Variable_24891) {
        Variable_24891 = new ScaledResolution(Minecraft.getMinecraft());
        final double Variable_24892 = (double)PvpToneGuiIngame.windows.iterator();
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!Method_2512(((Iterator)Variable_24892).hasNext() ? 1 : 0)) {
            final PvpToneUI Variable_24893 = ((Iterator<PvpToneUI>)Variable_24892).next();
            Variable_24893.renderGameOverlay0(Variable_24891.getScaledWidth(), Variable_24891.getScaledHeight(), (float)this);
        }
    }
    
    public boolean Method_2512(final int n) {
        return this == 0;
    }
    
    public void init() {
        PvpToneGuiIngame.windows.clear();
        PvpToneGuiIngame.windows.add((PvpToneUI)new Compass());
        "".length();
        PvpToneGuiIngame.windows.add((PvpToneUI)new Cps());
        "".length();
        PvpToneGuiIngame.windows.add((PvpToneUI)new Keystrokes());
        "".length();
        PvpToneGuiIngame.windows.add((PvpToneUI)new Info());
        "".length();
        PvpToneGuiIngame.windows.add((PvpToneUI)new ArmorStatus());
        "".length();
        PvpToneGuiIngame.windows.add((PvpToneUI)new ActiveEffects());
        "".length();
        PvpToneGuiIngame.windows.add((PvpToneUI)new FPS());
        "".length();
    }
}
