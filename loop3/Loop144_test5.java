package loop3;
import java.util.*;

public class Loop144_test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=2*(n-i); j++)
                System.out.print(" ");

            for(int j=1; j<=2*i-1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
