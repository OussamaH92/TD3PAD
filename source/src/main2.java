import java.io.IOException;

public class main2 {
    public static void main(String[] args) {

        System.out.println("Hello from main2");
        StubObjetDistant so = new StubObjetDistant("localhost",33333);
        ObjetParam1 o1 = new ObjetParam1();
        ObjetParam2 o2 = new ObjetParam2();
        try {
            so.M1(o1);
            so.M2(o2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
