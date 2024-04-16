import java.util.Scanner;
class LABADLABAD_ACTIVITY_I{
    public static void main(String[] args){
       int length = getLength();
       int width = getWidth();
       int area = length*width;
       System.out.println("The area of the rectangle is: " + area);
    }
        static int getLength(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of length: ");
            return sc.nextInt();
        }
        static int getWidth(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of width: ");
            return sc.nextInt();
}
}