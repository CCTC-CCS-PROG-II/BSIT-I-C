import java.util.Scanner;

public class PADAYAO_ACTIVITY_IV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color;

        System.out.println("Enter your color you want to display (Red, Green, Black)");
        color = scanner.nextLine();

        switch (color) {
            case "Red":
                System.out.println("1");
                
                break;
            case "Green":
                System.out.println("2");
                
                break;
            case "Black":
                System.out.println("3");
                
                break;
            default:
                System.out.println("Invalid choice. Please enter Red, Green, or Black.");
                break;
        }

       
    }
}