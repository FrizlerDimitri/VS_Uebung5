package de.lmu;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface RötgenbildIF extends Remote {

     Date getAufnameVom() throws RemoteException;

     void setAufnameVom(Date aufnameVom)throws RemoteException;

     String getPathienenName()throws RemoteException ;

     void setPathienenName(String pathienenName)throws RemoteException;

     byte[] getRawData()throws RemoteException;

     void setRawData(byte[] rawData)throws RemoteException;


}
