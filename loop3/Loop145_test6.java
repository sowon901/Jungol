package loop3;
import java.util.*;

public class Loop145_test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int count = 1;

            for(int j=1; j<=2*(n-i); j++)
                System.out.print(" ");

            for(int j=1; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }
}
