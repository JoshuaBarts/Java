import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon){
      return (drivenMiles / milesPerGallon) * dollarsPerGallon;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scan = new Scanner(System.in);
      double milesPerGallon = scan.nextDouble();
      double dollarsPerGallon = scan.nextDouble();
      
      System.out.printf("%.2f ", drivingCost(10, milesPerGallon, dollarsPerGallon));
      System.out.printf("%.2f ", drivingCost(50, milesPerGallon, dollarsPerGallon));
      System.out.printf("%.2f\n", drivingCost(400, milesPerGallon, dollarsPerGallon));
     
   }
}
