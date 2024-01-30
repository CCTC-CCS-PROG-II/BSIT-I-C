import java.util.Scanner;
public class Fuentes_Activity_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int t = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
       
        int sum = t + y;
        int difference = t - y;
        int product = x * t;

        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
    }
}