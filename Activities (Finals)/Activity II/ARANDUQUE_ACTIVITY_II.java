import java.util.Scanner;
public class ARANDUQUE_ACTIVITY_II {
     
    public static void main(String []args){
        System.out.print("enter feet/foot");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
    static void convert(double num){
        System.out.println(num * 12);
    }
}