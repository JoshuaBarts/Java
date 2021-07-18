import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   
   /* Define your method here */
   public static String headsOrTails(Random rand) {
      String coin;
      
      if (rand.nextInt(2) == 0) {
         coin = "heads";
      }
      else {
         coin = "tails";
      }
      
      return coin;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      // Add more variables as needed
      int flip = scnr.nextInt();
      
      for (int i = 0; i < flip; i++) {
         System.out.println(headsOrTails(rand));
      }

      /* Type your code here. */
   }
}
