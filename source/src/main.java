import java.io.IOException;

public class main {

    public static void main(String[] args) {

        System.out.println("Hello from main");
        ObjetDistantImpl o = new ObjetDistantImpl();
        SkeletonObjetDistant sk = new SkeletonObjetDistant(o,33333);
        try {
            sk.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
