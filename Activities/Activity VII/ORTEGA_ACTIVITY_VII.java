import java.util.Scanner;
    public class ORTEGA_ACTIVITY_VII {
      public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Please input a non-negative integer: ");
            int integer = sc.nextInt();

            long factorial = 1;
          
            for(int i = 1; i<=integer; i++) {
              factorial*=i;
            }
              System.out.println("Factorial of "+integer+" is "+factorial+".");
          
      }
    }