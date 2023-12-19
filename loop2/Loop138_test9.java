package loop2;
import java.util.*;

public class Loop138_test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int i=1; i<=input; i++) {
            for(int j=1; j<=input; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }

    }
}
