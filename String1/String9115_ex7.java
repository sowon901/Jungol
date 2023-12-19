package String1;
import java.util.*;

public class String9115_ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(char c: str.toCharArray()) {
            if(c>=97)
                System.out.print(Character.toUpperCase(c));
            else
                System.out.print(Character.toLowerCase(c));
        }

    }
}
