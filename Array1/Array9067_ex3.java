package Array1;
import java.util.*;

public class Array9067_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i=0; i<array.length; i++)
            array[i] = sc.nextInt();

        System.out.print(array[2] +" " + array[4] + " " + array[array.length-1]);

    }
}
