package loop2;
import java.util.*;

public class Loop136_test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int mult = 0;

        for(int i=1; i<=10; i++) {
            mult = input*i;
            System.out.print(mult + " ");
        }
    }
}
