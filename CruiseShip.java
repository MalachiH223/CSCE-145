
public class CruiseShip extends Ship{
	
	private int passengerAmt;
	private int crewAmt;
	
	public CruiseShip() {
		super();
		this.passengerAmt = 0;
		this.crewAmt = 0;
	}
	
	public CruiseShip(String xName, String xLaunchDate, int xPassengerAmt, int xCrewAmt) {
		super(xName, xLaunchDate);
		this.setPassengerAmt(xPassengerAmt);
		this.setCrewAmt(xCrewAmt);
	}
	
	public int getPassengerAmt() {
		return this.passengerAmt;
	}
	
	public int getCrewAmt() {
		return this.crewAmt;
	}
	
	public void setPassengerAmt(int xPassengerAmt) {
		if(xPassengerAmt > 0) {
			this.passengerAmt = xPassengerAmt;
		}
		else {
			System.out.println("Invalid value entered for passenger amount");	
		}
	}
	
	public void setCrewAmt(int xCrewAmt) {
		if(xCrewAmt > 0) {
			this.crewAmt = xCrewAmt;
		}
		else {
			System.out.println("Invalid value entered for crew amount");
		}
	}
	
	public String toString() {
		return "Name: " + getName() + 
				"\nPassenger Capacity: " + this.passengerAmt + 
				"\nCrew Members: " + this.crewAmt;
	}
	
	
	
	
	
}
