package pvptone.utils;

public class Timer extends Object<Timer>
{
    public int[] Field_1680;
    public long time;
    
    public long getTime() {
        return System.nanoTime() / 1000000L - this.time;
    }
    
    public void Method_7659() {
        (Timer.Field_1680 = new int[2])[0] = " ".length();
        Timer.Field_1680[1] = ((0x74 ^ 0x6C) & ~(0x1D ^ 0x5));
    }
    
    static {
        Method_7659();
    }
    
    public void reset() {
        this.time = System.nanoTime() / 1000000L;
    }
    
    public Timer() {
        this.time = System.nanoTime() / 1000000L;
    }
    
    public int Method_7660(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: lload_2        
        //     2: lcmp           
        //     3: ireturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean hasTimeElapsed() {
        if (Method_7661(Method_7660(this.getTime(), 10L))) {
            this.reset();
            return Timer.Field_1680[0] != 0;
        }
        return Timer.Field_1680[1] != 0;
    }
    
    public boolean Method_7661(final int n) {
        return this >= 0;
    }
}
