import java.util.Scanner;
      public class HEYRES_ACTIVITY_IV {
        public static void main (String []args) {
          Scanner scanner = new Scanner(System.in);

          String color;

          System.out.println("Enter a color: ");
          color = scanner.nextLine();

          switch (color) {
            case "blue":
            System.out.println("1");
            break;
            
            case "green":
            System.out.println("2");
            break;

            case "black":
            System.out.println("3");
            break;
            
          }

          
      
        }
      }  