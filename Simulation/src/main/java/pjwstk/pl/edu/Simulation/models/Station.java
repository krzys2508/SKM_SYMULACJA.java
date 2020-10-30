package pjwstk.pl.edu.Simulation.models;

import java.util.Random;

public enum Station {
    GDYNIAGLOWNA,
    GDYNIAWZGSWMAKSYMILIANA,
    GDYNIAREDLOWO,
    GDYNIAORLOWO,
    SOPOTKAMIENNYPOTOK,
    SOPOT,
    SOPOTWYSCIGI,
    GDANSKZABIANKA,
    GDANSKOLIWA,
    GDANSKPRZYMORZE,
    GDANSKZASPA,
    GDANSKWRZESZCZ,
    GDANSKPOLITECHNIKA,
    GDANSKSTOCZNIA,
    GDANSKGDLOWNY,
    GDANSKSRODMIESCIE;
    private static Station[] stations = values();

    public  boolean isLast() {
        return this.ordinal() == stations.length - 1;
    }

    public boolean isFirst() {
        return this.ordinal() == 0;
    }

    public  int setDirectionBacwards() {
        return this.ordinal();
    }

    public int setDirectionForward() {
        return this.ordinal() + 1;
    }

    public  Station move() {
        if (isLast()) {
            setDirectionBacwards();
        } else if (isFirst()) {
            setDirectionForward();
        }
        return stations[this.ordinal()];
    }
    public static Station randomStation (){
        Random random = new Random();
        return stations[random.nextInt(15)];
    }
}