import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */ 
   public static double milesToLaps(double userMiles) {
      return userMiles * 4;
   }
   
   public static void main(String[] args) {
      /* Type your code here. Your code must call the method.  */
      Scanner scan = new Scanner(System.in);
      double laps = scan.nextDouble();
      System.out.printf("%.2f", milesToLaps(laps));
   }
}
