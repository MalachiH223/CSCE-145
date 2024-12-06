
public class Concert {
	private String bandName;
	private int capacity;
	private int numTicketsSoldByPhone;
	private int numTicketsSoldAtVenue;
	private double priceByPhone;
	private double priceAtVenue;
	
	public Concert() {
		this.bandName = "No name selected";
		this.capacity = 0;
		this.numTicketsSoldByPhone = 0;
		this.numTicketsSoldAtVenue = 0;
		this.priceByPhone = 0;
		this.priceAtVenue = 0;
	}
	
	public Concert(String xBandName, int xCapacity, double xPricebyPhone, double xPriceAtVenue) {
		this.setBandName(xBandName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPricebyPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}
	
	public Concert(String xBandName, int xCapacity, int xNumTicketsSoldByPhone, int xNumTicketsSoldAtVenue, double xPricebyPhone, double xPriceAtVenue) {
		this.setBandName(xBandName);
		this.setCapacity(xCapacity);
		this.setNumTicketsSoldByPhone(xNumTicketsSoldByPhone);
		this.setNumTicketsSoldAtVenue(xNumTicketsSoldAtVenue);
		this.setPriceByPhone(xPricebyPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}
	
	public String getBandName() {
		return this.bandName;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getNumTicketsSoldByPhone() {
		return this.numTicketsSoldByPhone;
	}
	
	public int getNumTicketsSoldAtVenue() {
		return this.numTicketsSoldAtVenue;
	}
	
	public double getPriceByPhone() {
		return this.priceByPhone;
	}
	
	public double getPriceAtVenue() {
		return this.priceAtVenue;
	}
	
	public void setBandName(String xBandName) {
		this.bandName = xBandName;
	}
	
	public void setCapacity(int xCapacity) {
		if(xCapacity < 0) {
			System.out.println("Invalid Capacity entered");
		}
		else {
			this.capacity = xCapacity;
		}
	}
	
	public void setNumTicketsSoldByPhone(int xNumTicketsSoldByPhone) {
		if(xNumTicketsSoldByPhone < 0) {
			System.out.println("Invalid tickets sold by phone");
		}
		else {
			this.numTicketsSoldByPhone = xNumTicketsSoldByPhone;
		}
	}
	
	public void setNumTicketsSoldAtVenue(int xNumTicketsSoldAtVenue) {
		if(xNumTicketsSoldAtVenue < 0) {
			System.out.println("Invalid tickets sold at venue");
		}
		else {
			this.numTicketsSoldAtVenue = xNumTicketsSoldAtVenue;
		}
	}
	
	public void setPriceByPhone(double xPriceByPhone) {
		if(xPriceByPhone < 0) {
			System.out.println("Invalid price by phone");
		}
		else {
			this.priceByPhone = xPriceByPhone;
		}
	}
	
	public void setPriceAtVenue(double xPriceAtVenue) {
		if(xPriceAtVenue < 0) {
			System.out.println("Invalid price at venue");
		}
		else {
			this.priceAtVenue = xPriceAtVenue;
		}
	}
	
	
	public int totalNumberOfTicketsSold() {
		return this.numTicketsSoldAtVenue + this.numTicketsSoldByPhone;
	}
	
	public int ticketsRemaining() {
		return this.capacity - totalNumberOfTicketsSold();
	}
	
	public void buyTicketsAtVenue(int xNumTicketsSoldAtVenue) {
		if (xNumTicketsSoldAtVenue <= ticketsRemaining()) {
            this.numTicketsSoldAtVenue += xNumTicketsSoldAtVenue;
        } 
		else {
            System.out.println("Tickets Are Sold Out");
        }
	}
	
	public void buyTicketsByPhone(int xNumTicketsSoldByPhone) {
		if (xNumTicketsSoldByPhone <= ticketsRemaining()) {
            this.numTicketsSoldByPhone += xNumTicketsSoldByPhone;
        } 
		else {
            System.out.println("Tickets Are Sold Out");
        }
	}
	
	public double totalSales() {
		return (this.priceByPhone * this.numTicketsSoldByPhone) + (this.priceAtVenue * this.numTicketsSoldAtVenue);
	}
	
	
}
