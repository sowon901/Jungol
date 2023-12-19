package loop3;
import java.util.*;

public class Loop147_test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 1;

        for(int i=1; i<=n; i++) {

            for(int j=1; j<i; j++)
                System.out.print("  ");

            for(int j=n; j>=i; j--) {
                System.out.print(in + " ");
                in++;
            }

            System.out.println();
        }
    }
}
