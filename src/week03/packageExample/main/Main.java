package week03.packageExample.main;

import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.horn(); // pk1 빵빵

        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
        car2.horn(); // pk2 빵빵
    }
}
