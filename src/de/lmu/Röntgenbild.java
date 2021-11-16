package de.lmu;

import java.io.Serializable;
import java.util.Date;

public class Röntgenbild implements RötgenbildIF {

    private Date aufnameVom;
    private transient String pathienenName;
    private byte[] rawData;


    public Röntgenbild() {
    }

    public Röntgenbild(Date aufnameVom, String pathienenName, byte[] rawData) {
        this.aufnameVom = aufnameVom;
        this.pathienenName = pathienenName;
        this.rawData = rawData;
    }

    public Date getAufnameVom() {
        return aufnameVom;
    }

    public void setAufnameVom(Date aufnameVom) {
        this.aufnameVom = aufnameVom;
    }

    public String getPathienenName() {
        return pathienenName;
    }

    public void setPathienenName(String pathienenName) {
        this.pathienenName = pathienenName;
    }

    public byte[] getRawData() {
        return rawData;
    }

    public void setRawData(byte[] rawData) {
        this.rawData = rawData;
    }
}
