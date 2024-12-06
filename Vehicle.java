
public class Vehicle {
	private String manuName;
	private int cylinders;
	private String ownersName;
	
	public Vehicle() {
		this.manuName = "Unknown";
		this.cylinders = 0;
		this.ownersName = "Unknown";
	}
	
	public Vehicle(String xManuName, int xCyclinders, String xOwnersName) {
		this.setManuName(xManuName);
		this.setCylinders(xCyclinders);
		this.setOwnersName(xOwnersName);
	}
	
	public String getManuName() {
		return this.manuName;
	}
	
	public int getCylinders() {
		return this.cylinders;
	}
	
	public String getOwnersName() {
		return this.ownersName;
	}
	
	public void setManuName(String xManuName) {
		this.manuName = xManuName;
	}
	
	public void setCylinders(int xCylinders) {
		if(xCylinders > 0) {
			this.cylinders = xCylinders;
		}
		else {
			System.out.println("Invalid amount of cylinders entered");
		}
	}
	
	public void setOwnersName(String xOwnersName) {
		this.ownersName = xOwnersName;
	}
	
	public boolean equals(Vehicle v) {
		return v.getManuName().equals(this.manuName)
				&& v.getCylinders() == this.cylinders
				&& v.getOwnersName().equals(this.ownersName);
	}
	
	public String toString() {
		return "Manufacturer's name: " + this.manuName
				+ "\nCylinders: " + this.cylinders
				+ "\nOwners Name: " + this.ownersName;
	}
	
}
