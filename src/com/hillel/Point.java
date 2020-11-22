package com.hillel;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculateDistanceTo(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2.0) + Math.pow((p1.y - p2.y), 2.0));
    }

    @Override
    public String toString() {
        return "Point (" + x + "," + y + ")";
    }
}
