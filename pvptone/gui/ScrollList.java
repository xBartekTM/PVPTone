package pvptone.gui;

import net.minecraft.client.*;
import java.nio.charset.*;
import net.minecraft.client.gui.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class ScrollList extends Object<ScrollList>
{
    public List<GuiListExtended.IGuiListEntry> entrys;
    public int[] Field_1772;
    public String[] Field_1773;
    
    public void Method_8061() {
        (ScrollList.Field_1773 = new String[ScrollList.Field_1772[5]])[ScrollList.Field_1772[3]] = Method_8064("FzAgdnc=", "UDNLW");
    }
    
    public Minecraft access$0(final ScrollList list) {
        return this.mc;
    }
    
    static {
        Method_8062();
        Method_8061();
    }
    
    public GuiListExtended.IGuiListEntry getListEntry(final int Variable_84410) {
        return this.entrys.get(Variable_84410);
    }
    
    public void Method_8062() {
        (ScrollList.Field_1772 = new int[6])[0] = (0x82 ^ 0xAE ^ (0x3C ^ 0x30));
        ScrollList.Field_1772[1] = (0x3D ^ 0x46 ^ (0x2E ^ 0x45));
        ScrollList.Field_1772[2] = (106 + 143 - 232 + 130 ^ 24 + 117 - 59 + 53);
        ScrollList.Field_1772[3] = ((0x47 ^ 0x68) & ~(0xA8 ^ 0x87));
        ScrollList.Field_1772[4] = (0xB2 ^ 0x80);
        ScrollList.Field_1772[5] = " ".length();
    }
    
    public boolean Method_8063(final int Variable_84414, final int n) {
        return this >= Variable_84414;
    }
    
    public ScrollList(final Minecraft Variable_84416, final PvptoneOptions Variable_84417) {
        super(Variable_84416, Variable_84417.width, Variable_84417.height, ScrollList.Field_1772[0], Variable_84417.height - ScrollList.Field_1772[1], ScrollList.Field_1772[2]);
        this.entrys = new ArrayList<GuiListExtended.IGuiListEntry>();
        int Variable_84418 = ScrollList.Field_1772[3];
        "".length();
        if (((0xB5 ^ 0x86 ^ (0xF0 ^ 0x85)) & (35 + 103 - 75 + 177 ^ 55 + 176 - 69 + 20 ^ -" ".length())) > ((72 + 81 - 32 + 19 ^ 145 + 20 - 13 + 46) & (0x68 ^ 0x1D ^ (0x4E ^ 0x71) ^ -" ".length()))) {
            throw null;
        }
        while (!Method_8063(Variable_84418, ScrollList.Field_1772[4])) {
            this.entrys.add((GuiListExtended.IGuiListEntry)new BtnEntry(String.valueOf(new StringBuilder(ScrollList.Field_1773[ScrollList.Field_1772[3]]).append(Variable_84418)), null));
            "".length();
            ++Variable_84418;
        }
    }
    
    public String Method_8064(final String Variable_84424, String Variable_84426) {
        Variable_84438 = new String(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        Variable_84426 = new StringBuilder();
        final char[] Variable_84439 = Variable_84424.toCharArray();
        int Variable_84440 = ScrollList.Field_1772[3];
        final short Variable_84441 = (Object)((String)this).toCharArray();
        final Exception Variable_84442 = (Exception)Variable_84441.length;
        long Variable_84443 = ScrollList.Field_1772[3];
        while (Method_8065((int)Variable_84443, (int)Variable_84442)) {
            final char Variable_84444 = Variable_84441[Variable_84443];
            Variable_84426.append((char)(Variable_84444 ^ Variable_84439[Variable_84440 % Variable_84439.length]));
            "".length();
            ++Variable_84440;
            ++Variable_84443;
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(Variable_84426);
    }
    
    public int getSize() {
        return this.entrys.size();
    }
    
    public boolean Method_8065(final int Variable_84442, final int n) {
        return this < Variable_84442;
    }
    
    public class BtnEntry extends Object<BtnEntry>
    {
        public GuiButton btn;
        public String[] Field_2264;
        public ScrollList this$0;
        public int[] Field_2265;
        public GuiButton btn2;
        
        public void drawEntry(final int Variable_106842, final int Variable_106850, final int Variable_106846, final int Variable_106843, final int Variable_106841, final int Variable_106844, final int Variable_106847, final boolean Variable_106852) {
            this.btn.xPosition = Variable_106850;
            this.btn.yPosition = Variable_106846;
            this.btn.drawButton(ScrollList.access$0(this.this$0), Variable_106844, Variable_106847);
            this.btn2.xPosition = Variable_106850 + BtnEntry.Field_2265[3];
            this.btn2.yPosition = Variable_106846;
            this.btn2.drawButton(ScrollList.access$0(this.this$0), Variable_106844, Variable_106847);
        }
        
        public BtnEntry(final ScrollList Variable_106856, final String Variable_106857, final BtnEntry btnEntry) {
            this(Variable_106856, Variable_106857);
        }
        
        public void Method_10333() {
            (BtnEntry.Field_2265 = new int[7])[0] = ((0x8B ^ 0xA7) & ~(0x9 ^ 0x25));
            BtnEntry.Field_2265[1] = (0x67 ^ 0x7B ^ (0x16 ^ 0x41));
            BtnEntry.Field_2265[2] = (0xD4 ^ 0xC0);
            BtnEntry.Field_2265[3] = (0xB7 ^ 0xBD ^ (0x3 ^ 0x6D));
            BtnEntry.Field_2265[4] = " ".length();
            BtnEntry.Field_2265[5] = (40 + 21 - 2 + 77 ^ 75 + 4 + 6 + 43);
            BtnEntry.Field_2265[6] = "  ".length();
        }
        
        public void Method_10334() {
            (BtnEntry.Field_2264 = new String[BtnEntry.Field_2265[4]])[BtnEntry.Field_2265[0]] = Method_10335("JwzZv6sMIuQ=", "odSdt");
        }
        
        public void setSelected(final int Variable_106860, final int Variable_106859, final int Variable_106861) {
        }
        
        public boolean mousePressed(final int Variable_106866, final int Variable_106864, final int Variable_106868, final int Variable_106871, final int Variable_106863, final int Variable_106870) {
            return this.btn.mousePressed(ScrollList.access$0(this.this$0), Variable_106864, Variable_106868);
        }
        
        public BtnEntry(final ScrollList Variable_106875, final String Variable_106872) {
            this.this$0 = Variable_106875;
            this.btn = new GuiButton(BtnEntry.Field_2265[0], BtnEntry.Field_2265[0], BtnEntry.Field_2265[0], BtnEntry.Field_2265[1], BtnEntry.Field_2265[2], Variable_106872);
            this.btn2 = new GuiButton(BtnEntry.Field_2265[0], BtnEntry.Field_2265[0], BtnEntry.Field_2265[0], BtnEntry.Field_2265[1], BtnEntry.Field_2265[2], String.valueOf(new StringBuilder(String.valueOf(Variable_106872)).append(BtnEntry.Field_2264[BtnEntry.Field_2265[0]])));
        }
        
        public String Method_10335(final String Variable_106880, final String Variable_106883) {
            try {
                final SecretKeySpec Variable_106881 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_106880.getBytes(StandardCharsets.UTF_8)), BtnEntry.Field_2265[5]), "DES");
                final Cipher Variable_106882 = Cipher.getInstance("DES");
                Variable_106882.init(BtnEntry.Field_2265[6], Variable_106881);
                return new String(Variable_106882.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception Variable_106883) {
                Variable_106883.printStackTrace();
                return null;
            }
        }
        
        static {
            Method_10333();
            Method_10334();
        }
        
        public void mouseReleased(final int Variable_106889, final int Variable_106888, final int Variable_106886, final int Variable_106892, final int Variable_106887, final int Variable_106895) {
            this.btn.mouseReleased(Variable_106888, Variable_106886);
        }
    }
}
