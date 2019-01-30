package lab12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int arraySize = 1;
		
		System.out.println("Welcome to the Super Amazing Car Dealership Vehicle List. ");
		System.out.println();
		arraySize = (getInt (scnr, "How many cars are you entering? "));
		List<Car> carList = new ArrayList<>(arraySize);
		
		for (int i = 0; i<arraySize; i++) {
			String make = (getString(scnr, "Enter car make: "));
			String model = (getString(scnr, "Enter car model: "));
			int year = (getInt(scnr, "Enter car year: "));
			double price = (getDouble(scnr, "Enter car price in $ x.xx format: "));
			carList.add(new Car(make, model, year, price));
		}
		
		System.out.println("Our current inventory is: ");
		System.out.printf("%-14s %-14s %-14s %-14s\n", "Make", "Model", "Year", "Price");
		for (Car cars : carList) {
			System.out.println(cars);
		}

	}
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}
	
	public static int getInt(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		try {
			int num = scnr.nextInt();
			scnr.nextLine();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("Enter a whole number, using digits.");
			scnr.nextLine();
			return getInt(scnr, prompt);
		}
	}
	
	public static double getDouble(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine();
				System.out.println("Enter a number, in digits.");
			}
		} while (!isValid);
		
		double number = scnr.nextDouble();
		scnr.nextLine();
		return number;
	}
}
