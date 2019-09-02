package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//reads number of people to process through
		int customers = scan.nextInt();
		
		//array to save the output line for each customer 
		String[] output = new String[customers];
		
		/*iterates through each customer and saves the first name, last name, 
		number of items to local variables */
		for (int person = 0; person < customers; person++) {
			String fname = scan.next();
			String lname =  scan.next();
			int items = scan.nextInt();
			double totalcost = 0;
			/* iterates through each item and records the prices paid which is added
			 * to the total, item name has no purpose here, just to move on to next input
			 */
			for (int object = 0; object< items; object++) {
				double count = scan.nextDouble();
				String name = scan.next();
				double price = scan.nextDouble();
				totalcost += count*price;
			}
			//creates the output line for each customer
			output[person] = (fname.charAt(0)+ ". " + lname + ": " 
			+ String.format("%.2f", totalcost));
					
		}
		
		//prints out the outputs for each customer
		for (int lines = 0; lines< customers; lines++) {
			System.out.println(output[lines]);
		}
		
	}
}
