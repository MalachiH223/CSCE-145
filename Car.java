
public class Car extends Vehicle{
	private double mileage;
	private int passengers;
	
	public Car() {
		super();
		this.mileage = 0;
		this.passengers = 0;
	}
	
	public Car(String xManuName, int xCylinders, String xOwnersName, double xMileage, int xPassengers) {
		super(xManuName, xCylinders, xOwnersName);
		this.setMileage(xMileage);
		this.setPassengers(xPassengers);
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public void setMileage(double xMileage) {
		if(xMileage > 0) {
			this.mileage = xMileage;
		}
		else {
			System.out.println("Invalid mileage entered");
		}
	}
	
	public void setPassengers(int xPassengers) {
		if(xPassengers > 0) {
			this.passengers = xPassengers;
		}
		else {
			System.out.println("Invalid passengers entered");
		}
	}
	
	public boolean equals(Car c) {
		return c.getMileage() == this.mileage
				&& c.getPassengers() == this.passengers;
	}
	
	public String toString() {
		return super.toString() 
				+ "\nMileage: "  + this.mileage + " gallons"
				+ "\nPassengers: " + this.passengers;
	}
}
