package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkerWithUser {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final int quantity = 2;

    public Point[] takePointsArray() throws IOException {
        Point[] pointsArray = new Point[quantity];
        for (int i = 0; i < pointsArray.length; i++) {
            System.out.println("Введите координаты " + (i + 1) + "-й точки в формате: x,y (через запятую без пробела)");
            String coordinatesOfPoint = br.readLine();
            String[] coordinates = coordinatesOfPoint.split(",");
            pointsArray[i] = new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
        }
        return pointsArray;
    }

    public Circle takeCircle() throws IOException {
        System.out.println("Введите данные круга -" +
                " координаты центра и радиус в формате: x,y,radius (через запятую без пробела)");
        String coordinatesOfCircle = br.readLine();
        String[] coordinates = coordinatesOfCircle.split(",");
        return new Circle(new Point(Integer.parseInt(coordinates[0]),
                Integer.parseInt(coordinates[1])), Integer.parseInt(coordinates[2]));
    }

    public void checkPointsInTheCircle(Point[] pointsArray, Circle circle) {
        for (Point point : pointsArray) {
            if (circle.isContainPoint(point.calculateDistanceTo(point, circle.getCentre()))) {
                System.out.println("Точка " + point + " принадлежит кругу " + circle);
            }
        }
    }
}
