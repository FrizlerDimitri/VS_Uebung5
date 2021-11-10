package de.client;

import de.lmu.Bericht;
import de.lmu.FrüherkennungIF;
import de.lmu.Röntgenbild;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class UniklinkumRegensburgClient {

    public Bericht getBericht(Röntgenbild röntenbild)
    {
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            FrüherkennungIF früherkennungIF=(FrüherkennungIF) r.lookup("Test");
            Bericht bericht = früherkennungIF.anylysieren(röntenbild);
            return bericht;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

        return  null;

    }



}
