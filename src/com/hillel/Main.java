package com.hillel;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        WorkerWithUser worker = new WorkerWithUser();
        Point[] pointsArray = worker.takePointsArray();
        Circle circle = worker.takeCircle();
        worker.checkPointsInTheCircle(pointsArray, circle);
    }
}
