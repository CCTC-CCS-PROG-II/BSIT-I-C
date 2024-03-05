import java.util.Scanner;
  public class ORTEGA_ACTIVITY_I {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] names = new String[5];

        for(int x = 0; x<names.length; x++) {
          System.out.println("Enter a name: "+(x + 1)+ ": ");
          names[x]= sc.nextLine();
        }
       System.out.println("Enter a number: ");
       int index = sc.nextInt();

       if (index >= 1 && index <= names.length) {
        System.out.println("You've selected " + names[index - 1] + ".");
        
      }else {
        System.out.println("Invalid");
      }

    }
  } 