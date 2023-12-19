package loop3;
import java.util.*;

public class Loop9062_ex7 {
    public static void main(String[] args) {
        int input = 1;
        char ch = 'a';

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            for(int j=4; j>=i; j--) {
                System.out.print(input + " ");
                input++;
            }
            System.out.println();
        }
    }
}
