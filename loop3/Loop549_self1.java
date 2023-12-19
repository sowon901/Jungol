package loop3;
import java.util.*;
public class Loop549_self1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add = 1;
        int total = 0;
        int count = 0;
        boolean flag = true;

        while(flag) {
            if(add%2==1) {
                count++;
                total+=add;
            }
            if(total>=n){
                System.out.print(count + " " + total);
                flag = false;
            }
            add++;
        }

    }
}
