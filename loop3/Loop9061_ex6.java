package loop3;
import java.util.*;

public class Loop9061_ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                count++;
                System.out.print(count+" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
