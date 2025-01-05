package week02;

public class w35 {
    public static void main(String[] args) {
        // String 배열을 아래와 같이 선언과 생성할 수 있습니다.
        // 선언 후 하나씩 초기화 할 수 있습니다.
        String[] stringArray = new String[3];
        stringArray[0] = "val1";
        stringArray[1] = "val2";
        stringArray[2] = "val3";

        // 선언과 동시에 초기화 할 수 있습니다.
        String[] stringArray1 = new String[]{"val1", "val2", "val3"};
        String[] stringArray2 = {"val1", "val2", "val3"};
    }
}
