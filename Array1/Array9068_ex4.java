package Array1;
import java.util.*;

public class Array9068_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int index = 0;

        while(true) {

            array[index] = sc.nextInt();
            if(array[index]==0) {
                for(int i=0; i<index; i++) {
                    if(i%2==1)
                        System.out.print(array[i] + " ");
                }
                break;
            }
            index++;
        }

    }
}
