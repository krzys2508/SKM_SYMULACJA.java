package pjwstk.pl.edu.Simulation.models;


import com.github.javafaker.Faker;


public class Passenger {
    Faker faker = new Faker();
    Station endStation;

    public Passenger() {
        String name = faker.name().firstName().toString();
        String surname = faker.name().lastName().toString();
        Station endStation = Station.randomStation();
    }

    public Station getEndStation() {
        return endStation;
    }
}