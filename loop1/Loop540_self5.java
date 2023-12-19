package loop1;
import java.util.*;

public class Loop540_self5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int input = sc.nextInt();

            if(input%3==0) {
                int share = 0;
                share = input/3;
                System.out.println(share );
            }else {
                if(input==-1)
                    break;
                continue;
            }

        }

    }
}
