package loop1;
import java.util.*;

class Odd {
    int oddCount = 0;

    public void CountOdd(int input) {
        oddCount ++;
    }

    public int OddResult() {
        return oddCount;
    }

}
class Even {

    int evenCount=0;

    public void CountEven(int input) {
        evenCount ++;
    }

    public int EvenResult() {
        return evenCount;
    }

}

public class Loop126_test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Odd od = new Odd();
        Even ev = new Even();

        while(true) {
            int input = sc.nextInt();

            if(input==0) {
                System.out.println("odd : " + od.OddResult());
                System.out.println("even : " + ev.EvenResult());
                break;
            }

            if(input%2==1) {
                od.CountOdd(input);
            }else {
                ev.CountEven(input);
            }
        }

    }
}
