package loop3;
import java.util.*;

public class Loop9059_ex5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=5; i++) {
            for(int j=4; j>=i; j--)
                System.out.print(" ");

            for(int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
