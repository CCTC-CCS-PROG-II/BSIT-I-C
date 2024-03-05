import java.util.Scanner; 
      public class HEYRES_ACTIVITY_I {

        /**
         * @param args
         */
        public static void main(String[]args){
            Scanner sc = new Scanner (System.in);

            String [] names = new String[5];
            
            for(int i = 0; i < names.length; i++) {
                System.out.print("Enter name" + (i + 1) + ": " );
            names [i] = S.nextLine();

            }
                System.out.print(s:"Enter number of list of names:");
                final int index = S.nextInt();

                if(index >= 1 && index <= names.length) {
                    System.out.println("You have selected: " + names[index - 1] + ".");
                 } else {
                    System.out.println(x:"Invalid index");
                
                }
        }
      } 