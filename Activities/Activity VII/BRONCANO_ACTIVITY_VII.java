import java.util.Scanner;

public class BRONCANO_ACTIVITY_VII {
    public static void main(String []args) {
        Scanner sc= new Scanner (System.in);

        System.out.print("Enter Factional Number:");
        long number =sc.nextInt()
        fact = 1;
        for (long x=1;x<=number;x++){
            fact*=x;
        }
        System.out.print(fact);
        sc.close();
    }
}
