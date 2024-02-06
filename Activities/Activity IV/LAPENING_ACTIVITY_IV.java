import java.util.Scanner;
public class LAPENING_ACTIVITY_IV {
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);

        String Color;

        System.out.println("Please Enter Red, Green or Black:");
        Color = sc.nextLine();

        switch (Color)
        {
            case "Red":
            System.out.println("1");
            break;
            case "Green":
            System.out.println("2");
            break;
            case "Black":
            System.out.println("3");
            break;
        }
    }
}