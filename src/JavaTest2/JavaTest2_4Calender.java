package JavaTest2;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/4.
 */
public class JavaTest2_4Calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Year,Month and Day");
        int ysum = input.nextInt();
        int msum = input.nextInt();
        int dsum = input.nextInt();
        int a = 0;
        int b = 0;
        for (int y = 1900; y < ysum; ++y) {
            if (ysum % 4 == 0 && ysum % 100 != 0 || ysum%400==0) {
                a += 366;
            } else {
                a += 365;
            }
        }
        for (int m = 1; m < msum; ++m) {
            switch (m) {
                case 4:
                case 6:
                case 9:
                case 11:
                    b += 30;
                    break;
                case 2:
                    if (ysum % 4 == 0 && ysum % 100 != 0 || ysum%400==0) {
                        b += 29;
                    } else {
                        b += 28;
                    }
                    break;
                default:
                    b += 31;
                    break;
            }
        }
        int n=a+b+dsum;
        System.out.println(n);
        int x = n % 7;
        if (x == 0) {
            System.out.println("今天是星期日");
        } else {
            System.out.println("今天是星期" + x);
        }
    }
}