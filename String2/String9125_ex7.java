package String2;
import java.util.*;

public class String9125_ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray =  {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        System.out.print("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(String s: strArray) {
            if(s.contains(ch+"")) {
                System.out.println(s);
                count++;
            }
            if(s.equals(strArray[strArray.length-1])&&count==0)
                System.out.println("찾는 단어가 없습니다.");
        }
        count=0;

        System.out.print("문자열을 입력하세요. ");
        String str = sc.next();
        for(String s: strArray){
            if(s.contains(str)){
                System.out.println(s);
                count++;
            }
            if(s.equals(strArray[strArray.length-1])&&count==0)
                System.out.println("찾는 단어가 없습니다.");
        }




    }
}
