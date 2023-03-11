import javax.swing.JOptionPane;
/*
 * Ali Morabih 
 * 40522091
 * */

// Class Pokerdice 
public class Pokerdice {

	// Declaration of the Instances variables
	public int dice1;
	public int dice2;
	private static int yBet;
	private static int rolld1;
	private static int rolld2;
	private static final String displayMRunout = " You Run out of money you lost the game  " + " \n " + " Good Bye ";
	private static Table tab1 = new Table(" has The Lowest Score Table ");
	private static Table tab2 = new Table(" has The Highest Score Table ");

	// Constructor with no parameter
	public Pokerdice() {
	}

	// Function that will roll Randomly the first dice
	public static int roll_a_dice1() {

		int dice1 = (int) (Math.random() * 6 + 1);
		return dice1;
	}

	// Function that will roll Randomly the second dice
	public static int roll_a_dice2() {

		int dice2 = (int) (Math.random() * 6 + 1);
		return dice2;
	}

	// Function that will validate if the numbers are sequences
	public static boolean consecutive(int numberF, int numberS) {
		if (numberF == numberS) {
			return false;
		} else if ((numberF == numberS + 1 || numberF == numberS - 1)
				|| (numberF == numberS + 1 || numberF == numberS - 1)) {
			return true;
		}
		return false;
	}

	/*
	 * Method checkWinner() that take in parameter a integer xBankBalance and
	 * calculate the scores
	 */
	public static void checkWinner(int xBankBalance) {

		// JOptionPane will Prompt and ask the User to Enter a name
		String inputId = JOptionPane.showInputDialog(" Please Enter your Name ");
		Player pla1 = new Player(inputId);

		// initialize the Round to 1
		int Round = 1;

		// With While Loop I can use it to validate if the Round is less or equal to 5 &
		// also Validate the balance is less than 0
		while ((xBankBalance > 0) && (Round <= 5)) {

			/*
			 * Another do while Loop that validate if the Bet is between 1 and 4 if not I
			 * will have to prompt to the User to Re-enter the bet
			 */
			do {
				String inputCheck = JOptionPane.showInputDialog(" Your current balance is : " + xBankBalance + " £ "
						+ " \n " + "Please Enter your Bet amount   ");
				yBet = Integer.parseInt(inputCheck);
			} while ((yBet < 1) || (yBet > 4));

			// Assign instance variable rolld1 & rolld2 to the both function that will Roll
			// the Dices
			rolld1 = roll_a_dice1();
			rolld2 = roll_a_dice2();
			/*
			 * With if Statement I will verify if the numbers are sequential by calling the
			 * function boolean consecutive() The function will take the 2 numbers that been
			 * rolled by the dices and return false if the check is not valid, return true
			 * if the check is valid. After it return the true I need to display to the user
			 * some details, I use the interface JOptionPane to display the Result
			 */
			if (consecutive(rolld1, rolld2) == true) {
				String displayComputer = " You bet " + yBet + " £ " + " Computer Rolls " + rolld1 + " & " + rolld2
						+ "\n" + " You ear double your bet !! ";
				JOptionPane.showMessageDialog(null, displayComputer);
				yBet = yBet * 2;
				xBankBalance = xBankBalance + yBet;
				String output = " Your Bank Balance now is " + xBankBalance + " On The Round " + Round + "\n"
						+ " You Earn !! " + yBet + " £ ";
				JOptionPane.showMessageDialog(null, output);
				Round++;
			} else {
				// I use another if Statement to validate if the numbers are identical
				if (rolld1 == rolld2) {
					String displayComputer = " You bet " + yBet + " £ " + " Computer Rolls " + rolld1 + " & " + rolld2
							+ "\n" + " You Earn Triple your bet !!!";
					JOptionPane.showMessageDialog(null, displayComputer);
					yBet = yBet * 3;
					xBankBalance = xBankBalance + yBet;
					String output = " Your Bank Balance now is " + xBankBalance + " On The Round " + Round + "\n"
							+ " You Earn !! " + yBet + " £ ";
					JOptionPane.showMessageDialog(null, output);
					Round++;
					// Otherwise User Lose the Money he bet
				} else {
					String displayComputer = " You bet " + yBet + " £ " + " Computer Rolls " + rolld1 + " & " + rolld2
							+ "\n" + " You lose the amount of money you bet  \n ";
					JOptionPane.showMessageDialog(null, displayComputer);
					xBankBalance = xBankBalance - yBet;
					String output = "Your Bank Balance now is " + xBankBalance + " On The Round " + Round + "\n"
							+ "You Lose !! " + yBet + " £ ";
					JOptionPane.showMessageDialog(null, output);
					Round++;
				}
			}
			// if Statement to validate if balance equal to 0 will return a string message
			// to say good bye
			if (xBankBalance == 0) {
				JOptionPane.showMessageDialog(null, displayMRunout);

				// Else if Statement to display to the user that game is over because no
				// attempts left and display his remaining balance
			} else if (Round == 6) {
				String displayEndofRound = "The Game is end because you have no more attempts left" + " \n "
						+ "Your Bank Balance left is  " + xBankBalance + " £ ";
				JOptionPane.showMessageDialog(null, displayEndofRound);

				// lets check the balance and see on which table we should put this player
				if (xBankBalance > 10) {
					/*
					 * Use reference to point on the Class player & call addTable method Assign the
					 * Player to highest Score Table
					 */
					pla1.addTable(tab2);
					// Display the Player name & the Table Information
					pla1.displayDetTab();
				} else if (xBankBalance < 10) {
					/*
					 * Use reference to point on the Class player & call addTable method Assign the
					 * Player to Lowest Score Table
					 */
					pla1.addTable(tab1);
					// Display the Player name and the Table information
					pla1.displayDetTab();
				}
			}
		}
	}
}
