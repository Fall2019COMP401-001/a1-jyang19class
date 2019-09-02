package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int number_of_items = scan.nextInt();
		String[] items = new String[number_of_items];
		double [] prices = new double[number_of_items];
		
		//assigns each item and it's price to the same index in the price and item array
		for (int num = 0; num<number_of_items; num++) {
			items[num] = scan.next();
			prices[num] = scan.nextDouble();
			
		}

		// initializing variables to represent price points, total cost, and
		// what to print for lowest and highest prices
		int people = scan.nextInt();
		double average = 0;
		double lowest_price = 0;
		double highest_price = 0;
		String highest_line = "";
		String lowest_line = "";
		
		/*iterates through each person and collects name, total expenses
		 * and contains another loop which cycles through each item
		 * the person purchased; the cost is added to total expense
		 */
		for (int person = 0; person<people; person++) {
			String firstname = scan.next();
			String lastname = scan.next();
			double expenses = 0;
			int purchases = scan.nextInt();
			for (int item = 0; item<purchases; item++) {
				int quantity = scan.nextInt();
				String itemname = scan.next();
				
				/*finds the corresponding price for the item by cycling 
				 * through the item list and matching the correct item index
				 * with the same price index
				 */
				for(int i=0; i<items.length; i++) {

					if (items[i].equals(itemname)) {

						expenses += prices[i]*quantity;

					}
				}

			}
			/*checks if the total expenses is the highest or the first and 
			 * creates a message line for highest price
			 */
			if (expenses > highest_price || highest_price == 0.0) {
				highest_line = "Biggest: " + firstname + ' ' + lastname + 
				" (" + String.format("%.2f", expenses) + ')';
				highest_price = expenses;
			}
			
			/* checks if the total expenses is the lowest or first and
			 * creates a message line for lowest price
			 */
			if (expenses < lowest_price || lowest_price == 0.0) {
				lowest_line = "Smallest: " + firstname + ' ' + lastname + 
						" (" + String.format("%.2f", expenses) + ')';
				lowest_price = expenses;
			}
			average += expenses;
		}
		System.out.println(highest_line);
		System.out.println(lowest_line);
		System.out.println("Average: " + String.format("%.2f", average/people));
	}
	
	
}

