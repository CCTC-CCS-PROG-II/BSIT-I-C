import java.util.Scanner;
    public class ALCOMENDRAS_ACTIVITY_VI {
      public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
          int countdown;

          System.out.println("Input Seconds: ");
          countdown = sc.nextInt();

          while(countdown>0) {
            System.out.println(countdown);
            countdown -= 1;
          }

      }
    }
