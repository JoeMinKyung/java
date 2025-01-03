package week01;//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 요리 제목 입력
        String title = sc.nextLine();

        // 요리 별점 입력
        double star = sc.nextDouble();
        int starInt= (int)star;
        double starPercent = starInt/5.0 * 100;
        sc.nextLine(); // 개행 문자 소비

        // 요리 레시피 입력
        String[] strings = new String[10];

        for(int i=0;i<10;i++){
            strings[i]=sc.nextLine();
        }

        // 제목, 별점 출력
        System.out.println('['+title+']');
        System.out.println("별점: " + starInt + " (" + String.format("%.1f", starPercent) + "%)");

        // 레시피 출력
        for (int i=0;i<10;i++){
            System.out.println((i+1)+". "+strings[i]);
        }
    }
}