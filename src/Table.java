
public class Table {

	private String nameTable;

	// Constructor with no parameter
	public Table() {
	}

	// Constructor that take parameter
	public Table(String name) {
		this.nameTable = name;

	}

	// Getter and Setter for the Class Table
	public String getnameTable() {
		return this.nameTable;
	}

	public void setnameTable(String nameTable) {
		this.nameTable = nameTable;
	}

	// Method toString to call local variable and it will be displaying the name of
	// the Table
	@Override
	public String toString() {
		String output;
		output = " The Remaining Balance That you have left Make your Table  " + this.nameTable + "\n";
		return output;
	}
}
