package components;

public abstract class Accounts {
	protected String label;
	protected double balance;
	protected static int accountNumber = 0;

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

	public void setBalance(Flow flow) {
		// this.balance = flow;
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
