import java.util.Scanner;

public class CIRO_ACTIVITY_III {
    public static void main(String[] args) {
        // Array creation
        int[][] scores = new int[5][5];

        // Prompt for input
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter score for row " + (i+1) + ", column " + (j+1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // Average calculation
        int total = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                total += scores[i][j];
                count++;
            }
        }

        double average = (double) total / count;

        // Print results
        System.out.println("Average of all scores entered: " + average);
    }
}