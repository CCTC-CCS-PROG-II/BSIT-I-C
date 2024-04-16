import java.util.Scanner;


public class MERCADO_ACTIVITY_I {
    public static void main(String[] args) {
        int length = Length();
        int width = Width();
        int area= length* width;
        System.out.println("Area =" + area);
    } 

     
        static int Length () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of thev rectangle: ");
        return sc.nextInt();

         }
     static int Width (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter width of thev rectangle: ");
        return sc.nextInt();
     }


}
