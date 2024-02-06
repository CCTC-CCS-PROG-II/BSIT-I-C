import java.util.Scanner;
public class SALVADOR_ACTIVITY_IV {
 public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);

   System.out.print("Enter a color (1 for red, 2 for green, 3 for black): ");
   String colorCode = sc.nextLine();

   switch(colorCode) {
      case "Red":
          System.out.println("1");
          break;
      case "Green":
         System.out.println("2");
         break;
      case "Black":
         System.out.println(x:"3");
         break;
     }
   }
}

