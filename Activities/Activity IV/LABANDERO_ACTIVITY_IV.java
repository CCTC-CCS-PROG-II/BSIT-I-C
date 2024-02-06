import java.util.Scanner;
public class LABANDERO_ACTIVITY_IV{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String color;
        System.out.print("Enter the color: ");
        color = input.nextLine();

        switch(color){
            case "purple":
                System.out.println("8");
                break;
            case "pink":
                System.out.println("5");
                break;
            case "black":
                System.out.println("18");
                break;
        }
    }
}