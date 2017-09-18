// *******************************************************
// MilesConverter.java 				Author: Maricel
// *******************************************************

import java.util.Scanner;

public class MilesConverter
{
	// --------------------------------
	// Converts miles to km
	// --------------------------------

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);

		float miles;
		System.out.println("How many miles? ");
		miles = user_input.nextFloat();

		System.out.println((miles * 1.60935) + " kilometers" );

	}
}