package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarApp2 {

	public static void main(String[] args) {
		
		String userCarChoice = "";
		Scanner scnr = new Scanner(System.in);
		
		List<Car> carList = new ArrayList<>();
		
		carList.add( new Car("Chevrolet", "Corvette", 2019, 70000.00) );
		carList.add( new Car("Lamborghini", "Diablo", 2019, 200000.00) );
		carList.add( new Car("Ford", "Explorer", 2019, 32000.00) );
		carList.add( new UsedCar("Chevrolet", "Camaro", 1969, 82000.00, 130000) );
		carList.add( new UsedCar("Plymouth", "Barracuda", 1969, 58000.00, 75000) );
		carList.add( new UsedCar("Pontiac", "GTO", 1966, 48000.00, 118000) );
		
		for (int i=0; i<6; i++) {
			for (Car thisCar : carList) {
				// instance of UsedCar
//				if (thisCar instanceof UsedCar) {
//					((UsedCar) thisCar).getMileage(); //explicit cast
//				}
	
			}
		}
		
		
		System.out.println("Welcome to Super Amazing Car Dealership. Here is a list of our vehicles for sale: ");
		
		
		while (!userCarChoice.equalsIgnoreCase("q")) {
			do {
				System.out.println();
				System.out.printf("%-14s %-14s %-14s %-14s %-14s\n", "Make", "Model", "Year", "Price", "Mileage");
				for (Car carInstance: carList) {
					System.out.println(carInstance);
				}
		
				userCarChoice = getString(scnr, "Enter the model name of the vehicle you are interested in or 'q' to quit: ");
			//	for (int i = 0; i < carList.length; i++) {
				for (Car carInstance: carList) {
					System.out.println(carInstance);
				}
					
				if (userCarChoice.equalsIgnoreCase("Corvette")) {
					System.out.println(carList.get(0));
					break;
				}
				else if (userCarChoice.equalsIgnoreCase("Diablo")) {
					System.out.println(carList.get(1));
					break;
				}
				else if (userCarChoice.equalsIgnoreCase("Explorer")) {
					System.out.println(carList.get(2));
					break;
				}
				else if (userCarChoice.equalsIgnoreCase("Camaro")) {
					System.out.println(carList.get(3));
					break;
				}
				else if (userCarChoice.equalsIgnoreCase("Barracuda")) {
					System.out.println(carList.get(4));
					break;
				}
				else if (userCarChoice.equalsIgnoreCase("GTO")) {
					System.out.println(carList.get(5));
					break;
				} 
				else if (userCarChoice.equalsIgnoreCase("q")) {
					break;
				}
				else {
					System.out.println("Invalid selection. Please try again");
				}	
				
				
			} while ((!userCarChoice.equalsIgnoreCase("Corvette")) || (!userCarChoice.equalsIgnoreCase("Diablo")) ||
					(!userCarChoice.equalsIgnoreCase("Explorer")) || (!userCarChoice.equalsIgnoreCase("Camaro")) || 
					(!userCarChoice.equalsIgnoreCase("Barracuda")) || (!userCarChoice.equalsIgnoreCase("GTO")));
			
			System.out.println();
		
				if (userCarChoice.equalsIgnoreCase("q")) {
					continue;
				}
				else {
					String userDecision = "y";
					userDecision= getString(scnr, "Would you like to buy this car? Enter y/n: ");
		
		
				if (userDecision.equalsIgnoreCase("y")) {
					System.out.println("Excellent! Our finance department will be with you shortly");
					;
				} else {
					continue;
				}
		
					if (userCarChoice.equalsIgnoreCase("Corvette") && userDecision.equalsIgnoreCase("y")) {
						carList.remove(0);
					}
					if (userCarChoice.equalsIgnoreCase("Diablo") && userDecision.equalsIgnoreCase("y")) {
						carList.remove(1);
					}
					if (userCarChoice.equalsIgnoreCase("Explorer") && userDecision.equalsIgnoreCase("y")) {
						carList.remove(2);
					}
					if (userCarChoice.equalsIgnoreCase("Camaro") && userDecision.equalsIgnoreCase("y")) {
						carList.remove(3);
					}
					if (userCarChoice.equalsIgnoreCase("Barracuda") && userDecision.equalsIgnoreCase("y")) {
						carList.remove(4);
					}
					if (userCarChoice.equalsIgnoreCase("GTO") && userDecision.equalsIgnoreCase("y")) {
						carList.remove(5);
					}
				}
			
		}
			//for (Car carInstance: carList) {
			//	System.out.println(carInstance);
			//}
		
			System.out.println("Goodbye. ");
		
		
			scnr.close();
	}
	
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}

}
