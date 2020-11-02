package pjwstk.pl.edu.Simulation.models;

public class Segments {
    private int segmentId;
    private int capacity;
    int noPassengers;

    public Segments(int capacity, int segmentId) {
        this.capacity = capacity;
        this.segmentId = segmentId;
        this.noPassengers = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addNoPassengers(int noNewPassengers) {
        this.noPassengers += noNewPassengers;
    }
    public void deletePassengers (int noLeavers){
        this.noPassengers -= noLeavers;
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public double getPercentage() {
        return (1.0*noPassengers / capacity) * 100.0;
    }
}
