package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int randNum = new Random().nextInt(4);
		// 3. Print out this variable
		JOptionPane.showMessageDialog(null, randNum);
		// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog("enter somthing that is awsome");
		// 5. If the random number is 0
		if (randNum == 0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, "that is awsome");
		}
		// 6. If the random number is 1
		if (randNum == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "that is ok");
		}
		// 7. If the random number is 2
		if (randNum == 2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "boring!");
		}
		// 8. If the random number is 3
		if (randNum == 3) {
			// -- write your own answer
			JOptionPane.showInputDialog("write our own answer.");
		}
	}
}
