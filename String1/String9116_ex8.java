package String1;
import java.util.*;

public class String9116_ex8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        for(char c: str.toCharArray()){
            if(c==' ') {
                System.out.println();
            } else
                System.out.print(c);
        }

    }
}
