package Array1;
import java.util.*;

public class Array9073_ex9 {
    public static void main(String[] args) {
        int[] array = {95,75,85,100,50};
        //ArrayList<Integer> arrays = new ArrayList<>();
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]>=array[j]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
    }
}
