import de.client.UniklinkumRegensburgClient;
import de.lmu.Bericht;
import de.lmu.FrüherkennungServer;
import de.lmu.Röntgenbild;

import java.util.Date;

public class Klinikum {

    public static void main(String[] args) {



        //sever
        FrüherkennungServer früherkennungServer = new FrüherkennungServer();
        früherkennungServer.startServer();


        //client
        UniklinkumRegensburgClient client = new UniklinkumRegensburgClient();
        Date date = new Date(System.currentTimeMillis());

        Röntgenbild röntenbild = new Röntgenbild(date,"Dimitri",null);
        Bericht b = client.getBericht(röntenbild);

        System.out.println("Bericht: ");
        System.out.println(b.getDatum());
        System.out.println(b.getDiagnose());
        System.out.println(b.getWeiteresVorgehen());

    }
}
