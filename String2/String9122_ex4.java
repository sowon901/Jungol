package String2;
import java.util.*;

public class String9122_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];

        str[0] = sc.next();
        str[1] = sc.next();

        if(str[0].length() < str[1].length()){
            System.out.println(str[0]);
            System.out.println(str[1]);
        } else {
            System.out.println(str[1]);
            System.out.println(str[0]);
        }
    }
}
