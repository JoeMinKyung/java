package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성


        // 메서드 호출 및 반환값 저장
        System.out.println("페달 밟기 전 car.gear = " + car.gear); // 'D' 출력
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        // gasPedal 메서드 내부에 호출된 changeGear(type); 메서드의 결과 확인
        System.out.println("페달 밟은 후 car.gear = " + car.gear); // 'D' 출력

        System.out.println();
        // 가변길이 매개변수 확인
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
