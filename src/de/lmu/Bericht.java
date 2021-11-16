package de.lmu;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Date;

public class Bericht implements  BerichtIF {

    private Date datum;
    private String diagnose;
    private String weiteresVorgehen;

    public Bericht() {
    }

    public Bericht(Date datum, String diagnose, String weiteresVorgehen) {
        this.datum = datum;
        this.diagnose = diagnose;
        this.weiteresVorgehen = weiteresVorgehen;
    }


    public Date getDatum() throws RemoteException {
        return datum;
    }

    public void setDatum(Date datum) throws RemoteException {
        this.datum = datum;
    }

    public String getDiagnose() throws RemoteException {
        return diagnose;
    }

    public void setDiagnose(String diagnose)   throws RemoteException{
        this.diagnose = diagnose;
    }

    public String getWeiteresVorgehen()  throws RemoteException {
        return weiteresVorgehen;
    }

    public void setWeiteresVorgehen(String weiteresVorgehen)  throws RemoteException {
        this.weiteresVorgehen = weiteresVorgehen;
    }
}
