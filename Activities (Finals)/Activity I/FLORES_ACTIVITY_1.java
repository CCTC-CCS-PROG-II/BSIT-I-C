import java.util.Scanner;
public class FLORES_ACTIVITY_1 {
    public static void main(String args[]) 
    {   

        int length = getlength();
        int width = getWidth() ;
        int area = length*width;
         System.out.println("Area - " + area);    
   }
   static int getlength(){
      Scanner input = new Scanner (System.in);
      System.out.println("Input your Length");
      return input.nextInt();
   }
   static int getWidth(){
      Scanner input = new Scanner (System.in);
      System.out.println("Input your Width");
      return input.nextInt();
}
}
