import java.util.Scanner;
public class ALEDO_ACTIVITY_II{
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of feet: ");
    double num = sc.nextDouble();
    converToinches(num);
    sc.close();2                   
  }




static void converToinches(double num){
  double inches = num * 12;
  System.out.println(num + " feet is " + inches + " inches");
  
}
}