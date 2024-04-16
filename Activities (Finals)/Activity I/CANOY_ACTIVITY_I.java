import java.util.Scanner;

public class CANOY_ACTIVITY_I {
    public static void main(String args[]) {

        int length = getlength();
        int width = getWidth();
        int area = length * width;
        System.out.println("Area - " + area);
    }

    static int getlength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the rectangle");
        return input.nextInt();
    }

    static int getWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        return input.nextInt();
    }
}
