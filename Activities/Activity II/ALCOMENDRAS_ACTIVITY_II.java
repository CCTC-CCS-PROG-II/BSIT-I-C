import java.util.Scanner;

public class ALCOMENDRAS_ACTIVITY_II {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your First Number: ");
        int num1= sc.nextInt();
        System.out.print("Enter your Second Number: ");
        int num2= sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("Sum =" +sum);
        System.out.println("Difference =" +difference);
        System.out.println("Product =" +product);





        
    }
}