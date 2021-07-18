import java.util.Scanner;

public class LabProgram {

   /* Define your method here */
   public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
         int count = 0;
         for (int i = 0; i < listSize; i++) {
            if (wordsList[i].equals(currWord)) {
               count++;
            }
         }
      return count;  
   }

   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int arraySize = scnr.nextInt();
      
      String[] wordsList = new String[arraySize];
      
      for (int i = 0; i < arraySize; i++) {
         wordsList[i] = scnr.next();
      }
      
      for (int i = 0; i < arraySize; i++) {
         System.out.println(wordsList[i] + " " + getFrequencyOfWord(wordsList, arraySize, wordsList[i]));
      }
   }
}
