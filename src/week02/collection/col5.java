package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class col5 {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3); // 중복된 값은 덮어씁니다.
        intSet.add(3); // 중복된 값은 덮어씁니다.

        for (Integer value : intSet) {
            System.out.println(value); // 1,2,3 출력
        }

        // contains()
        System.out.println(intSet.contains(2)); // true 출력
        System.out.println(intSet.contains(4)); // false 출력

        // remove()
        intSet.remove(3); // 3 삭제

        for (Integer value : intSet) {
            System.out.println(value); // 1,2 출력
        }
    }
}
