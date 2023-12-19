package String2;
import java.util.*;

public class String9129_ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        String str = String.format("%.2f",d1) + String.format("%.2f",d2) + String.format("%.2f",d3);

        for(char ch: str.toCharArray()) {
            if(ch=='.')
                System.out.println();
            else
                System.out.print(ch);
        }



    }
}
