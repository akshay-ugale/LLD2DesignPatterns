package SIngleton;

//Math utility should be singleton
public class MathUtility {
    private static MathUtility isntance = null;
    private MathUtility(){

    }

    public static MathUtility getIsntance() {
        if(isntance == null) {
            try{
                Thread.sleep(1000);
                isntance = new MathUtility();
            }
            catch (Exception ex){
                System.out.println("Exceptions");;
            }
        }

        return isntance;
    }
}
