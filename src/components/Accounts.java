package components;

public abstract class Accounts {
	protected String label;
	protected double balance;
	protected int accountNumber;

	public Accounts(String label) {
		super();
		this.label = label;
		Client client = new Client(label, label);
		this.accountNumber++;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getBalance() {
		return (float) balance;
	}

	public void setBalance(float ammount) {
		this.balance = ammount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String toString() {
		return "Label: " + label + " Balance: " + balance + " Account Number: " + accountNumber;
	}

}
