package loop3;
import java.util.*;

public class Loop9062_self6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        char engch = 'A';

        for(int i=input; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(engch);
                engch++;
            }
            System.out.println();
        }
    }
}
