import java.util.Scanner;

public class ROSAPA_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lenght in feet: ");
        double num = sc.nextDouble();
        convertToInches(num);
        sc.close();
    }

    static void convertToInches(double num) {
        double inches = num * 12;
        System.out.println("Converted to inches: " + inches);
    }
}