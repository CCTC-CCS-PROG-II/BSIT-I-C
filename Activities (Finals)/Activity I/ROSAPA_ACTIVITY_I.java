import java.util.Scanner;

public class ROSAPA_ACTIVITY_I {
    public static void main(String []args){
        int length = getLength();
        int width = getWidth();
        int area = length * width;
        System.out.println("Area = " + area);
    }
    static int getLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        sc.close();
        return length;
    }
    static int getWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        sc.close();
        return width;
    }
}