import java.util.Scanner;

public class Villanueva_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);

        sc.close();
    }
}