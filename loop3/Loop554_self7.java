package loop3;
import java.util.*;

public class Loop554_self7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int in = 1;
        char ch = 'A';

        for(int i=1; i<=input; i++) {
            for(int j=input; j>=i; j--){
                System.out.print(in + " ");
                in++;
            }

            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
