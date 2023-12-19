package loop3;
import java.util.*;

public class Loop149_test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {

                if(odd>10)
                    odd=1;

                System.out.print(odd+" ");
                odd +=2;
            }
            System.out.println();
        }


    }
}
