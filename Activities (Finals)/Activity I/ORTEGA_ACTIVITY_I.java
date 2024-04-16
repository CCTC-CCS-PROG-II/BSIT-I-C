import java.util.Scanner;
  public class ORTEGA_ACTIVITY_I {
    public static void main (String []args){
      int length = getLength();
      int width = getWidth();
      int area = length * width;
      System.out.println("Area = "+area);
    }
    static int getLength(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of the rectangle: ");
      return sc.nextInt();
    }
    static int getWidth() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the width of the rectangle: ");
      return sc.nextInt();
    }
}
