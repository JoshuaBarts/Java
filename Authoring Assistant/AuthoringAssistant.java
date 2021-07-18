import java.util.Scanner;

public class AuthoringAssistant {
   public static Scanner scnr = new Scanner(System.in);
   
   //(2)Implement a printMenu() method
   public static char printMenu() {
      char choice;
      System.out.println("\nMENU");
      System.out.println("c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !'s");
      System.out.println("s - Shorten spaces");
      System.out.println("q - Quit");
      
      System.out.println("\nChoose an option:");
      choice = scnr.nextLine().charAt(0);
      
      return choice;
   }
   
   //(3) Implement the getNumOfNonWSCharacters() method 
   public static int getNumOfNonWSCharacters(String string) {
      string = string.replace(" ", ""); //replace() -> searches a string for specified value, then replaces it with the new value
      
      return string.length(); 
   }
   
   //(4) Implement the getNumOfWords() method
   public static int getNumOfWords(String string) {
      String[] words = string.split("\\s+"); // \s+ -> one or more whitespace
      //split() method -> split string into an array of substring
      
      return words.length;
   }
   
   //(5) Implement the findText() method
   public static int findText(String find, String string) {
      int start = 0;
      int count = 0;
      //indexOf() -> returns position of first occurence of a specified value
      //returns -1 if the value to search never occurs
      
      while (start != -1) {
         start = string.indexOf(find, start);
         
         if (start != -1) {
            count++;
            start += find.length();
         }
      }
      return count;
   }
   
   //(6) Implement the replaceExclamation() method
   public static String replaceExclamation(String string) {
      //String replace = string.replace("!", "."); //replace ! with .
      
      return string.replace("!", ".");
   }
   
   //(7) Implement the shortenSpace() method
   public static String shortenSpace(String string) {
      //String shorten = string.replaceAll("\\s+", " ").trim(); //trim() -> returns a copy of String but ommits leading and trailing whitespace
      return string.replaceAll("\\s+", " ").trim();
   }
   
   public static void main(String[] args) {
      
      /* Type your code here. */
      //(1) Prompt the user to enter a string of their choosing. Store the text in a string. Output the string.
      String input;
      System.out.println("Enter a sample text:\n");
      input = scnr.nextLine();
      System.out.println("You entered: " + input);
      
      char option;
      do {
         
         do {
            option = printMenu();
         } while((option != 'c') && (option != 'w') && (option != 'f') && (option != 'r') && (option != 's') && (option != 'q'));
         
         switch(option) {
               
            case 'c':
               System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(input));
            break;
            
            case 'w':
               System.out.println("Number of words: " + getNumOfWords(input));
            break;
            
            case 'f':
               System.out.println("Enter a word or phrase to be found:");
               String find = scnr.nextLine();
               System.out.println("\"" + find + "\" instances: " + findText(find, input));
            break;
            
            case 'r':
               System.out.println("Edited text: " + replaceExclamation(input));
            break;
            
            case 's':
               System.out.println("Edited text:  " + shortenSpace(input)+" ");
            break;
            
            default:
                 
            break;  
         }    
      } while (option != 'q');
   }
}
