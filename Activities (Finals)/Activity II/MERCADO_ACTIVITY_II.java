import java.util.Scanner; 

public class MERCADO_ACTIVITY_II {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter feet: ");
        int num= sc.nextInt();
        ConvertToInches(num);
        sc.close();

    }

    static void ConvertToInches(int num){
    int inches= num*12;
    System.out.println("The inches of feet is: " +inches);
    }
}
