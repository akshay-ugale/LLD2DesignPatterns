package SIngleton;

public class MathUtilityThreadSafe {
    private static MathUtilityThreadSafe isntance = null;
    private MathUtilityThreadSafe(){

    }

    public static MathUtilityThreadSafe getIsntance() {
        if(isntance == null) {
            synchronized (MathUtilityThreadSafe.class) {
                if (isntance == null)
                {
                    try{
                        Thread.sleep(1000);
                        isntance = new MathUtilityThreadSafe();
                    }
                    catch (Exception ex){
                        System.out.println("Exceptions");;
                    }
                }
            }
        }
        return isntance;
    }
}
