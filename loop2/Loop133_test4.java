package loop2;
import java.util.*;

public class Loop133_test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        double avg = 0.0;

        for(int i =0; i<num; i++) {
            int input = sc.nextInt();
            total += input;
        }
        avg = (double)total/num;

        System.out.printf("%.2f",avg);

    }
}
