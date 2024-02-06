import java.util.Scanner;

public class ciro_activity_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color (red, green, or black): ");
        String color = scanner.nextLine();

        int boxNumber = categorizeColor(color);
        System.out.println("The item goes to box #" + boxNumber);
    }

    public static int categorizeColor(String color) {
        switch (color) {
            case "red":
                return 1;
            case "green":
                return 2;
            case "black":
                return 3;
            default:
                System.out.println("Invalid color entered.");
                return -1;
        }
    }
}
        

            