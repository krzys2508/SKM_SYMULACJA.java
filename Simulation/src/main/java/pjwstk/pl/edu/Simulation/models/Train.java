package pjwstk.pl.edu.Simulation.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Train {
    private int capacity;
    private List<Segments> segments;
    private int name;
    Random random = new Random();
    private List<Passenger> passengers = new ArrayList();
    private List<Passenger> leavers = new ArrayList();

    public Train(List<Segments> segments, int name) {
        this.segments = segments;
        this.name = name;
    }

    public List<Passenger> addPassengers() {
        for (int i = 0; i < segments.size(); i++) {
            int people = random.nextInt((8 - 2) + 2);
            for (int j = 0; j <= people; j++) {
                Passenger passenger = new Passenger();
                passengers.add(passenger);
            }
        }
        return passengers;
    }


    public boolean isFull() {
        for (Segments segment : segments) {
            if (segment.getPeople().size() < segment.getCapacity()) {
                return true;
            }
        }
        return false;
    }

    public List<Passenger> leaveTrain() {
        for (int i = 0; i < passengers.size(); i++) {
            if (Station.values().toString() == passengers.get(i).getEndStation().toString()) {
                leavers.add(passengers.get(i));
            }
        }
        passengers.remove(leavers);
        return passengers;
    }
}
