package loop3;
import java.util.*;

public class Loop550_self3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for(int i = 1; i<=input; i++) {
            for(int j = input; j>=i; j--)
                System.out.print("*");
            System.out.println();
        }

        for(int i = 1; i<=input; i++) {
            for(int j = 1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
