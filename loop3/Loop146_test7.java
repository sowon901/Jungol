package loop3;
import java.util.*;

public class Loop146_test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ch = 'A';
        int in = 0;

        for(int i=n; i>=1; i--) {
            for(int j=i; j>=1; j--) {
                System.out.print(ch + " ");
                ch++;
            }

            for(int j=n-1;  j>=i; j--) {
                System.out.print(in + " ");
                in++;
            }

            System.out.println();
        }

    }
}
