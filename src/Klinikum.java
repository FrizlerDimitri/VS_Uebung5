import de.client.UniklinkumRegensburgClient;
import de.lmu.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class Klinikum {

    public static void main(String[] args) {



        //sever
        FrüherkennungServer früherkennungServer = new FrüherkennungServer();
        früherkennungServer.startServer();


        //client
        UniklinkumRegensburgClient client = new UniklinkumRegensburgClient();
        Date date = new Date(System.currentTimeMillis());


        try {
            Registry r= LocateRegistry.getRegistry("localhost",1099);


            //RötgenbildIF rötgenbildStub=(RötgenbildIF) r.lookup("Test");
            Röntgenbild röntenbild = new Röntgenbild(date,"Dimitri",null);

            BerichtIF b = client.getBericht(röntenbild);

            System.out.println("Bericht: ");
            System.out.println(b.getDatum());
            System.out.println(b.getDiagnose());
            System.out.println(b.getWeiteresVorgehen());

        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }
}
