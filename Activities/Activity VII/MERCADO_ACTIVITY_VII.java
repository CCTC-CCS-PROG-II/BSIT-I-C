import java.util.Scanner;

public class MERCADO_ACTIVITY_VII {
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);

        System.out.println("Please enter a Non-Negative integer: ");

        int number = sc.nextInt();
        long factorial= 1;
        for (int x=1; x<=number;x++){
            factorial*= x;
       }
       System.out.println("The Factorial of" + " " + number + " " + "is"  + " " +factorial);
}
}