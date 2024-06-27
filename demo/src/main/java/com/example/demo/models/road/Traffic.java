package com.example.demo.models.road;

public class Traffic implements Road{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    @Override
    public int getX1() {
        return this.x1;
    }

    @Override
    public int getY1() {
        return this.y1;
    }

    @Override
    public int getX2() {
        return this.x2;
    }

    @Override
    public int getY2() {
        return this.y2;
    }

    @Override
    public double getSlope() {
        if ((x2 - x1) == 0 && (y2 - y1) > 0)
            return 1;
        else if ((x2 - x1) == 0 && (y2 - y1) < 0)
            return -1;
        return (double)(y2 - y1)/(double)(x2 - x1);
    }

    @Override
    public double getIntercept() {
        return (double)y1 - x1*getSlope();
    }

    @Override
    public boolean onLine(int x, int y) {
        if (Math.abs(getSlope()*x - getIntercept() - y) <= 2) {
            return true;
        }
        return false;
    }
}
