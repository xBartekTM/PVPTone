package pvptone.mods.emoticons;

import net.minecraft.entity.*;
import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.model.*;

public class Dab extends Object<Dab>
{
    public int[] Field_431;
    public int prevDabbingHeld;
    public boolean dabbing;
    public int dabbingHeld;
    
    public boolean Method_1950(final int n) {
        return this != 0;
    }
    
    public void render(final Entity Variable_19053, ModelPlayer Variable_19049) {
        int n;
        if (Method_1951(((Entity)this).getEntityId(), Minecraft.getMinecraft().thePlayer.getEntityId())) {
            n = Dab.Field_431[0];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            n = Dab.Field_431[1];
        }
        Variable_19049 = (n != 0);
        if (Method_1950(Variable_19049 ? 1 : 0) && Method_1952(Dab.prevDabbingHeld)) {
            final float Variable_19054 = (Dab.prevDabbingHeld + (Dab.dabbingHeld - Dab.prevDabbingHeld) * Dab.Field_431[1]) / 8.0f;
            ((ModelPlayer)Variable_19053).bipedRightArm.rotateAngleX = (float)Math.toRadians(-90.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedRightArm.rotateAngleY = (float)Math.toRadians(-35.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedRightArmwear.rotateAngleX = (float)Math.toRadians(-90.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedRightArmwear.rotateAngleY = (float)Math.toRadians(-35.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedLeftArm.rotateAngleX = (float)Math.toRadians(15.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedLeftArm.rotateAngleZ = (float)Math.toRadians(-110.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedLeftArmwear.rotateAngleX = (float)Math.toRadians(15.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedLeftArmwear.rotateAngleY = (float)Math.toRadians(15.0f * Variable_19054);
            ((ModelPlayer)Variable_19053).bipedLeftArmwear.rotateAngleZ = (float)Math.toRadians(-110.0f * Variable_19054);
            final float Variable_19055 = ((Entity)this).rotationPitch;
            ((ModelPlayer)Variable_19053).bipedHead.rotateAngleX = (float)Math.toRadians(-Variable_19055 * Variable_19054) + (float)Math.toRadians(45.0f * Variable_19054 + Variable_19055);
            final float Variable_19056 = ((EntityPlayer)this).renderYawOffset - ((Entity)this).rotationYaw;
            ((ModelPlayer)Variable_19053).bipedHead.rotateAngleY = (float)Math.toRadians(Variable_19056 * Variable_19054) + (float)Math.toRadians(35.0f * Variable_19054 - Variable_19056);
            ModelBase.copyModelAngles(((ModelPlayer)Variable_19053).bipedHead, ((ModelPlayer)Variable_19053).bipedHeadwear);
        }
    }
    
    static {
        Method_1953();
    }
    
    public boolean Method_1951(final int Variable_19063, final int n) {
        return this == Variable_19063;
    }
    
    public boolean Method_1952(final int n) {
        return this > 0;
    }
    
    public void Method_1953() {
        (Dab.Field_431 = new int[2])[0] = " ".length();
        Dab.Field_431[1] = ((0xC7 ^ 0x97 ^ (0x4C ^ 0x5D)) & (0x9 ^ 0x56 ^ (0x25 ^ 0x3B) ^ -" ".length()));
    }
}
