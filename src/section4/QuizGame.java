package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String nili = JOptionPane.showInputDialog("who is Sara Aronson.");
		// 3. Use an if statement to check if their answer is correct
		if (nili.equals("someone that helped N.I.L.I. in world war 2")) {
			// 4. if the user's answer was correct, add one to their score
			score += 1;
			// 5. Create more questions by repeating steps 1, 2, and 3 below.
		}
		String math2 = JOptionPane.showInputDialog("what is one pluse one, you have one 2 seconds");
		if (math2.equals("2")) {
			score += 1;
		}
		String java = JOptionPane.showInputDialog("what code languge is this writen in");
		if (java.equals("java")) {
			score += 1;
			String annigma = JOptionPane.showInputDialog("what is an anigmma");
			if(annigma.equals ("a decoder mashin used during world war 2")) {
				score += 1;
			}
			// 6. After all the questions have been asked, print the user's score
			JOptionPane.showMessageDialog(null, "your score is " + score);
		}
	}

}