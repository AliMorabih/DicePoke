import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * Ali Morabih 
 * 40522091
 * */
public class Player {
	/*
	 * Class player
	 * 
	 */

	// Declaration of the Instances variables
	public String playerName;
	private Bankinformation plS;
	public int playerBankBance;
	private Table table;

	// Set-up Array list that will Store tables
	private ArrayList<Table> myTable = new ArrayList<Table>();
	private ArrayList<Player> playu = new ArrayList<Player>();

	// Constructor with no parameter
	public Player() {
	}

	// Constructor that take parameter
	public Player(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	// Method setPlayerBankSolde that take in parameter playerSold from
	// Bankinformation class
	public void setPlayerBankSolde(Bankinformation playerSolde) {
		this.plS = playerSolde;
	}

	// Method that display the sold of player that been stored in the class
	// Bankinformation
	// Using JOptionPane to display interface for the user
	public void displayDetails() {
		String output;
		output = " Your Bank Balance Is Currently " + this.plS.getBankSolde() + " £ ";
		// Display message
		JOptionPane.showMessageDialog(null, output, " Details of Player ", JOptionPane.INFORMATION_MESSAGE);
	}

	// Get to call the player Balance
	public int getPlayerBankBance() {
		return plS.getBankSolde();
	}

	// Get to call the player table
	public Table getTable() {
		return this.table;
	}

	// Set to set player table
	public void setTable(Table table) {
		this.table = table;
	}

	// Method to add the Table using the instance variable
	public void addTable(Table table) {
		this.myTable.add(table);
	}

	// Method to String for display player name on the end of the game
	@Override
	public String toString() {
		String output;
		output = " Mrs or Ms  " + this.playerName + "\n";
		return output;
	}

	// Method displayDetTab to display the player table
	public void displayDetTab() {
		String output;
		// important we need a loop to iterate because we are using arrayList
		output = toString();
		for (Table tempTab : this.myTable) {
			output = output + " \n " + tempTab.toString();
		}
		JOptionPane.showMessageDialog(null, output, "Details of Player", JOptionPane.INFORMATION_MESSAGE);
	}

	public void addPlayerName() {
		playu.add(this);
	}

}
