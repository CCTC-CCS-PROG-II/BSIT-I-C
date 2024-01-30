import java.util.Scanner;
public class LABANDERO_ACTIVITY_II {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
       
        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
    }
}
