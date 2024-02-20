import java.util.Scanner

public class ARNIDO_ACTIVITY_VII {
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        long factorial = 1;

        for (int i = 1; <=num; i++) {
            factorial *=i;
        }
        System.out.println("The Factorial of " + number + " is: " + factorial);
    }
}