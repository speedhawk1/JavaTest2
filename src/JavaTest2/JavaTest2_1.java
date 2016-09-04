package JavaTest2;
import java.util.Scanner;
/**
 * Created by Administrator on 2016/9/4.
 */
public class JavaTest2_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String ans="";
        do{
            System.out.println("编程。。。");
            System.out.println("合格吗");
            ans=input.next();
        }while ("不合格".equals(ans) || "no".equals(ans));
    }
}
