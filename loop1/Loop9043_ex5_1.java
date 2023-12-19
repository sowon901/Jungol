package loop1;
import java.util.*;

public class Loop9043_ex5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddtotal = 0;

        int avg = 0;
        int count = 0;

        while(true) {
            int input = sc.nextInt();

            if(input%2==1) {
                oddtotal += input;
                count++;
                avg = (int)oddtotal/count;
            }
            if(input==0) {
                System.out.println("홀수의 합 = " + oddtotal);
                System.out.println("홀수의 평균 = " + avg);
                break;
            }

        }
    }
}
