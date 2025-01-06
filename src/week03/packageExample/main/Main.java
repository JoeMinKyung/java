package week03.packageExample.main;

public class Main {
    public static void main(String[] args) {
        week03.packageExample.pk1.Car car = new week03.packageExample.pk1.Car();
        car.horn(); // pk1 빵빵

        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
        car2.horn(); // pk2 빵빵
    }
}
