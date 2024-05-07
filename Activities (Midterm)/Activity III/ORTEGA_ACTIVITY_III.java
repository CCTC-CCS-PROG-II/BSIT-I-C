import java.util.Scanner;
  public class ORTEGA_ACTIVITY_III {
      public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
          
          int scores [][] = new int [5][5];
          int totalscore = 0;
          double average;

          System.out.println("Input your Scores: ");
            

           for(int R = 0; R<scores.length; R++ ) {
              for(int C = 0; C<scores[R].length; C++) {
              scores[R][C] = sc.nextInt();
              totalscore += scores[R][C];

              }
           }

           average = (double) totalscore / (scores.length * scores[0].length);

          System.out.println("Average: "+average);


      }
  } 