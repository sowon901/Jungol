package loop3;
import java.util.*;

public class Loop9055_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int total = 0;
        int add = 1;

        while(true) {
            total +=add;

            if(total>input) {
                System.out.print(add+ " " +total);
                break;
            }
            add++;

        }

    }
}
