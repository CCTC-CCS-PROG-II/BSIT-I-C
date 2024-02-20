import java.util.Scanner;
public class CABISAS_ACTIVITY_VII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a non-negative integer: ");

        int num = sc.mextInt();

        long factorial = 1;
        for(int i = 1; i <= num; i++){
           factorial *= i;
        }
           System.out.println("The factorial of " + num + " is " + factorial);      
    }
}
