import java.util.Scanner;
public class LABADLABAD_ACTIVITY_VII {
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);


    System.out.print("Enter a non-negative integer: ");
    long num = sc.nextInt();
    long factorial=1;

   
    for(long i=1; i<=num; i++ ){
    factorial*=i;
   }
   System.out.println("The factorial of "+num+" is: "+factorial);
  }  
}
