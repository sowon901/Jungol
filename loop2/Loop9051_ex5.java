package loop2;
import java.util.*;

public class Loop9051_ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i=0; i<10; i++) {
            int input = sc.nextInt();
            if(input%2==0)
                count++;
        }
        System.out.println("입력받은 짝수는 " + count + "개입니다.");
    }
}
