package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//finds number of items
		int number_of_items = scan.nextInt();
		/*creates parallel arrays for each item, amount, purchases, number of customers
		 * buying and whether the customer has already bought the item
		 */
		boolean[] purchased = new boolean[number_of_items];
		int[] quantity = new int[number_of_items];
		int[] customerBought = new int[number_of_items];
		String[] items = new String[number_of_items];
		
		
		//adds each item to the item list; price is there to get rid of the price value
		for (int item = 0; item<number_of_items; item++) {
			items[item] = scan.next();
			double price = scan.nextDouble();
		}
		//each item receives a quantity of 0 to begin with
		for (int num = 0; num<number_of_items; num++) {
			quantity[num] = 0;
		}
		
		int people = scan.nextInt();
		for (int person = 0; person<people; person++) {
			//each item starts of with a false value to signify person has not bought yet
			for (int b = 0; b<number_of_items;b++) {
				purchased[b] = false;
			}
			//Receives the name which has no purpose
			String first_name = scan.next();
			String last_name = scan.next();
			int purchases = scan.nextInt();
			
			/*takes in the item name and the quantity purchases, finds the correct
			 * index and adds the quantity to the total quantity for the item
			 * checks if the person has purchased the item, if not adds 1 to the
			 * number of people who purchased the item
			 */
			for (int purchase = 0; purchase<purchases; purchase++) {
				int itemquantity = scan.nextInt();
				String itemname = scan.next();
				for (int i = 0; i<items.length; i++) {
					if (items[i].equals(itemname)){
						quantity[i] += itemquantity;
						if (purchased[i] == false) {
							purchased[i] = true;
							customerBought[i] += 1;
						}
					}
				}
				
			}
			
			
		}
		
		for (int item = 0; item<number_of_items; item++) {
			if (quantity[item] == 0) {
				System.out.println("No customers bought " + items[item]);
			}
			
			else {
				System.out.println(customerBought[item] + " customers bought " + 
						quantity[item] + 
						' ' + items[item]);
			}
		}
	}
}
