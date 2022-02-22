package diceRoll;

import java.util.Scanner;

public class diceRoll {
	
	public static void main (String[]args) {
		
		System.out.println("Roll 1 die or 2?");
		Scanner scanner = new Scanner(System.in);
		int diceNumber = scanner.nextInt();
		
		switch (diceNumber) {
		case 1:
			double c = Math.floor(6 * Math.random()) + 1;
			int z = (int) c;
			System.out.println("The die rolled a " + z);
			
			break;
			
		case 2:
			double a = Math.floor(6 * Math.random()) + 1;
			double b = Math.floor(6 * Math.random()) + 1;
			int x = (int) a;
			int y = (int) b;
			System.out.println("Die 1 rolled " + x + " and die 2 rolled " + y + " for a total of " + (x+y));
			
			break;
		}
	}
}