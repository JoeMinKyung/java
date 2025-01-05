package week02.operator;

public class w39 {
    public static void main(String[] args) {
        // 가변 2차원 배열 조회
        int[][] array = {
                {10, 20, 30},
                {10, 20, 30, 40},
                {10, 20}
        };

        for (int i = 0; i < array.length; i++) { // 1차원 길이
            for (int j = 0; j < array[i].length; j++) { // 2차원 길이
                System.out.println(array[i][j]); // 2중 반복문으로 i, j 인덱스 순회
            }
        }

        // 출력
        // 10
        // 20
        // 30
        // 10
        // 20
        // 30
        // 40
        // 10
        // 20
    }
}
