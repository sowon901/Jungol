package String1;
import java.util.*;

public class String9117_ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int index = 1;

        while(true) {
            StringBuilder strBuilder = new StringBuilder(str.substring(index));

            strBuilder.append(str.substring(0,index));

            System.out.println(strBuilder);
            count++;
            index++;
            if(count==str.length())
                break;
        }


    }
}
