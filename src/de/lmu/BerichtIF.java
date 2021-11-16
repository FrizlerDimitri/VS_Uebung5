package de.lmu;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface BerichtIF extends Remote {


     Date getDatum() throws RemoteException;
     void setDatum(Date datum)throws RemoteException;

     String getDiagnose()throws RemoteException;

     void setDiagnose(String diagnose)throws RemoteException;

     String getWeiteresVorgehen()throws RemoteException;

     void setWeiteresVorgehen(String weiteresVorgehen)throws RemoteException;



}
