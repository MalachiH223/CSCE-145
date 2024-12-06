//Malachi Hill
public class Apple {
	private String type;
	private double weight;
	private double price;
	
	public Apple() {
		this.type = "Gala";
		this.weight = .5;
		this.price = .88;
	}
	
	public Apple(String xType, double xWeight, double xPrice) {
		this.setType(xType);
		this.setWeight(xWeight);
		this.setPrice(xPrice);
	}
	
	public String getType() {
		return this.type;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setType(String xType) {
		if(xType.equalsIgnoreCase("Red Delicious") 
				||xType.equalsIgnoreCase("Golden Delicious")
				||xType.equalsIgnoreCase("Gala")
				||xType.equalsIgnoreCase("Granny Smith")) {
			this.type = xType;
		}
		else {
			System.out.println("Invalid answer for apple entered.");
		}
	}
	
	public void setWeight(double xWeight) {
		if(xWeight > 0 && xWeight < 2) {
			this.weight = xWeight;
		}
		else {
			System.out.println("Invalid weight for apple entered");
		}
	}
	
	public void setPrice(double xPrice) {
		if(xPrice > 0) {
			this.price = xPrice;
		}
		else {
			System.out.println("Invalid price entered for apple");
		}
	}
	
	public String writeOutput() {
		return " Apple type: " + this.type 
				+ "\n Apple weight: " + this.weight + " kgs"
				+ "\n Apple Price: $" + this.price;
	}
	
	
}
