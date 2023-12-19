package loop2;
import java.util.*;

public class Loop548_self8 {
    public static void main(String[] args) {
        int mult = 0;
        for(int i=2; i<=4; i++) {
            for(int j=1; j<=5;j++) {
                mult = i*j;
                System.out.printf("%d * %d =%3d   ", i, j, mult);
            }
            System.out.println();
        }
    }
}
