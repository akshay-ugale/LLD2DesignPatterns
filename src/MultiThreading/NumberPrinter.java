package MultiThreading;

import SIngleton.MathUtility;
import SIngleton.MathUtilityThreadSafe;

public class NumberPrinter implements Runnable {
    private final int i;
    private String safe = null;

    public NumberPrinter(int i){
        this.i = i;
    }

    public NumberPrinter(int i, String safe){
        this(i);
        this.safe = safe;
    }
    @Override
    public void run() {
        if(safe == null) {
            var instace = MathUtility.getIsntance();
            System.out.println(instace);
        }
        else{
            var instace = MathUtilityThreadSafe.getIsntance();
            System.out.println(instace);
        }
    }
}
