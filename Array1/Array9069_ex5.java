package Array1;
import java.util.*;


public class Array9069_ex5 {
    static Scanner sc = new Scanner(System.in);
    public static int CalcDay(int year, int month) {
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(year%400==0) {
                months[1] = 29;
        }else {
            if((year%4==0)&&(year%100!=0))
                months[1] = 29;
        }

        return months[month-1];
    }


    public static void main(String[] args) {

        while(true) {
            System.out.print("YEAR = ");
            int year = sc.nextInt();
            System.out.print("MONTH = ");
            int month = sc.nextInt();


            if (month > 0 && month < 13)
                System.out.println("입력하신 달의 날 수는 " +  CalcDay(year, month) + "일입니다.");
            else {
                if (month == 0)
                    break;
                else System.out.println("잘못 입력하였습니다.");
            }

        }

    }
}
