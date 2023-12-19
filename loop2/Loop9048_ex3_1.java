package loop2;
import java.util.*;

public class Loop9048_ex3_1 {
    public static void main(String[] args) {
        for(int i=1; i<21; i++) {
            if(i%2==0)
                continue;
            System.out.print(i + " ");
        }
    }
}
