package components;

import java.time.LocalDate;

public class Transfer extends Flow {
	int accountNumber;

	public Transfer(String comment, String identifier, double ammount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow, int accountNumber) {
		super(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
