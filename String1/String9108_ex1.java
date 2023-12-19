package String1;
import java.util.*;

public class String9108_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array = new ArrayList<>();
        while(true) {
            char ch = sc.next().charAt(0);
            array.add(ch);
            if(ch=='0') {
                for (Character c : array) {
                    System.out.println(c + " -> " + (int)c);
                }
                break;
            }

        }

    }
}
