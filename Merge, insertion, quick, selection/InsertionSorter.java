public class InsertionSorter extends Sorter {
 
   // Copy your solution from the InsertionSorter/SelectionSorter Lab.
   public InsertionSorter(int[] data) {
      super(data);
   }
   
   public void sort() {
      for (int i = 1; i < data.length; i++) {
         int current = data[i];
         int j = i - 1;
         while (j >= 0 && current < data[j]) {
            data[j+1] = data[j];
            j--;
         }
         
         data[j+1] = current;
      }
   }
   
}