package String1;
import java.util.*;

public class String9112_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder strs = new StringBuilder(str);

        strs.reverse();

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", str.length());
        System.out.println(strs);
    }
}
