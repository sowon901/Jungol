package Array2;
import java.util.*;

public class Array9077_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = {{3,5,4},{2,6,7},{8,10,1}};


        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
