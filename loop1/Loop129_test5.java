package loop1;
import java.util.*;


class Input {
    int base;
    int height;
    double width = 0.0;

    public void Base(int base) {
        this.base = base;
    }

    public void Height(int height) {
        this.height = height;
    }
    public double getWidth() {
        width = (double)base*height/2;
        return width;
    }

}

public class Loop129_test5 {

    public static void main(String[] args) {

        Input in = new Input();
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Base = ");
            int base = sc.nextInt();
            in.Base(base);

            System.out.print("Height = ");
            int height = sc.nextInt();
            in.Height(height);

            System.out.printf("Triangle width = %.1f\n" , in.getWidth());
            System.out.print("Continue? ");
            char ans = sc.next().charAt(0);

            if(ans=='Y'||ans=='y') continue;
            else break;

        } while(true);

    }
}
