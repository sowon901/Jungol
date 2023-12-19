package loop2;
import java.util.*;

public class Loop135_test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int total = 0;
        double avg = 0.0;

        int max = Math.max(a, b);
        int min = Math.min(a,b);
        int count = 0;

        for(int i=min; i<=max; i++) {
            if((i%3==0)||(i%5==0)) {
                total += i;
                count++;
            }
        }

        avg= (double)total/count;

        System.out.printf("sum : %d\navg : %.1f", total, avg);

        scanner.close();
    }
}
