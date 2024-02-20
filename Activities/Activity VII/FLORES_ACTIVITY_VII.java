package FLORES_ACTIVITY_VII;
import java.util.Scanner;
public class FLORES_ACTIVITY_VII {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a non-negative number:");
        int num = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i<= num; i++) {
            factorial *= 1;
        }
        System.out.println("The Factorial of "+ num + "factorial");
        
    }
}