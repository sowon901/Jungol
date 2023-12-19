package Array2;

import java.util.*;

public class Array9079_ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[4][4];

        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+ "번째 학생의 점수 ");
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
                array[i][3] += array[i][j];
                array[3][j] += array[i][j];
                array[3][3] += array[i][j];
            }
        }

        System.out.printf("     국어 영어 수학 총점\n");

        for(int i=0; i<4; i++) {
            if(i==3) {
                System.out.print("합계");
            } else  {
                System.out.printf(" %d번",(i+1));
            }

            for(int j=0; j<4; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

    }
}
