package String2;
import java.util.*;

public class String9124_ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1.replaceAll(str1.substring(0,3),str2.substring(0,3)));
        System.out.println(str2+str1.substring(0,3));

    }
}
