import java.util.Scanner;
public class CANOY_PROG_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        int ans1 = num1+num2;
        int ans2 = num1-num2;
        int ans3 = num1*num2;

        System.out.println("Sum = "+ans1);
        System.out.println("Difference = "+ans2);
        System.out.println("Product = "+ans3);
    }
}