import java.util.Scanner;
    public class CANONEO_ACTIVITY_II {
        static void feetToInches(double feet){
            int res = feet*12;
            System.out.println(res);
        }
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the feet: ");
            double feet = sc.nextDouble();
            convert(feet);
        }
        
    }
