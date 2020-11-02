package pjwstk.pl.edu.Client.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Train {
    private Station station;
    private List<Segments> segments;
    private int name;
    private List<Passenger> passengers = new ArrayList();
    private List<Passenger> leavers = new ArrayList();
    Random random = new Random();

    public Train() {
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public List<Segments> getSegments() {
        return segments;
    }

    public void setSegments(List<Segments> segments) {
        this.segments = segments;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Passenger> getLeavers() {
        return leavers;
    }

    public void setLeavers(List<Passenger> leavers) {
        this.leavers = leavers;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
