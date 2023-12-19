package loop2;
import java.util.*;

public class Loop545_self5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeMult = 0;
        int fiveMult = 0;
        int count = 0;

        while(count<10) {
            int input = sc.nextInt();

            if((input%3==0)&&(input%5==0)) {
                threeMult++;
                fiveMult++;
            } else if(input%3==0)
                threeMult++;
            else if(input%5==0)
                fiveMult++;

            count++;
        }

        System.out.println("Multiples of 3 : " + threeMult);
        System.out.println("Multiples of 5 : " + fiveMult);
    }
}
