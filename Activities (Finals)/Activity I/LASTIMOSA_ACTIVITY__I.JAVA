import java.util.Scanner;

public class LASTIMOSA_ACTIVITY_I {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = getDimension(scanner, "length");
        double width = getDimension(scanner, "width");

        double area = calculateArea(length, width);

        displayResult(area);

        scanner.close();
    }

    public static double getDimension(Scanner scanner, String dimensionName) {
        System.out.println("Enter the " + dimensionName + " of the rectangle:");
        return scanner.nextDouble();
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void displayResult(double area) {
        System.out.println("The area of the rectangle is: " + area);
    }
}
