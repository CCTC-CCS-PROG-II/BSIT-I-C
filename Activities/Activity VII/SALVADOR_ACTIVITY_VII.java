import java.util.Scanner;
public class SALVADOR_ACTIVITY_VII {
    public static void main(String) []args) {
      Scanner sc = new Scanner(System.in);
        Long factorial = 1;

          System.out.print(s:"Please input a non-negative integer: ");
          Long integer = sc.nextLong();

          for(Long x = 1; x<=integer; x++) {
            factorial*=x;
          }
            System.out.println("Factorial of "+integer+" is "+factorial+".");

        }
    }
