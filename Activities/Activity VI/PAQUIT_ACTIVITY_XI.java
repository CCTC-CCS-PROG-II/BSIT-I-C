import java.util.Scanner;
public class PAQUIT_ACTIVITY_XI {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int seconds = sc.nextInt();

        while(seconds >= 0){
            System.out.println(seconds);
            seconds--;
        }    
    }
}