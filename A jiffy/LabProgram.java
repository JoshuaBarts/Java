import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */
   public static double secondsToJiffies(double userSeconds){
      return userSeconds*100;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scan = new Scanner(System.in);
      double jiffy = scan.nextDouble();
      
      System.out.printf("%.2f", secondsToJiffies(jiffy));
   }
}