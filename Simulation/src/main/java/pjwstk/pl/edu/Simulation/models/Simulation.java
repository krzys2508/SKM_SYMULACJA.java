package pjwstk.pl.edu.Simulation.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {
    List<Train> skms = new ArrayList();

    public List<Train> getSkms() {
        return skms;
    }

    public Simulation(int noTrains, int noSegments, int noCapacity) {
        for (int i = 0; i < noTrains; i++) {
            List <Segments> segments = new ArrayList<>(noSegments);
            for (int noSeg = 0; noSeg < noSegments; noSeg++) {
                segments.add(new Segments(noCapacity, noSeg));
            }
            int name = i;
            skms.add(new Train(segments, i));
        }

        System.out.println("Station :"+skms.get(0).getStation().getCurrentStation()+" "+skms.get(0).printCurrAmountPassangers());
        skms.get(0).addPassengers();
        System.out.println("Station :"+skms.get(0).getStation().getCurrentStation()+" "+skms.get(0).printCurrAmountPassangers());
//        for (int i = 0; i < 50 ; i++) {
//            skms.get(0).go();
//            skms.get(0).leaveTrain();
//            skms.get(0).addPassengers();
        }
    public void move(){
        for (int i = 0; i <skms.size();i++){
            skms.get(i).leaveTrain();
            skms.get(i).addPassengers();
            skms.get(i).go();
            System.out.println("Station :"+skms.get(0).getStation().getCurrentStation()+" "+skms.get(0).printCurrAmountPassangers());
        }
    }
    public List <Object> getId (){
        List <Object> skm = new ArrayList<>();
        for (int i = 0; i<skms.size();i++){
        }
    }
}
