package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.demo.models.road.Road;
import com.example.demo.models.sign.Sign;
import com.example.demo.models.vehicles.Vehicle;

@Repository("ArrayLsit")
public class DemoDAS {

    private static Set<Sign> signList = new HashSet<>();
    private static List<Road> roadList = new ArrayList<>();
    private static List<Vehicle> vehicleList = new ArrayList<>();

    public int addSign(Sign o) {
        signList.add(o);

        return 1;
    }

    public int addRoad(Road o) {
        roadList.add(o);

        return 1;
    }

    public int addVehicle(Vehicle o) {
        vehicleList.add(o);

        return 1;
    }

    public Sign findSign(int x, int y) {
        for (Sign s : signList) {
            if (s.getX() == x && s.getY() == y)
                return s;
        }
        return null;
    }

    public Road findRoad(int x, int y) {
        for (Road r : roadList) {
            if (r.onLine(x, y))
                return r;
        }
        return null;
    }

    public Set<Sign> getAllSigns() {
        return signList;
    }

    public List<Road> getAllRoads() {
        return roadList;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleList;
    }
}
