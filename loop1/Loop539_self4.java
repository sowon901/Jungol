package loop1;
import java.util.*;

public class Loop539_self4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0.0;
        int count = 0;
        while(true) {
            int input = sc.nextInt();
            sum += input;
            count++;
            avg = (double)sum/count;
            if(input>=100) {
                System.out.println(sum);
                System.out.printf("%.1f",avg);
                break;
            }

        }

    }
}
