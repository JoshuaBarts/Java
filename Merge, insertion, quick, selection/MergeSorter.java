public class MergeSorter extends Sorter {
 
   public MergeSorter(int[] data) {
      super(data);
   }
   
   public void merge(int[] data, int partitionStart, int midpoint, int partitionEnd) {
      int mergedSize = partitionEnd - partitionStart + 1; //size of merged partition
      int[] mergedNumbers = new int[mergedSize];          //Temporary array for merged numbers
      int mergePos = 0;                                   //Position to insert merged number
      int leftPos = 0;                                    //Position of elements in left partition
      int rightPos = 0;                                   //Position of elements in right partition
      
      leftPos = partitionStart;
      rightPos = midpoint + 1;
      
      //add smallest ewlement from left or right partition
      while (leftPos <= midpoint && rightPos <= partitionEnd) {
         if (data[leftPos] < data[rightPos]) {
            mergedNumbers[mergePos] = data[leftPos];
            leftPos++;
         }
         else {
            mergedNumbers[mergePos] = data[rightPos];
            rightPos++;
         }
         mergePos++;
      }
      
      //if left partition not empty, add reamaining elements to merged
      while (leftPos <= midpoint) {
         mergedNumbers[mergePos] = data[leftPos];
         leftPos++;
         mergePos++;
      }
      
      //if right partition is not empty, add remaining elements to merged
      while (rightPos <= partitionEnd) {
         mergedNumbers[mergePos] = data[rightPos];
         rightPos++;
         mergePos++;
      }
      
      //copy merge
      for (mergePos = 0; mergePos < mergedSize; mergePos++) {
         data[partitionStart + mergePos] = mergedNumbers[mergePos];
      }
   }
   
   public void mergeSort(int[] data, int partitionStart, int partitionEnd) {
      int midpoint = 0;
      
      if (partitionStart < partitionEnd) {
         midpoint = (partitionStart + partitionEnd) / 2; //get midpoint
         
         //recursive calls
         mergeSort(data, partitionStart, midpoint);
         mergeSort(data, midpoint + 1, partitionEnd);
         
         //merge data
         merge(data, partitionStart, midpoint, partitionEnd);
      }
   }
   
   public void sort() {
      mergeSort(data, 0, data.length-1);
   }
   
}