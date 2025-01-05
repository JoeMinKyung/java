package week02.operator;

import java.util.Scanner;

public class w27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력제외할 구구단수 값
        for (int i = 2; i <= 9; i++) {
            if (i == passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
        }

        // 입력
        // 2

        // 출력 - 입력값인 2단은 건너띄고 구구단 출력
        // 3곱하기2는6입니다.
        // 3곱하기3는9입니다.
        // 3곱하기4는12입니다.
        // ... 중략 ...
        // 9곱하기8는72입니다.
        // 9곱하기9는81입니다.
    }
}
