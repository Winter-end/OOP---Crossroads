package com.example.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemoDAS;
import com.example.demo.models.road.Road;
import com.example.demo.models.sign.Sign;
import com.example.demo.models.vehicles.Vehicle;

@Service
public class DemoService {
    private static DemoDAS dao;

    @Autowired
    public DemoService(@Qualifier("ArrayLsit") DemoDAS dao) {
        DemoService.dao = dao;
    }

    public static Sign findSign(int x, int y) {
        return dao.findSign(y, y);
    }

    public static Road findRoad(int x, int y) {
        return dao.findRoad(x, y);
    }

    public int addSign(Sign s) {
        return dao.addSign(s);
    }

    public int addRoad(Road r) {
        return dao.addRoad(r);
    }

    public int addVehicle(Vehicle v) {
        return dao.addVehicle(v);
    }

    public Set<Sign> getAllSigns() {
        return dao.getAllSigns();
    }

    public List<Road> getAllRoads() {
        return dao.getAllRoads();
    }

    public List<Vehicle> getAllVehicles() {
        return dao.getAllVehicles();
    }
}