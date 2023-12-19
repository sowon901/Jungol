package loop2;
import java.util.*;
public class Loop132_test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        int input = sc.nextInt();

        for(int i=1; i<=input; i++) {
            if (i % 5 == 0)
                total += i;
        }
        System.out.println(total);
    }
}
