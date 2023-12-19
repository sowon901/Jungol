package String1;
import java.util.*;

public class String9113_ex5 {
    public static void main(String[] args) {
        String str1 = "우리나라 대한민국! ";
        String str2 = "위 문자열의 길이는 입니다.";
        String result = str1+str2;
        int length = result.length();
        char[] ch = new char[length];

        for(int i=0; i<length; i++) {
            ch[i] = result.charAt(i);
        }

        for(int i=0; i<length; i++) {
            if(i==str1.length())
                System.out.println();
            if(ch[i]=='입') {
                System.out.print(length);
            }
            System.out.print(ch[i]);
        }

    }
}
