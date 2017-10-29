import java.util.Scanner;

/**
 * @author Serhiy Bardysh
 *Creating a program to calculate factorial of user integer input 1 to 10.
 */
public class CalculateFactorialOfNumber {

	public static void main(String[] args) {
		
		String choice = "y";
		int userNum = 0;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator!");
		System.out.println();
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter integer that's greater than 0 but less that 10: ");
		
		userNum = scnr.nextInt();
		
		if (userNum < 1 || userNum > 10) {
			System.out.println("You have entered invalid number. Please enter number between 1 and 10: ");
			userNum = scnr.nextInt();
			}
	    int result = factorialCalc(userNum);
	    scnr.nextLine();
	    System.out.println("The factorial of " + userNum + " is " + result);
	    
	    System.out.println();
		System.out.println("Would you like to enter another number? y/n: ");
		choice = scnr.next();
		}
		System.out.println("The end.");
		scnr.close();
			
}	
	 public static int factorialCalc(int userNum) {
	       int result = 1;
	       for (int i = 1; i <= userNum; i++) {
	           result = result * i;
	       }
	       return result;
	 }
}
