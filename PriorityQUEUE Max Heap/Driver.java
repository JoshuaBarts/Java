import java.util.Random;

public class Driver {
	
	public static void main(String[] args) {
		int dataSize;
		dataSize = Integer.parseInt(args[0]);
		long seed = Long.parseLong(args[1]); 
		
		ArrayPriorityQueue q = new ArrayPriorityQueue();
		
		Random pseudoRNG = new Random(seed);
		boolean[] priorityPresent = new boolean[dataSize];
		
		for (int i=0; i < dataSize; i++)
			priorityPresent[i] = false;
		int numPrioritiesPresent = 0;
		
		System.out.println("-> Enqueue data items 1 to " + dataSize);
		while (numPrioritiesPresent < dataSize) {
			int priority = pseudoRNG.nextInt(dataSize);
			if (!priorityPresent[priority]) {
				String data = "Data item " + numPrioritiesPresent + " with priority " + priority;
				q.enqueue(data, priority);
				priorityPresent[priority] = true;
				System.out.println("enqueue " + data);
				numPrioritiesPresent++;
			}
		}
		
		System.out.println("Number of items in the queue: " + q.size());
	
		System.out.println("\n-> Dequeue according to priority (high number represents high priority): ");
		for (int i=0; i < dataSize; i++)
		   System.out.println(q.dequeue());
		   
		System.out.println("Number of items in the queue: " + q.size());		 
	}
}