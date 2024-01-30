public class YUNGOT_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(s:"Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print(s:"Enter your second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        System.out.println("Sum =" + sum);
        System.out.println("Difference =" + diff);
        System.out.println("Product =" + prod);


    }

}