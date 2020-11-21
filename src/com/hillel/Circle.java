package com.hillel;

public class Circle {
    private Point centre;
    private double radius;

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

    public boolean isPointInTheCircle(Point point){
        double distance = Math.sqrt(
                Math.pow(point.getX() - centre.getX(), 2.0)
                        + Math.pow(point.getY() - centre.getY(), 2.0)
                ); //d = корень((x1-x2)^2 + (y1-y2)^2)
        return distance <= this.radius;
    }

    @Override
    public String toString() {
        return "Circle{ " + "centre in " + centre + ", radius = " + radius + " }";
    }
}
