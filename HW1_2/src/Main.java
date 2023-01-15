import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
//		opens scanner sc and initializes ints and floats
		Scanner sc = new Scanner(System.in);
		float dollar;
		int amount;
		
//		user inputs dollar amount
		System.out.print("Enter your dollar amount: ");
		dollar = sc.nextFloat() + (float)0.00025;
		System.out.println();
		System.out.println("You have:");
		System.out.println();		
			
//		calculates and prints hundreds and subtracts from total
		amount = (int)(dollar / 100);
		dollar %= 100;
		System.out.println("  -  " + amount + " hundred(s)");
		
//		calculates and prints fifties and subtracts from total
		amount = (int)(dollar / 50);
		dollar %= 50;
		System.out.println("  -  " + amount + " fifty(s)");		
		
//		calculates and prints twenties and subtracts from total
		amount = (int)(dollar / 20);
		dollar %= 20;
		System.out.println("  -  " + amount + " twenty(s)");
		
//		calculates and prints tens and subtracts from total
		amount = (int)(dollar / 10);
		dollar %= 10;
		System.out.println("  -  " + amount + " ten(s)");		
		
//		calculates and prints fives and subtracts from total
		amount = (int)(dollar / 5);
		dollar %= 5;
		System.out.println("  -  " + amount + " five(s)");	
		
//		calculates and prints ones and subtracts from total
		amount = (int)(dollar / 1);
		dollar %= 1;
		System.out.println("  -  " + amount + " one(s)");
		
//		calculates and prints quarters and subtracts from total
		amount = (int)(dollar / 0.25);
		dollar %= 0.25;
		System.out.println("  -  " + amount + " quarter(s)");	
		
//		calculates and prints dimes and subtracts from total
		amount = (int)(dollar / 0.1);
		dollar %= 0.1;
		System.out.println("  -  " + amount + " dime(s)");	
		
//		calculates and prints nickels and subtracts from total
		amount = (int)(dollar / 0.05);
		dollar %= 0.05;
		System.out.println("  -  " + amount + " nickle(s)");
		
//		calculates and prints pennies and subtracts from total
		amount = (int)(dollar / 0.01);
		dollar %= 0.01;
		System.out.println("  -  " + amount + " cent(s)");		
		
//		prints goodbye message
		System.out.println();
		System.out.println("Goodbye!");
		
//		closes scanner sc
		sc.close();
		
	}
	
}
