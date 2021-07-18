import java.util.Scanner; 

public class LabProgram {
   
   /* Define your method here */
   public static void exactChange(int userTotal, int[] coinVals) {
      final int DOLLARS = 100;
      final int QUARTERS = 25;
      final int DIMES = 10;
      final int NICKELS = 5;
      
      int dollars = userTotal/DOLLARS;
      userTotal %= DOLLARS;
      int quarters = userTotal/QUARTERS;
      userTotal %= QUARTERS;
      int dimes = userTotal/DIMES;
      userTotal %= DIMES;
      int nickels = userTotal/NICKELS;
      userTotal %= NICKELS;
      int pennies = userTotal;
      
      coinVals[0] = dollars;
      coinVals[1] = quarters;
      coinVals[2] = dimes;
      coinVals[3] = nickels;
      coinVals[4] = pennies;
      
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int[] coinValue = new int[5];
      int total = scnr.nextInt();
      
      if (total == 0) {
         System.out.println("no change");
      }
      else {
         exactChange(total, coinValue);
         if (coinValue[0] > 0) {
            System.out.print(coinValue[0]);
            if (coinValue[0] > 1) {
               System.out.println(" dollars");
            }
            else {
               System.out.println(" dollar");
            }
         }
         if (coinValue[1] > 0) {
            System.out.print(coinValue[1]);
            if (coinValue[1] > 1) {
               System.out.println(" quarters");
            }
            else {
               System.out.println(" quarter");
            }
         }
         if (coinValue[2] > 0) {
            System.out.print(coinValue[2]);
            if (coinValue[2] > 1) {
               System.out.println(" dimes");
            }
            else {
               System.out.println(" dime");
            }
         }
         if (coinValue[3] > 0) {
            System.out.print(coinValue[3]);
            if (coinValue[3] > 1) {
               System.out.println(" nickels");
            }
            else {
               System.out.println(" nickel");
            }
         }
         if (coinValue[4] > 0) {
            System.out.print(coinValue[4]);
            if (coinValue[4] > 1) {
               System.out.println(" pennies");
            }
            else {
               System.out.println(" penny");
            }
         }
      } 
   }
}
