package loop3;
import java.util.*;

public class Loop140_test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int avg = 0;
        int count = 0;

        for(int i=1; i<=20; i++) {
            int input = sc.nextInt();

            if(input==0) {
                break;
            }

            total+=input;
            count++;
            avg = total/count;
        }

        System.out.print(total + " " + avg);
    }
}
