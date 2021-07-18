import java.util.Scanner; 

public class LabProgram {
   
   /* Define your method here */
   public static String getPhoneNumber(String[][] dataBase, String contactName, int arraySize) {
      String contact = "";
      for (int i = 0; i < dataBase.length; i++) {
         for (int j = 0; j < dataBase[0].length; j++) {
            if (dataBase[i][0] == null) {
               dataBase[i][j] = null;
            }
            else if (dataBase[i][0].equals(contactName)) {
               contact = dataBase[i][j];
            }
         }
      }
      return contact;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int column = 2;
      int arraySize = scnr.nextInt();
      String[][] data = new String[arraySize][column];
      
      for (int i = 0; i < arraySize; i++) {
         for (int j = 0; j < column; j++) {
            data[i][j] = scnr.next();
         }
      }
      
      System.out.println(getPhoneNumber(data, scnr.next(), arraySize));
   }
}
