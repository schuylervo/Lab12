package lab12;

public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	
	//setter
	public void setMake(String make) {
		this.make = make;
	}
	
	//getter
	public String getMake() {
		return make;
	}
	
	//setter
	public void setModel(String model) {
		this.model = model;
	}
		
	//getter
	public String getModel() {
		return model;
	}
	
	//setter
	public void setYear(int year) {
		this.year = year;
	}
			
	//getter
	public int getYear() {
		return year;
	}
	
	//setter
	public void setPrice(double price) {
		this.price = price;
	}
				
	//getter
	public double getPrice() {
		return price;
	}
	
	// no arg constructor
	public Car() {

	}
	
	// arg constructor
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString () {
		return String.format("%-14s %-14s %-14s %-14s\n", make, model, year, price);
	}
}
