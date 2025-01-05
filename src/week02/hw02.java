package week02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class hw02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자료구조 입력
        String dataStructure = sc.nextLine();

        // 요리 제목 입력
        String title = sc.nextLine();

        switch (dataStructure) {
            case "List":
                ArrayList<String> arrList = new ArrayList<>();

                while(true){
                    String strings = sc.nextLine();
                    if(Objects.equals(strings,"끝")) {
                        break;
                    }
                    arrList.add(strings);
                }

                System.out.println("[ List로 저장된 "+title+" ]");
                for (int i=0; i<arrList.size();i++){
                    int num = i+1;
                    System.out.println(num+" ."+arrList.get(i));
                }
                break;
            case "Set":
                LinkedHashSet<String> arrSet = new LinkedHashSet<>();

                while(true){
                   String strings = sc.nextLine();
                   if(Objects.equals(strings,"끝")){
                       break;
                   }
                   arrSet.add(strings);
                }

                System.out.println("[ Set으로 저장된 "+title+" ]");
                Iterator iterator = arrSet.iterator();
                for (int i = 0; i < arrSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + iterator.next());
                }
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNumber = 1;
                while (true) {
                    // 한줄씩 입력받아서 strList 에 저장
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(lineNumber++, text);
                }

                title = "[ Map 으로 저장된 " + title + " ]";  // [ 제목 ]
                System.out.println(title);

                // strList 한줄씩 출력
                for (int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + ". " + strMap.get(i + 1));
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}
