package week03;

public class Car {
    // <필드 영역>
    // 1) 고유 데이터 영역
    String company; // 자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격
    // 2) 상태 데이터 영역
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태
    // 3) 객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    // <생성자 영역>
    // 생성자: 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car() {
    }
    // 아무 것도 없는 위와같은 상태를 기본 생성자라고 한다. -> 생략 가능

    //<메서드 영역>
    //gasPedal
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    //breakPedal
    double brakePedal() {
        speed = 0;
        return speed;
    }

    //changeGear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    //onOffLight
    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    //horn
    void horn() {
        System.out.println("빵빵");
    }
}
