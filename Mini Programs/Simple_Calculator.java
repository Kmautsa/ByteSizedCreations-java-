import java.util.Scanner;
//Created by Kudzanai Mautsa
public class Simple_Calculator {

	public static void main(String[] args) {
		//creating a new scanner object
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to my Simple Calculator !!");
		System.out.println("Which operation do you want to use today?"+"(+,-,/,*)");
		System.out.println("{Enter choice}");
		final String add ="+",subtraction="-",multiply="*",division="/";
		String choice = kbd.nextLine();
		switch(choice) {
		case add:{
			System.out.println("You chose Addition ");
			System.out.println("Please enter first number");
			int num1 =kbd.nextInt();	
			System.out.println("Please enter second number");
			int num2 =kbd.nextInt();
			int num3 =num1+num2;
			System.out.println("Your Answer is "+num3+".");
			}
			break;
			
		case subtraction:{
			System.out.println("You chose Subtraction ");
			System.out.println("Please enter first number");
			int num1 =kbd.nextInt();	
			System.out.println("Please enter second number");
			int num2 =kbd.nextInt();
			int num3 =num1-num2;
			System.out.println("Your Answer is "+num3+".");
		}
			break;
		
		case multiply:{
			System.out.println("You chose Multiplication");
			System.out.println("Please enter first number");
			int num1 =kbd.nextInt();	
			System.out.println("Please enter second number");
			int num2 =kbd.nextInt();
			int num3 =num1*num2;
			System.out.println("Your Answer is "+num3+".");
		}
			break;
		
		case division:{
			System.out.println("You chose Division");
			System.out.println("Please enter first number");
			int num1 =kbd.nextInt();	
			System.out.println("Please enter second number");
			int num2 =kbd.nextInt();
			int num3 =num1/num2;
			System.out.println("Your Answer is "+num3+".");
		}
			break;
		default:
			System.out.println("Please make a Choice");
			
		}
	}
	}
		
	

