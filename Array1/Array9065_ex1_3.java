package Array1;
import java.util.*;

public class Array9065_ex1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=1; i<=5; i++) {
            array[i-1] = sc.nextInt();
            System.out.printf("%d ",array[i-1]);
        }
    }
}
