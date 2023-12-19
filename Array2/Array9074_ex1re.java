package Array2;
import java.util.*;

public class Array9074_ex1re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        while(true) {
            int input = sc.nextInt();
            if(input<1||input>10)
                break;

            array[input-1] +=1;
        }

        for(int i=0; i<array.length; i++){
            if(array[i]!=0)
                System.out.println((i+1) + " : " + array[i] + "개");
        }



    }
}
