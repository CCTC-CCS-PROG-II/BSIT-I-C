import java.util.Scanner;
public class LOPEZ_ACTIVITY_VII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a non-negative integer: ");
        
        int num= input.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= 1;
        }
            System.out.println("The factorial of " + num + " is 5" + factorial);

     }
  }

