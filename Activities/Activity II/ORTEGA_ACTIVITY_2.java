import java.util.Scanner;
  class ORTEGA_ACTIVITY_II {
  public static void main (String []args) {
    Scanner sc = new Scanner(System.in);
    int number1;
    int number2;
    
   
    System.out.println("Please put a Number: ");
    number1 = sc.nextInt();

    System.out.println("Please put a Number: ");
    number2 = sc.nextInt();
    
    int A = number1 + number2;
    int B = number1 - number2;
    int C = number1 * number2;

    System.out.println("Sum = "+A); //Addition
    System.out.println("Difference = "+B); //Subtraction
    System.out.println("Product = "+C); //Multiplication 

    sc.close();
   
  }
}