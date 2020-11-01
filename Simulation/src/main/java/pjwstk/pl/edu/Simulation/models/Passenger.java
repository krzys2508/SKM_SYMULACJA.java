package pjwstk.pl.edu.Simulation.models;


import java.util.Random;


public class Passenger {
    String name;
    String surname;
    int segmentID;
    String endStation;

    public Passenger(int segmentId) {
        Random random = new Random();
        int los= random.nextInt(300);
        this.segmentID = segmentId;
        this.name = "Mis"+los;
        this.surname = "Pys"+los;
        this.endStation = new Station().getCurrentStation();
    }

    public String getEndStation() {
        return endStation;
    }

    public int getSegmentID()
    {
        return segmentID;
    }
}