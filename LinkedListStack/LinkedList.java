public class LinkedList {
   /* This is your completed LinkedList from last lab with the following changes:
      0. Change the visibility modifiers in the Node and LinkedList classes as necessary.
         Remember visibility modifiers should be as restrictive as possible.
      1. Add methods isEmpty() and createNode(Object data).
      2. Remove the main method.
   */
   protected class Node {
      protected Object data;
      protected Node next;
   }
   
   protected Node head;
   protected Node tail;
   protected Node next;
   
   public LinkedList() {
      
      // TO-DO: initialize all data members to
      // make this an empty LinkedList object.
      // ...
      next = null;
      head = null;
      tail = null;
   }
   
   public void first() {
      next = head;
   }
   
   public Object next() {
      // TO-DO: return the data item pointed at by the "next" pointer, and then
      // advance the pointer.
      // ...
     
      if (next == null) {
         return null;
      }
      else {
         Object dataItem = next.data;
         next = next.next;
         return dataItem;
      }
   }
   
   public Object getAt(int index) {
      
      // TO-DO: find the Node at the requested index (zero-based)
      // and return the data contained within that Node.
      // ...
      if (index < 0) {
         return null;
      }
      
      Node node = head;
      int i = 0;
      while (node != null && i < index) {
         node = node.next;
         i++;
      }
      if (node != null) {
         return node.data;
      }
      
      return null;
   }

   // Additional method from last week:
   public Node createNode(Object data) {
      Node newNode = new Node();
      newNode.data = data;
      newNode.next = null;
      return newNode;
   }
   
   public void add(Object data) {
      Node newNode = createNode(data);
      
      if (tail != null) {
         tail.next = newNode;
      }
      tail = newNode;
      
      if (head == null) {
         head = newNode;
      }
   }
   
   // Additional method from last week:  
   public boolean isEmpty() {
       return (head == null);
   }
}