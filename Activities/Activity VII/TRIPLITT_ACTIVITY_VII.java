import java.util.Scanner;

public class TRIPLITT_ACTIVITY_VII{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("The factorial of" + " " + "is" + " " + num + " " + factorial);
    }
}    