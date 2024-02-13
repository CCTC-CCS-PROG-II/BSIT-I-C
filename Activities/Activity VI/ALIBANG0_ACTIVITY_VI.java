import java.util.Scanner;
public class ALIBANGO_ACTIVITY_VI{
    public static void main(String[ ] args) {
		System.out.print("please input seconds: ");
		Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();

        while(seconds > 0) {
            System.out.println(seconds);
            seconds--;
        }
    }
}
