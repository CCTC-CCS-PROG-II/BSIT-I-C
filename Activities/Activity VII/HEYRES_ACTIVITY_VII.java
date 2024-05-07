import java.util.Scanner; class HEYRES_ACTIVITY_VII{

}

public class HEYRES_ACTIVITY_VII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a negative integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i=1; i <= num; i++){
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        scanner.close();
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
