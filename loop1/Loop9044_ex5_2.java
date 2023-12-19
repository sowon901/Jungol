package loop1;
import java.util.*;

public class Loop9044_ex5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        int avg = 0;
        int count = 0;

        while(true) {
            int input = sc.nextInt();

            if(input%2==1) {
                total += input;
                count++;
                avg = (int)total/count;
            }
            if(input==0) {
                System.out.println("홀수의 합 = " + total);
                System.out.println("홀수의 평균 = " + avg);
                break;
            }

        }
    }
}

