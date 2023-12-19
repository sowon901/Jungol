package loop3;
import java.util.*;

public class Loop141_test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        int mult;

        while(true) {
            mult = input*count;

            if(mult>100)
                break;

            System.out.print(mult+" ");

            if(mult%10==0)
                break;

            count++;
        }
    }
}
