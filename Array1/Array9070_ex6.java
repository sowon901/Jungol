package Array1;
import java.util.*;

public class Array9070_ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<10; i++) {
            array[i] = sc.nextInt();
            max = Math.max(max, array[i]);
        }

        System.out.println(max);


        sc.close();
    }
}
