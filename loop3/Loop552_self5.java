package loop3;
import java.util.*;

public class Loop552_self5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=input; i>=1; i--) {

            for(int j = input-1; j>=i; j--)
                System.out.print(" ");

            for(int j = i*2-1; j>=1; j--)
                System.out.print("*");

            System.out.println();
        }

    }
}
