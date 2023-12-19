package loop2;

import java.util.*;

public class Loop546_self6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int[] score = new int[sub];
        int total = 0;
        double avg = 0.0;
        String result = null;

        for (int i = 0; i < sub; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        avg = (double) total / sub;

        if (avg >= 80) result = "pass";
        else result = "fail";

        System.out.printf("avg : %.1f\n%s", avg, result);

    }
}
