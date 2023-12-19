package Array1;
import java.util.*;

public class Array9066_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = new char[26];

        for(int i=25; i>=0; i--) {
            ch[i] = (char)('A'+i);
            System.out.print(ch[i] + " ");
        }
    }
}
