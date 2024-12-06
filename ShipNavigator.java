import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		
		//creating the scanner obj to allow for user input
		Scanner key = new Scanner(System.in);
		
		String again = "";
		
		//looping the code so it runs whenever the user wants to run another instance
		do {
		System.out.println("Enter the name of the ship");
		String name = key.nextLine();
		
		System.out.println("Enter the launch date of the ship (mm/dd/yyyy): ");
		String launchDate = key.nextLine();
		
		System.out.println("Is it a cruise ship or cargo ship?");
		String shipType = key.nextLine();
		
		//running the parameters if the ship entered is a cruise ship
		if(shipType.equalsIgnoreCase("cruise ship") || shipType.equalsIgnoreCase("cruise")) {
			System.out.println("Enter the passenger capacity of the ship");
			int passengers = key.nextInt();
			
			System.out.println("Enter the amount of crew members on the ship");
			int crew = key.nextInt();
			key.nextLine();
			
			CruiseShip cr = new CruiseShip(name, launchDate, passengers, crew);
			
			System.out.println("Creating a cargo ship...");
			System.out.println("Printing ships details: \n" + cr);
			
		}
		
		//running the parameters if the ship entered is a cargo ship
		else if(shipType.equalsIgnoreCase("cargo ship") || shipType.equalsIgnoreCase("cargo")) {
			System.out.println("Enter the tonnage of the ship");
			double tonnage = key.nextDouble();
			
			System.out.println("Enter the Max speed of the ship");
			double maxSpeed = key.nextDouble();
			key.nextLine();
			
			CargoShip ca = new CargoShip(name, launchDate, tonnage, maxSpeed);
			
			System.out.println("Creating a cruise ship...");
			System.out.println("Printing ships details: \n" + ca);
			
		}
		
		//In case the user enters another type of ship that isn't able to be processed
		else {
			System.out.println("Invalid option entered");
		}
		
		//Asking the user if they want to run the code again
		System.out.println("Do you want to enter another ship? (yes or no)");
		again = key.nextLine();
			
		
		
	//ending the do while loop if they say no but continuing while yes is their answer
	}while(again.equalsIgnoreCase("Yes"));
		
	}
}


