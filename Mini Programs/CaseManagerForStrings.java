// A simple Java Program
//Created by
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
			
	}
	String message1="Java i great fun";
	String uppercase = message1.toUpperCase();
	String lowercase = message1.toLowerCase();
	System.out.println(uppercase +"\n"+ lowercase);
}
}
