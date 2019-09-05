package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		//scanner to scan for input
		Scanner scan = new Scanner(System.in);
		
		
		//integer created to count how many groceries will be in the list
		int count = scan.nextInt();
		
		//creating a string and double array for grocery names and prices.
		String[] groceries = new String[count];
		double[] prices = new double[count];
		
		//running through a for loop to scan the values into their respective arrays.
		for (int i=0; i<count; i++) {
			groceries[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		//now scanning for how many customers there will be
		int custNum = scan.nextInt();

		//creating two string arrays for first and last name, length determined by number of customers.
		String[] firstName = new String[custNum];
		String[] lastName = new String[custNum];
		
		//creating a double array to hold values for each customers total.
		double[] total = new double[custNum];
		
		int i = 0;
		
		//running a while loop that will first loop for the customers name and how many items they are purchasing.
		while (i<custNum) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int numOfItems = scan.nextInt();
			
			//creating a for loop inside tht will ask for the quantity and name of a specific item
			for (int n=0; n<numOfItems; n++) {
				int quantity = scan.nextInt();
				String productName = scan.next();
				
				//creating another for loop that will run through the array of groceries to see if any
				//names of groceries in the array match the input. If so, their price will be multiplied
				//by the quantity to add to the total.
					for (int k=0; k<groceries.length; k++) {
						if (productName.equals(groceries[k])) {
							total[i] = total[i] + (prices[k] * quantity);
				}
			}
		}
			i++;
	}
		//creating a while loop that will link together first and last names
		int k=0;
		String[] everything = new String[custNum];
		while (k<custNum) {
			
			everything[k] = firstName[k] + " " + lastName[k];
			k++;
		}
		//creating a final printout statement which uses the called functions and total to generate text.
		System.out.print("Biggest: " + everything[findMax(total)] + " (" + String.format("%.2f", total[findMax(total)]) + ")\r\n");
		System.out.print("Smallest: " + everything[findMin(total)] + " (" + String.format("%.2f", total[findMin(total)]) + ")\r\n");
		System.out.print("Average: " + String.format("%.2f", findAvg(total)));
		
		scan.close();
		
		
	}
	//function for findMax.
	static int findMax(double[] vals) {
		double currentMax = 0;
		int i=0;
		int z=0;
		while ( i < vals.length) {
			if (vals[i] > currentMax) {
				currentMax = vals[i];
				z = i;
			}
		i++;
		}
		//returning Z to give us the exact index of the max.
		return z;		
	}
	//function for findMin.
	static int findMin(double[] vals) {
		
		double currentMin = vals[0];
		
		int i=0;
		int z=0;
		while ( i < vals.length) {
			if (vals[i] < currentMin) {
				currentMin = vals[i];
				z = i;
			}
		i++;
		}
		//returning Z to give us the exact index of the min.
		return z;
	}
	//function for findAvg.
	static double findAvg(double[] vals) {
		
		double average = 0;
		
		for (int i=0; i<vals.length; i++) {
			average = vals[i] + average;
		}
		average = average / vals.length;
		return average;
	}
	
}
