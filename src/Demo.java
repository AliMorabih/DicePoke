/*
 * Ali Morabih 
 * 40522091
 *  * */
public class Demo {
	/*
	 * Class Demo is the one that contain the method main() so in general the
	 * execution of the program will start from this Class.
	 */

	// Declaration of the Instance variables
	public static int fullPlayerStartingBalance;

	// Assign the £6 given by Computer to the instance variable BALANCEGIVEN
	public static final int BALANCEGIVEN = 6;

	public static void main(String[] args) {
		/*
		 * The main method is the starting point of any Java program. The program starts
		 * the execution from this method.
		 */

		/*
		 * Create reference that indicates where my object's variables and methods are
		 * stored. Also set the player Sole to 3
		 */

		Player pla1 = new Player();
		Bankinformation bck = new Bankinformation(3);

		// Call the method setPlayerBankSolde() from the class Player using reference
		// pla1
		pla1.setPlayerBankSolde(bck);
		// Call the method displayDetails() from the class Player using reference pla1
		pla1.displayDetails();
		/*
		 * Variable fullPlayerStartingBalance will call the getPlayerBankBance() method
		 * from Class Player using reference pla1 & add variable BALANCEGIVEN That store
		 * the amount given is 6. After that I will call checkWinner() method from the
		 * Class Pokerdice & pass the variable fullPlayerStartingBalance
		 */

		fullPlayerStartingBalance = pla1.getPlayerBankBance() + BALANCEGIVEN;
		Pokerdice.checkWinner(fullPlayerStartingBalance);

	}
}
