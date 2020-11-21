package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Point[] pointsArray = new Point[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Введите координаты " + (i+1) + "-й точки в формате: x,y (через запятую без пробела)");
            String coordinatesOfPoint = br.readLine();
            String[] coordinates =coordinatesOfPoint.split(",");
            pointsArray[i]= new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
        }

        System.out.println("Введите данные круга -" +
                " координаты центра и радиус в формате: x,y,radius (через запятую без пробела)");
        String coordinatesOfCircle = br.readLine();

        String coordinatesOfPoint = br.readLine();
        String[] coordinates =coordinatesOfPoint.split(",");
        Circle circle = new Circle(new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])), Integer.parseInt(coordinates[2]));


    }


}
