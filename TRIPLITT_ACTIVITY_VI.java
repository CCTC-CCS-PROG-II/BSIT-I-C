import java.util.Scanner;

public class TRIPLITT_ACTIVITY_VI{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter number to countdown: ");
        int secs = scan.nextInt();
        
        while(secs >= 0){
            System.out.println(secs);
            secs--;
        }
    }   
}    