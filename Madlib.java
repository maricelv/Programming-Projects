// ******************************************
// Madlib.java 			Author: Maricel
// ******************************************

import java.util.Scanner;

public class Madlib
{
	// -----------------------------------------------------
	// Asks user for name, age college and pet's name
	// Then puts into paragraph, with input
	// -----------------------------------------------------
	
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String name, college, pet_name;
		int age;

		System.out.println("What is your name? ");
		name = user_input.next();

		System.out.println("How old are you? ");
		age = user_input.nextInt();

		System.out.println("What is your dream college? ");
		college = user_input.next();

		System.out.println("What is your pet's name? ");
		pet_name = user_input.next();

		System.out.println("Hello, my name is " + name + " and I am " + age + " years\nold." + "I'm enjoying my time at " + college + ", though\nI miss my pet " + pet_name + " very much!");
	}
}