package String2;
import java.util.*;

public class String9123_ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        StringBuilder stringbuilder = new StringBuilder();

        stringbuilder.append(string2).append(string1);
        System.out.println(stringbuilder);
    }
}
