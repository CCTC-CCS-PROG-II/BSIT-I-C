
import java.util.Scanner;
public class LUGATIMAN_ACTIVITY_I {
    public static void main(String[]args){
     int length= getLength();
     int width= getWidth();
     int area= length*width;
     system.out.println("The area of the rectangle is: " +area);

        static int getLength(){
            Scanner sc=  new Scanner(System.in);
            System.out.println("Enter the value of the length: ");
            return= sc.nextInt();
        }

        static int getWidth(){ 
            Scanner sc=  new Scanner(System.in);
            System.out.println("Enter the value of the width: ");
            return= sc.nextInt()
        }
    }
    
}
