import java.util.Scanner;
public class ROSAPA_ACTIVITY_VI {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


       System.out.print("Enter the number of Seconds: ");
       int timer = sc.nextInt();

        while (timer >= 0){
            System.out.println(timer);
            timer--;


        }
    }
}
