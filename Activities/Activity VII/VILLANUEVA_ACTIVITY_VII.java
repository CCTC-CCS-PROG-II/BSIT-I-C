import java.util.Scanner;
public class VILLANUEVA_ACTIVITY_VII {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        long factorial = 1;

        System.out.println("Enter a Non-Negative Integer:");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            factorial*= i;
        }
        System.out.println("The Factorial of "+num+" is: "+factorial);
    }
}
