import java.util.Scanner;
public class PRAHINOG_ACT_IV{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number only 1-3: ");

       String color = sc.nextLine();

switch (color){
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
