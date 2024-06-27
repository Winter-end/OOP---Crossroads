package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.vehicles.Car;
import com.example.demo.models.vehicles.Vehicle;
import com.example.demo.service.DemoService;

@RequestMapping("vehicle")
@RestController
public class VehicleController {

    private final DemoService service;

    @Autowired
    public VehicleController(DemoService service) {
        this.service = service;
    }

    @PostMapping
    public void addVehicle(@RequestBody Car car) {
        service.addVehicle(car);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return service.getAllVehicles();
    }
}
