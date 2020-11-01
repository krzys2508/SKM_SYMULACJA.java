package pjwstk.pl.edu.Simulation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pjwstk.pl.edu.Simulation.models.Simulation;
import pjwstk.pl.edu.Simulation.models.Station;
import pjwstk.pl.edu.Simulation.models.Train;

import java.util.List;

@RestController
public class TrainPassengersController {
    private Simulation simulation;

    @Autowired
    public TrainPassengersController(@Value("${envnoTrains}") final int noTrains, @Value("${envnoSegments}") final int noSegments, @Value("${envnoCapacity}") final int noCapacity) {
        simulation = new Simulation(noTrains, noSegments, noCapacity);
    }

    @GetMapping("/trains")
    public List<Train> trains() {
        return simulation.getSkms();
    }

    @GetMapping("/movement")
    public void move() {
        simulation.move();
    }
    @GetMapping ('/id')
    public List <Train> skm(){
        return skm().
    }

}
