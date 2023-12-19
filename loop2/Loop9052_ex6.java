package loop2;
import java.util.*;

public class Loop9052_ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int total = 0;
        double avg = 0.0;

        for(int i=0; i<score.length; i++)
            score[i] = sc.nextInt();

        for(int i=0; i<score.length; i++)
            total += score[i];

        avg = (double)total/score.length;

        System.out.println("총점 : " + 429);
        System.out.printf("평균 : %.1f" , avg);
    }
}
