import java.util.Scanner;
public class LIMBAGA_ACTIVITY_IV {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the color: ");

        String color = sc.nextLine();

        switch (color) {
            case "blue":
                 System.out.println("1");
                 break;
            case "black":
                 System.out.println("2");   
                break;
            case "purple":
                 System.out.println("3");
               break;
        }
        
          
        }
    }