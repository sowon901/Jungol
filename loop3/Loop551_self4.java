package loop3;
import java.util.*;

public class Loop551_self4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=i-1; j>=1; j--)
                System.out.print(" ");
            for(int j=input; j>=i; j--)
                System.out.print("*");
            System.out.println();
        }

      /*  for(int i=input; i>=1; i--){

            for(int j=input-i; j>=1; j--)
                System.out.print(" ");
            for(int j=i; j>=1; j--)
                System.out.print("*");
            System.out.println();
        }*/
        sc.close();
    }
}
