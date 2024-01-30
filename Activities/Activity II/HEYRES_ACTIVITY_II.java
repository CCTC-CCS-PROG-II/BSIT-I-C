import java.util.Scanner; class HEYRES_ACTIVITY_II {
 public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter your first number: "); 
    int k = sc.nextInt(); 

    System.out.println("Enter your second number:"); 
    int l = sc.nextInt(); 

    int sum = k + l; 
    int diff = k - l; 
    int product = k * l; 

    System.out.println("Sum = " + sum); 
    System.out.println("Difference = " + diff); 
System.out.println("Product = " + product); 

sc.close(); 
 }
}
