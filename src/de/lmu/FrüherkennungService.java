package de.lmu;

import java.util.Date;

public class FrüherkennungService implements  FrüherkennungIF{


    @Override
    public Bericht anylysieren(Röntgenbild röntenbild) {

        String name = röntenbild.getPathienenName();
        Date vom =röntenbild.getAufnameVom();

        Date date = new Date(System.currentTimeMillis());

       Bericht bericht = new Bericht(date, "krebs", "Begräbnis");

        return bericht;
    }




}
