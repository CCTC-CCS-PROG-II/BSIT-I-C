import java.util.Scanner;

public class Lopez_activity_4

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the color of the item: ");
       String color = sc.nextLine();

switch (color) {
       case "red":
       System.out.println("1");
       break;

       case "green":
       System.out.println("2");
       break;

       case "black":
       System.out.println("3");
       }
    }
}
