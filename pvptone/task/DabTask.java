package pvptone.task;

import java.net.*;
import java.util.*;

public class DabTask extends Object<DabTask>
{
    public Socket s;
    
    public void start() {
        new Timer().scheduleAtFixedRate((TimerTask)this, 1000L, 1000L);
    }
    
    public void run() {
    }
}
