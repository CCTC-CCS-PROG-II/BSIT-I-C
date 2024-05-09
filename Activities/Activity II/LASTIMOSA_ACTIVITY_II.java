import java.util.Scanner;

public class LASTIMOSA_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fnum = input.nextInt();
        System.out.print("Enter second number: "); 
        int snum = input.nextInt();

        int subtract = fnum - snum;
        int add = fnum + snum;
        int product = fnum * snum;

        System.out.println("Difference = " + subtract);
        System.out.println("Sum = " + add);
        System.out.println("Product = " + product);
    }
}
