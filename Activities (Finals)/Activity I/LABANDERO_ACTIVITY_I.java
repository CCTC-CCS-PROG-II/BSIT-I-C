import java.util.Scanner;
public class LABANDERO_ACTIVITY_I {
    public static void main(String []args){
       int length = getlength();
       int width = getWidth();
       int area = length * width;
       System.out.println("Area = " + area);
    }
    static int getlength(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the length of the rectangle: ");
        return sc.nextInt();
    }
    static int getWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        return sc.nextInt();
    }
}
