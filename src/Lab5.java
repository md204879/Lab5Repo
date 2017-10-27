import java.util.Scanner;

class PairOfDice {
	// Number showing on the first die.
	double die1;
	// Number showing on the second die.
	double die2;

	PairOfDice(double n) {

	}

	// Create a method to roll the Dice
	public double roll(double n) {

		double die1 = (Math.random() * n) + 1;
		this.die1 = die1;
		double die2 = (Math.random() * n) + 1;
		this.die2 = die2;
		return die1 + die2;
	}

	double getDie1() {
		// Return the number showing on the first die.
		return die1;
	}

	double getDie2() {
		// Return the number showing on the second die.
		return die2;
	}

}

public class Lab5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char choice = 'y';
		char choice1 = 'y';
		// Ask the user for a number of sides for the dice
		System.out.print("Enter a number of sides you want the dice to have: ");
		double n = input.nextDouble();
		input.nextLine();

		PairOfDice pod = new PairOfDice(n);

		// Ask the user to roll the dice
		System.out.println("Roll the dice y/n");
		while (choice1 == 'y' || choice1 == 'Y') {
			choice1 = input.nextLine().charAt(0);
			// Create loop to ask the user if he wants to continue after the dice roll
			while (choice == 'y' || choice == 'Y') {

				pod.roll(n);
				int x = (int) pod.die1;
				int i = (int) pod.die2;
				System.out.println("The dice come up " + x + " and " + i);

				System.out.println("Would you like to continue y/n: ");
				choice = input.nextLine().charAt(0);

			}
			System.out.println("Program Terminated");
		}
		input.close();
		System.out.println("Program Terminated");

	}

}
