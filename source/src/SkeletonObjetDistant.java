import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SkeletonObjetDistant  {

    private int port ;
    private ObjetDistant od ;

    public SkeletonObjetDistant (ObjetDistant o , int p ){od = o; port =p;}

    public void run () throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(this.port);
        while(true) {
            traiterRequete(ss.accept());
        }

    }

    private void traiterRequete (Socket s) throws IOException, ClassNotFoundException {

        ObjectInputStream in =new ObjectInputStream(s.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());

        String request = (String) in.readObject();

        if(request.equals("M1")){

           ObjetParam2 res = od.M1((ObjetParam1)in.readObject());
           out.writeObject(res);

        }else if(request.equals("M2")){

           ObjetParam1 res = od.M2((ObjetParam2)in.readObject());
           out.writeObject(res);

        }

        in.close();
        out.close();
        s.close();

    }


}
