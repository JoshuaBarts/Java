public class LinkedQueue<T> implements QueueADT<T> {
   
   //subclass for node
   private class Node<T> {
      private Node<T> next;
      private T element;
      
      public Node() {
         next = null;
         element = null;
      }
      
      public Node(T element) {
         next = null;
         this.element = element;
      }
      
      public Node<T> getNextElement() {
         return next;
      }
      
      public void setNextElement(Node<T> node) {
         next = node;
      }
      
      public T getElement() {
         return element;
      }
      
      public void setElement(T element) {
         this.element = element;
      }
      
   }
   
   private int count;
   private Node<T> front;
   private Node<T> rear;
   
   public LinkedQueue() {
      count = 0;
      front = null;
      rear = null;
   }
   
   //adds an element
   public void enqueue(T element) {
      Node<T> newNode = new Node<T>(element);
      
      if (front == null) {
         front = newNode;
      }
      else {
         rear.setNextElement(newNode);
      }
      
      rear = newNode;
      count++;
   }
   
   //removes element at the front of queue
   public T dequeue() throws EmptyCollectionException {
      if (isEmpty()) {
         throw new EmptyCollectionException("queue");
      }
      
      T data = front.getElement();
      front = front.getNextElement();
      count--;
      
      if (isEmpty()) {
         rear = null;
      }
      return data;
   }
   
   //returns reference to front of queue
   public T first() throws EmptyCollectionException {
      if (isEmpty()) {
         throw new EmptyCollectionException("queue");
      }
      
      return front.getElement();
   }
   
   //checks if queue is empty
   public boolean isEmpty() {
      return (count == 0);
   }
   
   //return the size of queue
   public int size() {
      return count;
   }
   
   //represents string for Object
   public String toString() {
     //to do
      Node<T> node = front;
      String represent = "Queue is: ";
     
      while (node != null) {
         represent = represent + (node.getElement()).toString() + ", ";
         
         node = node.getNextElement();
      }
      
      if (isEmpty()) represent = "empty.";
      
      return represent.replaceAll(", $", "");
   }
   
}