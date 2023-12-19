package String2;
import java.util.*;

public class String9128_ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int integer1 = sc.nextInt();
        int integer2 = sc.nextInt();

        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();

        System.out.println(integer1 + " + " + integer2 + " = " + (integer1+integer2));
        System.out.printf("%.2f + %.2f = %.2f", double1, double2, (double1+double2));

    }
}
