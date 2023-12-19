package Array1;
import java.util.*;


public class Array9071_ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<10; i++) {
            input[i] = sc.nextInt();

            int abs = 0;
            abs = Math.abs(input[i]);

            if(abs%2==0)
                max = Math.max(max, input[i]);
            if(abs%2==1) {
                min = Math.min(min, input[i]);
            }
        }

        System.out.print(min + " " + max);

    }
}
