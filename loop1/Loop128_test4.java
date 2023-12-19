package loop1;
import java.util.*;

public class Loop128_test4 {
    static int count=0;
    public static void Count() {
       count++;
    }

    public static int Result() {
        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            int input = sc.nextInt();

            if((input%3!=0)&&(input%5!=0)) {
                Count();
            }

            if(input==0) {
                System.out.println(Result());
                flag = false;
            }
        }

    }
}
