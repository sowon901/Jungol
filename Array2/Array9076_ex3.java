package Array2;
import java.util.*;

public class Array9076_ex3 {

    public static int fibo(int num) {
        if(num==2||num==1) {
                return 1;
        }else {
            return fibo(num-1)+fibo(num-2);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++) {
            System.out.printf("피보나치 수열 %d항 : %d\n",(10+i*10), fibo(10+i*10));
        }
    }
}
