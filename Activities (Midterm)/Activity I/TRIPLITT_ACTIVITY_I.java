import java.util.Scanner;

public class TRIPLITT_ACTIVITY_I {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        String [] name = new String[5];

        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter name: ");
            name[i] = sc.nextLine();
        }
        System.out.println("Enter the number on the list of names you want to display: ");
        int index = sc.nextInt();

        if (index >= 1 && index <= name.length){
            System.out.println("you have selected " + name[index - 1] + ".");
        } else {
            System.out.println("Invalid index");
        }

    }
}
    