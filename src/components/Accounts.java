package components;

public abstract class Accounts {
	protected String label;
	protected static double balance;
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

	public static double getBalance() {
		return (double) balance;
	}

	public static void setBalance(Flow flow) {
		System.out.println(flow.toString());
		String identifier = flow.getIdentifier();
		double ammount = flow.getAmmount();
		int targetAccountNumber = flow.getTargetAccountNumber();
		int accountNumber2 = Transfer.getAccountNumber();

		if ("debit".equals(identifier)) {
			balance -= ammount;
		} else if ("credit".equals(identifier)) {
			balance += ammount;
		} else if ("transfer".equals(identifier)) {
			if (accountNumber == targetAccountNumber) {
				balance += ammount;
			} else if (accountNumber == accountNumber2) {
				balance -= ammount;
			}
		} else {
			System.out.println("Something went wrong with the flow");
		}
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
