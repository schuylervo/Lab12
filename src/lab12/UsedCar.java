package lab12;

public class UsedCar extends Car {

	private double mileage;
	
	public UsedCar() {
		super();
	}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
		
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	@Override
	public String toString () {
		return String.format("%-14s %-14s %-14s %-14s %-14s\n", getMake(), getModel(), getYear(), getPrice(),"(Used)" + mileage);
	}
	
}
