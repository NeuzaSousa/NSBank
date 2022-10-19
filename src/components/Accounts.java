package components;

public abstract class Accounts {
	protected String label;
	protected double balance;
	protected static int accountNumber = 0;
	// protected String name = Client.getName();
	// protected String firstName = Client.setFirstName(firstName)
	// Client client = new Client(String name, String firstName);

	protected Accounts(Client client, String label) {
		super();
		this.label = label;
		Accounts.accountNumber++;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getBalance() {
		return (double) balance;
	}

	public void setBalance(double ammount) {
		this.balance = ammount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		Accounts.accountNumber = accountNumber;
	}

	public String toString() {
		return "Account Number: " + accountNumber + " Balance: " + balance;
	}

}
