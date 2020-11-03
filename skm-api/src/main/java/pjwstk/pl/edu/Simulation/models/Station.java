package pjwstk.pl.edu.Simulation.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Station {
    int counter = 2;

    List<String> stationList = Arrays.asList("GDYNIA GLOWNA", "GDYNIA WZG SW MAKSYMILIANA", "GDYNIA REDLOWO", "GDYNIA ORLOWO",
            "SOPOT KAMIENNY POTOK", "SOPOT", "SOPOT WYSCIGI", "GDANSK ZABIANKA", "GDANSK OLIWA", "GDANSK PRZYMORZE",
            "GDANSK ZASPA", "GDANSK WRZESZCZ", "GDANSK POLITECHNIKA", "GDANSK STOCZNIA", "GDANSK GLOWNY",
            "GDANSK SRODMIESCIE");
    boolean directionForward;
    String currentStation = "";


    public Station() {
        directionForward = true;
        currentStation = randomStation();
    }

    public Station(String StationName) {
        this.directionForward = true;
        this.currentStation = StationName;
    }

    public boolean isLast() {
        return getCurrentStation().equals(stationList.get(stationList.size() - 1));
    }

    public boolean isFirst() {
        return getCurrentStation().equals(stationList.get(0));
    }

    public void goBacwards() {
        if (isFirst()) {
            setCurrentStation(stationList.get(0));
        }
        setCurrentStation(stationList.get(stationList.indexOf(getCurrentStation()) - 1));
    }

    public void goForward() {
        if (isLast()) {
            setCurrentStation(stationList.get(stationList.size() - 1));
        }
        setCurrentStation(stationList.get(stationList.indexOf(getCurrentStation()) + 1));
    }

    public void stay() {
        setCurrentStation(currentStation);
    }


    public void move() {
        if (directionForward) {
            if (isLast()) {
                for (int i = counter; i > 0; i--) {
                    {
                        stay();
                    }
                }
                setDirectionForward(false);
                goBacwards();
            }
            goForward();
        } else {
            if (isFirst()) {
                setDirectionForward(true);
                goForward();
            }
            goBacwards();
        }
    }


    public String randomStation() {
        Random random = new Random();
        return stationList.get(random.nextInt(stationList.size()));
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    public boolean isDirectionForward() {
        return directionForward;
    }

    public void setDirectionForward(boolean directionForward) {
        this.directionForward = directionForward;

    }
}
