package String2;
import java.util.*;

public class String9127_ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> strArray = new ArrayList<>();

        System.out.println("단어 5개를 입력하세요.");
        for(int i=0; i<5; i++) {
            String str = sc.next();
            strArray.add(str);
        }

        Collections.sort(strArray);

        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
