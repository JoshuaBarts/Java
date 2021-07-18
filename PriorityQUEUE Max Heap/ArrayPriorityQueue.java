public class ArrayPriorityQueue implements QueueADT {
	private static class Node {
		protected Object data;
		protected int priority;
	}

	final static int INITIAL_QUEUE_SIZE=5;
	private Node[] array;
	private int nextIndex;

	public ArrayPriorityQueue() {
		array = new Node[INITIAL_QUEUE_SIZE];
		nextIndex = 0;
	}

	@Override
	public void enqueue(Object data, int priority) {
		// 1. Add the new item to the next space in the array.
		// 2. Bubble Up starting from the new node.
		// 3. Increment nextIndex.
		// 4. Double the array size (and copy the Nodes to the new
		//    array) if nextIndex is too large for the array.
		if (nextIndex >= array.length) {
	      growArray(); //grow array if no space
	      //System.out.println(nextIndex);
	   }
		Node newNode = new Node(); //create newnode
		newNode.data = data;
		newNode.priority = priority;
	   array[nextIndex] = newNode; //set newnode in array
	   bubbleUp(nextIndex); //bubble up
	   nextIndex++;  
	   //System.out.println("array length is " + array.length);
	   //System.out.println("index is " + nextIndex);
	}
	
	public void growArray() {
	  Node[] temp = new Node[array.length * 2];
	  
	  for (int i = 0; i < array.length; i++) {
	      temp[i] = array[i];
	  }
	  array = temp;
	}

	@Override
	public Object dequeue() {
		// 1. Save the root's data value to return later.
		// 2. Place the last valid array item in the root's position.
		// 3. Decrement nextIndex.
		// 3. Bubble down, starting from the root.
		// 4. Return the value saved in Step 1.
		Object root = array[0].data;
		array[0] = array[nextIndex-1];
		nextIndex--;
		bubbleDown(0); //bubble down from root
		//System.out.println("root is " +  root);
	   return root;
	}
   
	@Override
	public int size() {
		return nextIndex;
	}
	
	private void bubbleUp(int index) {
		// 1. do nothing if index is the root.
		// 2. find the parent.
		// 3. if the parent's priority is less than the current node'saved
		//    priority, swap them and bubble up from the parent's position.
		Node current = array[index];
		int parent = (index-1)/2;
		while (index > 0 && array[parent].priority < current.priority) {
		   if (index == parent) {
		      return; 
		   }
		   //swapping adn then bubble up
   		Node temp = array[parent];
   		array[parent] = current;
   		current = temp;
   		bubbleUp(parent);
		}
		//update the array
		array[index] = current;

		
		/*
		MaxHeapPercolateUp(nodeIndex, heapArray) {
         while (nodeIndex > 0) {
            parentIndex = (nodeIndex - 1) / 2
            if (heapArray[nodeIndex] <= heapArray[parentIndex])
               return
            else {
               swap heapArray[nodeIndex] and heapArray[parentIndex]
               nodeIndex = parentIndex
            }
         }
		}
		*/
   }
  
	
	private void bubbleDown(int index) {
		// 1. if the current position is after the last node, do nothing
		// 2. find the left and right children (if they exist)
		// 3. if the current node's priority is lower than either of the children'saved
		//    priorities, swap current node with the higher-priority child, 
		//    and bubble down from that child.
		
		int currentPos = index;
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int max = index;                      //I want to get max value 
		boolean hasLeft = leftChild < size(); //check if left and right exist
		boolean hasRight = rightChild < size();
		
		if (hasLeft && array[max].priority < array[leftChild].priority) {
		   max = leftChild;
		}
		
		if (hasRight && array[max].priority < array[rightChild].priority) {
		   max = rightChild; 
		}
		if (max > index) {
		   //swapping and bubble down whichever was the child
		    Node temp = array[index];
		    array[index] = array[max];
		    array[max] = temp;
		    bubbleDown(max);
		}
		
		//I need to check childrens first, then check parent.....
		/*
         		MaxHeapPercolateDown(nodeIndex, heapArray, arraySize) {
            childIndex = 2 * nodeIndex + 1
            value = heapArray[nodeIndex]
         
            while (childIndex < arraySize) {
               // Find the max among the node and all the node's children
               maxValue = value
               maxIndex = -1
               for (i = 0; i < 2 && i + childIndex < arraySize; i++) {
                  if (heapArray[i + childIndex] > maxValue) {
                     maxValue = heapArray[i + childIndex]
                     maxIndex = i + childIndex
                  }
               }
         
               if (maxValue == value) {
                  return
               }
               else {
                  swap heapArray[nodeIndex] and heapArray[maxIndex]
                  nodeIndex = maxIndex
                  childIndex = 2 * nodeIndex + 1
               }
            }
         }
		*/
      
	}


	// This method is used for testing purposes. Do not modify.
	public Object getDataAtIndex(int index) { return array[index].data; }
}