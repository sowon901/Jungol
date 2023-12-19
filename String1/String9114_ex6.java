package String1;
import java.util.*;

public class String9114_ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            char input = sc.next().charAt(0);

            if(input>=65&&input<=90)
                System.out.println("대문자입니다.");
            else if(input>=97&&input<=122)
                System.out.println("소문자입니다.");
            else if(input>=48&&input<=57)
                System.out.println("숫자문자입니다.");
            else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }

        }

    }
}
