package loop1;

public class Loop9040_ex2 {
    public static void main(String[] args) {
        int num = 1;
        int total = 0;
        while(num<=10) {
            total += num;
            num++;
        }


        System.out.println("1부터 10까지의 합 = " + total);
        System.out.println("while문이 끝난 후의 num의 값 = " + num);
    }
}
