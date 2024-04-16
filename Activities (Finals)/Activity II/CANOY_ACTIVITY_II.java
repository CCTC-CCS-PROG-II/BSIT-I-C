import java.util.Scanner;

public class CANOY_ACTIVITY_II {
    static void convert(double feet) {
        int res = feet * 12;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the feet: ");
        int feet = input.nextInt();
        feetToInches(feet);
    }

}