package Array2;
import java.util.*;

class Count{
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public void StoreInt(int[] array) {
        for(int i: array) {
            if(i==0)
                break;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
    }

    public void ReturnInt() {
        for(int i: map.keySet()) {
            System.out.println(i + " : " + map.get(i) + "개");
        }
    }
}

public class Array9074_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count c = new Count();
        int[] array = new int[10];

        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
            if(array[i]==0||array[i]>10)
                break;
        }
        c.StoreInt(array);
        c.ReturnInt();
    }
}
