package pjwstk.pl.edu.Simulation.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {
    List<Train> skms = new ArrayList();
    Random random = new Random();

    public List<Train> getSkms() {
        return skms;
    }

    public Simulation(int noTrains, int noSegments, int noCapacity) {
        for (int i = 0; i < noTrains; i++) {
            List <Segments> segments = new ArrayList<>(noSegments);
            for (int k = 0; k < segments.size(); k++) {
                segments.add(new Segments(noCapacity));
            }
            int name = i;
            skms.add(new Train(segments, i));
        }


    }

}
