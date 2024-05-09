import java.util.Scanner;

public class LASTIMOSA_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int count = sc.nextInt();
        
        while (count >= 0) {
            System.out.println("Countdown: " + count);
            count--;
        }
        
        System.out.println("Countdown complete!");
    }
}
