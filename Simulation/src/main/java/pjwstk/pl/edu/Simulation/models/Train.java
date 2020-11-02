package pjwstk.pl.edu.Simulation.models;

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

    public Train(List<Segments> segments, int name) {
        this.segments = segments;
        this.name = name;
        this.station = new Station();
    }

    public void go() {
        this.station.move();
    }

    public Station getStation() {
        return station;
    }


    public List<Passenger> addPassengers() {
        int amountOfNewPassengers = 0;
        for (int i = 0; i < segments.size(); i++) {
            int freeSeatsInSeg = segments.get(i).getCapacity() - getAmountOfPassangersInSeg(segments.get(i).getSegmentId());
            if (freeSeatsInSeg > 0) {
                int amountOfNewPassengersInSeg = random.nextInt(freeSeatsInSeg);

                for (int j = 0; j < amountOfNewPassengersInSeg; j++) {
                    Passenger newPassengerInSeg = new Passenger(segments.get(i).getSegmentId());
                    passengers.add(newPassengerInSeg);
                }
                amountOfNewPassengers += amountOfNewPassengersInSeg;
            }
        }
        System.out.println("addPassengers new passengers #" + amountOfNewPassengers);
        return passengers;
    }


    private int getAmountOfPassangersInSeg(int segmentId) {
        int amount = 0;
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getSegmentID() == segmentId) {
                amount++;
            }
        }
        return amount;
    }


//    public boolean isFull() {
//        for (Segments segment : segments) {
//            if (segment.getPeople().size() < segment.getCapacity()) {
//                return true;
//            }
//        }
//        return false;
//    }

    public String printCurrAmountPassangers() {
        return " Train passengers#:" + passengers.size();
    }

    public List<Passenger> leaveTrain() {
        for (int i = 0; i < passengers.size(); i++) {
            if (station.getCurrentStation().equals(passengers.get(i).getEndStation())) {
                leavers.add(passengers.get(i));
            }
        }
        System.out.println("leaveTrain #" + leavers.size());
        passengers.removeAll(leavers);

        leavers.clear();
        return passengers;
    }

    public int toPercent() {
        int percentageInSegment = 0;
        for (int i = 0; i < segments.size(); i++) {
            percentageInSegment = (1 * getAmountOfPassangersInSeg(i) / segments.get(i).getCapacity());
        }
        return percentageInSegment;
    }

    public List<Segments> getSegments() {
        return segments;
    }
}
