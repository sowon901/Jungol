package Array2;
import java.util.*;

public class Array9078_ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];

        for(int i=0; i<array.length; i++) {
            System.out.printf("첫 번째 배열 %d행 " , (i+1));
            for(int j=0; j<array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<array.length; i++) {
            System.out.printf("두 번째 배열 %d행 ", (i+1));
            for(int j=0; j<array[i].length; j++) {
                int res = sc.nextInt();
                array[i][j] += res;
            }
        }

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }
}
