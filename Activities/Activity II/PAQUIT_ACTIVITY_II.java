import java.util.Scanner;
public class PAQUIT_ACTIVITY_II {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
       
        int sum = x + y;
        int difference = x - y;
        int product = x * y;

        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
    }
}
