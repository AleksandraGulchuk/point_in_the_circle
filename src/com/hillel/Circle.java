package com.hillel;

public class Circle {
    private final Point centre;
    private final double radius;

    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isContainPoint(double distance) {
        return distance <= this.radius;
    }

    @Override
    public String toString() {
        return "Circle{ " + "centre in " + centre + ", radius = " + radius + " }";
    }
}
