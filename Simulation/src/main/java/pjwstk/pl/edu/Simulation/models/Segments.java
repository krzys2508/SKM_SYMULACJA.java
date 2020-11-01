package pjwstk.pl.edu.Simulation.models;

import java.util.List;

public class Segments {
    private int segmentId; // dla passazera hhhhhhhhhhhhhhhhhhhhhh
    private int capacity;
    List <Passenger> people;
    public Segments(int capacity, int segmentId){
        this.capacity=capacity;
        this.segmentId=segmentId;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getPeople() {
        return people;
    }

    public int getSegmentId()
    {
        return segmentId;
    }
}
