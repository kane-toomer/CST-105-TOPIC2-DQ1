import java.util.Scanner; 

public class DQ_2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
    
      System.out.println("Enter highwayNumber: ");
      highwayNumber = scnr.nextInt();
      
      if (highwayNumber >= 1 && highwayNumber <= 99) {
          if (highwayNumber % 2 == 0){
              System.out.println("I-" + highwayNumber + " is primary, going east/west.");
          } else {
              System.out.println("I-" + highwayNumber + " is primary, going north/south.");
          }
      } else if (highwayNumber >= 100 && highwayNumber <= 999) {
          int primaryHighway = highwayNumber % 100;
          System.out.println("I-" + highwayNumber + "is serving, auxillary highway I-" + primaryHighway + ", going " + (primaryHighway % 2 == 0 ? "east/west." : "north/south."));
      } else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
   }
}