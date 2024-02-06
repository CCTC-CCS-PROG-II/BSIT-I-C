import java.util.Scanner;
public class CABISAS_ACTIVITY_IV{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String color;
        System.out.print("Enter the color: ");
        color = input.nextLine();

        switch (color){
            case "green":
                System.out.println("1");
                break;
            case "yellow":
                System.out.println("2"); 
                break;
            case "blue":
                System.out.println("3");
                break;
        }
    }
}                



        