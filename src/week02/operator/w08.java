package week02.operator;

public class w08 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "정답" : "땡";
        System.out.println(s); // 땡

        int max = (x > y) ? x : y;
        System.out.println(max); // 9

        int min = (x < y) ? x : y;
        System.out.println(min); // 1
    }
}
