package Array2;
import java.util.*;

public class Array9080_ex7 {
    public static void main(String[] args) {
        int[][] array= new int[5][5];

        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                if(j==0||j==i)
                    array[i][j] = 1;
                else
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
            }
        }

        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
