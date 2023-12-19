package String2;
import java.util.*;

public class String9118_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];

        for(int i=0; i<array.length; i++) {
            array[i] = sc.next();
        }

        for(String str: array) {
            System.out.println(str);
        }



    }
}
