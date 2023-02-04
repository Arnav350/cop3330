//HW1.1
//Arnav Patel

import java.util.Scanner;

public class HW1_1 {

	public static void main(String[] args) {
		
//		initialized String and double variables and opened scanner sc
		Scanner sc = new Scanner(System.in);
		String first;
		String last;
		String id;
		double rate;
		double hours;
		double total;
		double tax;
		double net;
		
//		user inputs the name, number, rate, and hours worked
		System.out.print("Enter the Employee's full name: ");
		first = sc.next();
		last = sc.next();
		System.out.print("Enter the Employee's number: ");
		id = sc.next();
		System.out.print("Enter the pay rate per hour: ");
		rate = sc.nextDouble();
		System.out.print("Enter the regular hours worked: ");
		hours = sc.nextDouble();
		
//		prints out filler messages
		System.out.println();
		System.out.println("Thank you!");
		System.out.println();
		System.out.println("here is your paycheck!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
//		prints out the name, number, rate, and hours worked, up to 2 decimals
		System.out.println("Employee's name: " + first + " " + last);
		System.out.println("Employee's number: " + id);
		System.out.printf("Hourly rate of pay: %.2f\n", rate);
		System.out.printf("Hours worked: %.2f\n", hours);
		System.out.println();
		
//		calculates the total gross income, tax amount, and net income
		total = rate * hours;
		tax = total * 0.06;
		net = total - tax;
		
//		prints out the total, tax, and net income, up to 2 decimals
		System.out.printf("Total Gross Pay: $%.2f\n", total);
		System.out.println();
		System.out.println("Deductions");
		System.out.printf("Tax (6%%): $%.2f\n", tax);
		System.out.println();
		System.out.printf("Net Pay: %.2f Dollars\n", net);
		
//		prints filler messages
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Bye!");
		
//		closes scanner sc
		sc.close();

	}

}
