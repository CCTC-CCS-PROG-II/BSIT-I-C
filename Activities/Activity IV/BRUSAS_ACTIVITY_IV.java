import java.util.Scanner;
public class BRUSAS_ACTIVITY_II_Activity_IV {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String color;
        System.out.print("Enter color");
        color = input.nextLine();

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
