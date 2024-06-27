package com.example.demo.models.road;

public interface Road {
    // returns starting position
    public int getX1();
    public int getY1();

    public int getX2();
    public int getY2();

    public double getSlope();
    public double getIntercept();
    public boolean onLine(int x, int y);
}
