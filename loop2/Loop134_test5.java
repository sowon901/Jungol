package loop2;
import java.util.*;

public class Loop134_test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<10; i++) {
            array[i] = sc.nextInt();

            if(array[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("even : " + evenCount);
        System.out.println("odd : " + oddCount);

    }
}
