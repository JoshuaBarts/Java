public class QuickSorter extends Sorter {

	public QuickSorter(int[] data) {
		super(data);
	}

	public int partition(int start, int end) {
		int low = 0;
		int high = 0;
		int midpoint = 0;
		int pivot;
		int temp = 0;
		boolean done = false;

		//pick pivot
		midpoint = start + (end - start) / 2;
		pivot = data[midpoint];

		low = start;
		high = end;

		while (!done) {
			//Increment low while data[low] < pivot
			while (data[low] < pivot) {++low;
			}

			//Decrement h while pivot < data[h]
			while (pivot < data[high]) {--high;
			}

			if (low >= high) {
				done = true;
			}
			else {
				//Swap
				temp = data[low];
				data[low] = data[high];
				data[high] = temp;

				++low; --high;
			}
		}
		return high;
	}

	public void quickSort(int start, int end) {
		int partitions = 0;

		//base case
		if (start >= end) {
			return;
		}

		partitions = partition(start, end);
      
      //recursive calls
		quickSort(start, partitions);
		quickSort(partitions + 1, end);

		return;
	}

	public void sort() {
		quickSort(0, data.length - 1);
	}

}