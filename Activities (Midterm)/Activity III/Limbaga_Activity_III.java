 import java.util.Scanner;
 public class Limbaga_Activity_III {
     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
      
        int[][] scores = new int[5][5];

       System.out.println("Enter the scores:");

       for (int i = 0; i < 5; i++) { for (int j = 0; j < 5; j++) { 
        System.out.print("Score " + (i * 5 + j + 1) + ": "); 
        scores[i][j] = scanner.nextInt(); 
    
      }  
    }



      int sum = 0; for (int[] row : scores){
        
        for (int score : row) { sum += score;
         }

    }

        int totalScores = 5 * 5; 

        double average = (double) sum / totalScores;

         System.out.println("Average score: " + average);

          scanner.close(); 
        } 
    }