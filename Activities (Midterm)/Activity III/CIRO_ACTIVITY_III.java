import java.util.Scanner;

public class CIRO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[5][5];


        for (int x = 0; x < score.lenght; x++){
            for (int y = 0; y < score.lenght; y++){
                System.out.print("Enter score for row " + (x + 1) + ", Column " + (y+1) + ":");
                scores[x][y] = sc.nextInt();
            }
        }

        int sum = 0;
        int count = 0;
        for (int x = 0; x < score.lenght; x++) {
            for (int y = 0; y < score.lenght; y++) {
                sum += scores[x][y];
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("The Average of the scores: " + average);
    }
}