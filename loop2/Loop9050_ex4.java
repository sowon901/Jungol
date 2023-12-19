package loop2;
import java.util.*;

public class Loop9050_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int total = 0;

        for(int i=1; i<=input; i++)
            total += i;

        System.out.print(total);
    }
}
