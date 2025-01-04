package week02;

public class w25 {
    public static void main(String[] args) {
        // continue 명령

        int number = 0;
        while(number < 3) {
            number++;
            if (number == 2) {
                continue;  // 2일때 반복 패스
            }
            System.out.println(number + "출력");
        }

        // 출력
        // 1출력
        // 3출력
    }
}
