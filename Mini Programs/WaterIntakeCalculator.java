//Created by Kudzanai Mautsa
	import java.util.Scanner;

	public class WaterIntakeCalculator {
	    public static void main(String[] args) {
	        final int OUNCES_PER_GLASS = 8;
	        final double ML_PER_OUNCE = 29.5735;
		    //new scanner object for user input
	        Scanner scanner = new Scanner(System.in);
		    //prmpt message of greeting and to prompt user to enter data 
		System.out.print("Welcome to my Water Intake Calculator!!!");
	        System.out.print("Enter the number of water glasses: ");
	        int glasses = scanner.nextInt();

	        int totalOunces = glasses * OUNCES_PER_GLASS;
	        int totalMilliliters = (int) (totalOunces * ML_PER_OUNCE);

	        System.out.println("Your water intake was: " + totalOunces + " ounces or " + totalMilliliters + " milliliters.");

	        scanner.close();
	    }
}
