package pjwstk.pl.edu.Client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pjwstk.pl.edu.Client.models.Train;

import java.util.Arrays;
import java.util.List;

@RestController
public class SkmController {
    private final String URItrains = "http://Simultation:11111/trains";
    private final String URIid = "http://Simulation:11111/id";

    @GetMapping("/trains")
    public List<Train> trains() {
        RestTemplate template = new RestTemplate();

        Train [] catalogue = template.getForObject(URItrains,Train[].class);
        return Arrays.asList(catalogue);
    }
    @GetMapping("/ID")
    public List<Train> id() {
        RestTemplate template = new RestTemplate();

        Train [] catalogue = template.getForObject(URIid,Train[].class);
        return Arrays.asList(catalogue);
    }
}

