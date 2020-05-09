package pvptone;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import net.arikia.dev.drpc.*;
import net.arikia.dev.drpc.callbacks.*;

public class Discord extends Object<Discord>
{
    public String[] Field_2741;
    public int[] Field_2742;
    public long created;
    public boolean running;
    
    public String Method_12459(final String Variable_128697, String Variable_128696) {
        try {
            Variable_128696 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(Variable_128697.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher Variable_128698 = Cipher.getInstance("Blowfish");
            Variable_128698.init(Discord.Field_2742[2], Variable_128696);
            return new String(Variable_128698.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_128699) {
            Variable_128699.printStackTrace();
            return null;
        }
    }
    
    public String Method_12460(final String Variable_128710, final String Variable_128713) {
        try {
            final SecretKeySpec Variable_128711 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(Variable_128710.getBytes(StandardCharsets.UTF_8)), Discord.Field_2742[5]), "DES");
            final Cipher Variable_128712 = Cipher.getInstance("DES");
            Variable_128712.init(Discord.Field_2742[2], Variable_128711);
            return new String(Variable_128712.doFinal(Base64.getDecoder().decode(((String)this).getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception Variable_128713) {
            Variable_128713.printStackTrace();
            return null;
        }
    }
    
    public void shutdown() {
        this.running = (Discord.Field_2742[1] != 0);
        DiscordRPC.discordShutdown();
    }
    
    static {
        Method_12462();
        Method_12461();
    }
    
    public void update(final String Variable_128715, final String Variable_128717) {
        final DiscordRichPresence.Builder Variable_128718 = new DiscordRichPresence.Builder(Variable_128717);
        Variable_128718.setBigImage(Discord.Field_2741[Discord.Field_2742[2]], Discord.Field_2741[Discord.Field_2742[3]]);
        "".length();
        Variable_128718.setDetails(Variable_128715);
        "".length();
        Variable_128718.setStartTimestamps(this.created);
        "".length();
        DiscordRPC.discordUpdatePresence(Variable_128718.build());
    }
    
    public void Method_12461() {
        (Discord.Field_2741 = new String[Discord.Field_2742[4]])[Discord.Field_2742[1]] = Method_12459("1HgADxJvQH7P4mVdabgcax8pRc42/GP2", "wEHuz");
        Discord.Field_2741[Discord.Field_2742[0]] = Method_12460("CYiK0pr2Oujvprs2QH5BSYI2IV7yYHAn", "oUhyJ");
        Discord.Field_2741[Discord.Field_2742[2]] = Method_12460("PTYxBjeGiFc=", "DqwAY");
        Discord.Field_2741[Discord.Field_2742[3]] = Method_12459("1hiKpGOYkVA=", "PgVFE");
    }
    
    public void Method_12462() {
        (Discord.Field_2742 = new int[6])[0] = " ".length();
        Discord.Field_2742[1] = ((0x70 ^ 0x2F ^ (0x12 ^ 0x78)) & (0xA3 ^ 0xC7 ^ (0xD8 ^ 0x89) ^ -" ".length()));
        Discord.Field_2742[2] = "  ".length();
        Discord.Field_2742[3] = "   ".length();
        Discord.Field_2742[4] = (59 + 90 - 72 + 117 ^ 128 + 153 - 257 + 174);
        Discord.Field_2742[5] = (0xEB ^ 0xAC ^ (0xD ^ 0x42));
    }
    
    public Discord() {
        this.running = (Discord.Field_2742[0] != 0);
        this.created = 0L;
    }
    
    public void start() {
        final DiscordEventHandlers Variable_128727 = new DiscordEventHandlers.Builder().setReadyEventHandler((ReadyCallback)new Object<Discord$1>(this) {
            public Discord this$0;
            
            public void apply(final DiscordUser Variable_27838) {
            }
        }).build();
        DiscordRPC.discordInitialize(Discord.Field_2741[Discord.Field_2742[1]], Variable_128727, (boolean)(Discord.Field_2742[0] != 0));
        new Object<Discord$2>(this, Discord.Field_2741[Discord.Field_2742[0]]) {
            public Discord this$0;
            
            public void run() {
                DiscordRPC.discordRunCallbacks();
            }
        }.start();
    }
}
