package pjwstk.pl.edu.Client.models;

import java.util.Arrays;
import java.util.List;

public class Station {
    List<String> stationList = Arrays.asList("GDYNIA GLOWNA", "GDYNIA WZG SW MAKSYMILIANA", "GDYNIA REDLOWO", "GDYNIA ORLOWO",
            "SOPOT KAMIENNY POTOK", "SOPOT", "SOPOT WYSCIGI", "GDANSK ZABIANKA", "GDANSK OLIWA", "GDANSK PRZYMORZE",
            "GDANSK ZASPA", "GDANSK WRZESZCZ", "GDANSK POLITECHNIKA", "GDANSK STOCZNIA", "GDANSK GDLOWNY",
            "GDANSK SRODMIESCIE");
    boolean directionForward;
    String currentStation = "";

    public Station() {
    }

    public List<String> getStationList() {
        return stationList;
    }

    public void setStationList(List<String> stationList) {
        this.stationList = stationList;
    }

    public boolean isDirectionForward() {
        return directionForward;
    }

    public void setDirectionForward(boolean directionForward) {
        this.directionForward = directionForward;
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }
}
