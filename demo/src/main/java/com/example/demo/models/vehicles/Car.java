package com.example.demo.models.vehicles;

import com.example.demo.models.road.Road;
import com.example.demo.models.sign.Sign;
import com.example.demo.models.sign.SpeedLimitSign;
import com.example.demo.service.DemoService;

public class Car implements Vehicle {
    private String name;
    private int speed;
    private int x;
    private int y;

    public Car(String name, int speed, int x, int y) {
        this.name = name;
        this.speed = speed;
        this.x = x;
        this.y = y;
        start();
    }

    @Override
    public void start() {
        Road r = DemoService.findRoad(x, y);
        while ((x < r.getX2() && y < r.getY2())) {
            Sign s = DemoService.findSign(x, y);
            if (s != null) {
                switch (s.getSignal(speed)) {
                    case STOP:                       // just terminates
                        return;
                    case SLOW_DOWN:
                        speed = ((SpeedLimitSign)s).getLimit();
                        break;
                }
            }
            x += speed*r.getSlope()/(r.getY2() - r.getY1());
            y += speed*r.getSlope()*(r.getX2() - r.getX1());
        }
    }
}
