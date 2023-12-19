package loop2;
import java.util.*;

public class Loop544_self4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        for(int i=input; i<=100; i++) {
            sum+=i;
        }
        System.out.print(sum);
    }
}
