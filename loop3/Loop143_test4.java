package loop3;
import java.util.*;

public class Loop143_test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>=1; i--) {

            for(int j=n; j>=i+1; j--)
                System.out.print(" ");

            for(int j=i*2-1; j>=1; j--)
                System.out.print("*");

            System.out.println();
        }

        for(int i=1; i<=n-1; i++) {

            for(int j=n-1; j>i; j--)
                System.out.print(" ");


            for(int j=1; j<=i*2+1; j++)
                System.out.print("*");

            System.out.println();
        }

    }
}
