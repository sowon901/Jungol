package String2;
import java.util.*;

public class String9121_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"champion","class"};
        System.out.print("문자를 입력하세요. ");
        char inputChar = sc.next().charAt(0);

        for(String s:str) {
            if(inputChar == s.charAt(0))
                System.out.println(s);
        }
    }
}
