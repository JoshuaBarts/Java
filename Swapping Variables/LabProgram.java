import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */
   public static void swapValues(int[] values){
      int temp = values[0];
      values[0] = values[values.length-1];
      values[values.length-1] = temp;
      
      System.out.println(values[0] + " " + values[1]);
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scan = new Scanner(System.in);
      int[] val = new int[2];
      
      for (int i = 0; i < val.length; i++) {
         val[i] = scan.nextInt();
      }
      
      swapValues(val);
      
     
   }
}
