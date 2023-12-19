package loop2;
import java.util.*;

public class Loop139_test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mult = 0;

        for(int i=1; i<=9; i++) {
            if(a>=b) {
                for (int j = a; j >= b; j--) {
                    mult = i * j;
                    System.out.printf("%d * %d =%3d   ", j, i, mult);
                }
                System.out.println();
            } else {
                for (int j = a; j <= b; j++) {
                    mult = i * j;
                    System.out.printf("%d * %d =%3d   ", j, i, mult);
                }
                System.out.println();
            }
        }
    }
}
