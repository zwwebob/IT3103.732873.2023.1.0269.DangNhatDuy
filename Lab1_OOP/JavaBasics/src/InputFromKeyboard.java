///Exercise 6.2: Write a program for input/output from keyboard
import java.util.Scanner;
public class InputFromKeyboard {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Whats your name? ");
		String strName = keyboard.nextLine();
		System.out.println("How old are you? ");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you? (m)");
		double dHeight = keyboard.nextDouble();
		
		/*similar to other data types 
		 * nextByte(), nextShort(), nextLong()
		 * nextFloat(), nextBoolean()
		 */
		
		System.out.println("Mr. " + strName + ", " + iAge
				+ " years old. " + "Your height is " + dHeight + ".");

	}

}
