import java.util.Scanner;
public class TRIPLITT_ACTIVITY_III{
public static void main (String[] args){
    Scanner scan = new Scanner(System.in);

    int[][] scores = new int [5][5];

     System.out.println("Enter your Score: ");
    
        for (int x = 0; x < scores.length; x++){
            for (int y=0; y < scores.length; y++){
               System.out.print("Enter score for rows:" + (x + 1) + ", column " + (y + 1) + ":");
               scores[x][y] = scan.nextInt();
             }
        }
        int sum = 0;
        int count = 0;
        for (int x = 0; x < scores.length; x++){
            for (int y = 0; y < scores.length; y++){
                sum += scores [x][y];
                count++;
            }
        }
        int totalscores = 5*5;

        double average = (double) sum / totalscores ;

        System.out.println("Average Score: " + average);
        scan.close();

    }
}