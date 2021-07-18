public class BubbleSorter extends Sorter {
	public BubbleSorter(int[] od) {
		super(od);
	}

	public void sort() {
		//Implement Bubble Sort Algorithm
	
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < data.length-1; i++) {
			   innerLoopExecutions++;
				if (data[i] > data[i+1]) {
					temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					sorted = false;
					numSwaps++;
				}
			}
			outerLoopExecutions++;
		}
	
	}
}

