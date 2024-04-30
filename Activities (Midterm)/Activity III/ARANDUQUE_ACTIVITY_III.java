import java.util.Scanner;
public class ARANDUQUE_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[5][5];

        for (int x = 0; i < scores.length; x++) {
            System.out.println("Enter Scores " + (x + 1) + ":");
            for (int y = 0; y < scores[i].length; y++) {
                scores[x][y] = input.nextInt();
            }
        }

        int sum = 0;
        int count = 0;
        for (int x = 0; x < scores.length; x++) {
            for (int y = 0; y < scores[x].length; y++) {
                sum += scores[x][y];
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Total Score Average: " + average);
    }
}