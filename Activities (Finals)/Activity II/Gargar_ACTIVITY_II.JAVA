import java.util.Scanner;

public class GARGAR_ACTIVITY_II.JAVA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length in feet:");
        double feet = scanner.nextDouble();

        double inches = feetToInches(feet);

        System.out.println(feet + " feet is equal to " + inches + " inches.");

        scanner.close();
    }

    public static double feetToInches(double feet) {
        return feet * 12;
    }
}