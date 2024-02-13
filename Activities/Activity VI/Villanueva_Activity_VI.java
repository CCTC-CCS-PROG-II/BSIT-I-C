import java.util.Scanner;
  public class Villanueva_Activity_VI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        while(seconds >= 0) {
            System.out.println(seconds);
            seconds --;
            

        }
    }
  }
