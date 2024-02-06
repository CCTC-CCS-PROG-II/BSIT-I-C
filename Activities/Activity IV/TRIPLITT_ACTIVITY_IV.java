import java.util.Scanner;
public class TRIPLITT_ACTIVITY_IV {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Color of the Item: ");
        String color = scan.nextLine();
        
        switch (color) {
            case "red":
                System.out.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "black":
                System.out.println(3);
                break;
        }
    }
}