import java.util.Scanner;
public class VILLAVER_ACTIVITY_I{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String [] names = new String[5];

    for(int i = 0; i < names.length; i++){
            System.out.print("Enter a name" + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter the number on the list of names: ");
        int index=sc.nextInt();

        if(index >= 1 && index <= names.length){
            System.out.println("You have Selected" + names[index - 1] + ".");
        } else {
            System.out.println("invalid index");
        }

    }
}