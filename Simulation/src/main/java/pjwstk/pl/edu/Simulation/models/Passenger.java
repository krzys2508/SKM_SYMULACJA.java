package pjwstk.pl.edu.Simulation.models;


import com.github.javafaker.Faker;

import java.util.Random;


public class Passenger {
    String name;
    String surname;
    int segmentID;
    String endStation;
    Faker faker = new Faker();

    public Passenger(int segmentId) {
        Random random = new Random();
        int los= random.nextInt(300);
        this.segmentID = segmentId;
        this.name =faker.name().firstName();
        this.surname = faker.name().lastName();
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