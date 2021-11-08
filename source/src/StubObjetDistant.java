import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StubObjetDistant {

    private int port ;
    private String adresse ;

    public StubObjetDistant ( String ad , int p ){
        port =p ; adresse = ad ;
    }

    public ObjetParam2 M1 ( ObjetParam1 arg ) throws IOException, ClassNotFoundException {

        Socket s = new Socket(adresse,port);
        ObjectInputStream in =new ObjectInputStream(s.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        out.writeObject("M1");
        out.writeObject(arg);

        Object o = in.readObject();

        in.close();
        out.close();
        s.close();

        return (ObjetParam2) o;

    }

    public ObjetParam1 M2 ( ObjetParam2 arg ) throws IOException, ClassNotFoundException {

        Socket s = new Socket(adresse,port);
        ObjectInputStream in =new ObjectInputStream(s.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        out.writeObject("M2");
        out.writeObject(arg);

        Object o = in.readObject();

        in.close();
        out.close();
        s.close();

        return (ObjetParam1) o;

    }


}
