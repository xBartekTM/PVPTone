package pvptone.cosmetics.builder;

import java.util.*;
import pvptone.cosmetics.others.*;

public class CosmeticsManager extends Object<CosmeticsManager>
{
    public LinkedList<CosmeticsBuilder> c;
    
    public void init() {
        CosmeticsManager.c.clear();
        CosmeticsManager.c.add((CosmeticsBuilder)new Hat());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new Okulary());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new WitchHat());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new Xmas());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new WizardHat());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new Beard());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new Egg());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new Crown());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new TrollMask());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new SurgicalMask());
        "".length();
        CosmeticsManager.c.add((CosmeticsBuilder)new SadPepe());
        "".length();
    }
    
    static {
        CosmeticsManager.c = new LinkedList<CosmeticsBuilder>();
    }
}
