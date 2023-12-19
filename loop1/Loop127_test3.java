package loop1;
import java.util.*;

public class Loop127_test3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        double avg = 0.0;

        while(true) {
            int input = sc.nextInt();

            if(input<0||input>100) {
                System.out.printf("sum : %d\n",  total);
                System.out.printf("avg : %.1f\n" , avg);
                break;
            }

            total+= input;
            count++;
            avg = (double)total/count;


        }

    }
}
