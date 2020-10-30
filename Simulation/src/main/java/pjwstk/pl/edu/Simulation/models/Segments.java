package pjwstk.pl.edu.Simulation.models;

import javax.swing.text.Segment;
import java.lang.reflect.Array;
import java.util.List;

public class Segments {
    private int capacity;
    List <Passenger> people;
    public Segments(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getPeople() {
        return people;
    }
}
