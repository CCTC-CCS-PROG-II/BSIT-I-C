import java.util.Scanner;
public class LUGATIMAN_ACTIVITY_VII {
        public static void main(String []args){
         Scanner sc= new Scanner(System.in);

         System.out.println("Enter a number: ");
         int num= sc.nextInt();
         long factorial= 1;

        for(int i= 1; i <= num; i++ ){
            factorial*= i;

        }
       System.out.println("the factorial of " + num +"is:" + factorial); 
    
        

    }
}
