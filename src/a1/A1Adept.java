package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemnum = scan.nextInt();
		String[] items = new String[itemnum];
		double [] prices = new double[itemnum];
		
		//assigns each item and it's price to the same index in the price and item array
		for (int num = 0; num<itemnum; num++) {
			items[num] = scan.next();
			prices[num] = scan.nextDouble();
			
		}

		// initializing variables to represent price points, total cost, and
		// what to print for lowest and highest prices
		int people = scan.nextInt();
		double average = 0;
		double lowestprice = 0;
		double highestprice = 0;
		String highestline = "";
		String lowestline = "";
		
		/*iterates through each person and collects name, total expenses
		 * and contains another loop which cycles through each item
		 * the person purchased; the cost is dded to total expense
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
			 * creates a message line
			 */
			if (expenses > highestprice || highestprice == 0.0) {
				highestline = "Biggest: " + firstname + ' ' + lastname + 
				" (" + String.format("%.2f", expenses) + ')';
				highestprice = expenses;
			}
			
			/* checks if the total expenses is the lowest or first and
			 * creates a message line
			 */
			if (expenses < lowestprice || lowestprice == 0.0) {
				lowestline = "Smallest: " + firstname + ' ' + lastname + 
						" (" + String.format("%.2f", expenses) + ')';
				lowestprice = expenses;
			}
			average += expenses;
		}
		System.out.println(highestline);
		System.out.println(lowestline);
		System.out.println("Average: " + String.format("%.2f", average/people));
	}
		/*static double FindPrice(String item, int numofitems, String[] items, double[] prices){
			double price = 0.0;
			for (int i = 0; i<numofitems; i++) {
				if (items[i] == item) {

					price = prices[i];
					}
				}
			return price;
		}*/
	
	
}

