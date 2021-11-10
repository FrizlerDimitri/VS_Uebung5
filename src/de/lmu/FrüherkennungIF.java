package de.lmu;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FrüherkennungIF extends Remote {

    Bericht anylysieren (Röntgenbild röntenbild) throws RemoteException;
}
