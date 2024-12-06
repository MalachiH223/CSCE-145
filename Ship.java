
public class Ship {
	private String name;
	private String date;
	
	public Ship() {
		this.name = "no name selected";
		this.date = "01/01/1990";
	}
	
	public Ship(String xName, String xDate) {
		this.setName(xName);
		this.setLaunchDate(xDate);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setName(String xName) {
		this.name = xName;
	}
	
	public void setLaunchDate(String xDate) {
        
        int year = Integer.parseInt(xDate.substring(6, 10)); 
        
        if (year >= 1990 && year <= 2019) {
            this.date = xDate;
        } else {
            System.out.println("Invalid launch year. Resetting to default (01/01/1990)");
        }
    }
	
	public String toString() {
		return "Name: " + this.name + 
				"\nDate: " + this.date;
				
	}
}
