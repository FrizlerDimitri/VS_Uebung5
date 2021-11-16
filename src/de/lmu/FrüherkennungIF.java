package de.lmu;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FrüherkennungIF extends Remote {

    BerichtIF anylysieren (RötgenbildIF röntenbild) throws RemoteException;
}
