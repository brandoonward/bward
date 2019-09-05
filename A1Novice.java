package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		//creating scanner to read for input from console
		Scanner scan = new Scanner(System.in);

		//allowing the next integer input by the user to be recorded by scanner
		int count = scan.nextInt();
		
		//creating a string array which will hold the names of the customers, length determined by first integer
		String[] customers = new String[count];
		
		//declaring counter variable
		int i = 0;
		
		//creating two string arrays, one which will hold the first names and other which will hold last names. Length based on amount of customers.
		String[] firstName = new String[customers.length];
			
		// same for last name
		String[] lastName = new String [customers.length];
			
		double[] realTotal = new double[customers.length];
		//reading values into the string array
		while (i<count) {
			
			//first name will be next string input through scanner
			firstName[i] = scan.next();
			
			lastName[i] = scan.next();
			
			//creating an integer that will hold the number of items for the next for loop.
			int numberOfItems = scan.nextInt();
			
			
			
			//new for loop which will process the total cost for each customer
			for (int i1=0; i1<numberOfItems; i1++) {
				
				//scanning for the number of the item, name, and price of the item.
				int numSpecificItem = scan.nextInt();
				String nameOfItem = scan.next();
				double price = scan.nextDouble();
				
				//creating an double array which will hold the total for each customer.
				double[] total = new double[numberOfItems];
				
				total[i1] = price * numSpecificItem + total[i1];
		
				//calculating the total for said customer.
				realTotal[i] = total[i1] + realTotal[i];
				
			}
			i++;
			// printing out the first initial of their name by using the charAt feature and picking the first letter
			// then assembling the rest by using the last name and a series of concatenations along with the total.
			
		}
		for (int k=0; k<count; k++) {
		System.out.print(firstName[k].charAt(0) + ". " + lastName[k] + ": " + String.format("%.2f", realTotal[k]) + "\r\n");
		}
		// closing the scanner as it is no longer used.
		scan.close();
		
	}
}
