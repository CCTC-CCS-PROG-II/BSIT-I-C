import java.util.Scanner; 
public class FUENTES_ACTIVITY_IV{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        String color;
        System.out.println("Enter color");
        color = input.nextLine();

        
        switch (color){
             case "red":
                System.out.println(1);
                break;
             case "green":
                System.out.println(2);
                break;
             case "black":
                System.out.println(3);
                break;   
        }
    }
}               
            

