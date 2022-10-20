package components;

import java.time.LocalDate;

public class Transfer extends Flow {
	static int accountNumber;

	public Transfer(String comment, String identifier, double ammount, int targetAccountNumber, boolean effect,
			LocalDate dateOfFlow, int accountNumber) {
		super(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
		Transfer.accountNumber = accountNumber;
	}

	public static int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		Transfer.accountNumber = accountNumber;
	}
}
