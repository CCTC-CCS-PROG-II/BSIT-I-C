import java.util.Scanner;
class ALIBANGO_ACT_2{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: " );
int x = sc.nextInt();

System.out.print("Enter second number: " );
int y = sc.nextInt();

int sum = x+y;
int dif = x-y;
int pro = x*y;
int qou = x/y;

System.out.println("This is the sum: "+sum);
System.out.println("This is the difference: "+dif);
System.out.println("This is the product: "+pro);
System.out.println("This is the quotient: "+qou);


    }
}