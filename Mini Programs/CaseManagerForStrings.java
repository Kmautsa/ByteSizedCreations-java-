// A simple Java Program(casemanager)
/**
*@author Kudzanai Mautsa
*/
import java.util.Scanner;

public class CaseManagerForStrings {
	
public static void main(String[]Args) {
	System.out.println("Welcome to the simple Case manager for Text.");
	Scanner kbd = new Scanner(Sytstem.in);
	System.out.println("Do you want to make text UpperCase(1) or LowerCase(2)?");
	int num = kbd.nextInt;
	switch(num){ 
		case 1:{   
			num =1;
			System.out.println("You chose uppercase!!");
			System.out.println("Enter your text: ");
			String msg1 = kbd.nextLine;
			String upper =msg1.toUpperCase();
			System.out.println(upper);
			System.out.println("Thank you for testing out my program!!");
		}
			break;
		case 2:{
			num=2;
			System.out.println("You chose lowercase!!");
			System.out.println("Enter your text: ");
			String msg2 = kbd.nextLine;
			String lower =msg2.toLowerCase();
			System.out.println(lower);
			System.out.println("Thank you for testing out my program!!");
		}
			break;
		default:
		System.out.println("Please make a choice.");
			break;
			
	}
}
}
