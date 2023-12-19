package String2;
import java.util.*;

public class String9120_ex2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput = sc.nextLine();
        int count = 1;

        for(char ch: strInput.toCharArray()) {
            if(ch==' ')
                count++;
        }

        String[] str = new String[count];
        int index = 0;

        for(int i=0; i<count; i++)
            str[i] = "";

        for(int i=0; i<strInput.length(); i++) {
            if(strInput.charAt(i)!=' ') {
                str[index] += strInput.charAt(i);
            }
            else
                index++;
        }

        for(String s: str)
            System.out.println(s);



    }
}
