package loop1;
import java.util.*;

public class Loop9045_ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");

            int input = sc.nextInt();


            if(input==1)
                System.out.println("\n입력하기를 선택하였습니다.\n");
            else if(input==2)
                System.out.println("\n출력하기를 선택하였습니다.\n");
            else if (input==3)
                System.out.println("\n삭제하기를 선택하였습니다.\n");
            else if (input==4) {
                System.out.println("\n끝내기를 선택하였습니다.\n");
                break;
            }
            else System.out.println("\n잘못 입력하였습니다.\n");
    }
    }
}
