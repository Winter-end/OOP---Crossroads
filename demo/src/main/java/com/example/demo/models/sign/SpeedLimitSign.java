package com.example.demo.models.sign;

public class SpeedLimitSign implements Sign {
    private int x;
    private int y;
    private final int limit;

    public SpeedLimitSign(int limit, int x, int y) {
        this.x = x;
        this.y = y;
        this.limit = limit;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public Signal getSignal(int speed) {
        if (speed > limit)
            return Signal.SLOW_DOWN;
        else
            return Signal.OK;
    }

    /*
    @Override
    public int hashCode() {
        return limit + x + y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof SpeedLimitSign))
            return false;
        if (((SpeedLimitSign) o).x != this.x && ((SpeedLimitSign) o).y != this.y
                && ((SpeedLimitSign) o).limit != this.limit)
            return false;
        return true;
    }
    */
}