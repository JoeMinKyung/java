package week02.operator;

public class w41 {
    public static void main(String[] args) {
        // 최소값 구하기

        int[] arr = { 3, 2, 1, 5, 1 };

        // 최소값 초기값 세팅
        int min = arr[0];

        // 최소값 구하기
        for (int num : arr) {
            if (num < min) { // 반복문 돌면서 나(min)보다 값이 작으면 저장
                min = num;
            }
        }

        // 최소값 1 출력
        System.out.println(min);
    }
}
