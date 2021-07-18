import java.util.Scanner; 

public class LabProgram {
   
   /* Define your method here */
   public static boolean isArrayEven(int[] arrayValues, int arraySize) {
      boolean even = false;
      for (int i = 0; i < arraySize; i++) {
         if (arrayValues[i] % 2 == 0) {
           even = true;
         }
      }
      return even;
   }
   
   public static boolean isArrayOdd(int[] arrayValues, int arraySize) {
      boolean odd = false;
      for (int i = 0; i < arraySize; i++) {
         if (arrayValues[i] % 2 == 1) {
           odd = true;
         }
      }
      return odd;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int size = scnr.nextInt();
      int[] array = new int[size];
      
      for (int i = 0; i < size; i++) {
         array[i] = scnr.nextInt();
      }
      
      if (isArrayEven(array, size) && !(isArrayOdd(array, size))) {
         System.out.println("all even");
      }
      else if (isArrayOdd(array, size) && !(isArrayEven(array, size))) {
         System.out.println("all odd");
      }
      else {
         System.out.println("not even or odd");
      }
   }
}
