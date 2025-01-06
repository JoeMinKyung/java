package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        // 초기값과 기본값 확인하기
        System.out.println("car.model = " + car.model); // 초기값 "Gv80"이 출력됩니다.
        System.out.println("car.color = " + car.color); // 기본값 null이 출력됩니다.
        System.out.println();

        System.out.println("car.speed = " + car.speed); // 기본값 0.0이 출력됩니다.
        System.out.println("car.gear = " + car.gear);  // 기본값 \u0000(공백)이 출력됩니다.
        System.out.println("car.lights = " + car.lights); // 초기값 true가 출력됩니다.
        System.out.println();

        System.out.println("car.tire = " + car.tire); // 초기값 인스턴스의 주소가 출력됩니다.
        System.out.println("car.door = " + car.door); // 기본값 null이 출력됩니다.
        System.out.println();

        // 필드 사용
        car.color = "blue"; // 필드 color에 "blue" 데이터를 저장합니다.
        car.speed = 100;    // 필드 speed에 100 데이터를 저장합니다.
        car.lights = false; // 필드 lights에 false 데이터를 저장합니다.

        System.out.println("car.color = " + car.color); // 저장된 "blue" 데이터가 출력됩니다.
        System.out.println("car.speed = " + car.speed); // 저장된 100.0 데이터가 출력됩니다.
        System.out.println("car.lights = " + car.lights); // 저장된 false 데이터가 출력됩니다.
    }
}
