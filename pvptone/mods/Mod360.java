package pvptone.mods;

import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;

public class Mod360 extends Object<Mod360>
{
    public boolean returnOnRelese;
    public int previousPerspective;
    public int[] Field_3105;
    public float cameraPitch;
    public boolean perspectiveToggled;
    public float cameraYaw;
    
    public float getCameraYaw() {
        float n;
        if (Method_14125(Mod360.perspectiveToggled ? 1 : 0)) {
            n = Mod360.cameraYaw;
            "".length();
            if ("   ".length() >= (0x45 ^ 0x41)) {
                return 0.0f;
            }
        }
        else {
            n = Minecraft.getMinecraft().thePlayer.rotationYaw;
        }
        return n;
    }
    
    public float getCameraPitch() {
        float n;
        if (Method_14125(Mod360.perspectiveToggled ? 1 : 0)) {
            n = Mod360.cameraPitch;
            "".length();
            if (" ".length() != " ".length()) {
                return 0.0f;
            }
        }
        else {
            n = Minecraft.getMinecraft().thePlayer.rotationPitch;
        }
        return n;
    }
    
    public void start(final int n) {
        EntityRenderer.a = (Mod360.Field_3105[1] != 0);
        int perspectiveToggled;
        if (Method_14125(Mod360.perspectiveToggled ? 1 : 0)) {
            perspectiveToggled = Mod360.Field_3105[0];
            "".length();
            if (((201 + 72 - 222 + 166 ^ 69 + 37 - 5 + 44) & (0x61 ^ 0x44 ^ (0x74 ^ 0x19) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            perspectiveToggled = Mod360.Field_3105[1];
        }
        Mod360.perspectiveToggled = (perspectiveToggled != 0);
        Mod360.cameraYaw = Minecraft.getMinecraft().thePlayer.rotationYaw;
        Mod360.cameraPitch = Minecraft.getMinecraft().thePlayer.rotationPitch;
        if (Method_14125(Mod360.perspectiveToggled ? 1 : 0)) {
            Mod360.previousPerspective = Minecraft.getMinecraft().gameSettings.thirdPersonView;
            Minecraft.getMinecraft().gameSettings.thirdPersonView = Mod360.Field_3105[1];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            Minecraft.getMinecraft().gameSettings.thirdPersonView = Mod360.previousPerspective;
        }
    }
    
    public int Method_14124(final float n, final float n2) {
        return fcmpl(this, n);
    }
    
    public boolean Method_14125(final int n) {
        return this != 0;
    }
    
    public boolean Method_14126(final int n) {
        return this < 0;
    }
    
    public boolean Method_14127(final int n) {
        return this > 0;
    }
    
    public boolean overrideMouse() {
        if (Method_14125(Minecraft.getMinecraft().inGameHasFocus ? 1 : 0) && Method_14125(Display.isActive() ? 1 : 0)) {
            if (Method_14128(Mod360.perspectiveToggled ? 1 : 0)) {
                return Mod360.Field_3105[1] != 0;
            }
            Minecraft.getMinecraft().mouseHelper.mouseXYChange();
            Variable_146756 = Minecraft.getMinecraft().gameSettings.mouseSensitivity * 0.6f + 0.5f;
            final float Variable_146757 = (float)(this * 3.0f * 0.5f);
            final float Variable_146758 = Minecraft.getMinecraft().mouseHelper.deltaX * Variable_146757;
            final float Variable_146759 = Minecraft.getMinecraft().mouseHelper.deltaY * Variable_146757;
            Mod360.cameraYaw += Variable_146758 * 0.15f;
            Mod360.cameraPitch += Variable_146759 * 0.15f;
            if (Method_14127(Method_14124(Mod360.cameraPitch, 90.0f))) {
                Mod360.cameraPitch = 90.0f;
            }
            if (Method_14126(Method_14129(Mod360.cameraPitch, -90.0f))) {
                Mod360.cameraPitch = -90.0f;
            }
        }
        if (Method_14125(Minecraft.getMinecraft().gameSettings.keyBindTogglePerspective.isKeyDown() ? 1 : 0)) {
            EntityRenderer.a = (Mod360.Field_3105[0] != 0);
            Mod360.perspectiveToggled = (Mod360.Field_3105[0] != 0);
        }
        return Mod360.Field_3105[0] != 0;
    }
    
    public boolean Method_14128(final int n) {
        return this == 0;
    }
    
    static {
        Method_14130();
        Mod360.perspectiveToggled = (Mod360.Field_3105[0] != 0);
        Mod360.returnOnRelese = (Mod360.Field_3105[1] != 0);
        Mod360.cameraYaw = 0.0f;
        Mod360.cameraPitch = 0.0f;
        Mod360.previousPerspective = Mod360.Field_3105[0];
    }
    
    public int Method_14129(final float n, final float n2) {
        return fcmpg(this, n);
    }
    
    public void Method_14130() {
        (Mod360.Field_3105 = new int[2])[0] = ((0xD1 ^ 0x95) & ~(0x7F ^ 0x3B));
        Mod360.Field_3105[1] = " ".length();
    }
}
