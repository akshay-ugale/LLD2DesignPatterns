import BuilderPattern.Student;
import MultiThreading.NumberPrinter;
import PrototypeAndRegistry.PrototypeAndRegistry;

public class Main {
    public static void main(String[] args) {

        //Singleton Thread unsafe
        for(int i=0; i < 11; i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

        //Singleton Thread safe
        for(int i=0; i < 11; i++){
            Thread t = new Thread(new NumberPrinter(i, "Safe"));
            t.start();
        }

        //Builder Patter
        Student std1 = Student.getBuilder()
                .setId(1)
                .setAge(21)
                .setBatchYear(2019)
                .setName("Akshay")
                .build();
        System.out.println(std1);

        //Prototype&Registry
        System.out.println("Prototype&Registry");
        PrototypeAndRegistry.ProtoDemo();

        System.out.println();
    }
}