import java.util.Scanner; 

public class LabProgram {
   
   /* Define your method here */
   public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize) {
      String contact = "";
      for (int i = 0; i < arraySize; i++) {
         if (nameVec[i].equals(contactName)) {
            contact = phoneNumberVec[i];
         }  
      }
      return contact;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int size = scnr.nextInt();
      
      String[] names = new String[size];
      String[] phone = new String[size];
      
      for (int i = 0; i < size; i++) {
         names[i] = scnr.next();
         phone[i] = scnr.next();
      }
      
      System.out.println(getPhoneNumber(names, phone, scnr.next(), size));
   }
}
