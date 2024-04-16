import java.util.Scanner;
public class TRIPLITT_ACTIVITY_II {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("enter the length in feet:");
    double feet = scan.nextDouble();

    double inches = feettoinches(feet);

    System.out.println(feet + " feet is equal to " + inches + " inches.");

    scan.close();
    }
    public static double feettoinches(double feet){
        return feet * 12;
    }
}