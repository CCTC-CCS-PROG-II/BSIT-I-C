import java.util.Scanner;

public class BRONCANO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println( "Enter First Number:");
        int num1 = sc.nextInt();

        System.out.print( "Enter Second Number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1*num2;

        System.out.println("Sum=" + sum);
        System.out.println("Difference ="+ diff);
        System.out.println("Product =" + prod);


    }
}

