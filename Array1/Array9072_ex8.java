package Array1;
import java.util.*;

public class Array9072_ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];
        int total = 0;
        double avg = 0.0;

        for(int i=0; i<scores.length; i++) {
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        avg = (double)total/scores.length;

        System.out.println("총점 = " + total);
        System.out.println("평균 = " + avg);
    }
}
