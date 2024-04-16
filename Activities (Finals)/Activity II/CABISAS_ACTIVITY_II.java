import java.util.Scanner;
public class CABISAS_ACTIVITY_II {
    public static void main(String []args){
        System.out.println("Enter feet/foot:");
        Scanner sc =  new Scanner(System.in);
        double num = sc.nextDouble();

        convert(num);
    }
        static void convert(double num){
        System.out.println(num * 12);
    }
}