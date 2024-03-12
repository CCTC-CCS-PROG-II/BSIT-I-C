import java.util.Scanner;

public class ALCOMENDRAS_ACTIVITY_III {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int[][] scores = new int[5][5];

        System.out.println("Enter the scores:");

        for (int i=0; i < 5; i++) {
            for (int j =0; j < 5; j++) {
                Sytem.out.print("Score " + (i = 5 + j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int[] row : scores){
            for (int score : row) {
                sum += score;
            }
        }
            
        int totalscores = 5 * 5;

        double average = (double) sum / count;
        System.out.println("Average score: " + average);

    }
}
