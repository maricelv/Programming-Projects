// *****************************************
// Change.java 			Author: Maricel
// *****************************************

import java.util.Scanner;

public class Change
{
	// Reads a monetary value (dollar value)
	// Then outputs the amount of bills and coins needed to make change
	// Begins with ten dollars, five, then so on

	public static void main(String[] args) {

		Scanner user_input = new Scanner(System.in);

		double amount;
		double oneDollar, fiveDollar, tenDollar;
		double penny, nickel, dime, quarter;

		System.out.println("Give me an amount ");
		amount = user_input.nextDouble();

		tenDollar = amount / 10;
		amount %= 10;

		fiveDollar = amount / 5;
		amount %= 10;

		oneDollar = amount / 1;
		amount %= 1;

		quarter = amount / .25;
		amount %= .25;

		dime = amount / .10;
		amount %= .10;

		nickel = amount / .05;
		amount %= .05;

		penny = amount / .01;
		amount %= .01;

		System.out.println((int)tenDollar + " ten dollar bills\n" + (int)fiveDollar + " five dollar bills\n" + (int)oneDollar + " one dollar bills\n" + (int)quarter + " quarters\n" + (int)dime + " dimes\n" + (int)nickel + " nickels\n" + (int)penny + " pennies");

	}
}"# Programming-Projects" 
