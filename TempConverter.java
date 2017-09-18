// **********************************************************
// TempConverter.java 			Author: Maricel
// ***********************************************************

import java.util.Scanner;

public class TempConverter
{
	// -------------------------------------
	// Temperature Converter 
	// user inputs Fahrenheit to Celsius
	// -------------------------------------

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int fahrenheit, celsius;

		System.out.println("What is the temperature(F)? ");
		fahrenheit = user_input.nextInt();

		System.out.println((fahrenheit - 32) * 5/9 + " degrees Celsius");



	}
}