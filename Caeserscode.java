import java.util.Scanner;
public class Caeserscode {

	public static void main(String[] args) {
	    krypteradchiper();
	    krypteraddeChiper();

	}

public static void krypteradchiper () {
	Scanner input2 = new Scanner(System.in);
	/** Adding a Scanner to enable the user to use the program
	 * 
	 */
	System.out.println("Enter a word");
	/** telling the user to enter a word for the chiper
	*/
	String str = input2.nextLine().toUpperCase();
    /** Here the input is being started for the varible str
     * 
     */
		
		for (int i = 0; i <str.length(); i++) {
		/** Starting the loop through the varible str
		 * 	
		 */
			 switch (str.charAt(i)) {
             case 88: System.out.print("A"); break;
             case 89: System.out.print("B"); break;
             case 90: System.out.print("C"); break;
          /** 
           * Printing out the letters and the number for the letters
           * 
           */
             default:  char cipher = str.charAt(i);
             /** Collecting the characters from the varible str
              * 
              */
             cipher += 3;
             /** Putting them into the chipher
              * 
              */
             System.out.print(cipher); break;
             /** Printing out the finished result
              * 
              */
            }
		
			
		

}
}

public static void krypteraddeChiper () {
	Scanner input2 = new Scanner(System.in);
	/** Adding a Scanner to enable the user to use the program
	 * 
	 */
	System.out.println("\nEnter the Encryptedword");
	/** telling the user to enter a word for the dechipher
	*/
	String str = input2.nextLine().toUpperCase();
	 /** Here the input is beeing started for the varible str
     * 
     */
		
		for (int i = 0; i <str.length(); i++) {
			/** Starting the loop through the varible str
			 * 	
			 */
			 switch (str.charAt(i)) {
			 case 65: System.out.print("x"); break;
             case 66: System.out.print("y"); break;
             case 67: System.out.print("z"); break;
             case 88: System.out.print("A"); break;
             case 89: System.out.print("B"); break;
             case 90: System.out.print("C"); break;
             /** 
              * Printing out the letters and the number for the letters
              * 
              */

             default:  char cipher = str.charAt(i);
             /** Collecting the characters from the varible str
              * 
              */
                 cipher += 3;
                 /** Putting them into the chipher
                  * 
                  */
                 System.out.print(cipher); break;
                 /** Printing out the finished result
                  * 
                  */
            }
			
			

}
}
}




