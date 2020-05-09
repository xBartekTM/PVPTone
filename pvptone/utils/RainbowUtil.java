package pvptone.utils;

import java.awt.*;

public class RainbowUtil extends Object<RainbowUtil>
{
    public float rainbow(final int n) {
        return (float)Color.HSBtoRGB(System.currentTimeMillis() % (long)this / (float)this, 0.8f, 0.8f);
    }
}
