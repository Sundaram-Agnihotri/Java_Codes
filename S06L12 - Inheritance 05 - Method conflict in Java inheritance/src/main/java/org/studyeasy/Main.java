package org.studyeasy;

import org.studyeasy.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Petrol", 2, 2, 21, "LED", "Short");

        System.out.println(bike.run());

    }
}
