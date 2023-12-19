package loop3;
import java.util.*;
public class Loop9060_ex5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=5; i++) {
            for(int j=5-1; j>=i; j--)
                System.out.print(" ");

            for(int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
