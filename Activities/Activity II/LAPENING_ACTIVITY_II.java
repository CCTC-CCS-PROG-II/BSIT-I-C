import java.util.Scanner;
public class LAPENING_ACTIVITY_II{
    public static void main (String []args){
        Scanner math = new Scanner(System.in);

        int x, y;

        System.out.println("Enter First Number: ");
        x = math.nextInt();

        System.out.println("Enter Second Number: ");
        y = math.nextInt();

        int sum = x + y;
        int dif = x - y;
        int pro = x * y;

        System.out.println("\nSum = "+ sum);
        System.out.println("Difference = "+ dif);
        System.out.println("Product = "+ pro);

 




    }
}