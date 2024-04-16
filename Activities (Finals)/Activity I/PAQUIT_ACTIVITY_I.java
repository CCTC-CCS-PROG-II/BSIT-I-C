import java.util.Scanner;
public class PAQUIT_ACTIVITY_IV{
    public static void main(String[] args){
    }
        int length = getlength();
        int width = getwidth();
        int area = length*width;
        System.out.println("Area = " + area);
    }
    static int getlength(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input you length");
        return input.nextInt();
    }
    static int getWidth(){
        Scanner input = new Scanner (System.in);
        System.out.println("Input your Width");
        return input.nextInt();
}
