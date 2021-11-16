package de.lmu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class FrüherkennungService implements FrüherkennungIF{


    @Override
    public BerichtIF anylysieren(RötgenbildIF röntenbild) throws RemoteException {



        String name = röntenbild.getPathienenName();
        Date vom =röntenbild.getAufnameVom();

        Date date = new Date(System.currentTimeMillis());

        Bericht bericht = new Bericht(date, "krebs", "Begräbnis");

        BerichtIF berichtStub = (BerichtIF) UnicastRemoteObject.exportObject(bericht,0);

        return berichtStub;


    }




}
