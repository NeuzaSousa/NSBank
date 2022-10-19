package components;

import java.util.Date;

public class Transfer extends Flow {
	int accountNumber;

	public Transfer(String comment, int identifier, double ammount, int targetAccountNumber, boolean effect,
			Date dateOfFlow, int accountNumber) {
		super(comment, identifier, ammount, targetAccountNumber, effect, dateOfFlow);
		this.accountNumber = accountNumber;
	}
}
