//Malachi Hill
import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		Apple a1 = new Apple();
		
		
		
		System.out.println("The first apple has values of:  \n" + a1.writeOutput());
		
		System.out.println("Enter the type of the second apple");
		String appleType = key.nextLine();
		
		System.out.println("Enter the weight of the second apple");
		double appleWeight = key.nextDouble();
		key.nextLine();
		
		System.out.println("Enter the price of the second apple");
		double applePrice = key.nextDouble();
		
		Apple a2 = new Apple(appleType, appleWeight, applePrice);
		System.out.println("The values of the second apple are: \n" + a2.writeOutput());

	}

}
