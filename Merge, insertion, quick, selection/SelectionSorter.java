public class SelectionSorter extends Sorter {
 
   // Copy your solution from the InsertionSorter/SelectionSorter Lab.
   public SelectionSorter(int[] data) {
      super(data);
   }
   
   public void sort() {
      int temp = 0;
	   int indexOfSmallest = 0;
	   for (int i = 0; i < data.length-1; i++) {
	      indexOfSmallest = i;
	      for (int j = i+1; j < data.length; j++) {
	         if (data[j] < data[indexOfSmallest]) {
	            indexOfSmallest = j; 
	         }
	      }
	      temp = data[i];
	      data[i] = data[indexOfSmallest];
	      data[indexOfSmallest] = temp;
	   }
   }
   
}