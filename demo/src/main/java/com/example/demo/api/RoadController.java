package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.road.Road;
import com.example.demo.models.road.Traffic;
import com.example.demo.service.DemoService;

@RequestMapping("road")
@RestController
public class RoadController {

    private final DemoService service;

    @Autowired
    public RoadController(DemoService service) {
        this.service = service;
    }

    @PostMapping
    public void addRoad(@RequestBody Traffic traffic) {
        service.addRoad(traffic);
    }

    @GetMapping
    public List<Road> getAllRoads() {
        return service.getAllRoads();
    }
}
