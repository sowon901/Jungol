package Array2;
import java.util.*;

public class Array9075_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        while(true) {
            int input = sc.nextInt();

            if(input==0) {
                for(int i=0; i<10; i++) {
                    if(array[i]!=0)
                        System.out.println(i + " : " + array[i] + "개");
                }
                break;
            }

            array[input%10]++;

        }

    }
}
