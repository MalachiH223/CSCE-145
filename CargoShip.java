
public class CargoShip extends Ship{
	
	
	private double tonnage;
	private double maxSpeed;
	
	public CargoShip() {
		super();
		this.tonnage = 0;
		this.maxSpeed = 0;
	}
	
	public CargoShip(String xName, String xLaunchDate, double xTonnage, double xMaxSpeed) {
		super(xName, xLaunchDate);
		this.setTonnage(xTonnage);
		this.setMaxSpeed(xMaxSpeed);
	}
	
	public double getTonnage() {
		return this.tonnage;
	}
	
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setTonnage(double xTonnage) {
		if(xTonnage < 0) {
			System.out.println("Invalid value entered for Tonnage");
		}
		else {
			this.tonnage = xTonnage;
		}
	}
	
	public void setMaxSpeed(double xMaxSpeed) {
		if(xMaxSpeed < 0) {
			System.out.println("Invalid value for Max Speed entered");
		}
		else {
			this.maxSpeed = xMaxSpeed;
		}
	}
	
	public String toString() {
		return "Name: " + getName() + 
		"\nTonnage: " + this.tonnage + 
		"\nMax Speed: " + this.maxSpeed + " mph";
	}
	
}
