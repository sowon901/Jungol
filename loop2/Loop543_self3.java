package loop2;
import java.util.*;

public class Loop543_self3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=1; i<=input; i++) {
            if(i%2!=0)
                continue;
            System.out.print(i + " ");
        }

    }
}
