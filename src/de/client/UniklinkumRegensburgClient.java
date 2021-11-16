package de.client;

import de.lmu.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class UniklinkumRegensburgClient {

    public BerichtIF getBericht(Röntgenbild röntenbild)
    {
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            FrüherkennungIF früherkennungIF=(FrüherkennungIF) r.lookup("Test");


            RötgenbildIF rötgenbildStub= (RötgenbildIF) UnicastRemoteObject.exportObject(röntenbild, 0);

            BerichtIF bericht = früherkennungIF.anylysieren(röntenbild);

            return bericht;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
