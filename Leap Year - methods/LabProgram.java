import java.util.Scanner; 

public class LabProgram {

   /* Define your method here */
   public static boolean isLeapYear(int userYear) {
      boolean leapYear = true;
      
      if (userYear % 4 == 0) {
         if (userYear % 100 == 0) {
            leapYear = ((userYear%400)==0);
         }
      }
      else {
         leapYear = false;
      }
      return leapYear;
   }

   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int year = scnr.nextInt();
      
      if (isLeapYear(year)) {
         System.out.println(year + " is a leap year.");
      }
      else {
         System.out.println(year + " is not a leap year.");
      }
      
   }
}
