import java.util.Scanner;
public class TRIPLITT_ACTIVITY_I {
public static void main(String[] args) {
    int length = getLength();
    int width = getWidth();
    int area = length * width;
    System.out.println(area * area);

    }
    static int getLength(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your Length: ");
        return scan.nextInt();
    }
    static int getWidth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your Width: ");
        return scan.nextInt();
    }
}
