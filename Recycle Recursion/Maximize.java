import java.util.Scanner;

public class Maximize {
   final static int CONTAINERS_FOR_FREE_SLICE = 3;
   
   public static int calculateMaxSlices(int money, int pizzaPrice) {
      int maxSlice = money / pizzaPrice;
      
      return maxSlice + extraSlices(maxSlice); 
   }
   
   public static int extraSlices(int maxSlice) { //recursive method
      int extra;
      int returnables = maxSlice / CONTAINERS_FOR_FREE_SLICE;
      int freeExtra = maxSlice % CONTAINERS_FOR_FREE_SLICE;
      int returnablesPlusExtra = returnables + freeExtra;
      
      if (returnables == 0) { //recursive base case: stop recursing if cannot divide further by 3
         return 0;
      }
      else { 
         return extra = returnables + extraSlices(returnablesPlusExtra); //recursive procedure
      }
      //return extra;
   }
   
	public static void main(String args[]) {
      
		Scanner sc = new Scanner(System.in);
      boolean quit = false;
      do {
         System.out.print("How much money do you have? ");
         int money = sc.nextInt();
         
         if (money >= 0) {
            System.out.print("What is the price of a pizza slice? ");
            int pricePerSlice = sc.nextInt();
            System.out.println("You can get " + calculateMaxSlices(money, pricePerSlice) + " slices with $" + money);
            System.out.print("Try again? (y/n) ");
            char menu = sc.next().charAt(0);
            
            switch (menu) {
               case 'n':
               case 'N':
                  quit = true;
                  break;
               case 'y':
               case 'Y':
                  quit = false;
                  break;
               default :
                  if (menu != 'n' || menu != 'y') {
                     quit = true;
                  }
               break;
            }
         }
         else {
            System.out.print("No pizza for you!");
         }
      } while (!quit);
         
   }
}