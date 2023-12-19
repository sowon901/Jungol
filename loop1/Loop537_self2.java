package loop1;
import java.util.*;

public class Loop537_self2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int sum = 0;

        while(b<=a) {
            sum+= b;
            b++;
        }

        System.out.print(sum);

    }
}
