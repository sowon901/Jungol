package loop2;
import java.util.*;

public class Loop9054_ex8 {
    public static void main(String[] args) {
        int mult = 0;
        for(int i=1; i<10; i++) {
            for(int j=2; j<5; j++) {
                mult = i*j;
                System.out.printf("%d * %d =%3d   ", j , i, mult);
            }
            System.out.println();
        }
    }
}
