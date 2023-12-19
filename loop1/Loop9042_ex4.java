package loop1;
import java.util.*;

public class Loop9042_ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        float avg = 0.00f;

        while(true) {
            int a = sc.nextInt();

            if(a==0) {
                System.out.println("입력된 자료의 개수 = " + count);
                System.out.println("입력된 자료의 합계 = " + total);
                System.out.printf("입력된 자료의 평균 = %4.2f" , avg );
                break;
            }

            total+= a;
            count++;
            avg = (float)total/count;

        }
    }
}
