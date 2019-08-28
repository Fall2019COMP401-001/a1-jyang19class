package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int itemnum = scan.nextInt();
		boolean[] purchased = new boolean[itemnum];
		int[] quantity = new int[itemnum];
		int[] customerbuy = new int[itemnum];
		String[] items = new String[itemnum];
		//adds each item to the item list; price is there to get rid of the price value
		for (int item = 0; item<itemnum; item++) {
			items[item] = scan.next();
			double price = scan.nextDouble();
		}
		//each item receives a quantity of 0 to begin with
		for (int num = 0; num<itemnum; num++) {
			quantity[num] = 0;
		}
		
		int people = scan.nextInt();
		for (int person = 0; person<people; person++) {
			//each item starts of with a false value to signify person has not bought yet
			for (int b = 0; b<itemnum;b++) {
				purchased[b] = false;
			}
			
			String fname = scan.next();
			String lname = scan.next();
			int purchases = scan.nextInt();
			for (int purchase = 0; purchase<purchases; purchase++) {
				int itemquantity = scan.nextInt();
				String itemname = scan.next();
				for (int i = 0; i<items.length; i++) {
					if (items[i].equals(itemname)){
						quantity[i] += itemquantity;
						if (purchased[i] == false) {
							purchased[i] = true;
							customerbuy[i] += 1;
						}
					}
				}
				
			}
			
			
		}
		
		for (int item = 0; item<itemnum; item++) {
			if (quantity[item] == 0) {
				System.out.println("No customers bought " + items[item]);
			}
			
			else {
				System.out.println(customerbuy[item] + " customers bought " + 
						quantity[item] + 
						' ' + items[item]);
			}
		}
	}
}
