package JavaTest2;
import java.util.Scanner;
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
            if (y % 4 == 0 && y % 100 != 0 || y%400==0) {
            /*错误一：这里误将y写成ysum,导致循环遍历失效。*/
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
        System.out.print("日\t一\t二\t三\t四\t五\t六\n");
        int wholeDay=a+b+1;
        int week=wholeDay%7;
//        以此上2语句可推算出需要的空格数
        for(int weekDay=0;weekDay<week;++weekDay){
            System.out.print("\t");
        }
        int monthDays;
        switch(msum){
            case 4:
            case 6:
            case 9:
            case 11:
                monthDays=30;
                break;
            case 2:
                if(ysum % 4 == 0 && ysum % 100 != 0 || ysum%400==0){
                monthDays=29;
        }else{
                monthDays=28;
        }
        break;
            default:
                monthDays=31;
        }
        for(int weekDays=1;weekDays<=monthDays;++weekDays){
           /* 错误二：这里的print全部不带ln，目的是按行输出值。*/
            System.out.print(weekDays+"\t");
            if((a+b+weekDays)%7==6){
                System.out.print("\n");
            }
        }
    }
}