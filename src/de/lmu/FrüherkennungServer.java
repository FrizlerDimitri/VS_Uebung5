package de.lmu;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class FrüherkennungServer {

    public void startServer()
    {

        try {
            FrüherkennungIF früherkennungIF=new FrüherkennungService();
            FrüherkennungIF skeleton= (FrüherkennungIF)UnicastRemoteObject.exportObject(früherkennungIF,0);

            Registry r= LocateRegistry.createRegistry(1099);
            r.bind("Test",skeleton);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }
    
}
