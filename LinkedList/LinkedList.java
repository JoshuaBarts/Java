public class LinkedList {
 
   private class Node {
      private Object data;
      private Node next;
   }
 
   // TO-DO: declare any required data members
   // ...
   private Node head;
   private Node tail;
   private Node next;
   
   public LinkedList() {
      
      // TO-DO: initialize all data members to
      // make this an empty LinkedList object.
      // ...
      next = null;
      head = null;
      tail = null;
   }
   
   public void add(Object obj) {
      
      // TO-DO: add "obj" to the end of the LinkedList.
      // ...
      Node newNode = new Node(); //create a new Node
      newNode.data = obj;
      newNode.next = null;
      
      if (head == null) { //checking if list is empty..
         //if list is empty, head points to newNode
         head = newNode;
      }
      
      if (tail != null) {
         tail.next = newNode;
      }
      tail = newNode;
   }
   
   public void first() {
      // TO-DO: set an internal "next" pointer to the head Node of
      // the list.
      // ...
      next = head;
   }
   
   public Object next() {
      // TO-DO: return the data item pointed at by the internal "next" pointer, and then
      // advance the pointer.
      // ...
      if (next == null) {
         return null;
      }
         
      Object dataItem = next.data;
      next = next.next;
      return dataItem;
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
   
   public static void main(String[] args) {
      // Do not modify the main for submission.
      // You may, of course, modify the main for your own testing purposes.
      LinkedList list = new LinkedList();
      list.add("bread");
      list.add("salad");
      list.add("potatoes");
      
      list.first();
      System.out.println(list.next());
      System.out.println(list.next());
      System.out.println(list.next());
   }
}
