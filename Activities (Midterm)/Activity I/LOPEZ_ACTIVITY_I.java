import java.util.Scanner;

    public class LOPEZ_ACTIVITY_I {
        public static void main(String[] args) {
            String[] namesArray = new String [5];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter name #" + (i + 1) + ":");
                namesArray[i] = scanner.nextLine().trim();
            }

            System.out.println("Enter the number of the name you want to select (1-5):");
            int selectNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectNumber < 1 || selectNumber > 5) {
                System.out.println("Invalid input. Pleas enter a number between 1 and 5.");
            } else {
                String selectedName = namesArray[selectNumber - 1];
                System.out.println("The name you selected is: " + selectedName);
            }
  
            scanner.close();

    }
}
